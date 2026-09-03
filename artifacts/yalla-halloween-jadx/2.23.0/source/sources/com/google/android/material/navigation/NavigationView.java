package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.widget.o000Oo0;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000O0Oo;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuPresenter.OooO0O0;
import com.google.android.material.internal.NavigationMenuPresenter.OooOO0O;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.OooOo00;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import o0O00o00.OooOOO;
import o0O00o00.Oooo000;
import org.jctools.util.Pow2;
import p012OooOo0O.OooOOO0;
import p016OooOoOO.o00oO0o;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final OooOo00 f17437OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final NavigationMenuPresenter f17438OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int[] f17439OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f17440OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public o00oO0o f17441OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO0o f17442OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f17443OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f17444OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f17445OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public Path f17446OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Px
    public final int f17447OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final RectF f17448OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final int[] f17435OooOo0o = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final int[] f17434OooOo = {-16842910};

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int f17436OooOoO0 = o0000O0O.Widget_Design_NavigationView;

    public class OooO00o implements OooO.OooO00o {
        public OooO00o() {
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean OooO00o(OooO oooO, MenuItem menuItem) {
            NavigationView.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void OooO0O0(OooO oooO) {
        }
    }

    public interface OooO0O0 {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public Bundle f17450OooO0o;

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

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17450OooO0o = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5532OooO0Oo, i);
            parcel.writeBundle(this.f17450OooO0o);
        }
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f17441OooOOOO == null) {
            this.f17441OooOOOO = new o00oO0o(getContext());
        }
        return this.f17441OooOOOO;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o(@NonNull WindowInsetsCompat windowInsetsCompat) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.getClass();
        int iOooO0o = windowInsetsCompat.OooO0o();
        if (navigationMenuPresenter.f17185OooOoo0 != iOooO0o) {
            navigationMenuPresenter.f17185OooOoo0 = iOooO0o;
            int i = (navigationMenuPresenter.f17163OooO0o0.getChildCount() == 0 && navigationMenuPresenter.f17181OooOoO) ? navigationMenuPresenter.f17185OooOoo0 : 0;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.f17161OooO0Oo;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = navigationMenuPresenter.f17161OooO0Oo;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, windowInsetsCompat.OooO0OO());
        ViewCompat.OooO0O0(navigationMenuPresenter.f17163OooO0o0, windowInsetsCompat);
    }

    @Nullable
    public final ColorStateList OooO0O0(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListOooO0O0 = ContextCompat.OooO0O0(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(OooOOO0.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListOooO0O0.getDefaultColor();
        int[] iArr = f17434OooOo;
        return new ColorStateList(new int[][]{iArr, f17435OooOo0o, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListOooO0O0.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    public final InsetDrawable OooO0OO(@NonNull o000Oo0 o000oo1, @Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO00o(o000oo1.OooO(o000OO.NavigationView_itemShapeAppearance, 0), getContext(), o000oo1.OooO(o000OO.NavigationView_itemShapeAppearanceOverlay, 0))));
        materialShapeDrawable.OooOOO(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, o000oo1.OooO0Oo(o000OO.NavigationView_itemShapeInsetStart, 0), o000oo1.OooO0Oo(o000OO.NavigationView_itemShapeInsetTop, 0), o000oo1.OooO0Oo(o000OO.NavigationView_itemShapeInsetEnd, 0), o000oo1.OooO0Oo(o000OO.NavigationView_itemShapeInsetBottom, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f17446OooOo0 == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f17446OooOo0);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f17438OooOO0o.f17165OooO0oo.f17192OooO0O0;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f17438OooOO0o.f17179OooOo0O;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f17438OooOO0o.f17177OooOo0;
    }

    public int getHeaderCount() {
        return this.f17438OooOO0o.f17163OooO0o0.getChildCount();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f17438OooOO0o.f17171OooOOOO;
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f17438OooOO0o.f17174OooOOo0;
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f17438OooOO0o.f17175OooOOoo;
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f17438OooOO0o.f17169OooOOO;
    }

    public int getItemMaxLines() {
        return this.f17438OooOO0o.f17183OooOoOO;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f17438OooOO0o.f17170OooOOO0;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.f17438OooOO0o.f17173OooOOo;
    }

    @NonNull
    public Menu getMenu() {
        return this.f17437OooOO0O;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.f17438OooOO0o.f17176OooOo;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.f17438OooOO0o.f17180OooOo0o;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOOO.OooO0OO(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f17442OooOOOo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.f17440OooOOO0;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), Pow2.MAX_POW2);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Pow2.MAX_POW2);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5532OooO0Oo);
        this.f17437OooOO0O.OooOo00(savedState.f17450OooO0o);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f17450OooO0o = bundle;
        this.f17437OooOO0O.OooOo0O(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        boolean z = getParent() instanceof DrawerLayout;
        RectF rectF = this.f17448OooOo0O;
        if (!z || (i5 = this.f17447OooOo00) <= 0 || !(getBackground() instanceof MaterialShapeDrawable)) {
            this.f17446OooOo0 = null;
            rectF.setEmpty();
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        com.google.android.material.shape.OooO0O0 oooO0O0 = materialShapeDrawable.f17582OooO0Oo.f17605OooO00o;
        oooO0O0.getClass();
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o(oooO0O0);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        if (Gravity.getAbsoluteGravity(this.f17445OooOOoo, ViewCompat.OooO.OooO0Oo(this)) == 3) {
            float f = i5;
            oooO00o.OooO0o(f);
            oooO00o.OooO0Oo(f);
        } else {
            float f2 = i5;
            oooO00o.OooO0o0(f2);
            oooO00o.OooO0OO(f2);
        }
        materialShapeDrawable.setShapeAppearanceModel(new com.google.android.material.shape.OooO0O0(oooO00o));
        if (this.f17446OooOo0 == null) {
            this.f17446OooOo0 = new Path();
        }
        this.f17446OooOo0.reset();
        rectF.set(0.0f, 0.0f, i, i2);
        Oooo000 oooo000 = Oooo000.OooO00o.f41818OooO00o;
        MaterialShapeDrawable.OooO0O0 oooO0O1 = materialShapeDrawable.f17582OooO0Oo;
        oooo000.OooO00o(oooO0O1.f17605OooO00o, oooO0O1.f17613OooOO0, rectF, null, this.f17446OooOo0);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f17443OooOOo = z;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem menuItemFindItem = this.f17437OooOO0O.findItem(i);
        if (menuItemFindItem != null) {
            this.f17438OooOO0o.f17165OooO0oo.OooO0O0((OooOO0O) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17179OooOo0O = i;
        navigationMenuPresenter.OooO(false);
    }

    public void setDividerInsetStart(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17177OooOo0 = i;
        navigationMenuPresenter.OooO(false);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        OooOOO.OooO0O0(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17171OooOOOO = drawable;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5271OooO00o;
        setItemBackground(ContextCompat.OooO0OO.OooO0O0(context, i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17174OooOOo0 = i;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17174OooOOo0 = dimensionPixelSize;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemIconPadding(@Dimension int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17175OooOOoo = i;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemIconPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17175OooOOoo = dimensionPixelSize;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemIconSize(@Dimension int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        if (navigationMenuPresenter.f17178OooOo00 != i) {
            navigationMenuPresenter.f17178OooOo00 = i;
            navigationMenuPresenter.f17182OooOoO0 = true;
            navigationMenuPresenter.OooO(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17169OooOOO = colorStateList;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemMaxLines(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17183OooOoOO = i;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17168OooOO0o = i;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17170OooOOO0 = colorStateList;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemVerticalPadding(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17173OooOOo = i;
        navigationMenuPresenter.OooO(false);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17173OooOOo = dimensionPixelSize;
        navigationMenuPresenter.OooO(false);
    }

    public void setNavigationItemSelectedListener(@Nullable OooO0O0 oooO0O0) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.f17186OooOooO = i;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.f17161OooO0Oo;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setSubheaderInsetEnd(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17176OooOo = i;
        navigationMenuPresenter.OooO(false);
    }

    public void setSubheaderInsetStart(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.f17438OooOO0o;
        navigationMenuPresenter.f17180OooOo0o = i;
        navigationMenuPresenter.OooO(false);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f17444OooOOo0 = z;
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ColorStateList colorStateListOooO0O0;
        int i2 = f17436OooOoO0;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.f17438OooOO0o = navigationMenuPresenter;
        this.f17439OooOOO = new int[2];
        this.f17444OooOOo0 = true;
        this.f17443OooOOo = true;
        this.f17445OooOOoo = 0;
        this.f17447OooOo00 = 0;
        this.f17448OooOo0O = new RectF();
        Context context2 = getContext();
        OooOo00 oooOo00 = new OooOo00(context2);
        this.f17437OooOO0O = oooOo00;
        o000Oo0 o000oo0OooO0o0 = com.google.android.material.internal.o00oO0o.OooO0o0(context2, attributeSet, o000OO.NavigationView, i, i2, new int[0]);
        int i3 = o000OO.NavigationView_android_background;
        if (o000oo0OooO0o0.OooOO0o(i3)) {
            Drawable drawableOooO0o0 = o000oo0OooO0o0.OooO0o0(i3);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, drawableOooO0o0);
        }
        this.f17447OooOo00 = o000oo0OooO0o0.OooO0Oo(o000OO.NavigationView_drawerLayoutCornerSize, 0);
        this.f17445OooOOoo = o000oo0OooO0o0.OooO0oo(o000OO.NavigationView_android_layout_gravity, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            com.google.android.material.shape.OooO0O0 oooO0O0 = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context2, attributeSet, i, i2));
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(oooO0O0);
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.OooOOO(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.OooOO0O(context2);
            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        }
        int i4 = o000OO.NavigationView_elevation;
        if (o000oo0OooO0o0.OooOO0o(i4)) {
            setElevation(o000oo0OooO0o0.OooO0Oo(i4, 0));
        }
        setFitsSystemWindows(o000oo0OooO0o0.OooO00o(o000OO.NavigationView_android_fitsSystemWindows, false));
        this.f17440OooOOO0 = o000oo0OooO0o0.OooO0Oo(o000OO.NavigationView_android_maxWidth, 0);
        int i5 = o000OO.NavigationView_subheaderColor;
        ColorStateList colorStateListOooO0O1 = o000oo0OooO0o0.OooOO0o(i5) ? o000oo0OooO0o0.OooO0O0(i5) : null;
        int i6 = o000OO.NavigationView_subheaderTextAppearance;
        int iOooO = o000oo0OooO0o0.OooOO0o(i6) ? o000oo0OooO0o0.OooO(i6, 0) : 0;
        if (iOooO == 0 && colorStateListOooO0O1 == null) {
            colorStateListOooO0O1 = OooO0O0(R.attr.textColorSecondary);
        }
        int i7 = o000OO.NavigationView_itemIconTint;
        if (o000oo0OooO0o0.OooOO0o(i7)) {
            colorStateListOooO0O0 = o000oo0OooO0o0.OooO0O0(i7);
        } else {
            colorStateListOooO0O0 = OooO0O0(R.attr.textColorSecondary);
        }
        int i8 = o000OO.NavigationView_itemTextAppearance;
        int iOooO2 = o000oo0OooO0o0.OooOO0o(i8) ? o000oo0OooO0o0.OooO(i8, 0) : 0;
        int i9 = o000OO.NavigationView_itemIconSize;
        if (o000oo0OooO0o0.OooOO0o(i9)) {
            setItemIconSize(o000oo0OooO0o0.OooO0Oo(i9, 0));
        }
        int i10 = o000OO.NavigationView_itemTextColor;
        ColorStateList colorStateListOooO0O2 = o000oo0OooO0o0.OooOO0o(i10) ? o000oo0OooO0o0.OooO0O0(i10) : null;
        if (iOooO2 == 0 && colorStateListOooO0O2 == null) {
            colorStateListOooO0O2 = OooO0O0(R.attr.textColorPrimary);
        }
        Drawable drawableOooO0o1 = o000oo0OooO0o0.OooO0o0(o000OO.NavigationView_itemBackground);
        if (drawableOooO0o1 == null) {
            if (o000oo0OooO0o0.OooOO0o(o000OO.NavigationView_itemShapeAppearance) || o000oo0OooO0o0.OooOO0o(o000OO.NavigationView_itemShapeAppearanceOverlay)) {
                drawableOooO0o1 = OooO0OO(o000oo0OooO0o0, c1.OooO0O0(getContext(), o000oo0OooO0o0, o000OO.NavigationView_itemShapeFillColor));
                ColorStateList colorStateListOooO0O3 = c1.OooO0O0(context2, o000oo0OooO0o0, o000OO.NavigationView_itemRippleColor);
                if (colorStateListOooO0O3 != null) {
                    navigationMenuPresenter.f17172OooOOOo = new RippleDrawable(p274o0O00OoO.OooO0OO.OooO0OO(colorStateListOooO0O3), null, OooO0OO(o000oo0OooO0o0, null));
                    navigationMenuPresenter.OooO(false);
                }
            }
        }
        int i11 = o000OO.NavigationView_itemHorizontalPadding;
        if (o000oo0OooO0o0.OooOO0o(i11)) {
            setItemHorizontalPadding(o000oo0OooO0o0.OooO0Oo(i11, 0));
        }
        int i12 = o000OO.NavigationView_itemVerticalPadding;
        if (o000oo0OooO0o0.OooOO0o(i12)) {
            setItemVerticalPadding(o000oo0OooO0o0.OooO0Oo(i12, 0));
        }
        setDividerInsetStart(o000oo0OooO0o0.OooO0Oo(o000OO.NavigationView_dividerInsetStart, 0));
        setDividerInsetEnd(o000oo0OooO0o0.OooO0Oo(o000OO.NavigationView_dividerInsetEnd, 0));
        setSubheaderInsetStart(o000oo0OooO0o0.OooO0Oo(o000OO.NavigationView_subheaderInsetStart, 0));
        setSubheaderInsetEnd(o000oo0OooO0o0.OooO0Oo(o000OO.NavigationView_subheaderInsetEnd, 0));
        setTopInsetScrimEnabled(o000oo0OooO0o0.OooO00o(o000OO.NavigationView_topInsetScrimEnabled, this.f17444OooOOo0));
        setBottomInsetScrimEnabled(o000oo0OooO0o0.OooO00o(o000OO.NavigationView_bottomInsetScrimEnabled, this.f17443OooOOo));
        int iOooO0Oo = o000oo0OooO0o0.OooO0Oo(o000OO.NavigationView_itemIconPadding, 0);
        setItemMaxLines(o000oo0OooO0o0.OooO0oo(o000OO.NavigationView_itemMaxLines, 1));
        oooOo00.f2577OooO0o0 = new OooO00o();
        navigationMenuPresenter.f17164OooO0oO = 1;
        navigationMenuPresenter.OooOO0O(context2, oooOo00);
        if (iOooO != 0) {
            navigationMenuPresenter.f17166OooOO0 = iOooO;
            navigationMenuPresenter.OooO(false);
        }
        navigationMenuPresenter.f17167OooOO0O = colorStateListOooO0O1;
        navigationMenuPresenter.OooO(false);
        navigationMenuPresenter.f17169OooOOO = colorStateListOooO0O0;
        navigationMenuPresenter.OooO(false);
        int overScrollMode = getOverScrollMode();
        navigationMenuPresenter.f17186OooOooO = overScrollMode;
        NavigationMenuView navigationMenuView = navigationMenuPresenter.f17161OooO0Oo;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (iOooO2 != 0) {
            navigationMenuPresenter.f17168OooOO0o = iOooO2;
            navigationMenuPresenter.OooO(false);
        }
        navigationMenuPresenter.f17170OooOOO0 = colorStateListOooO0O2;
        navigationMenuPresenter.OooO(false);
        navigationMenuPresenter.f17171OooOOOO = drawableOooO0o1;
        navigationMenuPresenter.OooO(false);
        navigationMenuPresenter.f17175OooOOoo = iOooO0Oo;
        navigationMenuPresenter.OooO(false);
        oooOo00.OooO0O0(navigationMenuPresenter, oooOo00.f2572OooO00o);
        if (navigationMenuPresenter.f17161OooO0Oo == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) navigationMenuPresenter.f17160OooO.inflate(o0000O00.design_navigation_menu, (ViewGroup) this, false);
            navigationMenuPresenter.f17161OooO0Oo = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(navigationMenuPresenter.new OooOO0O(navigationMenuPresenter.f17161OooO0Oo));
            if (navigationMenuPresenter.f17165OooO0oo == null) {
                navigationMenuPresenter.f17165OooO0oo = navigationMenuPresenter.new OooO0O0();
            }
            int i13 = navigationMenuPresenter.f17186OooOooO;
            if (i13 != -1) {
                navigationMenuPresenter.f17161OooO0Oo.setOverScrollMode(i13);
            }
            navigationMenuPresenter.f17163OooO0o0 = (LinearLayout) navigationMenuPresenter.f17160OooO.inflate(o0000O00.design_navigation_item_header, (ViewGroup) navigationMenuPresenter.f17161OooO0Oo, false);
            navigationMenuPresenter.f17161OooO0Oo.setAdapter(navigationMenuPresenter.f17165OooO0oo);
        }
        addView(navigationMenuPresenter.f17161OooO0Oo);
        int i14 = o000OO.NavigationView_menu;
        if (o000oo0OooO0o0.OooOO0o(i14)) {
            int iOooO3 = o000oo0OooO0o0.OooO(i14, 0);
            NavigationMenuPresenter.OooO0O0 oooO0O1 = navigationMenuPresenter.f17165OooO0oo;
            if (oooO0O1 != null) {
                oooO0O1.f17193OooO0OO = true;
            }
            getMenuInflater().inflate(iOooO3, oooOo00);
            NavigationMenuPresenter.OooO0O0 oooO0O2 = navigationMenuPresenter.f17165OooO0oo;
            if (oooO0O2 != null) {
                oooO0O2.f17193OooO0OO = false;
            }
            navigationMenuPresenter.OooO(false);
        }
        int i15 = o000OO.NavigationView_headerLayout;
        if (o000oo0OooO0o0.OooOO0o(i15)) {
            navigationMenuPresenter.f17163OooO0o0.addView(navigationMenuPresenter.f17160OooO.inflate(o000oo0OooO0o0.OooO(i15, 0), (ViewGroup) navigationMenuPresenter.f17163OooO0o0, false));
            NavigationMenuView navigationMenuView3 = navigationMenuPresenter.f17161OooO0Oo;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        o000oo0OooO0o0.OooOOO();
        this.f17442OooOOOo = new OooO0o(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f17442OooOOOo);
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f17437OooOO0O.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f17438OooOO0o.f17165OooO0oo.OooO0O0((androidx.appcompat.view.menu.OooOO0O) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
