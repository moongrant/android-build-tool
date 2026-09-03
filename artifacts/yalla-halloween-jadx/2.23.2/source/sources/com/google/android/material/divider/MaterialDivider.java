package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import o0O0O0O.OooO00o;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p276o0O00OoO.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f16499OooO = o0000O0O.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f16500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ColorInt
    public int f16501OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16502OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16503OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f16504OooO0oo;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f16501OooO0o;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f16504OooO0oo;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f16503OooO0oO;
    }

    public int getDividerThickness() {
        return this.f16502OooO0o0;
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(this) == 1;
        int i2 = z ? this.f16504OooO0oo : this.f16503OooO0oO;
        if (z) {
            width = getWidth();
            i = this.f16503OooO0oO;
        } else {
            width = getWidth();
            i = this.f16504OooO0oo;
        }
        int i3 = width - i;
        MaterialShapeDrawable materialShapeDrawable = this.f16500OooO0Oo;
        materialShapeDrawable.setBounds(i2, 0, i3, getBottom() - getTop());
        materialShapeDrawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f16502OooO0o0;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i) {
        if (this.f16501OooO0o != i) {
            this.f16501OooO0o = i;
            this.f16500OooO0Oo.OooOOO(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5281OooO00o;
        setDividerColor(ContextCompat.OooO0o.OooO00o(context, i));
    }

    public void setDividerInsetEnd(@Px int i) {
        this.f16504OooO0oo = i;
    }

    public void setDividerInsetEndResource(@DimenRes int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@Px int i) {
        this.f16503OooO0oO = i;
    }

    public void setDividerInsetStartResource(@DimenRes int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@Px int i) {
        if (this.f16502OooO0o0 != i) {
            this.f16502OooO0o0 = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16499OooO;
        super(OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f16500OooO0Oo = new MaterialShapeDrawable();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.MaterialDivider, i, i2, new int[0]);
        this.f16502OooO0o0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(o00000O.material_divider_thickness));
        this.f16503OooO0oO = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialDivider_dividerInsetStart, 0);
        this.f16504OooO0oo = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(OooO0o.OooO00o(context2, typedArrayOooO0Oo, o000OO.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayOooO0Oo.recycle();
    }
}
