package p167o00Ooo;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends p167o00Ooo.OooO {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final OooOOO0 f32601OooOOOo = new OooOOO0();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final Function1<Double, Double> f32602OooOOo0 = OooOO0O.f32621Oooo0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final float[] f32603OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f32604OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f32605OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f32606OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final o000oOoO f32607OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final float[] f32608OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final float[] f32609OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Function1<Double, Double> f32610OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Function1<Double, Double> f32611OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Function1<Double, Double> f32612OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Function1<Double, Double> f32613OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f32614OooOOOO;

    public static final class OooO extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ double f32615Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(double d) {
            super(1);
            this.f32615Oooo0o = d;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue < 0.0d) {
                dDoubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(dDoubleValue, 1.0d / this.f32615Oooo0o));
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f32616Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000oOoO o000oooo2) {
            super(1);
            this.f32616Oooo0o = o000oooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            o000oOoO o000oooo2 = this.f32616Oooo0o;
            double d2 = o000oooo2.f32629OooO0O0;
            double d3 = o000oooo2.f32630OooO0OO;
            double d4 = o000oooo2.f32631OooO0Oo;
            return Double.valueOf(dDoubleValue >= o000oooo2.f32633OooO0o0 * d4 ? (Math.pow(dDoubleValue, 1.0d / o000oooo2.f32628OooO00o) - d3) / d2 : dDoubleValue / d4);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f32617Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000oOoO o000oooo2) {
            super(1);
            this.f32617Oooo0o = o000oooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            o000oOoO o000oooo2 = this.f32617Oooo0o;
            double d2 = o000oooo2.f32629OooO0O0;
            double d3 = o000oooo2.f32630OooO0OO;
            double d4 = o000oooo2.f32631OooO0Oo;
            return Double.valueOf(dDoubleValue >= o000oooo2.f32633OooO0o0 * d4 ? (Math.pow(dDoubleValue - o000oooo2.f32632OooO0o, 1.0d / o000oooo2.f32628OooO00o) - d3) / d2 : (dDoubleValue - o000oooo2.f32634OooO0oO) / d4);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f32618Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000oOoO o000oooo2) {
            super(1);
            this.f32618Oooo0o = o000oooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            o000oOoO o000oooo2 = this.f32618Oooo0o;
            double d2 = o000oooo2.f32629OooO0O0;
            return Double.valueOf(dDoubleValue >= o000oooo2.f32633OooO0o0 ? Math.pow((d2 * dDoubleValue) + o000oooo2.f32630OooO0OO, o000oooo2.f32628OooO00o) : dDoubleValue * o000oooo2.f32631OooO0Oo);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f32619Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o000oOoO o000oooo2) {
            super(1);
            this.f32619Oooo0o = o000oooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            o000oOoO o000oooo2 = this.f32619Oooo0o;
            double d2 = o000oooo2.f32629OooO0O0;
            double d3 = o000oooo2.f32630OooO0OO;
            double d4 = o000oooo2.f32631OooO0Oo;
            return Double.valueOf(dDoubleValue >= o000oooo2.f32633OooO0o0 ? Math.pow((d2 * dDoubleValue) + d3, o000oooo2.f32628OooO00o) + o000oooo2.f32632OooO0o : (d4 * dDoubleValue) + o000oooo2.f32634OooO0oO);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ double f32620Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(double d) {
            super(1);
            this.f32620Oooo0o = d;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue < 0.0d) {
                dDoubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(dDoubleValue, this.f32620Oooo0o));
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f32621Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            return Double.valueOf(d.doubleValue());
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Double, Double> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            Oooo0 oooo0 = Oooo0.this;
            return oooo0.f32613OooOOO0.invoke(Double.valueOf(RangesKt.coerceIn(dDoubleValue, oooo0.f32606OooO0o0, oooo0.f32605OooO0o)));
        }
    }

    public static final class OooOOO0 {
        public final float OooO00o(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? -f7 : f7;
        }

        public final boolean OooO0O0(double d, Function1<? super Double, Double> function1, Function1<? super Double, Double> function2) {
            return Math.abs(function1.invoke(Double.valueOf(d)).doubleValue() - function2.invoke(Double.valueOf(d)).doubleValue()) <= 0.001d;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<Double, Double> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = Oooo0.this.f32610OooOO0O.invoke(Double.valueOf(d.doubleValue())).doubleValue();
            Oooo0 oooo0 = Oooo0.this;
            return Double.valueOf(RangesKt.coerceIn(dDoubleValue, oooo0.f32606OooO0o0, oooo0.f32605OooO0o));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    public Oooo0(@NotNull String name, @NotNull float[] primaries, @NotNull o0OoOo0 whitePoint, @NotNull o000oOoO function, int i) {
        Function1 oooO0O0;
        Function1 oooO0o;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
        if (function.f32632OooO0o == 0.0d) {
            if (function.f32634OooO0oO == 0.0d) {
                oooO0O0 = new OooO00o(function);
            } else {
                oooO0O0 = new OooO0O0(function);
            }
        } else {
            oooO0O0 = new OooO0O0(function);
        }
        Function1 function1 = oooO0O0;
        if (function.f32632OooO0o == 0.0d) {
            if (function.f32634OooO0oO == 0.0d) {
                oooO0o = new OooO0OO(function);
            } else {
                oooO0o = new OooO0o(function);
            }
        } else {
            oooO0o = new OooO0o(function);
        }
        this(name, primaries, whitePoint, null, function1, oooO0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, function, i);
    }

    @Override // p167o00Ooo.OooO
    @NotNull
    public final float[] OooO00o(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        p167o00Ooo.OooOO0O.OooO0oo(this.f32609OooOO0, v);
        v[0] = (float) ((Number) this.f32611OooOO0o.invoke(Double.valueOf(v[0]))).doubleValue();
        v[1] = (float) ((Number) this.f32611OooOO0o.invoke(Double.valueOf(v[1]))).doubleValue();
        v[2] = (float) ((Number) this.f32611OooOO0o.invoke(Double.valueOf(v[2]))).doubleValue();
        return v;
    }

    @Override // p167o00Ooo.OooO
    public final float OooO0O0(int i) {
        return this.f32605OooO0o;
    }

    @Override // p167o00Ooo.OooO
    public final float OooO0OO(int i) {
        return this.f32606OooO0o0;
    }

    @Override // p167o00Ooo.OooO
    public final boolean OooO0Oo() {
        return this.f32614OooOOOO;
    }

    @Override // p167o00Ooo.OooO
    @NotNull
    public final float[] OooO0o0(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) ((Number) this.f32612OooOOO.invoke(Double.valueOf(v[0]))).doubleValue();
        v[1] = (float) ((Number) this.f32612OooOOO.invoke(Double.valueOf(v[1]))).doubleValue();
        v[2] = (float) ((Number) this.f32612OooOOO.invoke(Double.valueOf(v[2]))).doubleValue();
        p167o00Ooo.OooOO0O.OooO0oo(this.f32603OooO, v);
        return v;
    }

    @Override // p167o00Ooo.OooO
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(Oooo0.class), Reflection.getOrCreateKotlinClass(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        if (Float.compare(oooo0.f32606OooO0o0, this.f32606OooO0o0) != 0 || Float.compare(oooo0.f32605OooO0o, this.f32605OooO0o) != 0 || !Intrinsics.areEqual(this.f32604OooO0Oo, oooo0.f32604OooO0Oo) || !Arrays.equals(this.f32608OooO0oo, oooo0.f32608OooO0oo)) {
            return false;
        }
        o000oOoO o000oooo2 = this.f32607OooO0oO;
        if (o000oooo2 != null) {
            return Intrinsics.areEqual(o000oooo2, oooo0.f32607OooO0oO);
        }
        if (oooo0.f32607OooO0oO == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.f32610OooOO0O, oooo0.f32610OooOO0O)) {
            return Intrinsics.areEqual(this.f32613OooOOO0, oooo0.f32613OooOOO0);
        }
        return false;
    }

    @Override // p167o00Ooo.OooO
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f32608OooO0oo) + ((this.f32604OooO0Oo.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f32606OooO0o0;
        int iFloatToIntBits = (iHashCode + (!((f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f32605OooO0o;
        int iFloatToIntBits2 = (iFloatToIntBits + (!(f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) ? Float.floatToIntBits(f2) : 0)) * 31;
        o000oOoO o000oooo2 = this.f32607OooO0oO;
        int iHashCode2 = iFloatToIntBits2 + (o000oooo2 != null ? o000oooo2.hashCode() : 0);
        if (this.f32607OooO0oO == null) {
            return this.f32613OooOOO0.hashCode() + ((this.f32610OooOO0O.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:36:0x022b  */
    /* JADX WARN: Multi-variable type inference failed */
    public Oooo0(@NotNull String name, @NotNull float[] primaries, @NotNull o0OoOo0 whitePoint, @Nullable float[] fArr, @NotNull Function1<? super Double, Double> oetf, @NotNull Function1<? super Double, Double> eotf, float f, float f2, @Nullable o000oOoO o000oooo2, int i) {
        boolean z;
        boolean z2;
        super(name, p167o00Ooo.OooO0o.f32562OooO0O0, i);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        o00Ooo.OooO0o.OooO00o oooO00o = p167o00Ooo.OooO0o.f32561OooO00o;
        o00Ooo.OooO0o.OooO00o oooO00o2 = p167o00Ooo.OooO0o.f32561OooO00o;
        this.f32604OooO0Oo = whitePoint;
        this.f32606OooO0o0 = f;
        this.f32605OooO0o = f2;
        this.f32607OooO0oO = o000oooo2;
        this.f32610OooOO0O = oetf;
        this.f32611OooOO0o = new OooOOOO();
        this.f32613OooOOO0 = eotf;
        this.f32612OooOOO = new OooOOO();
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            OooOOO0 oooOOO0 = f32601OooOOOo;
            float[] a = new float[6];
            if (primaries.length == 9) {
                float f3 = primaries[0] + primaries[1] + primaries[2];
                a[0] = primaries[0] / f3;
                a[1] = primaries[1] / f3;
                float f4 = primaries[3] + primaries[4] + primaries[5];
                a[2] = primaries[3] / f4;
                a[3] = primaries[4] / f4;
                float f5 = primaries[6] + primaries[7] + primaries[8];
                a[4] = primaries[6] / f5;
                a[5] = primaries[7] / f5;
            } else {
                ArraysKt___ArraysJvmKt.copyInto$default(primaries, a, 0, 0, 6, 6, (Object) null);
            }
            this.f32608OooO0oo = a;
            if (fArr == null) {
                float f6 = a[0];
                float f7 = a[1];
                float f8 = a[2];
                float f9 = a[3];
                float f10 = a[4];
                float f11 = a[5];
                float f12 = whitePoint.f32635OooO00o;
                float f13 = whitePoint.f32636OooO0O0;
                float f14 = 1;
                float f15 = (f14 - f6) / f7;
                float f16 = (f14 - f8) / f9;
                float f17 = (f14 - f10) / f11;
                float f18 = (f14 - f12) / f13;
                float f19 = f6 / f7;
                float f20 = f12 / f13;
                float f21 = (f8 / f9) - f19;
                float f22 = f20 - f19;
                float f23 = f16 - f15;
                float f24 = (f10 / f11) - f19;
                float f25 = (((f18 - f15) * f21) - (f22 * f23)) / (((f17 - f15) * f21) - (f23 * f24));
                float fOooO00o = p167o00Ooo.OooOO0.OooO00o(f24, f25, f22, f21);
                float f26 = (1.0f - fOooO00o) - f25;
                float f27 = f26 / f7;
                float f28 = fOooO00o / f9;
                float f29 = f25 / f11;
                this.f32603OooO = new float[]{f27 * f6, f26, ((1.0f - f6) - f7) * f27, f28 * f8, fOooO00o, ((1.0f - f8) - f9) * f28, f29 * f10, f25, ((1.0f - f10) - f11) * f29};
            } else if (fArr.length == 9) {
                this.f32603OooO = fArr;
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Transform must have 9 entries! Has ");
                sbOooO0o0.append(fArr.length);
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
            this.f32609OooOO0 = p167o00Ooo.OooOO0O.OooO0o0(this.f32603OooO);
            float fOooO00o2 = oooOOO0.OooO00o(a);
            p167o00Ooo.OooOOO0 oooOOO1 = p167o00Ooo.OooOOO0.f32567OooO00o;
            if (fOooO00o2 / oooOOO0.OooO00o(p167o00Ooo.OooOOO0.f32569OooO0OO) > 0.9f) {
                float[] fArr2 = p167o00Ooo.OooOOO0.f32568OooO0O0;
                float[] fArr3 = {a[0] - fArr2[0], a[1] - fArr2[1], a[2] - fArr2[2], a[3] - fArr2[3], a[4] - fArr2[4], a[5] - fArr2[5]};
                if (((fArr2[1] - fArr2[5]) * fArr3[0]) - (fArr3[1] * (fArr2[0] - fArr2[4])) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ((fArr2[0] - fArr2[2]) * fArr3[1]) - ((fArr2[1] - fArr2[3]) * fArr3[0]) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ((fArr2[3] - fArr2[1]) * fArr3[2]) - (fArr3[3] * (fArr2[2] - fArr2[0])) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ((fArr2[2] - fArr2[4]) * fArr3[3]) - ((fArr2[3] - fArr2[5]) * fArr3[2]) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ((fArr2[5] - fArr2[3]) * fArr3[4]) - (fArr3[5] * (fArr2[4] - fArr2[2])) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    int i2 = ((((fArr2[4] - fArr2[0]) * fArr3[5]) - ((fArr2[5] - fArr2[1]) * fArr3[4])) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : ((((fArr2[4] - fArr2[0]) * fArr3[5]) - ((fArr2[5] - fArr2[1]) * fArr3[4])) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1));
                }
            }
            if (i == 0) {
                z = true;
            } else {
                float[] b = p167o00Ooo.OooOOO0.f32568OooO0O0;
                Intrinsics.checkNotNullParameter(a, "a");
                Intrinsics.checkNotNullParameter(b, "b");
                if (a != b) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 6) {
                            z2 = true;
                            break;
                        } else {
                            if (Float.compare(a[i3], b[i3]) != 0 && Math.abs(a[i3] - b[i3]) > 0.001f) {
                                z2 = false;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                if (z2 && p167o00Ooo.OooOO0O.OooO0OO(whitePoint, OooOo00.f32599OooO0Oo)) {
                    if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        if (f2 == 1.0f) {
                            p167o00Ooo.OooOOO0 oooOOO2 = p167o00Ooo.OooOOO0.f32567OooO00o;
                            Oooo0 oooo0 = p167o00Ooo.OooOOO0.f32570OooO0Oo;
                            double d = 0.0d;
                            while (true) {
                                if (d > 1.0d) {
                                    z = true;
                                } else if (oooOOO0.OooO0O0(d, oetf, oooo0.f32610OooOO0O) && oooOOO0.OooO0O0(d, eotf, oooo0.f32613OooOOO0)) {
                                    d += 0.00392156862745098d;
                                }
                            }
                        }
                    }
                }
                z = false;
            }
            this.f32614OooOOOO = z;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Oooo0(@NotNull String name, @NotNull float[] primaries, @NotNull o0OoOo0 whitePoint, double d, float f, float f2, int i) {
        Function1 oooO;
        Function1 oooOO1;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        if (d == 1.0d) {
            oooO = f32602OooOOo0;
        } else {
            oooO = new OooO(d);
        }
        Function1 function1 = oooO;
        if (d == 1.0d) {
            oooOO1 = f32602OooOOo0;
        } else {
            oooOO1 = new OooOO0(d);
        }
        this(name, primaries, whitePoint, null, function1, oooOO1, f, f2, new o000oOoO(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
