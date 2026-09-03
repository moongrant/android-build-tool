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
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Rect f16920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ColorStateList f16921OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ColorStateList f16922OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ColorStateList f16923OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.google.android.material.shape.OooO00o f16924OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f16925OooO0o0;

    public OooO00o(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, com.google.android.material.shape.OooO00o oooO00o, @NonNull Rect rect) {
        o000OO0O.OooOOO0.OooO0O0(rect.left);
        o000OO0O.OooOOO0.OooO0O0(rect.top);
        o000OO0O.OooOOO0.OooO0O0(rect.right);
        o000OO0O.OooOOO0.OooO0O0(rect.bottom);
        this.f16920OooO00o = rect;
        this.f16921OooO0O0 = colorStateList2;
        this.f16922OooO0OO = colorStateList;
        this.f16923OooO0Oo = colorStateList3;
        this.f16925OooO0o0 = i;
        this.f16924OooO0o = oooO00o;
    }

    @NonNull
    public static OooO00o OooO00o(@NonNull Context context, @StyleRes int i) {
        o000OO0O.OooOOO0.OooO00o(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, p337o0OO0o0.Oooo0.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(p337o0OO0o0.Oooo0.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p337o0OO0o0.Oooo0.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p337o0OO0o0.Oooo0.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p337o0OO0o0.Oooo0.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListOooO00o = o0OOO0O.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, p337o0OO0o0.Oooo0.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListOooO00o2 = o0OOO0O.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, p337o0OO0o0.Oooo0.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListOooO00o3 = o0OOO0O.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, p337o0OO0o0.Oooo0.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p337o0OO0o0.Oooo0.MaterialCalendarItem_itemStrokeWidth, 0);
        com.google.android.material.shape.OooO00o OooO00o2 = com.google.android.material.shape.OooO00o.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).OooO00o();
        typedArrayObtainStyledAttributes.recycle();
        return new OooO00o(colorStateListOooO00o, colorStateListOooO00o2, colorStateListOooO00o3, dimensionPixelSize, OooO00o2, rect);
    }

    public final void OooO0O0(@NonNull TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f16924OooO0o);
        materialShapeDrawable2.setShapeAppearanceModel(this.f16924OooO0o);
        materialShapeDrawable.OooOOOo(this.f16922OooO0OO);
        materialShapeDrawable.OooOo0O(this.f16925OooO0o0, this.f16923OooO0Oo);
        textView.setTextColor(this.f16921OooO0O0);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f16921OooO0O0.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f16920OooO00o;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(textView, insetDrawable);
    }
}
