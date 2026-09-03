package p118o00O0Oo;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOOO;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements o0OoOo0, OooOO0O.OooO00o, Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final OooOO0O<?, Float> f30697OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f30699OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f30700OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PolystarShape.Type f30701OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O<?, Float> f30702OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f30703OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0O<?, PointF> f30704OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0O<?, Float> f30705OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0O<?, Float> f30706OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final OooOO0O<?, Float> f30707OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOO0O<?, Float> f30708OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f30709OooOOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f30698OooO00o = new Path();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO f30710OooOOO0 = new OooO();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f30711OooO00o;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f30711OooO00o = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30711OooO00o[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o00O0O(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, PolystarShape polystarShape) {
        this.f30700OooO0OO = lottieDrawable;
        this.f30699OooO0O0 = polystarShape.f10112OooO00o;
        PolystarShape.Type type = polystarShape.f10113OooO0O0;
        this.f30701OooO0Oo = type;
        this.f30703OooO0o0 = polystarShape.f10120OooOO0;
        OooOO0O<?, ?> oooOO0OOooO00o = polystarShape.f10114OooO0OO.OooO00o();
        this.f30702OooO0o = (OooOOOO) oooOO0OOooO00o;
        OooOO0O<PointF, PointF> oooOO0OOooO00o2 = polystarShape.f10115OooO0Oo.OooO00o();
        this.f30704OooO0oO = oooOO0OOooO00o2;
        OooOO0O<?, ?> oooOO0OOooO00o3 = polystarShape.f10117OooO0o0.OooO00o();
        this.f30705OooO0oo = (OooOOOO) oooOO0OOooO00o3;
        OooOO0O<?, ?> oooOO0OOooO00o4 = polystarShape.f10118OooO0oO.OooO00o();
        this.f30706OooOO0 = (OooOOOO) oooOO0OOooO00o4;
        OooOO0O<?, ?> oooOO0OOooO00o5 = polystarShape.f10111OooO.OooO00o();
        this.f30708OooOO0o = (OooOOOO) oooOO0OOooO00o5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f30697OooO = (OooOOOO) polystarShape.f10116OooO0o.OooO00o();
            this.f30707OooOO0O = (OooOOOO) polystarShape.f10119OooO0oo.OooO00o();
        } else {
            this.f30697OooO = null;
            this.f30707OooOO0O = null;
        }
        oooO00o.OooO0oO(oooOO0OOooO00o);
        oooO00o.OooO0oO(oooOO0OOooO00o2);
        oooO00o.OooO0oO(oooOO0OOooO00o3);
        oooO00o.OooO0oO(oooOO0OOooO00o4);
        oooO00o.OooO0oO(oooOO0OOooO00o5);
        if (type == type2) {
            oooO00o.OooO0oO(this.f30697OooO);
            oooO00o.OooO0oO(this.f30707OooOO0O);
        }
        oooOO0OOooO00o.OooO00o(this);
        oooOO0OOooO00o2.OooO00o(this);
        oooOO0OOooO00o3.OooO00o(this);
        oooOO0OOooO00o4.OooO00o(this);
        oooOO0OOooO00o5.OooO00o(this);
        if (type == type2) {
            this.f30697OooO.OooO00o(this);
            this.f30707OooOO0O.OooO00o(this);
        }
    }

    @Override // p118o00O0Oo.o0OoOo0
    public final Path OooO00o() {
        float fSin;
        double d;
        float fCos;
        float fOooO00o;
        float f;
        float f2;
        if (this.f30709OooOOO) {
            return this.f30698OooO00o;
        }
        this.f30698OooO00o.reset();
        if (this.f30703OooO0o0) {
            this.f30709OooOOO = true;
            return this.f30698OooO00o;
        }
        int i = OooO00o.f30711OooO00o[this.f30701OooO0Oo.ordinal()];
        if (i == 1) {
            float fFloatValue = this.f30702OooO0o.OooO0o().floatValue();
            OooOO0O<?, Float> oooOO0O = this.f30705OooO0oo;
            double radians = Math.toRadians((oooOO0O != null ? oooOO0O.OooO0o().floatValue() : 0.0d) - 90.0d);
            double d2 = fFloatValue;
            float f3 = (float) (6.283185307179586d / d2);
            float f4 = f3 / 2.0f;
            float f5 = fFloatValue - ((int) fFloatValue);
            if (f5 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                radians += (double) ((1.0f - f5) * f4);
            }
            float fFloatValue2 = this.f30706OooOO0.OooO0o().floatValue();
            float fFloatValue3 = this.f30697OooO.OooO0o().floatValue();
            OooOO0O<?, Float> oooOO0O2 = this.f30707OooOO0O;
            float fFloatValue4 = oooOO0O2 != null ? oooOO0O2.OooO0o().floatValue() / 100.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            OooOO0O<?, Float> oooOO0O3 = this.f30708OooOO0o;
            float fFloatValue5 = oooOO0O3 != null ? oooOO0O3.OooO0o().floatValue() / 100.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (f5 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                fOooO00o = Oooo000.OooO00o.OooO00o(fFloatValue2, fFloatValue3, f5, fFloatValue3);
                double d3 = fOooO00o;
                fCos = (float) (Math.cos(radians) * d3);
                fSin = (float) (d3 * Math.sin(radians));
                this.f30698OooO00o.moveTo(fCos, fSin);
                d = radians + ((double) ((f3 * f5) / 2.0f));
            } else {
                double d4 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d4);
                fSin = (float) (Math.sin(radians) * d4);
                this.f30698OooO00o.moveTo(fCos2, fSin);
                d = radians + ((double) f4);
                fCos = fCos2;
                fOooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            double dCeil = Math.ceil(d2) * 2.0d;
            int i2 = 0;
            boolean z = false;
            while (true) {
                double d5 = i2;
                if (d5 >= dCeil) {
                    break;
                }
                float f6 = z ? fFloatValue2 : fFloatValue3;
                float f7 = (fOooO00o == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || d5 != dCeil - 2.0d) ? f4 : (f3 * f5) / 2.0f;
                if (fOooO00o == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || d5 != dCeil - 1.0d) {
                    fOooO00o = f6;
                }
                double d6 = fOooO00o;
                float fCos3 = (float) (Math.cos(d) * d6);
                float fSin2 = (float) (d6 * Math.sin(d));
                if (fFloatValue4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fFloatValue5 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    this.f30698OooO00o.lineTo(fCos3, fSin2);
                    f = fSin2;
                    f2 = fFloatValue5;
                } else {
                    float f8 = fSin;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin3 = (float) Math.sin(dAtan2);
                    f = fSin2;
                    f2 = fFloatValue5;
                    double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin4 = (float) Math.sin(dAtan3);
                    float f9 = z ? fFloatValue4 : f2;
                    float f10 = z ? f2 : fFloatValue4;
                    float f11 = (z ? fFloatValue3 : fFloatValue2) * f9 * 0.47829f;
                    float f12 = fCos4 * f11;
                    float f13 = f11 * fSin3;
                    float f14 = (z ? fFloatValue2 : fFloatValue3) * f10 * 0.47829f;
                    float f15 = fCos5 * f14;
                    float f16 = f14 * fSin4;
                    if (f5 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        if (i2 == 0) {
                            f12 *= f5;
                            f13 *= f5;
                        } else if (d5 == dCeil - 1.0d) {
                            f15 *= f5;
                            f16 *= f5;
                        }
                    }
                    this.f30698OooO00o.cubicTo(fCos - f12, f8 - f13, fCos3 + f15, f + f16, fCos3, f);
                }
                d += (double) f7;
                z = !z;
                i2++;
                fCos = fCos3;
                fOooO00o = fOooO00o;
                f3 = f3;
                fSin = f;
                fFloatValue5 = f2;
            }
            PointF pointFOooO0o = this.f30704OooO0oO.OooO0o();
            this.f30698OooO00o.offset(pointFOooO0o.x, pointFOooO0o.y);
            this.f30698OooO00o.close();
        } else if (i == 2) {
            int iFloor = (int) Math.floor(this.f30702OooO0o.OooO0o().floatValue());
            OooOO0O<?, Float> oooOO0O4 = this.f30705OooO0oo;
            double radians2 = Math.toRadians((oooOO0O4 != null ? oooOO0O4.OooO0o().floatValue() : 0.0d) - 90.0d);
            double d7 = iFloor;
            float fFloatValue6 = this.f30708OooOO0o.OooO0o().floatValue() / 100.0f;
            float fFloatValue7 = this.f30706OooOO0.OooO0o().floatValue();
            double d8 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d8);
            float fSin5 = (float) (Math.sin(radians2) * d8);
            this.f30698OooO00o.moveTo(fCos6, fSin5);
            double d9 = (float) (6.283185307179586d / d7);
            double d10 = radians2 + d9;
            double dCeil2 = Math.ceil(d7);
            int i3 = 0;
            while (i3 < dCeil2) {
                float fCos7 = (float) (Math.cos(d10) * d8);
                double d11 = dCeil2;
                float fSin6 = (float) (Math.sin(d10) * d8);
                if (fFloatValue6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    double dAtan4 = (float) (Math.atan2(fSin5, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin7 = (float) Math.sin(dAtan4);
                    double dAtan5 = (float) (Math.atan2(fSin6, fCos7) - 1.5707963267948966d);
                    float f17 = fFloatValue7 * fFloatValue6 * 0.25f;
                    this.f30698OooO00o.cubicTo(fCos6 - (fCos8 * f17), fSin5 - (fSin7 * f17), fCos7 + (((float) Math.cos(dAtan5)) * f17), fSin6 + (f17 * ((float) Math.sin(dAtan5))), fCos7, fSin6);
                } else {
                    this.f30698OooO00o.lineTo(fCos7, fSin6);
                }
                d10 += d9;
                i3++;
                fSin5 = fSin6;
                fCos6 = fCos7;
                dCeil2 = d11;
                d8 = d8;
                d9 = d9;
            }
            PointF pointFOooO0o2 = this.f30704OooO0oO.OooO0o();
            this.f30698OooO00o.offset(pointFOooO0o2.x, pointFOooO0o2.y);
            this.f30698OooO00o.close();
        }
        this.f30698OooO00o.close();
        this.f30710OooOOO0.OooO0O0(this.f30698OooO00o);
        this.f30709OooOOO = true;
        return this.f30698OooO00o;
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30709OooOOO = false;
        this.f30700OooO0OO.invalidateSelf();
    }

    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            OooOO0 oooOO1 = (OooOO0) arrayList.get(i);
            if (oooOO1 instanceof o0ooOOo) {
                o0ooOOo o0ooooo2 = (o0ooOOo) oooOO1;
                if (o0ooooo2.f30739OooO0OO == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f30710OooOOO0.OooO00o(o0ooooo2);
                    o0ooooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }

    @Override // p225o00oOOo.oo0oOO0
    public final void OooO0Oo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        o000O0.OooO0o0(o00o0ooo2, i, list, o00o0ooo3, this);
    }

    @Override // p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        OooOO0O<?, Float> oooOO0O;
        OooOO0O<?, Float> oooOO0O2;
        if (t == o000oOoO.f10221OooOo0o) {
            this.f30702OooO0o.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10217OooOo) {
            this.f30705OooO0oo.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10210OooOOO) {
            this.f30704OooO0oO.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10223OooOoO0 && (oooOO0O2 = this.f30697OooO) != null) {
            oooOO0O2.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10222OooOoO) {
            this.f30706OooOO0.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10224OooOoOO && (oooOO0O = this.f30707OooOO0O) != null) {
            oooOO0O.OooOO0O(o000000o2);
        } else if (t == o000oOoO.f10226OooOoo0) {
            this.f30708OooOO0o.OooOO0O(o000000o2);
        }
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30699OooO0O0;
    }
}
