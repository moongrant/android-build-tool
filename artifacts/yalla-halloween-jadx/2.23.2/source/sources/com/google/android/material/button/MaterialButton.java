package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
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
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p013OooOo0o.o00Oo0;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p276o0O00OoO.OooO0o;
import p277o0O00Ooo.OooOOOO;
import p280o0O00o0O.OooOo00;
import p280o0O00o0O.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, o0OoOo0 {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final int[] f16061OooOo0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final int[] f16062OooOo0O = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final int f16063OooOo0o = o0000O0O.Widget_MaterialComponents_Button;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f16064OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.button.OooO00o f16065OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OooO00o> f16066OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f16067OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16068OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Drawable f16069OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Px
    public int f16070OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public String f16071OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Px
    public int f16072OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Px
    public int f16073OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f16074OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Px
    public int f16075OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f16076OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f16077OooOo00;

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

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f16078OooO0o;

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

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f16078OooO0o = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeInt(this.f16078OooO0o ? 1 : 0);
        }
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
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
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean OooO00o() {
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        return (oooO00o == null || oooO00o.f16112OooOOOO) ? false : true;
    }

    public final void OooO0O0() {
        int i = this.f16077OooOo00;
        if (i == 1 || i == 2) {
            TextViewCompat.OooO0O0.OooO0o0(this, this.f16069OooOO0o, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            TextViewCompat.OooO0O0.OooO0o0(this, null, null, this.f16069OooOO0o, null);
            return;
        }
        if (i == 16 || i == 32) {
            TextViewCompat.OooO0O0.OooO0o0(this, null, this.f16069OooOO0o, null, null);
        }
    }

    public final void OooO0OO(boolean z) {
        Drawable drawable = this.f16069OooOO0o;
        boolean z2 = true;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f16069OooOO0o = drawableMutate;
            o00Ooo.OooO0O0.OooO0oo(drawableMutate, this.f16068OooOO0O);
            PorterDuff.Mode mode = this.f16067OooOO0;
            if (mode != null) {
                o00Ooo.OooO0O0.OooO(this.f16069OooOO0o, mode);
            }
            int intrinsicWidth = this.f16070OooOOO;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f16069OooOO0o.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f16070OooOOO;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f16069OooOO0o.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f16069OooOO0o;
            int i = this.f16072OooOOOO;
            int i2 = this.f16073OooOOOo;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f16069OooOO0o.setVisible(true, z);
        }
        if (z) {
            OooO0O0();
            return;
        }
        Drawable[] drawableArrOooO00o = TextViewCompat.OooO0O0.OooO00o(this);
        Drawable drawable3 = drawableArrOooO00o[0];
        Drawable drawable4 = drawableArrOooO00o[1];
        Drawable drawable5 = drawableArrOooO00o[2];
        int i3 = this.f16077OooOo00;
        if (!(i3 == 1 || i3 == 2) || drawable3 == this.f16069OooOO0o) {
            if (!(i3 == 3 || i3 == 4) || drawable5 == this.f16069OooOO0o) {
                if (!(i3 == 16 || i3 == 32) || drawable4 == this.f16069OooOO0o) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            OooO0O0();
        }
    }

    public final void OooO0Oo(int i, int i2) {
        if (this.f16069OooOO0o == null || getLayout() == null) {
            return;
        }
        int i3 = this.f16077OooOo00;
        boolean z = true;
        if (!(i3 == 1 || i3 == 2)) {
            if (!(i3 == 3 || i3 == 4)) {
                if (i3 != 16 && i3 != 32) {
                    z = false;
                }
                if (z) {
                    this.f16072OooOOOO = 0;
                    if (i3 == 16) {
                        this.f16073OooOOOo = 0;
                        OooO0OO(false);
                        return;
                    }
                    int intrinsicHeight = this.f16070OooOOO;
                    if (intrinsicHeight == 0) {
                        intrinsicHeight = this.f16069OooOO0o.getIntrinsicHeight();
                    }
                    int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f16075OooOOo0) - getPaddingBottom()) / 2);
                    if (this.f16073OooOOOo != iMax) {
                        this.f16073OooOOOo = iMax;
                        OooO0OO(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.f16073OooOOOo = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f16077OooOo00;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f16072OooOOOO = 0;
            OooO0OO(false);
            return;
        }
        int intrinsicWidth = this.f16070OooOOO;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f16069OooOO0o.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0o0 = (((textLayoutWidth - ViewCompat.OooO.OooO0o0(this)) - intrinsicWidth) - this.f16075OooOOo0) - ViewCompat.OooO.OooO0o(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iOooO0o0 /= 2;
        }
        if ((ViewCompat.OooO.OooO0Oo(this) == 1) != (this.f16077OooOo00 == 4)) {
            iOooO0o0 = -iOooO0o0;
        }
        if (this.f16072OooOOOO != iOooO0o0) {
            this.f16072OooOOOO = iOooO0o0;
            OooO0OO(false);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f16071OooOOO0)) {
            return this.f16071OooOOO0;
        }
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        return (oooO00o != null && oooO00o.f16115OooOOo0 ? CompoundButton.class : Button.class).getName();
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
        if (OooO00o()) {
            return this.f16065OooO0oO.f16105OooO0oO;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f16069OooOO0o;
    }

    public int getIconGravity() {
        return this.f16077OooOo00;
    }

    @Px
    public int getIconPadding() {
        return this.f16075OooOOo0;
    }

    @Px
    public int getIconSize() {
        return this.f16070OooOOO;
    }

    public ColorStateList getIconTint() {
        return this.f16068OooOO0O;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f16067OooOO0;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f16065OooO0oO.f16103OooO0o;
    }

    @Dimension
    public int getInsetTop() {
        return this.f16065OooO0oO.f16104OooO0o0;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (OooO00o()) {
            return this.f16065OooO0oO.f16109OooOO0o;
        }
        return null;
    }

    @NonNull
    public com.google.android.material.shape.OooO0O0 getShapeAppearanceModel() {
        if (OooO00o()) {
            return this.f16065OooO0oO.f16100OooO0O0;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (OooO00o()) {
            return this.f16065OooO0oO.f16108OooOO0O;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (OooO00o()) {
            return this.f16065OooO0oO.f16106OooO0oo;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return OooO00o() ? this.f16065OooO0oO.f16107OooOO0 : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return OooO00o() ? this.f16065OooO0oO.f16098OooO : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f16074OooOOo;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (OooO00o()) {
            OooOo00.OooO0Oo(this, this.f16065OooO0oO.OooO0O0(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        if (oooO00o != null && oooO00o.f16115OooOOo0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16061OooOo0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16062OooOo0O);
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
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        accessibilityNodeInfo.setCheckable(oooO00o != null && oooO00o.f16115OooOOo0);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        setChecked(savedState.f16078OooO0o);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16078OooO0o = this.f16074OooOOo;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f16065OooO0oO.f16114OooOOo) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f16069OooOO0o != null) {
            if (this.f16069OooOO0o.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(@Nullable String str) {
        this.f16071OooOOO0 = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        if (!OooO00o()) {
            super.setBackgroundColor(i);
            return;
        }
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        if (oooO00o.OooO0O0(false) != null) {
            oooO00o.OooO0O0(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!OooO00o()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        oooO00o.f16112OooOOOO = true;
        ColorStateList colorStateList = oooO00o.f16107OooOO0;
        MaterialButton materialButton = oooO00o.f16099OooO00o;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(oooO00o.f16098OooO);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? o00Oo0.OooO00o(getContext(), i) : null);
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
        if (OooO00o()) {
            this.f16065OooO0oO.f16115OooOOo0 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        if ((oooO00o != null && oooO00o.f16115OooOOo0) && isEnabled() && this.f16074OooOOo != z) {
            this.f16074OooOOo = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.f16074OooOOo;
                if (!materialButtonToggleGroup.f16080OooO) {
                    materialButtonToggleGroup.OooO0O0(getId(), z2);
                }
            }
            if (this.f16076OooOOoo) {
                return;
            }
            this.f16076OooOOoo = true;
            Iterator<OooO00o> it = this.f16066OooO0oo.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
            this.f16076OooOOoo = false;
        }
    }

    public void setCornerRadius(@Px int i) {
        if (OooO00o()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
            if (oooO00o.f16113OooOOOo && oooO00o.f16105OooO0oO == i) {
                return;
            }
            oooO00o.f16105OooO0oO = i;
            oooO00o.f16113OooOOOo = true;
            oooO00o.OooO0OO(oooO00o.f16100OooO0O0.OooO0oO(i));
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (OooO00o()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (OooO00o()) {
            this.f16065OooO0oO.OooO0O0(false).OooOOO0(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f16069OooOO0o != drawable) {
            this.f16069OooOO0o = drawable;
            OooO0OO(true);
            OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f16077OooOo00 != i) {
            this.f16077OooOo00 = i;
            OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i) {
        if (this.f16075OooOOo0 != i) {
            this.f16075OooOOo0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@DrawableRes int i) {
        setIcon(i != 0 ? o00Oo0.OooO00o(getContext(), i) : null);
    }

    public void setIconSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f16070OooOOO != i) {
            this.f16070OooOOO = i;
            OooO0OO(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f16068OooOO0O != colorStateList) {
            this.f16068OooOO0O = colorStateList;
            OooO0OO(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f16067OooOO0 != mode) {
            this.f16067OooOO0 = mode;
            OooO0OO(false);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(ContextCompat.OooO0O0(i, getContext()));
    }

    public void setInsetBottom(@Dimension int i) {
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        oooO00o.OooO0Oo(oooO00o.f16104OooO0o0, i);
    }

    public void setInsetTop(@Dimension int i) {
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        oooO00o.OooO0Oo(i, oooO00o.f16103OooO0o);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable OooO0O0 oooO0O0) {
        this.f16064OooO = oooO0O0;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        OooO0O0 oooO0O0 = this.f16064OooO;
        if (oooO0O0 != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (OooO00o()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
            if (oooO00o.f16109OooOO0o != colorStateList) {
                oooO00o.f16109OooOO0o = colorStateList;
                MaterialButton materialButton = oooO00o.f16099OooO00o;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(OooOOOO.OooO0OO(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (OooO00o()) {
            setRippleColor(ContextCompat.OooO0O0(i, getContext()));
        }
    }

    @Override // p280o0O00o0O.o0OoOo0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        if (!OooO00o()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f16065OooO0oO.OooO0OO(oooO0O0);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (OooO00o()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
            oooO00o.f16110OooOOO = z;
            oooO00o.OooO0o();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (OooO00o()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
            if (oooO00o.f16108OooOO0O != colorStateList) {
                oooO00o.f16108OooOO0O = colorStateList;
                oooO00o.OooO0o();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (OooO00o()) {
            setStrokeColor(ContextCompat.OooO0O0(i, getContext()));
        }
    }

    public void setStrokeWidth(@Px int i) {
        if (OooO00o()) {
            com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
            if (oooO00o.f16106OooO0oo != i) {
                oooO00o.f16106OooO0oo = i;
                oooO00o.OooO0o();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (OooO00o()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!OooO00o()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        if (oooO00o.f16107OooOO0 != colorStateList) {
            oooO00o.f16107OooOO0 = colorStateList;
            if (oooO00o.OooO0O0(false) != null) {
                o00Ooo.OooO0O0.OooO0oo(oooO00o.OooO0O0(false), oooO00o.f16107OooOO0);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!OooO00o()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        com.google.android.material.button.OooO00o oooO00o = this.f16065OooO0oO;
        if (oooO00o.f16098OooO != mode) {
            oooO00o.f16098OooO = mode;
            if (oooO00o.OooO0O0(false) == null || oooO00o.f16098OooO == null) {
                return;
            }
            o00Ooo.OooO0O0.OooO(oooO00o.OooO0O0(false), oooO00o.f16098OooO);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f16065OooO0oO.f16114OooOOo = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f16074OooOOo);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16063OooOo0o;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16066OooO0oo = new LinkedHashSet<>();
        this.f16074OooOOo = false;
        this.f16076OooOOoo = false;
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.MaterialButton, i, i2, new int[0]);
        this.f16075OooOOo0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialButton_iconPadding, 0);
        this.f16067OooOO0 = oo0o0Oo.OooO0oO(typedArrayOooO0Oo.getInt(o000OO.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f16068OooOO0O = OooO0o.OooO00o(getContext(), typedArrayOooO0Oo, o000OO.MaterialButton_iconTint);
        this.f16069OooOO0o = OooO0o.OooO0Oo(getContext(), typedArrayOooO0Oo, o000OO.MaterialButton_icon);
        this.f16077OooOo00 = typedArrayOooO0Oo.getInteger(o000OO.MaterialButton_iconGravity, 1);
        this.f16070OooOOO = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialButton_iconSize, 0);
        com.google.android.material.button.OooO00o oooO00o = new com.google.android.material.button.OooO00o(this, new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context2, attributeSet, i, i2)));
        this.f16065OooO0oO = oooO00o;
        oooO00o.f16101OooO0OO = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialButton_android_insetLeft, 0);
        oooO00o.f16102OooO0Oo = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialButton_android_insetRight, 0);
        oooO00o.f16104OooO0o0 = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialButton_android_insetTop, 0);
        oooO00o.f16103OooO0o = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialButton_android_insetBottom, 0);
        int i3 = o000OO.MaterialButton_cornerRadius;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(i3, -1);
            oooO00o.f16105OooO0oO = dimensionPixelSize;
            oooO00o.OooO0OO(oooO00o.f16100OooO0O0.OooO0oO(dimensionPixelSize));
            oooO00o.f16113OooOOOo = true;
        }
        oooO00o.f16106OooO0oo = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialButton_strokeWidth, 0);
        oooO00o.f16098OooO = oo0o0Oo.OooO0oO(typedArrayOooO0Oo.getInt(o000OO.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        oooO00o.f16107OooOO0 = OooO0o.OooO00o(getContext(), typedArrayOooO0Oo, o000OO.MaterialButton_backgroundTint);
        oooO00o.f16108OooOO0O = OooO0o.OooO00o(getContext(), typedArrayOooO0Oo, o000OO.MaterialButton_strokeColor);
        oooO00o.f16109OooOO0o = OooO0o.OooO00o(getContext(), typedArrayOooO0Oo, o000OO.MaterialButton_rippleColor);
        oooO00o.f16115OooOOo0 = typedArrayOooO0Oo.getBoolean(o000OO.MaterialButton_android_checkable, false);
        oooO00o.f16117OooOo00 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialButton_elevation, 0);
        oooO00o.f16114OooOOo = typedArrayOooO0Oo.getBoolean(o000OO.MaterialButton_toggleCheckedStateOnClick, true);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0o = ViewCompat.OooO.OooO0o(this);
        int paddingTop = getPaddingTop();
        int iOooO0o0 = ViewCompat.OooO.OooO0o0(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayOooO0Oo.hasValue(o000OO.MaterialButton_android_background)) {
            oooO00o.f16112OooOOOO = true;
            setSupportBackgroundTintList(oooO00o.f16107OooOO0);
            setSupportBackgroundTintMode(oooO00o.f16098OooO);
        } else {
            oooO00o.OooO0o0();
        }
        ViewCompat.OooO.OooOO0O(this, iOooO0o + oooO00o.f16101OooO0OO, paddingTop + oooO00o.f16104OooO0o0, iOooO0o0 + oooO00o.f16102OooO0Oo, paddingBottom + oooO00o.f16103OooO0o);
        typedArrayOooO0Oo.recycle();
        setCompoundDrawablePadding(this.f16075OooOOo0);
        OooO0OO(this.f16069OooOO0o != null);
    }
}
