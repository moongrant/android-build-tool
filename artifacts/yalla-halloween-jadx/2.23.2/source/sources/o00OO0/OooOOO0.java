package o00OO0;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;
import p133o00OO00o.o0ooOOo;
import p135o00OO0o0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements OooO, o00OO0O0.OooO00o.InterfaceC0423OooO00o, OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f36984OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final String f36985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f36986OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f36987OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Path f36989OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0ooOOo f36991OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RectF f36992OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final GradientType f36993OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00OO0O0.OooO f36994OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00OO0O0.OooOO0 f36995OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00OO0O0.OooOo00 f36996OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00OO0O0.OooOo00 f36997OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public o00OO0O0.o00O0O f36998OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public o00OO0O0.o00O0O f36999OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f37000OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final LottieDrawable f37001OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public o00OO0O0.OooO00o<Float, Float> f37002OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO0OO f37003OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f37004OooOo00;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p190o00o0O.OooOOOO<LinearGradient> f36988OooO0Oo = new p190o00o0O.OooOOOO<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p190o00o0O.OooOOOO<RadialGradient> f36990OooO0o0 = new p190o00o0O.OooOOOO<>();

    public OooOOO0(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, p136o00OO0oO.OooOO0O oooOO0O) {
        Path path = new Path();
        this.f36989OooO0o = path;
        this.f36991OooO0oO = new o0ooOOo(1);
        this.f36992OooO0oo = new RectF();
        this.f36984OooO = new ArrayList();
        this.f37004OooOo00 = 0.0f;
        this.f36987OooO0OO = oooO00o;
        this.f36985OooO00o = oooOO0O.f37355OooO0oO;
        this.f36986OooO0O0 = oooOO0O.f37356OooO0oo;
        this.f37001OooOOo0 = lottieDrawable;
        this.f36993OooOO0 = oooOO0O.f37349OooO00o;
        path.setFillType(oooOO0O.f37350OooO0O0);
        this.f37000OooOOo = (int) (lottieDrawable.f11763OooO0o0.OooO0O0() / 32.0f);
        o00OO0O0.OooO00o<p136o00OO0oO.OooOO0, p136o00OO0oO.OooOO0> OooO00o2 = oooOO0O.f37351OooO0OO.OooO00o();
        this.f36994OooOO0O = (o00OO0O0.OooO) OooO00o2;
        OooO00o2.OooO00o(this);
        oooO00o.OooO0oO(OooO00o2);
        o00OO0O0.OooO00o<Integer, Integer> OooO00o3 = oooOO0O.f37352OooO0Oo.OooO00o();
        this.f36995OooOO0o = (o00OO0O0.OooOO0) OooO00o3;
        OooO00o3.OooO00o(this);
        oooO00o.OooO0oO(OooO00o3);
        o00OO0O0.OooO00o<PointF, PointF> OooO00o4 = oooOO0O.f37354OooO0o0.OooO00o();
        this.f36997OooOOO0 = (o00OO0O0.OooOo00) OooO00o4;
        OooO00o4.OooO00o(this);
        oooO00o.OooO0oO(OooO00o4);
        o00OO0O0.OooO00o<PointF, PointF> OooO00o5 = oooOO0O.f37353OooO0o.OooO00o();
        this.f36996OooOOO = (o00OO0O0.OooOo00) OooO00o5;
        OooO00o5.OooO00o(this);
        oooO00o.OooO0oO(OooO00o5);
        if (oooO00o.OooOO0o() != null) {
            o00OO0O0.OooO00o<Float, Float> OooO00o6 = oooO00o.OooOO0o().f37341OooO00o.OooO00o();
            this.f37002OooOOoo = OooO00o6;
            OooO00o6.OooO00o(this);
            oooO00o.OooO0oO(this.f37002OooOOoo);
        }
        if (oooO00o.OooOOO0() != null) {
            this.f37003OooOo0 = new o00OO0O0.OooO0OO(this, oooO00o, oooO00o.OooOOO0());
        }
    }

    public final int OooO() {
        float f = this.f36997OooOOO0.f37241OooO0Oo;
        float f2 = this.f37000OooOOo;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f36996OooOOO.f37241OooO0Oo * f2);
        int iRound3 = Math.round(this.f36994OooOO0O.f37241OooO0Oo * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f37001OooOOo0.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        for (int i = 0; i < list2.size(); i++) {
            OooO0OO oooO0OO = list2.get(i);
            if (oooO0OO instanceof Oooo000) {
                this.f36984OooO.add((Oooo000) oooO0OO);
            }
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        if (obj == com.airbnb.lottie.o00Oo0.f11974OooO0Oo) {
            this.f36995OooOO0o.OooOO0O(oooO0OO);
            return;
        }
        ColorFilter colorFilter = com.airbnb.lottie.o00Oo0.f12006Oooo0OO;
        com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f36987OooO0OO;
        if (obj == colorFilter) {
            o00OO0O0.o00O0O o00o0o2 = this.f36998OooOOOO;
            if (o00o0o2 != null) {
                oooO00o.OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f36998OooOOOO = null;
                return;
            }
            o00OO0O0.o00O0O o00o0o3 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f36998OooOOOO = o00o0o3;
            o00o0o3.OooO00o(this);
            oooO00o.OooO0oO(this.f36998OooOOOO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f12008Oooo0o0) {
            o00OO0O0.o00O0O o00o0o4 = this.f36999OooOOOo;
            if (o00o0o4 != null) {
                oooO00o.OooOOOo(o00o0o4);
            }
            if (oooO0OO == null) {
                this.f36999OooOOOo = null;
                return;
            }
            this.f36988OooO0Oo.OooO0Oo();
            this.f36990OooO0o0.OooO0Oo();
            o00OO0O0.o00O0O o00o0o5 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f36999OooOOOo = o00o0o5;
            o00o0o5.OooO00o(this);
            oooO00o.OooO0oO(this.f36999OooOOOo);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11979OooOO0) {
            o00OO0O0.OooO00o<Float, Float> oooO00o2 = this.f37002OooOOoo;
            if (oooO00o2 != null) {
                oooO00o2.OooOO0O(oooO0OO);
                return;
            }
            o00OO0O0.o00O0O o00o0o6 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f37002OooOOoo = o00o0o6;
            o00o0o6.OooO00o(this);
            oooO00o.OooO0oO(this.f37002OooOOoo);
            return;
        }
        Integer num = com.airbnb.lottie.o00Oo0.f11976OooO0o0;
        o00OO0O0.OooO0OO oooO0OO2 = this.f37003OooOo0;
        if (obj == num && oooO0OO2 != null) {
            oooO0OO2.f37253OooO0O0.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f12003Oooo00O && oooO0OO2 != null) {
            oooO0OO2.OooO0OO(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f12004Oooo00o && oooO0OO2 != null) {
            oooO0OO2.f37255OooO0Oo.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f12001Oooo0 && oooO0OO2 != null) {
            oooO0OO2.f37257OooO0o0.OooOO0O(oooO0OO);
        } else {
            if (obj != com.airbnb.lottie.o00Oo0.f12005Oooo0O0 || oooO0OO2 == null) {
                return;
            }
            oooO0OO2.f37256OooO0o.OooOO0O(oooO0OO);
        }
    }

    @Override // o00OO0.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f36989OooO0o;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36984OooO;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((Oooo000) arrayList.get(i)).OooO00o(), matrix);
                i++;
            }
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0o0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        o00OOO0.OooOOO.OooO0Oo(o00oo0o2, i, arrayList, o00oo0o3, this);
    }

    public final int[] OooO0oO(int[] iArr) {
        o00OO0O0.o00O0O o00o0o2 = this.f36999OooOOOo;
        if (o00o0o2 != null) {
            Integer[] numArr = (Integer[]) o00o0o2.OooO0o();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o00OO0.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        Shader radialGradient;
        if (this.f36986OooO0O0) {
            return;
        }
        Path path = this.f36989OooO0o;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f36984OooO;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((Oooo000) arrayList.get(i2)).OooO00o(), matrix);
            i2++;
        }
        path.computeBounds(this.f36992OooO0oo, false);
        GradientType gradientType = GradientType.LINEAR;
        GradientType gradientType2 = this.f36993OooOO0;
        o00OO0O0.OooO oooO = this.f36994OooOO0O;
        o00OO0O0.OooOo00 oooOo00 = this.f36996OooOOO;
        o00OO0O0.OooOo00 oooOo01 = this.f36997OooOOO0;
        if (gradientType2 == gradientType) {
            long jOooO = OooO();
            p190o00o0O.OooOOOO<LinearGradient> oooOOOO = this.f36988OooO0Oo;
            radialGradient = (LinearGradient) oooOOOO.OooO0oO(jOooO, null);
            if (radialGradient == null) {
                PointF pointFOooO0o = oooOo01.OooO0o();
                PointF pointFOooO0o2 = oooOo00.OooO0o();
                p136o00OO0oO.OooOO0 oooOO0OooO0o = oooO.OooO0o();
                radialGradient = new LinearGradient(pointFOooO0o.x, pointFOooO0o.y, pointFOooO0o2.x, pointFOooO0o2.y, OooO0oO(oooOO0OooO0o.f37348OooO0O0), oooOO0OooO0o.f37347OooO00o, Shader.TileMode.CLAMP);
                oooOOOO.OooO(jOooO, radialGradient);
            }
        } else {
            long jOooO2 = OooO();
            p190o00o0O.OooOOOO<RadialGradient> oooOOOO2 = this.f36990OooO0o0;
            radialGradient = (RadialGradient) oooOOOO2.OooO0oO(jOooO2, null);
            if (radialGradient == null) {
                PointF pointFOooO0o3 = oooOo01.OooO0o();
                PointF pointFOooO0o4 = oooOo00.OooO0o();
                p136o00OO0oO.OooOO0 oooOO0OooO0o2 = oooO.OooO0o();
                int[] iArrOooO0oO = OooO0oO(oooOO0OooO0o2.f37348OooO0O0);
                float[] fArr = oooOO0OooO0o2.f37347OooO00o;
                float f = pointFOooO0o3.x;
                float f2 = pointFOooO0o3.y;
                float fHypot = (float) Math.hypot(pointFOooO0o4.x - f, pointFOooO0o4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrOooO0oO, fArr, Shader.TileMode.CLAMP);
                oooOOOO2.OooO(jOooO2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        o0ooOOo o0ooooo = this.f36991OooO0oO;
        o0ooooo.setShader(radialGradient);
        o00OO0O0.o00O0O o00o0o2 = this.f36998OooOOOO;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        o00OO0O0.OooO00o<Float, Float> oooO00o = this.f37002OooOOoo;
        if (oooO00o != null) {
            float fFloatValue = oooO00o.OooO0o().floatValue();
            if (fFloatValue == 0.0f) {
                o0ooooo.setMaskFilter(null);
            } else if (fFloatValue != this.f37004OooOo00) {
                o0ooooo.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f37004OooOo00 = fFloatValue;
        }
        o00OO0O0.OooO0OO oooO0OO = this.f37003OooOo0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(o0ooooo);
        }
        int iIntValue = (int) ((((i / 255.0f) * this.f36995OooOO0o.OooO0o().intValue()) / 100.0f) * 255.0f);
        PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
        o0ooooo.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        canvas.drawPath(path, o0ooooo);
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f36985OooO00o;
    }
}
