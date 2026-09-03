package o00O000o;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o00Oo0;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public OooO00o<Float, Float> f36315OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f36316OooO00o = new Matrix();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f36317OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix f36318OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Matrix f36319OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public OooO00o<PointF, PointF> f36320OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float[] f36321OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public OooO00o<?, PointF> f36322OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public OooO00o<o00O0O00.OooO0o, o00O0O00.OooO0o> f36323OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public OooO00o<Integer, Integer> f36324OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooO0o f36325OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooO0o f36326OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooO00o<?, Float> f36327OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO00o<?, Float> f36328OooOOO0;

    public o0OoOo0(o00O00OO.OooOo oooOo) {
        o00O00OO.OooO oooO = oooOo.f36342OooO00o;
        this.f36320OooO0o = oooO == null ? null : oooO.OooO00o();
        o00O00OO.Oooo000<PointF, PointF> oooo000 = oooOo.f36343OooO0O0;
        this.f36322OooO0oO = oooo000 == null ? null : oooo000.OooO00o();
        o00O00OO.OooOO0O oooOO0O = oooOo.f36344OooO0OO;
        this.f36323OooO0oo = oooOO0O == null ? null : oooOO0O.OooO00o();
        o00O00OO.OooO0O0 oooO0O0 = oooOo.f36345OooO0Oo;
        this.f36315OooO = oooO0O0 == null ? null : oooO0O0.OooO00o();
        o00O00OO.OooO0O0 oooO0O1 = oooOo.f36346OooO0o;
        OooO0o oooO0o = oooO0O1 == null ? null : (OooO0o) oooO0O1.OooO00o();
        this.f36325OooOO0O = oooO0o;
        if (oooO0o != null) {
            this.f36317OooO0O0 = new Matrix();
            this.f36318OooO0OO = new Matrix();
            this.f36319OooO0Oo = new Matrix();
            this.f36321OooO0o0 = new float[9];
        } else {
            this.f36317OooO0O0 = null;
            this.f36318OooO0OO = null;
            this.f36319OooO0Oo = null;
            this.f36321OooO0o0 = null;
        }
        o00O00OO.OooO0O0 oooO0O2 = oooOo.f36348OooO0oO;
        this.f36326OooOO0o = oooO0O2 == null ? null : (OooO0o) oooO0O2.OooO00o();
        o00O00OO.OooO0o oooO0o2 = oooOo.f36347OooO0o0;
        if (oooO0o2 != null) {
            this.f36324OooOO0 = oooO0o2.OooO00o();
        }
        o00O00OO.OooO0O0 oooO0O3 = oooOo.f36349OooO0oo;
        if (oooO0O3 != null) {
            this.f36328OooOOO0 = oooO0O3.OooO00o();
        } else {
            this.f36328OooOOO0 = null;
        }
        o00O00OO.OooO0O0 oooO0O4 = oooOo.f36341OooO;
        if (oooO0O4 != null) {
            this.f36327OooOOO = oooO0O4.OooO00o();
        } else {
            this.f36327OooOOO = null;
        }
    }

    public final void OooO00o(com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        oooO00o.OooO0oO(this.f36324OooOO0);
        oooO00o.OooO0oO(this.f36328OooOOO0);
        oooO00o.OooO0oO(this.f36327OooOOO);
        oooO00o.OooO0oO(this.f36320OooO0o);
        oooO00o.OooO0oO(this.f36322OooO0oO);
        oooO00o.OooO0oO(this.f36323OooO0oo);
        oooO00o.OooO0oO(this.f36315OooO);
        oooO00o.OooO0oO(this.f36325OooOO0O);
        oooO00o.OooO0oO(this.f36326OooOO0o);
    }

    public final void OooO0O0(OooO00o.InterfaceC0420OooO00o interfaceC0420OooO00o) {
        OooO00o<Integer, Integer> oooO00o = this.f36324OooOO0;
        if (oooO00o != null) {
            oooO00o.OooO00o(interfaceC0420OooO00o);
        }
        OooO00o<?, Float> oooO00o2 = this.f36328OooOOO0;
        if (oooO00o2 != null) {
            oooO00o2.OooO00o(interfaceC0420OooO00o);
        }
        OooO00o<?, Float> oooO00o3 = this.f36327OooOOO;
        if (oooO00o3 != null) {
            oooO00o3.OooO00o(interfaceC0420OooO00o);
        }
        OooO00o<PointF, PointF> oooO00o4 = this.f36320OooO0o;
        if (oooO00o4 != null) {
            oooO00o4.OooO00o(interfaceC0420OooO00o);
        }
        OooO00o<?, PointF> oooO00o5 = this.f36322OooO0oO;
        if (oooO00o5 != null) {
            oooO00o5.OooO00o(interfaceC0420OooO00o);
        }
        OooO00o<o00O0O00.OooO0o, o00O0O00.OooO0o> oooO00o6 = this.f36323OooO0oo;
        if (oooO00o6 != null) {
            oooO00o6.OooO00o(interfaceC0420OooO00o);
        }
        OooO00o<Float, Float> oooO00o7 = this.f36315OooO;
        if (oooO00o7 != null) {
            oooO00o7.OooO00o(interfaceC0420OooO00o);
        }
        OooO0o oooO0o = this.f36325OooOO0O;
        if (oooO0o != null) {
            oooO0o.OooO00o(interfaceC0420OooO00o);
        }
        OooO0o oooO0o2 = this.f36326OooOO0o;
        if (oooO0o2 != null) {
            oooO0o2.OooO00o(interfaceC0420OooO00o);
        }
    }

    public final boolean OooO0OO(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        OooO0o oooO0o;
        OooO0o oooO0o2;
        OooO00o<?, Float> oooO00o;
        OooO00o<?, Float> oooO00o2;
        if (obj == o00Oo0.f8885OooO0o) {
            OooO00o<PointF, PointF> oooO00o3 = this.f36320OooO0o;
            if (oooO00o3 == null) {
                this.f36320OooO0o = new o00O0O(oooO0OO, new PointF());
                return true;
            }
            oooO00o3.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f8887OooO0oO) {
            OooO00o<?, PointF> oooO00o4 = this.f36322OooO0oO;
            if (oooO00o4 == null) {
                this.f36322OooO0oO = new o00O0O(oooO0OO, new PointF());
                return true;
            }
            oooO00o4.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f8888OooO0oo) {
            OooO00o<?, PointF> oooO00o5 = this.f36322OooO0oO;
            if (oooO00o5 instanceof Oooo0) {
                Oooo0 oooo0 = (Oooo0) oooO00o5;
                o00O0O00.OooO0OO<Float> oooO0OO2 = oooo0.f36311OooOOO0;
                oooo0.f36311OooOOO0 = oooO0OO;
                return true;
            }
        }
        if (obj == o00Oo0.f8880OooO) {
            OooO00o<?, PointF> oooO00o6 = this.f36322OooO0oO;
            if (oooO00o6 instanceof Oooo0) {
                Oooo0 oooo1 = (Oooo0) oooO00o6;
                o00O0O00.OooO0OO<Float> oooO0OO3 = oooo1.f36310OooOOO;
                oooo1.f36310OooOOO = oooO0OO;
                return true;
            }
        }
        if (obj == o00Oo0.f8894OooOOOO) {
            OooO00o<o00O0O00.OooO0o, o00O0O00.OooO0o> oooO00o7 = this.f36323OooO0oo;
            if (oooO00o7 == null) {
                this.f36323OooO0oo = new o00O0O(oooO0OO, new o00O0O00.OooO0o());
                return true;
            }
            oooO00o7.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f8895OooOOOo) {
            OooO00o<Float, Float> oooO00o8 = this.f36315OooO;
            if (oooO00o8 == null) {
                this.f36315OooO = new o00O0O(oooO0OO, Float.valueOf(0.0f));
                return true;
            }
            oooO00o8.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f8883OooO0OO) {
            OooO00o<Integer, Integer> oooO00o9 = this.f36324OooOO0;
            if (oooO00o9 == null) {
                this.f36324OooOO0 = new o00O0O(oooO0OO, 100);
                return true;
            }
            oooO00o9.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f8907OooOoo && (oooO00o2 = this.f36328OooOOO0) != null) {
            if (oooO00o2 == null) {
                this.f36328OooOOO0 = new o00O0O(oooO0OO, 100);
                return true;
            }
            oooO00o2.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f8909OooOooO && (oooO00o = this.f36327OooOOO) != null) {
            if (oooO00o == null) {
                this.f36327OooOOO = new o00O0O(oooO0OO, 100);
                return true;
            }
            oooO00o.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f8897OooOOo0 && (oooO0o2 = this.f36325OooOO0O) != null) {
            if (oooO0o2 == null) {
                this.f36325OooOO0O = new OooO0o(Collections.singletonList(new o00O0O00.OooO00o(Float.valueOf(0.0f))));
            }
            this.f36325OooOO0O.OooOO0O(oooO0OO);
            return true;
        }
        if (obj != o00Oo0.f8896OooOOo || (oooO0o = this.f36326OooOO0o) == null) {
            return false;
        }
        if (oooO0o == null) {
            this.f36326OooOO0o = new OooO0o(Collections.singletonList(new o00O0O00.OooO00o(Float.valueOf(0.0f))));
        }
        this.f36326OooOO0o.OooOO0O(oooO0OO);
        return true;
    }

    public final Matrix OooO0Oo() {
        float[] fArr;
        Matrix matrix = this.f36316OooO00o;
        matrix.reset();
        OooO00o<?, PointF> oooO00o = this.f36322OooO0oO;
        if (oooO00o != null) {
            PointF pointFOooO0o = oooO00o.OooO0o();
            float f = pointFOooO0o.x;
            if (f != 0.0f || pointFOooO0o.y != 0.0f) {
                matrix.preTranslate(f, pointFOooO0o.y);
            }
        }
        OooO00o<Float, Float> oooO00o2 = this.f36315OooO;
        if (oooO00o2 != null) {
            float fFloatValue = oooO00o2 instanceof o00O0O ? oooO00o2.OooO0o().floatValue() : ((OooO0o) oooO00o2).OooOO0o();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        if (this.f36325OooOO0O != null) {
            OooO0o oooO0o = this.f36326OooOO0o;
            float fCos = oooO0o == null ? 0.0f : (float) Math.cos(Math.toRadians((-oooO0o.OooOO0o()) + 90.0f));
            OooO0o oooO0o2 = this.f36326OooOO0o;
            float fSin = oooO0o2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-oooO0o2.OooOO0o()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(this.f36325OooOO0O.OooOO0o()));
            int i = 0;
            while (true) {
                fArr = this.f36321OooO0o0;
                if (i >= 9) {
                    break;
                }
                fArr[i] = 0.0f;
                i++;
            }
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f36317OooO0O0;
            matrix2.setValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                fArr[i2] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f36318OooO0OO;
            matrix3.setValues(fArr);
            for (int i3 = 0; i3 < 9; i3++) {
                fArr[i3] = 0.0f;
            }
            fArr[0] = fCos;
            fArr[1] = f2;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f36319OooO0Oo;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        OooO00o<o00O0O00.OooO0o, o00O0O00.OooO0o> oooO00o3 = this.f36323OooO0oo;
        if (oooO00o3 != null) {
            o00O0O00.OooO0o OooO0o2 = oooO00o3.OooO0o();
            float f3 = OooO0o2.f36521OooO00o;
            if (f3 != 1.0f || OooO0o2.f36522OooO0O0 != 1.0f) {
                matrix.preScale(f3, OooO0o2.f36522OooO0O0);
            }
        }
        OooO00o<PointF, PointF> oooO00o4 = this.f36320OooO0o;
        if (oooO00o4 != null) {
            PointF pointFOooO0o2 = oooO00o4.OooO0o();
            float f4 = pointFOooO0o2.x;
            if (f4 != 0.0f || pointFOooO0o2.y != 0.0f) {
                matrix.preTranslate(-f4, -pointFOooO0o2.y);
            }
        }
        return matrix;
    }

    public final Matrix OooO0o0(float f) {
        OooO00o<?, PointF> oooO00o = this.f36322OooO0oO;
        PointF pointFOooO0o = oooO00o == null ? null : oooO00o.OooO0o();
        OooO00o<o00O0O00.OooO0o, o00O0O00.OooO0o> oooO00o2 = this.f36323OooO0oo;
        o00O0O00.OooO0o OooO0o2 = oooO00o2 == null ? null : oooO00o2.OooO0o();
        Matrix matrix = this.f36316OooO00o;
        matrix.reset();
        if (pointFOooO0o != null) {
            matrix.preTranslate(pointFOooO0o.x * f, pointFOooO0o.y * f);
        }
        if (OooO0o2 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(OooO0o2.f36521OooO00o, d), (float) Math.pow(OooO0o2.f36522OooO0O0, d));
        }
        OooO00o<Float, Float> oooO00o3 = this.f36315OooO;
        if (oooO00o3 != null) {
            float fFloatValue = oooO00o3.OooO0o().floatValue();
            OooO00o<PointF, PointF> oooO00o4 = this.f36320OooO0o;
            PointF pointFOooO0o2 = oooO00o4 != null ? oooO00o4.OooO0o() : null;
            matrix.preRotate(fFloatValue * f, pointFOooO0o2 == null ? 0.0f : pointFOooO0o2.x, pointFOooO0o2 != null ? pointFOooO0o2.y : 0.0f);
        }
        return matrix;
    }
}
