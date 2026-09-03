package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DocumentData {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @ColorInt
    public final int f11851OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f11852OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f11853OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f11854OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Justification f11855OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f11856OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f11857OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f11858OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @ColorInt
    public final int f11859OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f11860OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f11861OooOO0O;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z) {
        this.f11852OooO00o = str;
        this.f11853OooO0O0 = str2;
        this.f11854OooO0OO = f;
        this.f11855OooO0Oo = justification;
        this.f11857OooO0o0 = i;
        this.f11856OooO0o = f2;
        this.f11858OooO0oO = f3;
        this.f11859OooO0oo = i2;
        this.f11851OooO = i3;
        this.f11860OooOO0 = f4;
        this.f11861OooOO0O = z;
    }

    public final int hashCode() {
        int iOrdinal = ((this.f11855OooO0Oo.ordinal() + (((int) (OooO0O0.OooO00o(this.f11853OooO0O0, this.f11852OooO00o.hashCode() * 31, 31) + this.f11854OooO0OO)) * 31)) * 31) + this.f11857OooO0o0;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f11856OooO0o);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f11859OooO0oo;
    }
}
