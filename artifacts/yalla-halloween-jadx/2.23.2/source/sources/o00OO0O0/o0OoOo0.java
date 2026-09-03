package o00OO0O0;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o00Oo0;
import java.util.Collections;
import p134o00OO0o.o00000;
import p134o00OO0o.o000000O;
import p134o00OO0o.o0OO00O;
import p134o00OO0o.o0OOO0o;
import p134o00OO0o.o0ooOOo;
import p134o00OO0o.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public OooO00o<Float, Float> f37280OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f37281OooO00o = new Matrix();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f37282OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix f37283OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Matrix f37284OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public OooO00o<PointF, PointF> f37285OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float[] f37286OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public OooO00o<?, PointF> f37287OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public OooO00o<o00OOO0O.OooO0o, o00OOO0O.OooO0o> f37288OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public OooO00o<Integer, Integer> f37289OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooO0o f37290OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooO0o f37291OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooO00o<?, Float> f37292OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO00o<?, Float> f37293OooOOO0;

    public o0OoOo0(o000000O o000000o2) {
        o0OOO0o o0ooo0o2 = o000000o2.f37308OooO00o;
        this.f37285OooO0o = o0ooo0o2 == null ? null : o0ooo0o2.OooO00o();
        o00000<PointF, PointF> o00000Var = o000000o2.f37309OooO0O0;
        this.f37287OooO0oO = o00000Var == null ? null : o00000Var.OooO00o();
        o0OO00O o0oo00o2 = o000000o2.f37310OooO0OO;
        this.f37288OooO0oo = o0oo00o2 == null ? null : o0oo00o2.OooO00o();
        oo000o oo000oVar = o000000o2.f37311OooO0Oo;
        this.f37280OooO = oo000oVar == null ? null : oo000oVar.OooO00o();
        oo000o oo000oVar2 = o000000o2.f37312OooO0o;
        OooO0o oooO0o = oo000oVar2 == null ? null : (OooO0o) oo000oVar2.OooO00o();
        this.f37290OooOO0O = oooO0o;
        if (oooO0o != null) {
            this.f37282OooO0O0 = new Matrix();
            this.f37283OooO0OO = new Matrix();
            this.f37284OooO0Oo = new Matrix();
            this.f37286OooO0o0 = new float[9];
        } else {
            this.f37282OooO0O0 = null;
            this.f37283OooO0OO = null;
            this.f37284OooO0Oo = null;
            this.f37286OooO0o0 = null;
        }
        oo000o oo000oVar3 = o000000o2.f37314OooO0oO;
        this.f37291OooOO0o = oo000oVar3 == null ? null : (OooO0o) oo000oVar3.OooO00o();
        o0ooOOo o0ooooo = o000000o2.f37313OooO0o0;
        if (o0ooooo != null) {
            this.f37289OooOO0 = o0ooooo.OooO00o();
        }
        oo000o oo000oVar4 = o000000o2.f37315OooO0oo;
        if (oo000oVar4 != null) {
            this.f37293OooOOO0 = oo000oVar4.OooO00o();
        } else {
            this.f37293OooOOO0 = null;
        }
        oo000o oo000oVar5 = o000000o2.f37307OooO;
        if (oo000oVar5 != null) {
            this.f37292OooOOO = oo000oVar5.OooO00o();
        } else {
            this.f37292OooOOO = null;
        }
    }

    public final void OooO00o(com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        oooO00o.OooO0oO(this.f37289OooOO0);
        oooO00o.OooO0oO(this.f37293OooOOO0);
        oooO00o.OooO0oO(this.f37292OooOOO);
        oooO00o.OooO0oO(this.f37285OooO0o);
        oooO00o.OooO0oO(this.f37287OooO0oO);
        oooO00o.OooO0oO(this.f37288OooO0oo);
        oooO00o.OooO0oO(this.f37280OooO);
        oooO00o.OooO0oO(this.f37290OooOO0O);
        oooO00o.OooO0oO(this.f37291OooOO0o);
    }

    public final void OooO0O0(OooO00o.InterfaceC0423OooO00o interfaceC0423OooO00o) {
        OooO00o<Integer, Integer> oooO00o = this.f37289OooOO0;
        if (oooO00o != null) {
            oooO00o.OooO00o(interfaceC0423OooO00o);
        }
        OooO00o<?, Float> oooO00o2 = this.f37293OooOOO0;
        if (oooO00o2 != null) {
            oooO00o2.OooO00o(interfaceC0423OooO00o);
        }
        OooO00o<?, Float> oooO00o3 = this.f37292OooOOO;
        if (oooO00o3 != null) {
            oooO00o3.OooO00o(interfaceC0423OooO00o);
        }
        OooO00o<PointF, PointF> oooO00o4 = this.f37285OooO0o;
        if (oooO00o4 != null) {
            oooO00o4.OooO00o(interfaceC0423OooO00o);
        }
        OooO00o<?, PointF> oooO00o5 = this.f37287OooO0oO;
        if (oooO00o5 != null) {
            oooO00o5.OooO00o(interfaceC0423OooO00o);
        }
        OooO00o<o00OOO0O.OooO0o, o00OOO0O.OooO0o> oooO00o6 = this.f37288OooO0oo;
        if (oooO00o6 != null) {
            oooO00o6.OooO00o(interfaceC0423OooO00o);
        }
        OooO00o<Float, Float> oooO00o7 = this.f37280OooO;
        if (oooO00o7 != null) {
            oooO00o7.OooO00o(interfaceC0423OooO00o);
        }
        OooO0o oooO0o = this.f37290OooOO0O;
        if (oooO0o != null) {
            oooO0o.OooO00o(interfaceC0423OooO00o);
        }
        OooO0o oooO0o2 = this.f37291OooOO0o;
        if (oooO0o2 != null) {
            oooO0o2.OooO00o(interfaceC0423OooO00o);
        }
    }

    public final boolean OooO0OO(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        OooO0o oooO0o;
        OooO0o oooO0o2;
        OooO00o<?, Float> oooO00o;
        OooO00o<?, Float> oooO00o2;
        if (obj == o00Oo0.f11975OooO0o) {
            OooO00o<PointF, PointF> oooO00o3 = this.f37285OooO0o;
            if (oooO00o3 == null) {
                this.f37285OooO0o = new o00O0O(oooO0OO, new PointF());
                return true;
            }
            oooO00o3.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f11977OooO0oO) {
            OooO00o<?, PointF> oooO00o4 = this.f37287OooO0oO;
            if (oooO00o4 == null) {
                this.f37287OooO0oO = new o00O0O(oooO0OO, new PointF());
                return true;
            }
            oooO00o4.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f11978OooO0oo) {
            OooO00o<?, PointF> oooO00o5 = this.f37287OooO0oO;
            if (oooO00o5 instanceof Oooo0) {
                Oooo0 oooo0 = (Oooo0) oooO00o5;
                o00OOO0O.OooO0OO<Float> oooO0OO2 = oooo0.f37276OooOOO0;
                oooo0.f37276OooOOO0 = oooO0OO;
                return true;
            }
        }
        if (obj == o00Oo0.f11970OooO) {
            OooO00o<?, PointF> oooO00o6 = this.f37287OooO0oO;
            if (oooO00o6 instanceof Oooo0) {
                Oooo0 oooo1 = (Oooo0) oooO00o6;
                o00OOO0O.OooO0OO<Float> oooO0OO3 = oooo1.f37275OooOOO;
                oooo1.f37275OooOOO = oooO0OO;
                return true;
            }
        }
        if (obj == o00Oo0.f11984OooOOOO) {
            OooO00o<o00OOO0O.OooO0o, o00OOO0O.OooO0o> oooO00o7 = this.f37288OooO0oo;
            if (oooO00o7 == null) {
                this.f37288OooO0oo = new o00O0O(oooO0OO, new o00OOO0O.OooO0o());
                return true;
            }
            oooO00o7.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f11985OooOOOo) {
            OooO00o<Float, Float> oooO00o8 = this.f37280OooO;
            if (oooO00o8 == null) {
                this.f37280OooO = new o00O0O(oooO0OO, Float.valueOf(0.0f));
                return true;
            }
            oooO00o8.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f11973OooO0OO) {
            OooO00o<Integer, Integer> oooO00o9 = this.f37289OooOO0;
            if (oooO00o9 == null) {
                this.f37289OooOO0 = new o00O0O(oooO0OO, 100);
                return true;
            }
            oooO00o9.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f11997OooOoo && (oooO00o2 = this.f37293OooOOO0) != null) {
            if (oooO00o2 == null) {
                this.f37293OooOOO0 = new o00O0O(oooO0OO, 100);
                return true;
            }
            oooO00o2.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f11999OooOooO && (oooO00o = this.f37292OooOOO) != null) {
            if (oooO00o == null) {
                this.f37292OooOOO = new o00O0O(oooO0OO, 100);
                return true;
            }
            oooO00o.OooOO0O(oooO0OO);
            return true;
        }
        if (obj == o00Oo0.f11987OooOOo0 && (oooO0o2 = this.f37290OooOO0O) != null) {
            if (oooO0o2 == null) {
                this.f37290OooOO0O = new OooO0o(Collections.singletonList(new o00OOO0O.OooO00o(Float.valueOf(0.0f))));
            }
            this.f37290OooOO0O.OooOO0O(oooO0OO);
            return true;
        }
        if (obj != o00Oo0.f11986OooOOo || (oooO0o = this.f37291OooOO0o) == null) {
            return false;
        }
        if (oooO0o == null) {
            this.f37291OooOO0o = new OooO0o(Collections.singletonList(new o00OOO0O.OooO00o(Float.valueOf(0.0f))));
        }
        this.f37291OooOO0o.OooOO0O(oooO0OO);
        return true;
    }

    public final Matrix OooO0Oo() {
        float[] fArr;
        Matrix matrix = this.f37281OooO00o;
        matrix.reset();
        OooO00o<?, PointF> oooO00o = this.f37287OooO0oO;
        if (oooO00o != null) {
            PointF pointFOooO0o = oooO00o.OooO0o();
            float f = pointFOooO0o.x;
            if (f != 0.0f || pointFOooO0o.y != 0.0f) {
                matrix.preTranslate(f, pointFOooO0o.y);
            }
        }
        OooO00o<Float, Float> oooO00o2 = this.f37280OooO;
        if (oooO00o2 != null) {
            float fFloatValue = oooO00o2 instanceof o00O0O ? oooO00o2.OooO0o().floatValue() : ((OooO0o) oooO00o2).OooOO0o();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        if (this.f37290OooOO0O != null) {
            OooO0o oooO0o = this.f37291OooOO0o;
            float fCos = oooO0o == null ? 0.0f : (float) Math.cos(Math.toRadians((-oooO0o.OooOO0o()) + 90.0f));
            OooO0o oooO0o2 = this.f37291OooOO0o;
            float fSin = oooO0o2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-oooO0o2.OooOO0o()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(this.f37290OooOO0O.OooOO0o()));
            int i = 0;
            while (true) {
                fArr = this.f37286OooO0o0;
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
            Matrix matrix2 = this.f37282OooO0O0;
            matrix2.setValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                fArr[i2] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f37283OooO0OO;
            matrix3.setValues(fArr);
            for (int i3 = 0; i3 < 9; i3++) {
                fArr[i3] = 0.0f;
            }
            fArr[0] = fCos;
            fArr[1] = f2;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f37284OooO0Oo;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        OooO00o<o00OOO0O.OooO0o, o00OOO0O.OooO0o> oooO00o3 = this.f37288OooO0oo;
        if (oooO00o3 != null) {
            o00OOO0O.OooO0o OooO0o2 = oooO00o3.OooO0o();
            float f3 = OooO0o2.f37459OooO00o;
            if (f3 != 1.0f || OooO0o2.f37460OooO0O0 != 1.0f) {
                matrix.preScale(f3, OooO0o2.f37460OooO0O0);
            }
        }
        OooO00o<PointF, PointF> oooO00o4 = this.f37285OooO0o;
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
        OooO00o<?, PointF> oooO00o = this.f37287OooO0oO;
        PointF pointFOooO0o = oooO00o == null ? null : oooO00o.OooO0o();
        OooO00o<o00OOO0O.OooO0o, o00OOO0O.OooO0o> oooO00o2 = this.f37288OooO0oo;
        o00OOO0O.OooO0o OooO0o2 = oooO00o2 == null ? null : oooO00o2.OooO0o();
        Matrix matrix = this.f37281OooO00o;
        matrix.reset();
        if (pointFOooO0o != null) {
            matrix.preTranslate(pointFOooO0o.x * f, pointFOooO0o.y * f);
        }
        if (OooO0o2 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(OooO0o2.f37459OooO00o, d), (float) Math.pow(OooO0o2.f37460OooO0O0, d));
        }
        OooO00o<Float, Float> oooO00o3 = this.f37280OooO;
        if (oooO00o3 != null) {
            float fFloatValue = oooO00o3.OooO0o().floatValue();
            OooO00o<PointF, PointF> oooO00o4 = this.f37285OooO0o;
            PointF pointFOooO0o2 = oooO00o4 != null ? oooO00o4.OooO0o() : null;
            matrix.preRotate(fFloatValue * f, pointFOooO0o2 == null ? 0.0f : pointFOooO0o2.x, pointFOooO0o2 != null ? pointFOooO0o2.y : 0.0f);
        }
        return matrix;
    }
}
