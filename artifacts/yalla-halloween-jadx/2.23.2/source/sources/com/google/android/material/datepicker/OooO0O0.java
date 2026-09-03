package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final OooO00o f16403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooO00o f16404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooO00o f16405OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OooO00o f16406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final OooO00o f16407OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooO00o f16408OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final OooO00o f16409OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Paint f16410OooO0oo;

    public OooO0O0(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p276o0O00OoO.OooO0OO.OooO0OO(p272o0O0000o.o00000.materialCalendarStyle, context, OooOo00.class.getCanonicalName()).data, o000OO.MaterialCalendar);
        this.f16403OooO00o = OooO00o.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendar_dayStyle, 0), context);
        this.f16409OooO0oO = OooO00o.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendar_dayInvalidStyle, 0), context);
        this.f16404OooO0O0 = OooO00o.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendar_daySelectedStyle, 0), context);
        this.f16405OooO0OO = OooO00o.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendar_dayTodayStyle, 0), context);
        ColorStateList colorStateListOooO00o = p276o0O00OoO.OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.MaterialCalendar_rangeFillColor);
        this.f16406OooO0Oo = OooO00o.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendar_yearStyle, 0), context);
        this.f16408OooO0o0 = OooO00o.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendar_yearSelectedStyle, 0), context);
        this.f16407OooO0o = OooO00o.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialCalendar_yearTodayStyle, 0), context);
        Paint paint = new Paint();
        this.f16410OooO0oo = paint;
        paint.setColor(colorStateListOooO00o.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
