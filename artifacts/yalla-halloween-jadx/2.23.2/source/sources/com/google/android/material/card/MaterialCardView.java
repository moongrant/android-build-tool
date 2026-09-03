package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p013OooOo0o.o00Oo0;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p274o0O000oo.OooOOO0;
import p276o0O00OoO.OooO0o;
import p277o0O00Ooo.OooOOOO;
import p280o0O00o0O.OooOo00;
import p280o0O00o0O.o0OoOo0;
import p446o0OoOoOO.o0oO0Ooo;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, o0OoOo0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final o0oO0Ooo f16122OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f16123OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f16124OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f16125OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final int[] f16118OooOOOO = {R.attr.state_checkable};

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int[] f16119OooOOOo = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final int[] f16121OooOOo0 = {o00000.state_dragged};

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final int f16120OooOOo = o0000O0O.Widget_MaterialComponents_CardView;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OooO00o {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f16122OooOO0O.f47367OooO0OO.getBounds());
        return rectF;
    }

    public final void OooO0o() {
        o0oO0Ooo o0oo0ooo2;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (o0oo0ooo2 = this.f16122OooOO0O).f47378OooOOOO) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        o0oo0ooo2.f47378OooOOOO.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        o0oo0ooo2.f47378OooOOOO.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f16122OooOO0O.f47367OooO0OO.f17105OooO0Oo.f17130OooO0OO;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f16122OooOO0O.f47368OooO0Oo.f17105OooO0Oo.f17130OooO0OO;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f16122OooOO0O.f47373OooOO0;
    }

    public int getCheckedIconGravity() {
        return this.f16122OooOO0O.f47371OooO0oO;
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f16122OooOO0O.f47370OooO0o0;
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f16122OooOO0O.f47369OooO0o;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f16122OooOO0O.f47375OooOO0o;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f16122OooOO0O.f47366OooO0O0.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f16122OooOO0O.f47366OooO0O0.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f16122OooOO0O.f47366OooO0O0.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f16122OooOO0O.f47366OooO0O0.top;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f16122OooOO0O.f47367OooO0OO.f17105OooO0Oo.f17136OooOO0;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f16122OooOO0O.f47367OooO0OO.OooOO0();
    }

    public ColorStateList getRippleColor() {
        return this.f16122OooOO0O.f47374OooOO0O;
    }

    @NonNull
    public OooO0O0 getShapeAppearanceModel() {
        return this.f16122OooOO0O.f47377OooOOO0;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f16122OooOO0O.f47376OooOOO;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f16122OooOO0O.f47376OooOOO;
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f16122OooOO0O.f47372OooO0oo;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f16125OooOOO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOo00.OooO0Oo(this, this.f16122OooOO0O.f47367OooO0OO);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        if (o0oo0ooo2 != null && o0oo0ooo2.f47382OooOOoo) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16118OooOOOO);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16119OooOOOo);
        }
        if (this.f16124OooOOO) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16121OooOOo0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        accessibilityNodeInfo.setCheckable(o0oo0ooo2 != null && o0oo0ooo2.f47382OooOOoo);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f16122OooOO0O.OooO0o0(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f16123OooOO0o) {
            o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
            if (!o0oo0ooo2.f47380OooOOo) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                o0oo0ooo2.f47380OooOOo = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f16122OooOO0O.f47367OooO0OO.OooOOO(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        o0oo0ooo2.f47367OooO0OO.OooOOO0(o0oo0ooo2.f47365OooO00o.getCardElevation());
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f16122OooOO0O.f47368OooO0Oo;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.OooOOO(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f16122OooOO0O.f47382OooOOoo = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f16125OooOOO0 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f16122OooOO0O.OooO0oO(drawable);
    }

    public void setCheckedIconGravity(int i) {
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        if (o0oo0ooo2.f47371OooO0oO != i) {
            o0oo0ooo2.f47371OooO0oO = i;
            MaterialCardView materialCardView = o0oo0ooo2.f47365OooO00o;
            o0oo0ooo2.OooO0o0(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(@Dimension int i) {
        this.f16122OooOO0O.f47370OooO0o0 = i;
    }

    public void setCheckedIconMarginResource(@DimenRes int i) {
        if (i != -1) {
            this.f16122OooOO0O.f47370OooO0o0 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        this.f16122OooOO0O.OooO0oO(o00Oo0.OooO00o(getContext(), i));
    }

    public void setCheckedIconSize(@Dimension int i) {
        this.f16122OooOO0O.f47369OooO0o = i;
    }

    public void setCheckedIconSizeResource(@DimenRes int i) {
        if (i != 0) {
            this.f16122OooOO0O.f47369OooO0o = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        o0oo0ooo2.f47375OooOO0o = colorStateList;
        Drawable drawable = o0oo0ooo2.f47373OooOO0;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO0oo(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        if (o0oo0ooo2 != null) {
            Drawable drawable = o0oo0ooo2.f47364OooO;
            MaterialCardView materialCardView = o0oo0ooo2.f47365OooO00o;
            Drawable drawableOooO0OO = materialCardView.isClickable() ? o0oo0ooo2.OooO0OO() : o0oo0ooo2.f47368OooO0Oo;
            o0oo0ooo2.f47364OooO = drawableOooO0OO;
            if (drawable != drawableOooO0OO) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableOooO0OO);
                } else {
                    materialCardView.setForeground(o0oo0ooo2.OooO0Oo(drawableOooO0OO));
                }
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.f16124OooOOO != z) {
            this.f16124OooOOO = z;
            refreshDrawableState();
            OooO0o();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f16122OooOO0O.OooOO0O();
    }

    public void setOnCheckedChangeListener(@Nullable OooO00o oooO00o) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        o0oo0ooo2.OooOO0O();
        o0oo0ooo2.OooOO0();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        o0oo0ooo2.f47367OooO0OO.OooOOOO(f);
        MaterialShapeDrawable materialShapeDrawable = o0oo0ooo2.f47368OooO0Oo;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.OooOOOO(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = o0oo0ooo2.f47381OooOOo0;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.OooOOOO(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        o0oo0ooo2.OooO0oo(o0oo0ooo2.f47377OooOOO0.OooO0oO(f));
        o0oo0ooo2.f47364OooO.invalidateSelf();
        if (o0oo0ooo2.OooO()) {
            o0oo0ooo2.OooOO0();
        } else {
            if (o0oo0ooo2.f47365OooO00o.getPreventCornerOverlap() && !o0oo0ooo2.f47367OooO0OO.OooOO0o()) {
                o0oo0ooo2.OooOO0();
            }
        }
        if (o0oo0ooo2.OooO()) {
            o0oo0ooo2.OooOO0O();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        o0oo0ooo2.f47374OooOO0O = colorStateList;
        int[] iArr = OooOOOO.f41031OooO00o;
        RippleDrawable rippleDrawable = o0oo0ooo2.f47378OooOOOO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        ColorStateList colorStateListOooO0O0 = ContextCompat.OooO0O0(i, getContext());
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        o0oo0ooo2.f47374OooOO0O = colorStateListOooO0O0;
        int[] iArr = OooOOOO.f41031OooO00o;
        RippleDrawable rippleDrawable = o0oo0ooo2.f47378OooOOOO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListOooO0O0);
        }
    }

    @Override // p280o0O00o0O.o0OoOo0
    public void setShapeAppearanceModel(@NonNull OooO0O0 oooO0O0) {
        setClipToOutline(oooO0O0.OooO0o(getBoundsAsRectF()));
        this.f16122OooOO0O.OooO0oo(oooO0O0);
    }

    public void setStrokeColor(@ColorInt int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@Dimension int i) {
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        if (i != o0oo0ooo2.f47372OooO0oo) {
            o0oo0ooo2.f47372OooO0oo = i;
            MaterialShapeDrawable materialShapeDrawable = o0oo0ooo2.f47368OooO0Oo;
            ColorStateList colorStateList = o0oo0ooo2.f47376OooOOO;
            materialShapeDrawable.OooOo00(i);
            materialShapeDrawable.OooOOoo(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        o0oo0ooo2.OooOO0O();
        o0oo0ooo2.OooOO0();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        if ((o0oo0ooo2 != null && o0oo0ooo2.f47382OooOOoo) && isEnabled()) {
            this.f16125OooOOO0 = !this.f16125OooOOO0;
            refreshDrawableState();
            OooO0o();
            o0oo0ooo2.OooO0o(this.f16125OooOOO0, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        o0oO0Ooo o0oo0ooo2 = this.f16122OooOO0O;
        if (o0oo0ooo2.f47376OooOOO != colorStateList) {
            o0oo0ooo2.f47376OooOOO = colorStateList;
            MaterialShapeDrawable materialShapeDrawable = o0oo0ooo2.f47368OooO0Oo;
            materialShapeDrawable.OooOo00(o0oo0ooo2.f47372OooO0oo);
            materialShapeDrawable.OooOOoo(colorStateList);
        }
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        int i2 = f16120OooOOo;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16125OooOOO0 = false;
        this.f16124OooOOO = false;
        this.f16123OooOO0o = true;
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(getContext(), attributeSet, o000OO.MaterialCardView, i, i2, new int[0]);
        o0oO0Ooo o0oo0ooo2 = new o0oO0Ooo(this, attributeSet, i);
        this.f16122OooOO0O = o0oo0ooo2;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        MaterialShapeDrawable materialShapeDrawable = o0oo0ooo2.f47367OooO0OO;
        materialShapeDrawable.OooOOO(cardBackgroundColor);
        o0oo0ooo2.f47366OooO0O0.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        o0oo0ooo2.OooOO0();
        MaterialCardView materialCardView = o0oo0ooo2.f47365OooO00o;
        ColorStateList colorStateListOooO00o = OooO0o.OooO00o(materialCardView.getContext(), typedArrayOooO0Oo, o000OO.MaterialCardView_strokeColor);
        o0oo0ooo2.f47376OooOOO = colorStateListOooO00o;
        if (colorStateListOooO00o == null) {
            o0oo0ooo2.f47376OooOOO = ColorStateList.valueOf(-1);
        }
        o0oo0ooo2.f47372OooO0oo = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialCardView_strokeWidth, 0);
        boolean z = typedArrayOooO0Oo.getBoolean(o000OO.MaterialCardView_android_checkable, false);
        o0oo0ooo2.f47382OooOOoo = z;
        materialCardView.setLongClickable(z);
        o0oo0ooo2.f47375OooOO0o = OooO0o.OooO00o(materialCardView.getContext(), typedArrayOooO0Oo, o000OO.MaterialCardView_checkedIconTint);
        o0oo0ooo2.OooO0oO(OooO0o.OooO0Oo(materialCardView.getContext(), typedArrayOooO0Oo, o000OO.MaterialCardView_checkedIcon));
        o0oo0ooo2.f47369OooO0o = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialCardView_checkedIconSize, 0);
        o0oo0ooo2.f47370OooO0o0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialCardView_checkedIconMargin, 0);
        o0oo0ooo2.f47371OooO0oO = typedArrayOooO0Oo.getInteger(o000OO.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListOooO00o2 = OooO0o.OooO00o(materialCardView.getContext(), typedArrayOooO0Oo, o000OO.MaterialCardView_rippleColor);
        o0oo0ooo2.f47374OooOO0O = colorStateListOooO00o2;
        if (colorStateListOooO00o2 == null) {
            o0oo0ooo2.f47374OooOO0O = ColorStateList.valueOf(OooOOO0.OooO0OO(o00000.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListOooO00o3 = OooO0o.OooO00o(materialCardView.getContext(), typedArrayOooO0Oo, o000OO.MaterialCardView_cardForegroundColor);
        MaterialShapeDrawable materialShapeDrawable2 = o0oo0ooo2.f47368OooO0Oo;
        materialShapeDrawable2.OooOOO(colorStateListOooO00o3 == null ? ColorStateList.valueOf(0) : colorStateListOooO00o3);
        int[] iArr = OooOOOO.f41031OooO00o;
        RippleDrawable rippleDrawable = o0oo0ooo2.f47378OooOOOO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(o0oo0ooo2.f47374OooOO0O);
        }
        materialShapeDrawable.OooOOO0(materialCardView.getCardElevation());
        float f = o0oo0ooo2.f47372OooO0oo;
        ColorStateList colorStateList = o0oo0ooo2.f47376OooOOO;
        materialShapeDrawable2.OooOo00(f);
        materialShapeDrawable2.OooOOoo(colorStateList);
        materialCardView.setBackgroundInternal(o0oo0ooo2.OooO0Oo(materialShapeDrawable));
        Drawable drawableOooO0OO = materialCardView.isClickable() ? o0oo0ooo2.OooO0OO() : materialShapeDrawable2;
        o0oo0ooo2.f47364OooO = drawableOooO0OO;
        materialCardView.setForeground(o0oo0ooo2.OooO0Oo(drawableOooO0OO));
        typedArrayOooO0Oo.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i) {
        this.f16122OooOO0O.f47367OooO0OO.OooOOO(ColorStateList.valueOf(i));
    }
}
