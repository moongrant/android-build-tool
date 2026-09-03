package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0O0 extends CircularRevealHelper.OooO00o {

    public static class OooO00o implements TypeEvaluator<OooO0o> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final TypeEvaluator<OooO0o> f16858OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f16859OooO00o = new OooO0o();

        @Override // android.animation.TypeEvaluator
        @NonNull
        public final OooO0o evaluate(float f, @NonNull OooO0o oooO0o, @NonNull OooO0o oooO0o2) {
            OooO0o oooO0o3 = oooO0o;
            OooO0o oooO0o4 = oooO0o2;
            OooO0o oooO0o5 = this.f16859OooO00o;
            float fOooO0Oo = o0000O.OooO0Oo(oooO0o3.f16862OooO00o, oooO0o4.f16862OooO00o, f);
            float fOooO0Oo2 = o0000O.OooO0Oo(oooO0o3.f16863OooO0O0, oooO0o4.f16863OooO0O0, f);
            float fOooO0Oo3 = o0000O.OooO0Oo(oooO0o3.f16864OooO0OO, oooO0o4.f16864OooO0OO, f);
            oooO0o5.f16862OooO00o = fOooO0Oo;
            oooO0o5.f16863OooO0O0 = fOooO0Oo2;
            oooO0o5.f16864OooO0OO = fOooO0Oo3;
            return this.f16859OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0107OooO0O0 extends Property<OooO0O0, OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Property<OooO0O0, OooO0o> f16860OooO00o = new C0107OooO0O0();

        public C0107OooO0O0() {
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
        public static final Property<OooO0O0, Integer> f16861OooO00o = new OooO0OO();

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

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f16862OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f16863OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f16864OooO0OO;

        public OooO0o() {
        }

        public OooO0o(float f, float f2, float f3) {
            this.f16862OooO00o = f;
            this.f16863OooO0O0 = f2;
            this.f16864OooO0OO = f3;
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
}
