package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final OooO00o f16926OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooO00o f16927OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooO00o f16928OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OooO00o f16929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final OooO00o f16930OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooO00o f16931OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final OooO00o f16932OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Paint f16933OooO0oo;

    public OooO0O0(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(o0OOO0O.OooO0O0.OooO0O0(context, p337o0OO0o0.OooO0o.materialCalendarStyle, OooOO0O.class.getCanonicalName()), p337o0OO0o0.Oooo0.MaterialCalendar);
        this.f16926OooO00o = OooO00o.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendar_dayStyle, 0));
        this.f16932OooO0oO = OooO00o.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendar_dayInvalidStyle, 0));
        this.f16927OooO0O0 = OooO00o.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendar_daySelectedStyle, 0));
        this.f16928OooO0OO = OooO00o.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListOooO00o = o0OOO0O.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, p337o0OO0o0.Oooo0.MaterialCalendar_rangeFillColor);
        this.f16929OooO0Oo = OooO00o.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendar_yearStyle, 0));
        this.f16931OooO0o0 = OooO00o.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendar_yearSelectedStyle, 0));
        this.f16930OooO0o = OooO00o.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(p337o0OO0o0.Oooo0.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f16933OooO0oo = paint;
        paint.setColor(colorStateListOooO00o.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
