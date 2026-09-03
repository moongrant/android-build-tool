package p118o00O0Oo;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o000oOoO;
import p021OooOooo.o00Ooo;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOo00;
import p120o00O0OoO.o00O0O;
import p120o00O0OoO.o0OOO0o;
import p125o00O0o0O.o000000;
import p131o00O0oo0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends OooO0o {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final String f30659OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f30660OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f30661OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o00Ooo<RadialGradient> f30662OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o00Ooo<LinearGradient> f30663OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final RectF f30664OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final GradientType f30665OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooOO0O<PointF, PointF> f30666OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooOO0O<o000000, o000000> f30667OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooOO0O<PointF, PointF> f30668OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public o0OOO0o f30669OooOoo0;

    public OooOo(LottieDrawable lottieDrawable, OooO00o oooO00o, com.airbnb.lottie.model.content.OooO00o oooO00o2) {
        super(lottieDrawable, oooO00o, oooO00o2.f10106OooO0oo.OooO00o(), oooO00o2.f10098OooO.OooO00o(), oooO00o2.f10107OooOO0, oooO00o2.f10102OooO0Oo, oooO00o2.f10105OooO0oO, oooO00o2.f10108OooOO0O, oooO00o2.f10109OooOO0o);
        this.f30663OooOo00 = new o00Ooo<>();
        this.f30662OooOo0 = new o00Ooo<>();
        this.f30664OooOo0O = new RectF();
        this.f30659OooOOo = oooO00o2.f10099OooO00o;
        this.f30665OooOo0o = oooO00o2.f10100OooO0O0;
        this.f30660OooOOoo = oooO00o2.f10110OooOOO0;
        this.f30661OooOo = (int) (lottieDrawable.f9985Oooo0oO.OooO0O0() / 32.0f);
        OooOO0O<o000000, o000000> oooOO0OOooO00o = oooO00o2.f10101OooO0OO.OooO00o();
        this.f30667OooOoO0 = (OooOo00) oooOO0OOooO00o;
        oooOO0OOooO00o.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o);
        OooOO0O<PointF, PointF> oooOO0OOooO00o2 = oooO00o2.f10104OooO0o0.OooO00o();
        this.f30666OooOoO = (o00O0O) oooOO0OOooO00o2;
        oooOO0OOooO00o2.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o2);
        OooOO0O<PointF, PointF> oooOO0OOooO00o3 = oooO00o2.f10103OooO0o.OooO00o();
        this.f30668OooOoOO = (o00O0O) oooOO0OOooO00o3;
        oooOO0OOooO00o3.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o3);
    }

    public final int OooO() {
        int iRound = Math.round(this.f30666OooOoO.f30768OooO0Oo * this.f30661OooOo);
        int iRound2 = Math.round(this.f30668OooOoOO.f30768OooO0Oo * this.f30661OooOo);
        int iRound3 = Math.round(this.f30667OooOoO0.f30768OooO0Oo * this.f30661OooOo);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118o00O0Oo.OooO0o, p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        super.OooO0o0(t, o000000o2);
        if (t == o000oOoO.f10236Oooo0o0) {
            o0OOO0o o0ooo0o2 = this.f30669OooOoo0;
            if (o0ooo0o2 != null) {
                this.f30613OooO0o.OooOOo(o0ooo0o2);
            }
            if (o000000o2 == null) {
                this.f30669OooOoo0 = null;
                return;
            }
            o0OOO0o o0ooo0o3 = new o0OOO0o(o000000o2, null);
            this.f30669OooOoo0 = o0ooo0o3;
            o0ooo0o3.OooO00o(this);
            this.f30613OooO0o.OooO0oO(this.f30669OooOoo0);
        }
    }

    public final int[] OooO0oO(int[] iArr) {
        o0OOO0o o0ooo0o2 = this.f30669OooOoo0;
        if (o0ooo0o2 != null) {
            Integer[] numArr = (Integer[]) o0ooo0o2.OooO0o();
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
    @Override // p118o00O0Oo.OooO0o, p118o00O0Oo.OooOOO0
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradientOooO;
        if (this.f30660OooOOoo) {
            return;
        }
        OooO0o(this.f30664OooOo0O, matrix, false);
        if (this.f30665OooOo0o == GradientType.LINEAR) {
            long jOooO = OooO();
            radialGradientOooO = this.f30663OooOo00.OooO(jOooO, null);
            if (radialGradientOooO == null) {
                PointF pointFOooO0o = this.f30666OooOoO.OooO0o();
                PointF pointFOooO0o2 = this.f30668OooOoOO.OooO0o();
                o000000 o000000VarOooO0o = this.f30667OooOoO0.OooO0o();
                radialGradientOooO = new LinearGradient(pointFOooO0o.x, pointFOooO0o.y, pointFOooO0o2.x, pointFOooO0o2.y, OooO0oO(o000000VarOooO0o.f30996OooO0O0), o000000VarOooO0o.f30995OooO00o, Shader.TileMode.CLAMP);
                this.f30663OooOo00.OooOO0o(jOooO, radialGradientOooO);
            }
        } else {
            long jOooO2 = OooO();
            radialGradientOooO = this.f30662OooOo0.OooO(jOooO2, null);
            if (radialGradientOooO == null) {
                PointF pointFOooO0o3 = this.f30666OooOoO.OooO0o();
                PointF pointFOooO0o4 = this.f30668OooOoOO.OooO0o();
                o000000 o000000VarOooO0o2 = this.f30667OooOoO0.OooO0o();
                int[] iArrOooO0oO = OooO0oO(o000000VarOooO0o2.f30996OooO0O0);
                float[] fArr = o000000VarOooO0o2.f30995OooO00o;
                float f = pointFOooO0o3.x;
                float f2 = pointFOooO0o3.y;
                radialGradientOooO = new RadialGradient(f, f2, (float) Math.hypot(pointFOooO0o4.x - f, pointFOooO0o4.y - f2), iArrOooO0oO, fArr, Shader.TileMode.CLAMP);
                this.f30662OooOo0.OooOO0o(jOooO2, radialGradientOooO);
            }
        }
        radialGradientOooO.setLocalMatrix(matrix);
        this.f30608OooO.setShader(radialGradientOooO);
        super.OooO0oo(canvas, matrix, i);
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30659OooOOo;
    }
}
