package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Rect f16397OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ColorStateList f16398OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ColorStateList f16399OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ColorStateList f16400OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.google.android.material.shape.OooO0O0 f16401OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f16402OooO0o0;

    public OooO00o(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, com.google.android.material.shape.OooO0O0 oooO0O0, @NonNull Rect rect) {
        o000OO.OooOOO0.OooO0Oo(rect.left);
        o000OO.OooOOO0.OooO0Oo(rect.top);
        o000OO.OooOOO0.OooO0Oo(rect.right);
        o000OO.OooOOO0.OooO0Oo(rect.bottom);
        this.f16397OooO00o = rect;
        this.f16398OooO0O0 = colorStateList2;
        this.f16399OooO0OO = colorStateList;
        this.f16400OooO0Oo = colorStateList3;
        this.f16402OooO0o0 = i;
        this.f16401OooO0o = oooO0O0;
    }

    @NonNull
    public static OooO00o OooO00o(@StyleRes int i, @NonNull Context context) {
        o000OO.OooOOO0.OooO0O0(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, o000OO.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(o000OO.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(o000OO.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(o000OO.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(o000OO.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListOooO00o = p276o0O00OoO.OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListOooO00o2 = p276o0O00OoO.OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListOooO00o3 = p276o0O00OoO.OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.MaterialCalendarItem_itemStrokeWidth, 0);
        com.google.android.material.shape.OooO0O0 oooO0O0 = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendarItem_itemShapeAppearance, 0), context, typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)));
        typedArrayObtainStyledAttributes.recycle();
        return new OooO00o(colorStateListOooO00o, colorStateListOooO00o2, colorStateListOooO00o3, dimensionPixelSize, oooO0O0, rect);
    }

    public final void OooO0O0(@NonNull TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f16401OooO0o;
        materialShapeDrawable.setShapeAppearanceModel(oooO0O0);
        materialShapeDrawable2.setShapeAppearanceModel(oooO0O0);
        materialShapeDrawable.OooOOO(this.f16399OooO0OO);
        materialShapeDrawable.OooOo00(this.f16402OooO0o0);
        materialShapeDrawable.OooOOoo(this.f16400OooO0Oo);
        ColorStateList colorStateList = this.f16398OooO0O0;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f16397OooO00o;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOo0(textView, insetDrawable);
    }
}
