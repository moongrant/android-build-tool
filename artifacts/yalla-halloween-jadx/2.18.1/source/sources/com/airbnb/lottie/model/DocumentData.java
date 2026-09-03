package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DocumentData {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @ColorInt
    public final int f10080OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f10082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f10083OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Justification f10084OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f10085OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f10086OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f10087OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @ColorInt
    public final int f10088OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f10089OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f10090OooOO0O;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z) {
        this.f10081OooO00o = str;
        this.f10082OooO0O0 = str2;
        this.f10083OooO0OO = f;
        this.f10084OooO0Oo = justification;
        this.f10086OooO0o0 = i;
        this.f10085OooO0o = f2;
        this.f10087OooO0oO = f3;
        this.f10088OooO0oo = i2;
        this.f10080OooO = i3;
        this.f10089OooOO0 = f4;
        this.f10090OooOO0O = z;
    }

    public final int hashCode() {
        int iOrdinal = ((this.f10084OooO0Oo.ordinal() + (((int) (o0O0O00.OooO00o(this.f10082OooO0O0, this.f10081OooO00o.hashCode() * 31, 31) + this.f10083OooO0OO)) * 31)) * 31) + this.f10086OooO0o0;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f10085OooO0o);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f10088OooO0oo;
    }
}
