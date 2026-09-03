package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.KotlinVersion;
import o0OOO0O.OooO0OO;
import p012OooOo0.OooOO0O;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o00000;
import p347o0OOO0o0.o0O0O00;
import p352o0OOOOoO.OooOOO0;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, o00000 {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final int[] f16735OoooOoo = {R.attr.state_checkable};

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final int[] f16736Ooooo00 = {R.attr.state_checked};

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final int[] f16737Ooooo0o = {OooO0o.state_dragged};

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final int f16738OooooO0 = Oooo000.Widget_MaterialComponents_CardView;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f16739OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f16740OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f16741OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public OooO00o f16742OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NonNull
    public final o0OO0oO0.OooO00o f16743o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OooO00o {
        void OooO00o();
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f16743o000oOoO.f37997OooO0OO.getBounds());
        return rectF;
    }

    public final void OooO0o() {
        o0OO0oO0.OooO00o oooO00o;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (oooO00o = this.f16743o000oOoO).f38008OooOOOO) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        oooO00o.f38008OooOOOO.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        oooO00o.f38008OooOOOO.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    public final boolean OooO0oO() {
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        return oooO00o != null && oooO00o.f38012OooOOoo;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f16743o000oOoO.f37997OooO0OO.f17510Oooo0o.f17536OooO0OO;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f16743o000oOoO.f37998OooO0Oo.f17510Oooo0o.f17536OooO0OO;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f16743o000oOoO.f38003OooOO0;
    }

    public int getCheckedIconGravity() {
        return this.f16743o000oOoO.f38001OooO0oO;
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f16743o000oOoO.f38000OooO0o0;
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f16743o000oOoO.f37999OooO0o;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f16743o000oOoO.f38005OooOO0o;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f16743o000oOoO.f37996OooO0O0.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f16743o000oOoO.f37996OooO0O0.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f16743o000oOoO.f37996OooO0O0.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f16743o000oOoO.f37996OooO0O0.top;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f16743o000oOoO.f37997OooO0OO.f17510Oooo0o.f17542OooOO0;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f16743o000oOoO.f37997OooO0OO.OooOO0O();
    }

    public ColorStateList getRippleColor() {
        return this.f16743o000oOoO.f38004OooOO0O;
    }

    @NonNull
    public com.google.android.material.shape.OooO00o getShapeAppearanceModel() {
        return this.f16743o000oOoO.f38007OooOOO0;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f16743o000oOoO.f38006OooOOO;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f16743o000oOoO.f38006OooOOO;
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f16743o000oOoO.f38002OooO0oo;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f16740OoooOOo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00.OooO0Oo(this, this.f16743o000oOoO.f37997OooO0OO);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (OooO0oO()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16735OoooOoo);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16736Ooooo00);
        }
        if (this.f16741OoooOo0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16737Ooooo0o);
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
        accessibilityNodeInfo.setCheckable(OooO0oO());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f16743o000oOoO.OooO0o(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f16739OoooOOO) {
            if (!this.f16743o000oOoO.f38010OooOOo) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f16743o000oOoO.f38010OooOOo = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i) {
        this.f16743o000oOoO.OooO0oO(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        oooO00o.f37997OooO0OO.OooOOOO(oooO00o.f37995OooO00o.getCardElevation());
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f16743o000oOoO.f37998OooO0Oo;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.OooOOOo(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f16743o000oOoO.f38012OooOOoo = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f16740OoooOOo != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f16743o000oOoO.OooO0oo(drawable);
    }

    public void setCheckedIconGravity(int i) {
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        if (oooO00o.f38001OooO0oO != i) {
            oooO00o.f38001OooO0oO = i;
            oooO00o.OooO0o(oooO00o.f37995OooO00o.getMeasuredWidth(), oooO00o.f37995OooO00o.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(@Dimension int i) {
        this.f16743o000oOoO.f38000OooO0o0 = i;
    }

    public void setCheckedIconMarginResource(@DimenRes int i) {
        if (i != -1) {
            this.f16743o000oOoO.f38000OooO0o0 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        this.f16743o000oOoO.OooO0oo(OooOO0O.OooO0O0(getContext(), i));
    }

    public void setCheckedIconSize(@Dimension int i) {
        this.f16743o000oOoO.f37999OooO0o = i;
    }

    public void setCheckedIconSizeResource(@DimenRes int i) {
        if (i != 0) {
            this.f16743o000oOoO.f37999OooO0o = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        oooO00o.f38005OooOO0o = colorStateList;
        Drawable drawable = oooO00o.f38003OooOO0;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0oo(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        if (oooO00o != null) {
            oooO00o.OooOO0O();
        }
    }

    public void setDragged(boolean z) {
        if (this.f16741OoooOo0 != z) {
            this.f16741OoooOo0 = z;
            refreshDrawableState();
            OooO0o();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f16743o000oOoO.OooOOO0();
    }

    public void setOnCheckedChangeListener(@Nullable OooO00o oooO00o) {
        this.f16742OoooOoO = oooO00o;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f16743o000oOoO.OooOOO0();
        this.f16743o000oOoO.OooOO0o();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        oooO00o.f37997OooO0OO.OooOOo0(f);
        MaterialShapeDrawable materialShapeDrawable = oooO00o.f37998OooO0Oo;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.OooOOo0(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = oooO00o.f38011OooOOo0;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.OooOOo0(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        oooO00o.OooO(oooO00o.f38007OooOOO0.OooO0oO(f));
        oooO00o.f37994OooO.invalidateSelf();
        if (oooO00o.OooOO0()) {
            oooO00o.OooOO0o();
        } else {
            if (oooO00o.f37995OooO00o.getPreventCornerOverlap() && !oooO00o.f37997OooO0OO.OooOOO()) {
                oooO00o.OooOO0o();
            }
        }
        if (oooO00o.OooOO0()) {
            oooO00o.OooOOO0();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        oooO00o.f38004OooOO0O = colorStateList;
        oooO00o.OooOOO();
    }

    public void setRippleColorResource(@ColorRes int i) {
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        oooO00o.f38004OooOO0O = OooOO0O.OooO00o(getContext(), i);
        oooO00o.OooOOO();
    }

    @Override // p347o0OOO0o0.o00000
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        setClipToOutline(oooO00o.OooO0o(getBoundsAsRectF()));
        this.f16743o000oOoO.OooO(oooO00o);
    }

    public void setStrokeColor(@ColorInt int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@Dimension int i) {
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        if (i != oooO00o.f38002OooO0oo) {
            oooO00o.f38002OooO0oo = i;
            oooO00o.OooOOOO();
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f16743o000oOoO.OooOOO0();
        this.f16743o000oOoO.OooOO0o();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (OooO0oO() && isEnabled()) {
            this.f16740OoooOOo = !this.f16740OoooOOo;
            refreshDrawableState();
            OooO0o();
            o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
            boolean z = this.f16740OoooOOo;
            Drawable drawable = oooO00o.f38003OooOO0;
            if (drawable != null) {
                drawable.setAlpha(z ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            }
            OooO00o oooO00o2 = this.f16742OoooOoO;
            if (oooO00o2 != null) {
                oooO00o2.OooO00o();
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f16743o000oOoO.OooO0oO(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        o0OO0oO0.OooO00o oooO00o = this.f16743o000oOoO;
        if (oooO00o.f38006OooOOO != colorStateList) {
            oooO00o.f38006OooOOO = colorStateList;
            oooO00o.OooOOOO();
        }
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        int i2 = f16738OooooO0;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16740OoooOOo = false;
        this.f16741OoooOo0 = false;
        this.f16739OoooOOO = true;
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(getContext(), attributeSet, Oooo0.MaterialCardView, i, i2, new int[0]);
        o0OO0oO0.OooO00o oooO00o = new o0OO0oO0.OooO00o(this, attributeSet, i);
        this.f16743o000oOoO = oooO00o;
        oooO00o.OooO0oO(super.getCardBackgroundColor());
        oooO00o.f37996OooO0O0.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        oooO00o.OooOO0o();
        ColorStateList colorStateListOooO00o = OooO0OO.OooO00o(oooO00o.f37995OooO00o.getContext(), typedArrayOooO0Oo, Oooo0.MaterialCardView_strokeColor);
        oooO00o.f38006OooOOO = colorStateListOooO00o;
        if (colorStateListOooO00o == null) {
            oooO00o.f38006OooOOO = ColorStateList.valueOf(-1);
        }
        oooO00o.f38002OooO0oo = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialCardView_strokeWidth, 0);
        boolean z = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialCardView_android_checkable, false);
        oooO00o.f38012OooOOoo = z;
        oooO00o.f37995OooO00o.setLongClickable(z);
        oooO00o.f38005OooOO0o = OooO0OO.OooO00o(oooO00o.f37995OooO00o.getContext(), typedArrayOooO0Oo, Oooo0.MaterialCardView_checkedIconTint);
        oooO00o.OooO0oo(OooO0OO.OooO0Oo(oooO00o.f37995OooO00o.getContext(), typedArrayOooO0Oo, Oooo0.MaterialCardView_checkedIcon));
        oooO00o.f37999OooO0o = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialCardView_checkedIconSize, 0);
        oooO00o.f38000OooO0o0 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialCardView_checkedIconMargin, 0);
        oooO00o.f38001OooO0oO = typedArrayOooO0Oo.getInteger(Oooo0.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListOooO00o2 = OooO0OO.OooO00o(oooO00o.f37995OooO00o.getContext(), typedArrayOooO0Oo, Oooo0.MaterialCardView_rippleColor);
        oooO00o.f38004OooOO0O = colorStateListOooO00o2;
        if (colorStateListOooO00o2 == null) {
            oooO00o.f38004OooOO0O = ColorStateList.valueOf(o0O0000O.OooO0OO(oooO00o.f37995OooO00o, OooO0o.colorControlHighlight));
        }
        ColorStateList colorStateListOooO00o3 = OooO0OO.OooO00o(oooO00o.f37995OooO00o.getContext(), typedArrayOooO0Oo, Oooo0.MaterialCardView_cardForegroundColor);
        oooO00o.f37998OooO0Oo.OooOOOo(colorStateListOooO00o3 == null ? ColorStateList.valueOf(0) : colorStateListOooO00o3);
        oooO00o.OooOOO();
        oooO00o.f37997OooO0OO.OooOOOO(oooO00o.f37995OooO00o.getCardElevation());
        oooO00o.OooOOOO();
        oooO00o.f37995OooO00o.setBackgroundInternal(oooO00o.OooO0o0(oooO00o.f37997OooO0OO));
        Drawable drawableOooO0Oo = oooO00o.f37995OooO00o.isClickable() ? oooO00o.OooO0Oo() : oooO00o.f37998OooO0Oo;
        oooO00o.f37994OooO = drawableOooO0Oo;
        oooO00o.f37995OooO00o.setForeground(oooO00o.OooO0o0(drawableOooO0Oo));
        typedArrayOooO0Oo.recycle();
    }
}
