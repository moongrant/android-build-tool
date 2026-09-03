package o00OO0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends OooO00o {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final String f36973OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f36974OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f36975OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final p190o00o0O.OooOOOO<RadialGradient> f36976OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final p190o00o0O.OooOOOO<LinearGradient> f36977OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final RectF f36978OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final GradientType f36979OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final o00OO0O0.OooOo00 f36980OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final o00OO0O0.OooO f36981OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o00OO0O0.OooOo00 f36982OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public o00OO0O0.o00O0O f36983OooOoo0;

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOOO(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, com.airbnb.lottie.model.content.OooO00o oooO00o2) {
        ShapeStroke.LineCapType lineCapType = oooO00o2.f11876OooO0oo;
        lineCapType.getClass();
        int i = ShapeStroke.OooO00o.f11901OooO00o[lineCapType.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        ShapeStroke.LineJoinType lineJoinType = oooO00o2.f11868OooO;
        lineJoinType.getClass();
        int i2 = ShapeStroke.OooO00o.f11902OooO0O0[lineJoinType.ordinal()];
        super(lottieDrawable, oooO00o, cap, i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, oooO00o2.f11877OooOO0, oooO00o2.f11872OooO0Oo, oooO00o2.f11875OooO0oO, oooO00o2.f11878OooOO0O, oooO00o2.f11879OooOO0o);
        this.f36977OooOo00 = new p190o00o0O.OooOOOO<>();
        this.f36976OooOo0 = new p190o00o0O.OooOOOO<>();
        this.f36978OooOo0O = new RectF();
        this.f36973OooOOo = oooO00o2.f11869OooO00o;
        this.f36979OooOo0o = oooO00o2.f11870OooO0O0;
        this.f36974OooOOoo = oooO00o2.f11880OooOOO0;
        this.f36975OooOo = (int) (lottieDrawable.f11763OooO0o0.OooO0O0() / 32.0f);
        o00OO0O0.OooO00o<p136o00OO0oO.OooOO0, p136o00OO0oO.OooOO0> OooO00o2 = oooO00o2.f11871OooO0OO.OooO00o();
        this.f36981OooOoO0 = (o00OO0O0.OooO) OooO00o2;
        OooO00o2.OooO00o(this);
        oooO00o.OooO0oO(OooO00o2);
        o00OO0O0.OooO00o<PointF, PointF> OooO00o3 = oooO00o2.f11874OooO0o0.OooO00o();
        this.f36980OooOoO = (o00OO0O0.OooOo00) OooO00o3;
        OooO00o3.OooO00o(this);
        oooO00o.OooO0oO(OooO00o3);
        o00OO0O0.OooO00o<PointF, PointF> OooO00o4 = oooO00o2.f11873OooO0o.OooO00o();
        this.f36982OooOoOO = (o00OO0O0.OooOo00) OooO00o4;
        OooO00o4.OooO00o(this);
        oooO00o.OooO0oO(OooO00o4);
    }

    public final int OooO() {
        float f = this.f36980OooOoO.f37241OooO0Oo;
        float f2 = this.f36975OooOo;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f36982OooOoOO.f37241OooO0Oo * f2);
        int iRound3 = Math.round(this.f36981OooOoO0.f37241OooO0Oo * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // o00OO0.OooO00o, p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        super.OooO0Oo(oooO0OO, obj);
        if (obj == com.airbnb.lottie.o00Oo0.f12008Oooo0o0) {
            o00OO0O0.o00O0O o00o0o2 = this.f36983OooOoo0;
            com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f36926OooO0o;
            if (o00o0o2 != null) {
                oooO00o.OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f36983OooOoo0 = null;
                return;
            }
            o00OO0O0.o00O0O o00o0o3 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f36983OooOoo0 = o00o0o3;
            o00o0o3.OooO00o(this);
            oooO00o.OooO0oO(this.f36983OooOoo0);
        }
    }

    public final int[] OooO0oO(int[] iArr) {
        o00OO0O0.o00O0O o00o0o2 = this.f36983OooOoo0;
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
    @Override // o00OO0.OooO00o, o00OO0.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        Shader radialGradient;
        if (this.f36974OooOOoo) {
            return;
        }
        OooO0o(this.f36978OooOo0O, matrix, false);
        GradientType gradientType = GradientType.LINEAR;
        GradientType gradientType2 = this.f36979OooOo0o;
        o00OO0O0.OooO oooO = this.f36981OooOoO0;
        o00OO0O0.OooOo00 oooOo00 = this.f36982OooOoOO;
        o00OO0O0.OooOo00 oooOo01 = this.f36980OooOoO;
        if (gradientType2 == gradientType) {
            long jOooO = OooO();
            p190o00o0O.OooOOOO<LinearGradient> oooOOOO = this.f36977OooOo00;
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
            p190o00o0O.OooOOOO<RadialGradient> oooOOOO2 = this.f36976OooOo0;
            radialGradient = (RadialGradient) oooOOOO2.OooO0oO(jOooO2, null);
            if (radialGradient == null) {
                PointF pointFOooO0o3 = oooOo01.OooO0o();
                PointF pointFOooO0o4 = oooOo00.OooO0o();
                p136o00OO0oO.OooOO0 oooOO0OooO0o2 = oooO.OooO0o();
                int[] iArrOooO0oO = OooO0oO(oooOO0OooO0o2.f37348OooO0O0);
                float[] fArr = oooOO0OooO0o2.f37347OooO00o;
                float f = pointFOooO0o3.x;
                float f2 = pointFOooO0o3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointFOooO0o4.x - f, pointFOooO0o4.y - f2), iArrOooO0oO, fArr, Shader.TileMode.CLAMP);
                oooOOOO2.OooO(jOooO2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.f36921OooO.setShader(radialGradient);
        super.OooO0oo(canvas, matrix, i);
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f36973OooOOo;
    }
}
