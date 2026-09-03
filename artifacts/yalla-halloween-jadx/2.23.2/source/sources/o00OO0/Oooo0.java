package o00OO0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import p135o00OO0o0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements Oooo000, o00OO0O0.OooO00o.InterfaceC0423OooO00o, OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO0o f37011OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f37013OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f37014OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PolystarShape.Type f37015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37016OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f37017OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO0O0.OooO00o<?, PointF> f37018OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37019OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37020OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO0o f37021OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37022OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f37023OooOOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f37012OooO00o = new Path();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO0O0 f37024OooOOO0 = new OooO0O0();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f37025OooO00o;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f37025OooO00o = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37025OooO00o[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Oooo0(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, PolystarShape polystarShape) {
        this.f37014OooO0OO = lottieDrawable;
        this.f37013OooO0O0 = polystarShape.f11882OooO00o;
        PolystarShape.Type type = polystarShape.f11883OooO0O0;
        this.f37015OooO0Oo = type;
        this.f37017OooO0o0 = polystarShape.f11890OooOO0;
        o00OO0O0.OooO00o<?, ?> OooO00o2 = polystarShape.f11884OooO0OO.OooO00o();
        this.f37016OooO0o = (o00OO0O0.OooO0o) OooO00o2;
        o00OO0O0.OooO00o<PointF, PointF> OooO00o3 = polystarShape.f11885OooO0Oo.OooO00o();
        this.f37018OooO0oO = OooO00o3;
        o00OO0O0.OooO00o<?, ?> OooO00o4 = polystarShape.f11887OooO0o0.OooO00o();
        this.f37019OooO0oo = (o00OO0O0.OooO0o) OooO00o4;
        o00OO0O0.OooO00o<?, ?> OooO00o5 = polystarShape.f11888OooO0oO.OooO00o();
        this.f37020OooOO0 = (o00OO0O0.OooO0o) OooO00o5;
        o00OO0O0.OooO00o<?, ?> OooO00o6 = polystarShape.f11881OooO.OooO00o();
        this.f37022OooOO0o = (o00OO0O0.OooO0o) OooO00o6;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f37011OooO = (o00OO0O0.OooO0o) polystarShape.f11886OooO0o.OooO00o();
            this.f37021OooOO0O = (o00OO0O0.OooO0o) polystarShape.f11889OooO0oo.OooO00o();
        } else {
            this.f37011OooO = null;
            this.f37021OooOO0O = null;
        }
        oooO00o.OooO0oO(OooO00o2);
        oooO00o.OooO0oO(OooO00o3);
        oooO00o.OooO0oO(OooO00o4);
        oooO00o.OooO0oO(OooO00o5);
        oooO00o.OooO0oO(OooO00o6);
        if (type == type2) {
            oooO00o.OooO0oO(this.f37011OooO);
            oooO00o.OooO0oO(this.f37021OooOO0O);
        }
        OooO00o2.OooO00o(this);
        OooO00o3.OooO00o(this);
        OooO00o4.OooO00o(this);
        OooO00o5.OooO00o(this);
        OooO00o6.OooO00o(this);
        if (type == type2) {
            this.f37011OooO.OooO00o(this);
            this.f37021OooOO0O.OooO00o(this);
        }
    }

    @Override // o00OO0.Oooo000
    public final Path OooO00o() {
        float fCos;
        float f;
        double d;
        float f2;
        Path path;
        float f3;
        Path path2;
        float f4;
        float f5;
        float f6;
        double d2;
        boolean z = this.f37023OooOOO;
        Path path3 = this.f37012OooO00o;
        if (z) {
            return path3;
        }
        path3.reset();
        if (this.f37017OooO0o0) {
            this.f37023OooOOO = true;
            return path3;
        }
        int i = OooO00o.f37025OooO00o[this.f37015OooO0Oo.ordinal()];
        o00OO0O0.OooO00o<?, PointF> oooO00o = this.f37018OooO0oO;
        o00OO0O0.OooO0o oooO0o = this.f37022OooOO0o;
        o00OO0O0.OooO0o oooO0o2 = this.f37020OooOO0;
        o00OO0O0.OooO0o oooO0o3 = this.f37019OooO0oo;
        o00OO0O0.OooO0o oooO0o4 = this.f37016OooO0o;
        if (i != 1) {
            if (i == 2) {
                int iFloor = (int) Math.floor(oooO0o4.OooO0o().floatValue());
                double radians = Math.toRadians((oooO0o3 == null ? 0.0d : oooO0o3.OooO0o().floatValue()) - 90.0d);
                double d3 = iFloor;
                float fFloatValue = oooO0o.OooO0o().floatValue() / 100.0f;
                float fFloatValue2 = oooO0o2.OooO0o().floatValue();
                double d4 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d4);
                float fSin = (float) (Math.sin(radians) * d4);
                path3.moveTo(fCos2, fSin);
                double d5 = (float) (6.283185307179586d / d3);
                double d6 = radians + d5;
                double dCeil = Math.ceil(d3);
                double d7 = d5;
                for (int i2 = 0; i2 < dCeil; i2++) {
                    float fCos3 = (float) (Math.cos(d6) * d4);
                    float fSin2 = (float) (Math.sin(d6) * d4);
                    if (fFloatValue != 0.0f) {
                        double d8 = d4;
                        double dAtan2 = (float) (Math.atan2(fSin, fCos2) - 1.5707963267948966d);
                        float fCos4 = (float) Math.cos(dAtan2);
                        float fSin3 = (float) Math.sin(dAtan2);
                        double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                        float f7 = fFloatValue2 * fFloatValue * 0.25f;
                        f6 = fSin2;
                        d2 = d8;
                        path3.cubicTo(fCos2 - (fCos4 * f7), fSin - (fSin3 * f7), (((float) Math.cos(dAtan3)) * f7) + fCos3, (f7 * ((float) Math.sin(dAtan3))) + fSin2, fCos3, f6);
                    } else {
                        f6 = fSin2;
                        d2 = d4;
                        path3.lineTo(fCos3, f6);
                    }
                    double d9 = d6 + d7;
                    fSin = f6;
                    d4 = d2;
                    d7 = d7;
                    oooO00o = oooO00o;
                    d6 = d9;
                    fCos2 = fCos3;
                }
                PointF pointFOooO0o = oooO00o.OooO0o();
                path3.offset(pointFOooO0o.x, pointFOooO0o.y);
                path3.close();
            }
            path = path3;
        } else {
            o00OO0O0.OooO00o<?, PointF> oooO00o2 = oooO00o;
            float fFloatValue3 = oooO0o4.OooO0o().floatValue();
            double radians2 = Math.toRadians((oooO0o3 == null ? 0.0d : oooO0o3.OooO0o().floatValue()) - 90.0d);
            double d10 = fFloatValue3;
            float f8 = (float) (6.283185307179586d / d10);
            float f9 = f8 / 2.0f;
            float f10 = fFloatValue3 - ((int) fFloatValue3);
            if (f10 != 0.0f) {
                radians2 += (double) ((1.0f - f10) * f9);
            }
            float fFloatValue4 = oooO0o2.OooO0o().floatValue();
            float fFloatValue5 = this.f37011OooO.OooO0o().floatValue();
            o00OO0O0.OooO0o oooO0o5 = this.f37021OooOO0O;
            float fFloatValue6 = oooO0o5 != null ? oooO0o5.OooO0o().floatValue() / 100.0f : 0.0f;
            float fFloatValue7 = oooO0o != null ? oooO0o.OooO0o().floatValue() / 100.0f : 0.0f;
            if (f10 != 0.0f) {
                float fOooO00o = OooOo.OooO0o.OooO00o(fFloatValue4, fFloatValue5, f10, fFloatValue5);
                double d11 = fOooO00o;
                fCos = (float) (Math.cos(radians2) * d11);
                float fSin4 = (float) (d11 * Math.sin(radians2));
                path3.moveTo(fCos, fSin4);
                f = fSin4;
                d = radians2 + ((double) ((f8 * f10) / 2.0f));
                f2 = fOooO00o;
            } else {
                double d12 = fFloatValue4;
                fCos = (float) (Math.cos(radians2) * d12);
                float fSin5 = (float) (d12 * Math.sin(radians2));
                path3.moveTo(fCos, fSin5);
                f = fSin5;
                d = radians2 + ((double) f9);
                f2 = 0.0f;
            }
            double dCeil2 = Math.ceil(d10) * 2.0d;
            int i3 = 0;
            double d13 = 2.0d;
            double d14 = d;
            boolean z2 = false;
            while (true) {
                double d15 = i3;
                if (d15 >= dCeil2) {
                    break;
                }
                float f11 = z2 ? fFloatValue4 : fFloatValue5;
                float f12 = (f2 == 0.0f || d15 != dCeil2 - d13) ? f9 : (f8 * f10) / 2.0f;
                if (f2 != 0.0f && d15 == dCeil2 - 1.0d) {
                    f11 = f2;
                }
                double d16 = f11;
                o00OO0O0.OooO00o<?, PointF> oooO00o3 = oooO00o2;
                float fCos5 = (float) (Math.cos(d14) * d16);
                float fSin6 = (float) (d16 * Math.sin(d14));
                if (fFloatValue6 == 0.0f && fFloatValue7 == 0.0f) {
                    path3.lineTo(fCos5, fSin6);
                    path2 = path3;
                    f5 = f12;
                    f3 = fSin6;
                    f4 = fFloatValue4;
                } else {
                    float f13 = fFloatValue4;
                    float f14 = f;
                    double dAtan4 = (float) (Math.atan2(f, fCos) - 1.5707963267948966d);
                    float fCos6 = (float) Math.cos(dAtan4);
                    float fSin7 = (float) Math.sin(dAtan4);
                    float f15 = f12;
                    f3 = fSin6;
                    path2 = path3;
                    double dAtan5 = (float) (Math.atan2(fSin6, fCos5) - 1.5707963267948966d);
                    float fCos7 = (float) Math.cos(dAtan5);
                    float fSin8 = (float) Math.sin(dAtan5);
                    float f16 = z2 ? fFloatValue6 : fFloatValue7;
                    float f17 = z2 ? fFloatValue7 : fFloatValue6;
                    float f18 = (z2 ? fFloatValue5 : f13) * f16 * 0.47829f;
                    float f19 = fCos6 * f18;
                    float f20 = f18 * fSin7;
                    float f21 = (z2 ? f13 : fFloatValue5) * f17 * 0.47829f;
                    float f22 = fCos7 * f21;
                    float f23 = f21 * fSin8;
                    if (f10 != 0.0f) {
                        if (i3 == 0) {
                            f19 *= f10;
                            f20 *= f10;
                        } else if (d15 == dCeil2 - 1.0d) {
                            f22 *= f10;
                            f23 *= f10;
                        }
                    }
                    f4 = f13;
                    path2.cubicTo(fCos - f19, f14 - f20, fCos5 + f22, f3 + f23, fCos5, f3);
                    f5 = f15;
                }
                d14 += (double) f5;
                z2 = !z2;
                i3++;
                d13 = 2.0d;
                fCos = fCos5;
                fFloatValue5 = fFloatValue5;
                fFloatValue4 = f4;
                f2 = f2;
                f8 = f8;
                f9 = f9;
                oooO00o2 = oooO00o3;
                f = f3;
                path3 = path2;
            }
            PointF pointFOooO0o2 = oooO00o2.OooO0o();
            path = path3;
            path.offset(pointFOooO0o2.x, pointFOooO0o2.y);
            path.close();
        }
        path.close();
        this.f37024OooOOO0.OooO0O0(path);
        this.f37023OooOOO = true;
        return path;
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f37023OooOOO = false;
        this.f37014OooO0OO.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            OooO0OO oooO0OO = (OooO0OO) arrayList.get(i);
            if (oooO0OO instanceof o00Ooo) {
                o00Ooo o00ooo2 = (o00Ooo) oooO0OO;
                if (o00ooo2.f37049OooO0OO == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    ((List) this.f37024OooOOO0.f36940OooO00o).add(o00ooo2);
                    o00ooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        o00OO0O0.OooO0o oooO0o;
        o00OO0O0.OooO0o oooO0o2;
        if (obj == com.airbnb.lottie.o00Oo0.f11993OooOo0o) {
            this.f37016OooO0o.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11989OooOo) {
            this.f37019OooO0oo.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11982OooOOO) {
            this.f37018OooO0oO.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11995OooOoO0 && (oooO0o2 = this.f37011OooO) != null) {
            oooO0o2.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11994OooOoO) {
            this.f37020OooOO0.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11996OooOoOO && (oooO0o = this.f37021OooOO0O) != null) {
            oooO0o.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f11998OooOoo0) {
            this.f37022OooOO0o.OooOO0O(oooO0OO);
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0o0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        o00OOO0.OooOOO.OooO0Oo(o00oo0o2, i, arrayList, o00oo0o3, this);
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f37013OooO0O0;
    }
}
