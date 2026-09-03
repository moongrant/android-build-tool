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
import androidx.appcompat.view.menu.OooO0o;
import androidx.appcompat.view.menu.OooOO0;
import androidx.appcompat.widget.o0000O0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.OooOO0O;
import com.google.android.material.internal.OooOOO0;
import com.google.android.material.internal.OooOOO0.C0109OooOOO0;
import com.google.android.material.internal.OooOOO0.OooO0OO;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p016OooOoO0.OooOo;
import p337o0OO0o0.OooOOOO;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final int[] f17449OooooOO = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final int[] f17450OooooOo = {-16842910};

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final int f17451Oooooo0 = Oooo000.Widget_Design_NavigationView;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooO0O0 f17452OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NonNull
    public final OooOO0O f17453OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooOOO0 f17454OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f17455OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooOo f17456OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO0OO f17457OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f17458OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f17459OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f17460OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Px
    public int f17461Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public Path f17462Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final RectF f17463OooooO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int[] f17464o000oOoO;

    public class OooO00o implements OooO0o.OooO00o {
        public OooO00o() {
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final boolean OooO00o(OooO0o oooO0o, MenuItem menuItem) {
            OooO0O0 oooO0O0 = NavigationView.this.f17452OoooO;
            return oooO0O0 != null && oooO0O0.OooO00o();
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final void OooO0O0(OooO0o oooO0o) {
        }
    }

    public interface OooO0O0 {
        boolean OooO00o();
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f17456OoooOOO == null) {
            this.f17456OoooOOO = new OooOo(getContext());
        }
        return this.f17456OoooOOO;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o(@NonNull WindowInsetsCompat windowInsetsCompat) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        Objects.requireNonNull(oooOOO0);
        int iOooO = windowInsetsCompat.OooO();
        if (oooOOO0.f17302Ooooooo != iOooO) {
            oooOOO0.f17302Ooooooo = iOooO;
            oooOOO0.OooOO0();
        }
        NavigationMenuView navigationMenuView = oooOOO0.f17281Oooo0o;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.OooO0o());
        ViewCompat.OooO0o0(oooOOO0.f17282Oooo0oO, windowInsetsCompat);
    }

    @Nullable
    public final ColorStateList OooO0O0(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListOooO00o = p012OooOo0.OooOO0O.OooO00o(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(OooOo00.OooO00o.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListOooO00o.getDefaultColor();
        int[] iArr = f17450OooooOo;
        return new ColorStateList(new int[][]{iArr, f17449OooooOO, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListOooO00o.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    public final Drawable OooO0OO(@NonNull o0000O0 o0000o1, @Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new com.google.android.material.shape.OooO00o(com.google.android.material.shape.OooO00o.OooO00o(getContext(), o0000o1.OooOOO0(Oooo0.NavigationView_itemShapeAppearance, 0), o0000o1.OooOOO0(Oooo0.NavigationView_itemShapeAppearanceOverlay, 0))));
        materialShapeDrawable.OooOOOo(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, o0000o1.OooO0o(Oooo0.NavigationView_itemShapeInsetStart, 0), o0000o1.OooO0o(Oooo0.NavigationView_itemShapeInsetTop, 0), o0000o1.OooO0o(Oooo0.NavigationView_itemShapeInsetEnd, 0), o0000o1.OooO0o(Oooo0.NavigationView_itemShapeInsetBottom, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f17462Ooooo0o == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f17462Ooooo0o);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f17454OoooO0O.f17286OoooO00.f17309OooO0O0;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f17454OoooO0O.f17297OooooOO;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f17454OoooO0O.f17296OooooO0;
    }

    public int getHeaderCount() {
        return this.f17454OoooO0O.f17282Oooo0oO.getChildCount();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f17454OoooO0O.f17290OoooOOo;
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f17454OoooO0O.f17292OoooOoO;
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f17454OoooO0O.f17294Ooooo00;
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f17454OoooO0O.f17289OoooOOO;
    }

    public int getItemMaxLines() {
        return this.f17454OoooO0O.f17301OoooooO;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f17454OoooO0O.f17303o000oOoO;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.f17454OoooO0O.f17293OoooOoo;
    }

    @NonNull
    public Menu getMenu() {
        return this.f17453OoooO0;
    }

    @Px
    public int getSubheaderInsetEnd() {
        Objects.requireNonNull(this.f17454OoooO0O);
        return 0;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.f17454OoooO0O.f17298OooooOo;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00.OooO0OO(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f17457OoooOOo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f17455OoooOO0), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f17455OoooOO0, 1073741824);
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
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        this.f17453OoooO0.OooOo(savedState.f17466Oooo0oo);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f17466Oooo0oo = bundle;
        this.f17453OoooO0.OooOoO(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(getParent() instanceof DrawerLayout) || this.f17461Ooooo00 <= 0 || !(getBackground() instanceof MaterialShapeDrawable)) {
            this.f17462Ooooo0o = null;
            this.f17463OooooO0.setEmpty();
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        com.google.android.material.shape.OooO00o oooO00o = materialShapeDrawable.f17510Oooo0o.f17534OooO00o;
        Objects.requireNonNull(oooO00o);
        com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o);
        int i5 = this.f17460OoooOoo;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (Gravity.getAbsoluteGravity(i5, ViewCompat.OooO.OooO0Oo(this)) == 3) {
            c0110OooO00o.OooO0oO(this.f17461Ooooo00);
            c0110OooO00o.OooO0o0(this.f17461Ooooo00);
        } else {
            c0110OooO00o.OooO0o(this.f17461Ooooo00);
            c0110OooO00o.OooO0Oo(this.f17461Ooooo00);
        }
        materialShapeDrawable.setShapeAppearanceModel(c0110OooO00o.OooO00o());
        if (this.f17462Ooooo0o == null) {
            this.f17462Ooooo0o = new Path();
        }
        this.f17462Ooooo0o.reset();
        this.f17463OooooO0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i, i2);
        com.google.android.material.shape.OooO0O0 oooO0O0 = com.google.android.material.shape.OooO0O0.OooO00o.f17591OooO00o;
        MaterialShapeDrawable.OooO0O0 oooO0O1 = materialShapeDrawable.f17510Oooo0o;
        oooO0O0.OooO00o(oooO0O1.f17534OooO00o, oooO0O1.f17542OooOO0, this.f17463OooooO0, this.f17462Ooooo0o);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f17459OoooOoO = z;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem menuItemFindItem = this.f17453OoooO0.findItem(i);
        if (menuItemFindItem != null) {
            this.f17454OoooO0O.f17286OoooO00.OooO0O0((OooOO0) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@Px int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17297OooooOO = i;
        oooOOO0.OooO0Oo(false);
    }

    public void setDividerInsetStart(@Px int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17296OooooO0 = i;
        oooOOO0.OooO0Oo(false);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        o0O0O00.OooO0O0(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17290OoooOOo = drawable;
        oooOOO0.OooO0Oo(false);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        Context context = getContext();
        Object obj = o000O000.OooO00o.f28085OooO00o;
        setItemBackground(o000O000.OooO00o.OooO0OO.OooO0O0(context, i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17292OoooOoO = i;
        oooOOO0.OooO0Oo(false);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17292OoooOoO = getResources().getDimensionPixelSize(i);
        oooOOO0.OooO0Oo(false);
    }

    public void setItemIconPadding(@Dimension int i) {
        this.f17454OoooO0O.OooO00o(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f17454OoooO0O.OooO00o(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@Dimension int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        if (oooOOO0.f17295Ooooo0o != i) {
            oooOOO0.f17295Ooooo0o = i;
            oooOOO0.f17300Oooooo0 = true;
            oooOOO0.OooO0Oo(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17289OoooOOO = colorStateList;
        oooOOO0.OooO0Oo(false);
    }

    public void setItemMaxLines(int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17301OoooooO = i;
        oooOOO0.OooO0Oo(false);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17288OoooOO0 = i;
        oooOOO0.OooO0Oo(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17303o000oOoO = colorStateList;
        oooOOO0.OooO0Oo(false);
    }

    public void setItemVerticalPadding(@Px int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17293OoooOoo = i;
        oooOOO0.OooO0Oo(false);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17293OoooOoo = getResources().getDimensionPixelSize(i);
        oooOOO0.OooO0Oo(false);
    }

    public void setNavigationItemSelectedListener(@Nullable OooO0O0 oooO0O0) {
        this.f17452OoooO = oooO0O0;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        if (oooOOO0 != null) {
            oooOOO0.f17306ooOO = i;
            NavigationMenuView navigationMenuView = oooOOO0.f17281Oooo0o;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setSubheaderInsetEnd(@Px int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17298OooooOo = i;
        oooOOO0.OooO0Oo(false);
    }

    public void setSubheaderInsetStart(@Px int i) {
        OooOOO0 oooOOO0 = this.f17454OoooO0O;
        oooOOO0.f17298OooooOo = i;
        oooOOO0.OooO0Oo(false);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f17458OoooOo0 = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public Bundle f17466Oooo0oo;

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
            this.f17466Oooo0oo = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeBundle(this.f17466Oooo0oo);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ColorStateList colorStateListOooO0O0;
        int i2 = f17451Oooooo0;
        super(p352o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        OooOOO0 oooOOO0 = new OooOOO0();
        this.f17454OoooO0O = oooOOO0;
        this.f17464o000oOoO = new int[2];
        this.f17458OoooOo0 = true;
        this.f17459OoooOoO = true;
        this.f17460OoooOoo = 0;
        this.f17461Ooooo00 = 0;
        this.f17463OooooO0 = new RectF();
        Context context2 = getContext();
        OooOO0O oooOO0O = new OooOO0O(context2);
        this.f17453OoooO0 = oooOO0O;
        o0000O0 o0000o0OooO0o0 = o000oOoO.OooO0o0(context2, attributeSet, Oooo0.NavigationView, i, i2, new int[0]);
        int i3 = Oooo0.NavigationView_android_background;
        if (o0000o0OooO0o0.OooOOOo(i3)) {
            Drawable drawableOooO0oO = o0000o0OooO0o0.OooO0oO(i3);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, drawableOooO0oO);
        }
        this.f17461Ooooo00 = o0000o0OooO0o0.OooO0o(Oooo0.NavigationView_drawerLayoutCornerSize, 0);
        this.f17460OoooOoo = o0000o0OooO0o0.OooOO0(Oooo0.NavigationView_android_layout_gravity, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            com.google.android.material.shape.OooO00o oooO00o = new com.google.android.material.shape.OooO00o(com.google.android.material.shape.OooO00o.OooO0OO(context2, attributeSet, i, i2));
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(oooO00o);
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.OooOOOo(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.OooOOO0(context2);
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        }
        int i4 = Oooo0.NavigationView_elevation;
        if (o0000o0OooO0o0.OooOOOo(i4)) {
            setElevation(o0000o0OooO0o0.OooO0o(i4, 0));
        }
        setFitsSystemWindows(o0000o0OooO0o0.OooO00o(Oooo0.NavigationView_android_fitsSystemWindows, false));
        this.f17455OoooOO0 = o0000o0OooO0o0.OooO0o(Oooo0.NavigationView_android_maxWidth, 0);
        int i5 = Oooo0.NavigationView_subheaderColor;
        ColorStateList colorStateListOooO0OO = o0000o0OooO0o0.OooOOOo(i5) ? o0000o0OooO0o0.OooO0OO(i5) : null;
        int i6 = Oooo0.NavigationView_subheaderTextAppearance;
        int iOooOOO0 = o0000o0OooO0o0.OooOOOo(i6) ? o0000o0OooO0o0.OooOOO0(i6, 0) : 0;
        if (iOooOOO0 == 0 && colorStateListOooO0OO == null) {
            colorStateListOooO0OO = OooO0O0(R.attr.textColorSecondary);
        }
        int i7 = Oooo0.NavigationView_itemIconTint;
        if (o0000o0OooO0o0.OooOOOo(i7)) {
            colorStateListOooO0O0 = o0000o0OooO0o0.OooO0OO(i7);
        } else {
            colorStateListOooO0O0 = OooO0O0(R.attr.textColorSecondary);
        }
        int i8 = Oooo0.NavigationView_itemTextAppearance;
        int iOooOOO1 = o0000o0OooO0o0.OooOOOo(i8) ? o0000o0OooO0o0.OooOOO0(i8, 0) : 0;
        int i9 = Oooo0.NavigationView_itemIconSize;
        if (o0000o0OooO0o0.OooOOOo(i9)) {
            setItemIconSize(o0000o0OooO0o0.OooO0o(i9, 0));
        }
        int i10 = Oooo0.NavigationView_itemTextColor;
        ColorStateList colorStateListOooO0OO2 = o0000o0OooO0o0.OooOOOo(i10) ? o0000o0OooO0o0.OooO0OO(i10) : null;
        if (iOooOOO1 == 0 && colorStateListOooO0OO2 == null) {
            colorStateListOooO0OO2 = OooO0O0(R.attr.textColorPrimary);
        }
        Drawable drawableOooO0oO2 = o0000o0OooO0o0.OooO0oO(Oooo0.NavigationView_itemBackground);
        if (drawableOooO0oO2 == null) {
            if (o0000o0OooO0o0.OooOOOo(Oooo0.NavigationView_itemShapeAppearance) || o0000o0OooO0o0.OooOOOo(Oooo0.NavigationView_itemShapeAppearanceOverlay)) {
                drawableOooO0oO2 = OooO0OO(o0000o0OooO0o0, o0OOO0O.OooO0OO.OooO0O0(getContext(), o0000o0OooO0o0, Oooo0.NavigationView_itemShapeFillColor));
                ColorStateList colorStateListOooO0O1 = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, Oooo0.NavigationView_itemRippleColor);
                if (colorStateListOooO0O1 != null) {
                    oooOOO0.f17291OoooOo0 = new RippleDrawable(o0OOO0OO.OooO0O0.OooO0OO(colorStateListOooO0O1), null, OooO0OO(o0000o0OooO0o0, null));
                    oooOOO0.OooO0Oo(false);
                }
            }
        }
        int i11 = Oooo0.NavigationView_itemHorizontalPadding;
        if (o0000o0OooO0o0.OooOOOo(i11)) {
            setItemHorizontalPadding(o0000o0OooO0o0.OooO0o(i11, 0));
        }
        int i12 = Oooo0.NavigationView_itemVerticalPadding;
        if (o0000o0OooO0o0.OooOOOo(i12)) {
            setItemVerticalPadding(o0000o0OooO0o0.OooO0o(i12, 0));
        }
        setDividerInsetStart(o0000o0OooO0o0.OooO0o(Oooo0.NavigationView_dividerInsetStart, 0));
        setDividerInsetEnd(o0000o0OooO0o0.OooO0o(Oooo0.NavigationView_dividerInsetEnd, 0));
        setSubheaderInsetStart(o0000o0OooO0o0.OooO0o(Oooo0.NavigationView_subheaderInsetStart, 0));
        setSubheaderInsetEnd(o0000o0OooO0o0.OooO0o(Oooo0.NavigationView_subheaderInsetEnd, 0));
        setTopInsetScrimEnabled(o0000o0OooO0o0.OooO00o(Oooo0.NavigationView_topInsetScrimEnabled, this.f17458OoooOo0));
        setBottomInsetScrimEnabled(o0000o0OooO0o0.OooO00o(Oooo0.NavigationView_bottomInsetScrimEnabled, this.f17459OoooOoO));
        int iOooO0o = o0000o0OooO0o0.OooO0o(Oooo0.NavigationView_itemIconPadding, 0);
        setItemMaxLines(o0000o0OooO0o0.OooOO0(Oooo0.NavigationView_itemMaxLines, 1));
        oooOO0O.f4711OooO0o0 = new OooO00o();
        oooOOO0.f17280Oooo = 1;
        oooOOO0.OooO0oo(context2, oooOO0O);
        if (iOooOOO0 != 0) {
            oooOOO0.f17287OoooO0O = iOooOOO0;
            oooOOO0.OooO0Oo(false);
        }
        oooOOO0.f17284OoooO = colorStateListOooO0OO;
        oooOOO0.OooO0Oo(false);
        oooOOO0.f17289OoooOOO = colorStateListOooO0O0;
        oooOOO0.OooO0Oo(false);
        int overScrollMode = getOverScrollMode();
        oooOOO0.f17306ooOO = overScrollMode;
        NavigationMenuView navigationMenuView = oooOOO0.f17281Oooo0o;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (iOooOOO1 != 0) {
            oooOOO0.f17288OoooOO0 = iOooOOO1;
            oooOOO0.OooO0Oo(false);
        }
        oooOOO0.f17303o000oOoO = colorStateListOooO0OO2;
        oooOOO0.OooO0Oo(false);
        oooOOO0.f17290OoooOOo = drawableOooO0oO2;
        oooOOO0.OooO0Oo(false);
        oooOOO0.OooO00o(iOooO0o);
        oooOO0O.OooO0O0(oooOOO0);
        if (oooOOO0.f17281Oooo0o == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) oooOOO0.f17285OoooO0.inflate(OooOOOO.design_navigation_menu, (ViewGroup) this, false);
            oooOOO0.f17281Oooo0o = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(oooOOO0.new C0109OooOOO0(oooOOO0.f17281Oooo0o));
            if (oooOOO0.f17286OoooO00 == null) {
                oooOOO0.f17286OoooO00 = oooOOO0.new OooO0OO();
            }
            int i13 = oooOOO0.f17306ooOO;
            if (i13 != -1) {
                oooOOO0.f17281Oooo0o.setOverScrollMode(i13);
            }
            oooOOO0.f17282Oooo0oO = (LinearLayout) oooOOO0.f17285OoooO0.inflate(OooOOOO.design_navigation_item_header, (ViewGroup) oooOOO0.f17281Oooo0o, false);
            oooOOO0.f17281Oooo0o.setAdapter(oooOOO0.f17286OoooO00);
        }
        addView(oooOOO0.f17281Oooo0o);
        int i14 = Oooo0.NavigationView_menu;
        if (o0000o0OooO0o0.OooOOOo(i14)) {
            int iOooOOO2 = o0000o0OooO0o0.OooOOO0(i14, 0);
            oooOOO0.OooO0O0(true);
            getMenuInflater().inflate(iOooOOO2, oooOO0O);
            oooOOO0.OooO0O0(false);
            oooOOO0.OooO0Oo(false);
        }
        int i15 = Oooo0.NavigationView_headerLayout;
        if (o0000o0OooO0o0.OooOOOo(i15)) {
            oooOOO0.f17282Oooo0oO.addView(oooOOO0.f17285OoooO0.inflate(o0000o0OooO0o0.OooOOO0(i15, 0), (ViewGroup) oooOOO0.f17282Oooo0oO, false));
            NavigationMenuView navigationMenuView3 = oooOOO0.f17281Oooo0o;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        o0000o0OooO0o0.OooOOoo();
        this.f17457OoooOOo = new OooO0OO(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f17457OoooOOo);
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f17453OoooO0.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f17454OoooO0O.f17286OoooO00.OooO0O0((OooOO0) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
