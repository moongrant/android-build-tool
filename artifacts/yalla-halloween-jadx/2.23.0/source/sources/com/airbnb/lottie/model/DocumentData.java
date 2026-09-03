package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DocumentData {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @ColorInt
    public final int f8761OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f8762OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f8763OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f8764OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Justification f8765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f8766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f8767OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f8768OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @ColorInt
    public final int f8769OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f8770OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f8771OooOO0O;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z) {
        this.f8762OooO00o = str;
        this.f8763OooO0O0 = str2;
        this.f8764OooO0OO = f;
        this.f8765OooO0Oo = justification;
        this.f8767OooO0o0 = i;
        this.f8766OooO0o = f2;
        this.f8768OooO0oO = f3;
        this.f8769OooO0oo = i2;
        this.f8761OooO = i3;
        this.f8770OooOO0 = f4;
        this.f8771OooOO0O = z;
    }

    public final int hashCode() {
        int iOrdinal = ((this.f8765OooO0Oo.ordinal() + (((int) (o0OO00O.OooO00o(this.f8763OooO0O0, this.f8762OooO00o.hashCode() * 31, 31) + this.f8764OooO0OO)) * 31)) * 31) + this.f8767OooO0o0;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f8766OooO0o);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f8769OooO0oo;
    }
}
