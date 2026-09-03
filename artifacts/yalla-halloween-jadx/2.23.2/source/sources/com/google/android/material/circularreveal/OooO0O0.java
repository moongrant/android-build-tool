package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface OooO0O0 extends CircularRevealHelper.OooO00o {

    public static class OooO00o implements TypeEvaluator<OooO0o> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f16322OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f16323OooO00o = new OooO0o();

        @Override // android.animation.TypeEvaluator
        @NonNull
        public final OooO0o evaluate(float f, @NonNull OooO0o oooO0o, @NonNull OooO0o oooO0o2) {
            OooO0o oooO0o3 = oooO0o;
            OooO0o oooO0o4 = oooO0o2;
            float f2 = oooO0o3.f16326OooO00o;
            float f3 = 1.0f - f;
            float f4 = (oooO0o4.f16326OooO00o * f) + (f2 * f3);
            float f5 = oooO0o3.f16327OooO0O0;
            float f6 = (oooO0o4.f16327OooO0O0 * f) + (f5 * f3);
            float f7 = oooO0o3.f16328OooO0OO;
            float f8 = (f * oooO0o4.f16328OooO0OO) + (f3 * f7);
            OooO0o oooO0o5 = this.f16323OooO00o;
            oooO0o5.f16326OooO00o = f4;
            oooO0o5.f16327OooO0O0 = f6;
            oooO0o5.f16328OooO0OO = f8;
            return oooO0o5;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0218OooO0O0 extends Property<OooO0O0, OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0218OooO0O0 f16324OooO00o = new C0218OooO0O0();

        public C0218OooO0O0() {
            super(OooO0o.class, "circularReveal");
        }

        @Override // android.util.Property
        @Nullable
        public final OooO0o get(@NonNull OooO0O0 oooO0O0) {
            return oooO0O0.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(@NonNull OooO0O0 oooO0O0, @Nullable OooO0o oooO0o) {
            oooO0O0.setRevealInfo(oooO0o);
        }
    }

    public static class OooO0OO extends Property<OooO0O0, Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f16325OooO00o = new OooO0OO();

        public OooO0OO() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        @NonNull
        public final Integer get(@NonNull OooO0O0 oooO0O0) {
            return Integer.valueOf(oooO0O0.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(@NonNull OooO0O0 oooO0O0, @NonNull Integer num) {
            oooO0O0.setCircularRevealScrimColor(num.intValue());
        }
    }

    void OooO00o();

    void OooO0O0();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    OooO0o getRevealInfo();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i);

    void setRevealInfo(@Nullable OooO0o oooO0o);

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f16326OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f16327OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f16328OooO0OO;

        public OooO0o() {
        }

        public OooO0o(float f, float f2, float f3) {
            this.f16326OooO00o = f;
            this.f16327OooO0O0 = f2;
            this.f16328OooO0OO = f3;
        }

        public OooO0o(@NonNull OooO0o oooO0o) {
            this(oooO0o.f16326OooO00o, oooO0o.f16327OooO0O0, oooO0o.f16328OooO0OO);
        }
    }
}
