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
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import o000O000.OooO00o;
import o000O0O0.o00000O;
import o0OOO0O.OooO0OO;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final int f17023OoooO0 = Oooo000.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f17024Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f17025Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f17026Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @ColorInt
    public int f17027Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f17028OoooO00;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f17027Oooo0oo;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f17028OoooO00;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f17024Oooo;
    }

    public int getDividerThickness() {
        return this.f17026Oooo0oO;
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(this) == 1;
        int i2 = z ? this.f17028OoooO00 : this.f17024Oooo;
        if (z) {
            width = getWidth();
            i = this.f17024Oooo;
        } else {
            width = getWidth();
            i = this.f17028OoooO00;
        }
        this.f17025Oooo0o.setBounds(i2, 0, width - i, getBottom() - getTop());
        this.f17025Oooo0o.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f17026Oooo0oO;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i) {
        if (this.f17027Oooo0oo != i) {
            this.f17027Oooo0oo = i;
            this.f17025Oooo0o.OooOOOo(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i) {
        setDividerColor(OooO00o.OooO0O0(getContext(), i));
    }

    public void setDividerInsetEnd(@Px int i) {
        this.f17028OoooO00 = i;
    }

    public void setDividerInsetEndResource(@DimenRes int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@Px int i) {
        this.f17024Oooo = i;
    }

    public void setDividerInsetStartResource(@DimenRes int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@Px int i) {
        if (this.f17026Oooo0oO != i) {
            this.f17026Oooo0oO = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17023OoooO0;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f17025Oooo0o = new MaterialShapeDrawable();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.MaterialDivider, i, i2, new int[0]);
        this.f17026Oooo0oO = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(OooOO0.material_divider_thickness));
        this.f17024Oooo = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.MaterialDivider_dividerInsetStart, 0);
        this.f17028OoooO00 = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(OooO0OO.OooO00o(context2, typedArrayOooO0Oo, Oooo0.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayOooO0Oo.recycle();
    }
}
