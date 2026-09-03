package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o0OOO0O.OooO0OO;
import p012OooOo0.OooOO0O;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o00000;
import p347o0OOO0o0.o0O0O00;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, o00000 {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final int[] f16678Ooooo0o = {R.attr.state_checkable};

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final int[] f16679OooooO0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final int f16680OooooOO = Oooo000.Widget_MaterialComponents_Button;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.button.OooO00o f16681Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16682OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f16683OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OooO00o> f16684OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f16685OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public Drawable f16686OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Px
    public int f16687OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Px
    public int f16688OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Px
    public int f16689OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f16690OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f16691OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f16692Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Px
    public int f16693o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OooO00o {
        void OooO00o();
    }

    public interface OooO0O0 {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f16694Oooo0oo;

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
            @NonNull
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
            parcel.writeInt(this.f16694Oooo0oo ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f16694Oooo0oo = parcel.readInt() == 1;
        }
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private String getA11yClassName() {
        return (OooO00o() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public final boolean OooO00o() {
        com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
        return oooO00o != null && oooO00o.f16733OooOOo0;
    }

    public final boolean OooO0O0() {
        int i = this.f16692Ooooo00;
        return i == 3 || i == 4;
    }

    public final boolean OooO0OO() {
        int i = this.f16692Ooooo00;
        return i == 1 || i == 2;
    }

    public final boolean OooO0Oo() {
        int i = this.f16692Ooooo00;
        return i == 16 || i == 32;
    }

    public final void OooO0o() {
        if (OooO0OO()) {
            TextViewCompat.OooO0O0.OooO0o0(this, this.f16686OoooOO0, null, null, null);
        } else if (OooO0O0()) {
            TextViewCompat.OooO0O0.OooO0o0(this, null, null, this.f16686OoooOO0, null);
        } else if (OooO0Oo()) {
            TextViewCompat.OooO0O0.OooO0o0(this, null, this.f16686OoooOO0, null, null);
        }
    }

    public final boolean OooO0o0() {
        com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
        return (oooO00o == null || oooO00o.f16730OooOOOO) ? false : true;
    }

    public final void OooO0oO(boolean z) {
        Drawable drawable = this.f16686OoooOO0;
        boolean z2 = true;
        if (drawable != null) {
            Drawable drawableMutate = o0OOO0o.OooO0o0(drawable).mutate();
            this.f16686OoooOO0 = drawableMutate;
            o0OOO0o.OooO0O0.OooO0oo(drawableMutate, this.f16682OoooO);
            PorterDuff.Mode mode = this.f16685OoooO0O;
            if (mode != null) {
                o0OOO0o.OooO0O0.OooO(this.f16686OoooOO0, mode);
            }
            int intrinsicWidth = this.f16693o000oOoO;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f16686OoooOO0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f16693o000oOoO;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f16686OoooOO0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f16686OoooOO0;
            int i = this.f16687OoooOOO;
            int i2 = this.f16688OoooOOo;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f16686OoooOO0.setVisible(true, z);
        }
        if (z) {
            OooO0o();
            return;
        }
        Drawable[] drawableArrOooO00o = TextViewCompat.OooO0O0.OooO00o(this);
        Drawable drawable3 = drawableArrOooO00o[0];
        Drawable drawable4 = drawableArrOooO00o[1];
        Drawable drawable5 = drawableArrOooO00o[2];
        if ((!OooO0OO() || drawable3 == this.f16686OoooOO0) && ((!OooO0O0() || drawable5 == this.f16686OoooOO0) && (!OooO0Oo() || drawable4 == this.f16686OoooOO0))) {
            z2 = false;
        }
        if (z2) {
            OooO0o();
        }
    }

    public final void OooO0oo(int i, int i2) {
        if (this.f16686OoooOO0 == null || getLayout() == null) {
            return;
        }
        if (!OooO0OO() && !OooO0O0()) {
            if (OooO0Oo()) {
                this.f16687OoooOOO = 0;
                if (this.f16692Ooooo00 == 16) {
                    this.f16688OoooOOo = 0;
                    OooO0oO(false);
                    return;
                }
                int intrinsicHeight = this.f16693o000oOoO;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f16686OoooOO0.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f16689OoooOo0) - getPaddingBottom()) / 2;
                if (this.f16688OoooOOo != textHeight) {
                    this.f16688OoooOOo = textHeight;
                    OooO0oO(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f16688OoooOOo = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i3 = this.f16692Ooooo00;
        if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f16687OoooOOO = 0;
            OooO0oO(false);
            return;
        }
        int intrinsicWidth = this.f16693o000oOoO;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f16686OoooOO0.getIntrinsicWidth();
        }
        int textWidth = i - getTextWidth();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0o0 = (((textWidth - ViewCompat.OooO.OooO0o0(this)) - intrinsicWidth) - this.f16689OoooOo0) - ViewCompat.OooO.OooO0o(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iOooO0o0 /= 2;
        }
        if ((ViewCompat.OooO.OooO0Oo(this) == 1) != (this.f16692Ooooo00 == 4)) {
            iOooO0o0 = -iOooO0o0;
        }
        if (this.f16687OoooOOO != iOooO0o0) {
            this.f16687OoooOOO = iOooO0o0;
            OooO0oO(false);
        }
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (OooO0o0()) {
            return this.f16681Oooo.f16723OooO0oO;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f16686OoooOO0;
    }

    public int getIconGravity() {
        return this.f16692Ooooo00;
    }

    @Px
    public int getIconPadding() {
        return this.f16689OoooOo0;
    }

    @Px
    public int getIconSize() {
        return this.f16693o000oOoO;
    }

    public ColorStateList getIconTint() {
        return this.f16682OoooO;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f16685OoooO0O;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f16681Oooo.f16721OooO0o;
    }

    @Dimension
    public int getInsetTop() {
        return this.f16681Oooo.f16722OooO0o0;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (OooO0o0()) {
            return this.f16681Oooo.f16727OooOO0o;
        }
        return null;
    }

    @NonNull
    public com.google.android.material.shape.OooO00o getShapeAppearanceModel() {
        if (OooO0o0()) {
            return this.f16681Oooo.f16718OooO0O0;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (OooO0o0()) {
            return this.f16681Oooo.f16726OooOO0O;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (OooO0o0()) {
            return this.f16681Oooo.f16724OooO0oo;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return OooO0o0() ? this.f16681Oooo.f16725OooOO0 : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return OooO0o0() ? this.f16681Oooo.f16716OooO : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f16690OoooOoO;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (OooO0o0()) {
            o0O0O00.OooO0Oo(this, this.f16681Oooo.OooO0O0(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (OooO00o()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16678Ooooo0o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16679OooooO0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(OooO00o());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.google.android.material.button.OooO00o oooO00o;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (oooO00o = this.f16681Oooo) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = oooO00o.f16729OooOOO0;
            if (drawable != null) {
                drawable.setBounds(oooO00o.f16719OooO0OO, oooO00o.f16722OooO0o0, i6 - oooO00o.f16720OooO0Oo, i5 - oooO00o.f16721OooO0o);
            }
        }
        OooO0oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        setChecked(savedState.f16694Oooo0oo);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16694Oooo0oo = this.f16690OoooOoO;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        OooO0oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f16686OoooOO0 != null) {
            if (this.f16686OoooOO0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        if (!OooO0o0()) {
            super.setBackgroundColor(i);
            return;
        }
        com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
        if (oooO00o.OooO0O0(false) != null) {
            oooO00o.OooO0O0(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!OooO0o0()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
        oooO00o.f16730OooOOOO = true;
        oooO00o.f16717OooO00o.setSupportBackgroundTintList(oooO00o.f16725OooOO0);
        oooO00o.f16717OooO00o.setSupportBackgroundTintMode(oooO00o.f16716OooO);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? OooOO0O.OooO0O0(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (OooO0o0()) {
            this.f16681Oooo.f16733OooOOo0 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (OooO00o() && isEnabled() && this.f16690OoooOoO != z) {
            this.f16690OoooOoO = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.f16690OoooOoO;
                if (!materialButtonToggleGroup.f16701OoooO0) {
                    materialButtonToggleGroup.OooO0O0(getId(), z2);
                }
            }
            if (this.f16691OoooOoo) {
                return;
            }
            this.f16691OoooOoo = true;
            Iterator<OooO00o> it = this.f16684OoooO00.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
            this.f16691OoooOoo = false;
        }
    }

    public void setCornerRadius(@Px int i) {
        if (OooO0o0()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
            if (oooO00o.f16731OooOOOo && oooO00o.f16723OooO0oO == i) {
                return;
            }
            oooO00o.f16723OooO0oO = i;
            oooO00o.f16731OooOOOo = true;
            oooO00o.OooO0OO(oooO00o.f16718OooO0O0.OooO0oO(i));
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (OooO0o0()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (OooO0o0()) {
            this.f16681Oooo.OooO0O0(false).OooOOOO(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f16686OoooOO0 != drawable) {
            this.f16686OoooOO0 = drawable;
            OooO0oO(true);
            OooO0oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f16692Ooooo00 != i) {
            this.f16692Ooooo00 = i;
            OooO0oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i) {
        if (this.f16689OoooOo0 != i) {
            this.f16689OoooOo0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@DrawableRes int i) {
        setIcon(i != 0 ? OooOO0O.OooO0O0(getContext(), i) : null);
    }

    public void setIconSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f16693o000oOoO != i) {
            this.f16693o000oOoO = i;
            OooO0oO(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f16682OoooO != colorStateList) {
            this.f16682OoooO = colorStateList;
            OooO0oO(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f16685OoooO0O != mode) {
            this.f16685OoooO0O = mode;
            OooO0oO(false);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(OooOO0O.OooO00o(getContext(), i));
    }

    public void setInsetBottom(@Dimension int i) {
        com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
        oooO00o.OooO0Oo(oooO00o.f16722OooO0o0, i);
    }

    public void setInsetTop(@Dimension int i) {
        com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
        oooO00o.OooO0Oo(i, oooO00o.f16721OooO0o);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable OooO0O0 oooO0O0) {
        this.f16683OoooO0 = oooO0O0;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        OooO0O0 oooO0O0 = this.f16683OoooO0;
        if (oooO0O0 != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (OooO0o0()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
            if (oooO00o.f16727OooOO0o != colorStateList) {
                oooO00o.f16727OooOO0o = colorStateList;
                boolean z = com.google.android.material.button.OooO00o.f16715OooOo00;
                if (z && (oooO00o.f16717OooO00o.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) oooO00o.f16717OooO00o.getBackground()).setColor(o0OOO0OO.OooO0O0.OooO0OO(colorStateList));
                } else {
                    if (z || !(oooO00o.f16717OooO00o.getBackground() instanceof o0OOO0OO.OooO00o)) {
                        return;
                    }
                    ((o0OOO0OO.OooO00o) oooO00o.f16717OooO00o.getBackground()).setTintList(o0OOO0OO.OooO0O0.OooO0OO(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (OooO0o0()) {
            setRippleColor(OooOO0O.OooO00o(getContext(), i));
        }
    }

    @Override // p347o0OOO0o0.o00000
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        if (!OooO0o0()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f16681Oooo.OooO0OO(oooO00o);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (OooO0o0()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
            oooO00o.f16728OooOOO = z;
            oooO00o.OooO0o();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (OooO0o0()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
            if (oooO00o.f16726OooOO0O != colorStateList) {
                oooO00o.f16726OooOO0O = colorStateList;
                oooO00o.OooO0o();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (OooO0o0()) {
            setStrokeColor(OooOO0O.OooO00o(getContext(), i));
        }
    }

    public void setStrokeWidth(@Px int i) {
        if (OooO0o0()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
            if (oooO00o.f16724OooO0oo != i) {
                oooO00o.f16724OooO0oo = i;
                oooO00o.OooO0o();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (OooO0o0()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!OooO0o0()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
        if (oooO00o.f16725OooOO0 != colorStateList) {
            oooO00o.f16725OooOO0 = colorStateList;
            if (oooO00o.OooO0O0(false) != null) {
                o0OOO0o.OooO0O0.OooO0oo(oooO00o.OooO0O0(false), oooO00o.f16725OooOO0);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!OooO0o0()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        com.google.android.material.button.OooO00o oooO00o = this.f16681Oooo;
        if (oooO00o.f16716OooO != mode) {
            oooO00o.f16716OooO = mode;
            if (oooO00o.OooO0O0(false) == null || oooO00o.f16716OooO == null) {
                return;
            }
            o0OOO0o.OooO0O0.OooO(oooO00o.OooO0O0(false), oooO00o.f16716OooO);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        OooO0oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f16690OoooOoO);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16680OooooOO;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16684OoooO00 = new LinkedHashSet<>();
        this.f16690OoooOoO = false;
        this.f16691OoooOoo = false;
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.MaterialButton, i, i2, new int[0]);
        this.f16689OoooOo0 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialButton_iconPadding, 0);
        this.f16685OoooO0O = o00Ooo.OooO0oO(typedArrayOooO0Oo.getInt(Oooo0.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f16682OoooO = OooO0OO.OooO00o(getContext(), typedArrayOooO0Oo, Oooo0.MaterialButton_iconTint);
        this.f16686OoooOO0 = OooO0OO.OooO0Oo(getContext(), typedArrayOooO0Oo, Oooo0.MaterialButton_icon);
        this.f16692Ooooo00 = typedArrayOooO0Oo.getInteger(Oooo0.MaterialButton_iconGravity, 1);
        this.f16693o000oOoO = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialButton_iconSize, 0);
        com.google.android.material.button.OooO00o oooO00o = new com.google.android.material.button.OooO00o(this, com.google.android.material.shape.OooO00o.OooO0OO(context2, attributeSet, i, i2).OooO00o());
        this.f16681Oooo = oooO00o;
        Objects.requireNonNull(oooO00o);
        oooO00o.f16719OooO0OO = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.MaterialButton_android_insetLeft, 0);
        oooO00o.f16720OooO0Oo = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.MaterialButton_android_insetRight, 0);
        oooO00o.f16722OooO0o0 = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.MaterialButton_android_insetTop, 0);
        oooO00o.f16721OooO0o = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.MaterialButton_android_insetBottom, 0);
        int i3 = Oooo0.MaterialButton_cornerRadius;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(i3, -1);
            oooO00o.f16723OooO0oO = dimensionPixelSize;
            oooO00o.OooO0OO(oooO00o.f16718OooO0O0.OooO0oO(dimensionPixelSize));
            oooO00o.f16731OooOOOo = true;
        }
        oooO00o.f16724OooO0oo = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialButton_strokeWidth, 0);
        oooO00o.f16716OooO = o00Ooo.OooO0oO(typedArrayOooO0Oo.getInt(Oooo0.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        oooO00o.f16725OooOO0 = OooO0OO.OooO00o(getContext(), typedArrayOooO0Oo, Oooo0.MaterialButton_backgroundTint);
        oooO00o.f16726OooOO0O = OooO0OO.OooO00o(getContext(), typedArrayOooO0Oo, Oooo0.MaterialButton_strokeColor);
        oooO00o.f16727OooOO0o = OooO0OO.OooO00o(getContext(), typedArrayOooO0Oo, Oooo0.MaterialButton_rippleColor);
        oooO00o.f16733OooOOo0 = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialButton_android_checkable, false);
        oooO00o.f16734OooOOoo = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialButton_elevation, 0);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0o = ViewCompat.OooO.OooO0o(this);
        int paddingTop = getPaddingTop();
        int iOooO0o0 = ViewCompat.OooO.OooO0o0(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayOooO0Oo.hasValue(Oooo0.MaterialButton_android_background)) {
            oooO00o.f16730OooOOOO = true;
            setSupportBackgroundTintList(oooO00o.f16725OooOO0);
            setSupportBackgroundTintMode(oooO00o.f16716OooO);
        } else {
            oooO00o.OooO0o0();
        }
        ViewCompat.OooO.OooOO0O(this, iOooO0o + oooO00o.f16719OooO0OO, paddingTop + oooO00o.f16722OooO0o0, iOooO0o0 + oooO00o.f16720OooO0Oo, paddingBottom + oooO00o.f16721OooO0o);
        typedArrayOooO0Oo.recycle();
        setCompoundDrawablePadding(this.f16689OoooOo0);
        OooO0oO(this.f16686OoooOO0 != null);
    }
}
