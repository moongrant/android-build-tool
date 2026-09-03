package p118o00O0Oo;

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
import com.airbnb.lottie.OooO0o;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import p021OooOooo.o00Ooo;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOO;
import p120o00O0OoO.OooOo;
import p120o00O0OoO.o00O0O;
import p120o00O0OoO.o0OOO0o;
import p125o00O0o0O.o000000;
import p125o00O0o0O.o000000O;
import p129o00O0oOo.o000O0;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements OooOOO0, OooOO0O.OooO00o, Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<o0OoOo0> f30670OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final String f30671OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f30672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f30673OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Path f30675OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oo0oOO0.OooO00o f30677OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RectF f30678OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final GradientType f30679OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O<o000000, o000000> f30680OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOO0O<Integer, Integer> f30681OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooOO0O<PointF, PointF> f30682OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooOO0O<PointF, PointF> f30683OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooOO0O<ColorFilter, ColorFilter> f30684OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public o0OOO0o f30685OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f30686OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final LottieDrawable f30687OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f30688OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooOOO f30689OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f30690OooOo00;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Ooo<LinearGradient> f30674OooO0Oo = new o00Ooo<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Ooo<RadialGradient> f30676OooO0o0 = new o00Ooo<>();

    public OooOo00(LottieDrawable lottieDrawable, OooO00o oooO00o, o000000O o000000o2) {
        Path path = new Path();
        this.f30675OooO0o = path;
        this.f30677OooO0oO = new oo0oOO0.OooO00o(1);
        this.f30678OooO0oo = new RectF();
        this.f30670OooO = new ArrayList();
        this.f30690OooOo00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f30673OooO0OO = oooO00o;
        this.f30671OooO00o = o000000o2.f31003OooO0oO;
        this.f30672OooO0O0 = o000000o2.f31004OooO0oo;
        this.f30687OooOOo0 = lottieDrawable;
        this.f30679OooOO0 = o000000o2.f30997OooO00o;
        path.setFillType(o000000o2.f30998OooO0O0);
        this.f30686OooOOo = (int) (lottieDrawable.f9985Oooo0oO.OooO0O0() / 32.0f);
        OooOO0O<o000000, o000000> oooOO0OOooO00o = o000000o2.f30999OooO0OO.OooO00o();
        this.f30680OooOO0O = (p120o00O0OoO.OooOo00) oooOO0OOooO00o;
        oooOO0OOooO00o.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o);
        OooOO0O<Integer, Integer> oooOO0OOooO00o2 = o000000o2.f31000OooO0Oo.OooO00o();
        this.f30681OooOO0o = (OooOo) oooOO0OOooO00o2;
        oooOO0OOooO00o2.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o2);
        OooOO0O<PointF, PointF> oooOO0OOooO00o3 = o000000o2.f31002OooO0o0.OooO00o();
        this.f30683OooOOO0 = (o00O0O) oooOO0OOooO00o3;
        oooOO0OOooO00o3.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o3);
        OooOO0O<PointF, PointF> oooOO0OOooO00o4 = o000000o2.f31001OooO0o.OooO00o();
        this.f30682OooOOO = (o00O0O) oooOO0OOooO00o4;
        oooOO0OOooO00o4.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o4);
        if (oooO00o.OooOO0o() != null) {
            OooOO0O<Float, Float> oooOO0OOooO00o5 = oooO00o.OooOO0o().f31027OooO00o.OooO00o();
            this.f30688OooOOoo = oooOO0OOooO00o5;
            oooOO0OOooO00o5.OooO00o(this);
            oooO00o.OooO0oO(this.f30688OooOOoo);
        }
        if (oooO00o.OooOOO() != null) {
            this.f30689OooOo0 = new OooOOO(this, oooO00o, oooO00o.OooOOO());
        }
    }

    public final int OooO() {
        int iRound = Math.round(this.f30683OooOOO0.f30768OooO0Oo * this.f30686OooOOo);
        int iRound2 = Math.round(this.f30682OooOOO.f30768OooO0Oo * this.f30686OooOOo);
        int iRound3 = Math.round(this.f30680OooOO0O.f30768OooO0Oo * this.f30686OooOOo);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30687OooOOo0.invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        for (int i = 0; i < list2.size(); i++) {
            OooOO0 oooOO1 = list2.get(i);
            if (oooOO1 instanceof o0OoOo0) {
                this.f30670OooO.add((o0OoOo0) oooOO1);
            }
        }
    }

    @Override // p225o00oOOo.oo0oOO0
    public final void OooO0Oo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        o000O0.OooO0o0(o00o0ooo2, i, list, o00o0ooo3, this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f30675OooO0o.reset();
        for (int i = 0; i < this.f30670OooO.size(); i++) {
            this.f30675OooO0o.addPath(((o0OoOo0) this.f30670OooO.get(i)).OooO00o(), matrix);
        }
        this.f30675OooO0o.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable p131o00O0oo0.o000000O<T> o000000o2) {
        OooOOO oooOOO;
        OooOOO oooOOO2;
        OooOOO oooOOO3;
        OooOOO oooOOO4;
        OooOOO oooOOO5;
        if (t == o000oOoO.f10202OooO0Oo) {
            this.f30681OooOO0o.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10234Oooo0OO) {
            OooOO0O<ColorFilter, ColorFilter> oooOO0O = this.f30684OooOOOO;
            if (oooOO0O != null) {
                this.f30673OooO0OO.OooOOo(oooOO0O);
            }
            if (o000000o2 == null) {
                this.f30684OooOOOO = null;
                return;
            }
            o0OOO0o o0ooo0o2 = new o0OOO0o(o000000o2, null);
            this.f30684OooOOOO = o0ooo0o2;
            o0ooo0o2.OooO00o(this);
            this.f30673OooO0OO.OooO0oO(this.f30684OooOOOO);
            return;
        }
        if (t == o000oOoO.f10236Oooo0o0) {
            o0OOO0o o0ooo0o3 = this.f30685OooOOOo;
            if (o0ooo0o3 != null) {
                this.f30673OooO0OO.OooOOo(o0ooo0o3);
            }
            if (o000000o2 == null) {
                this.f30685OooOOOo = null;
                return;
            }
            this.f30674OooO0Oo.OooO0Oo();
            this.f30676OooO0o0.OooO0Oo();
            o0OOO0o o0ooo0o4 = new o0OOO0o(o000000o2, null);
            this.f30685OooOOOo = o0ooo0o4;
            o0ooo0o4.OooO00o(this);
            this.f30673OooO0OO.OooO0oO(this.f30685OooOOOo);
            return;
        }
        if (t == o000oOoO.f10207OooOO0) {
            OooOO0O<Float, Float> oooOO0O2 = this.f30688OooOOoo;
            if (oooOO0O2 != null) {
                oooOO0O2.OooOO0O(o000000o2);
                return;
            }
            o0OOO0o o0ooo0o5 = new o0OOO0o(o000000o2, null);
            this.f30688OooOOoo = o0ooo0o5;
            o0ooo0o5.OooO00o(this);
            this.f30673OooO0OO.OooO0oO(this.f30688OooOOoo);
            return;
        }
        if (t == o000oOoO.f10204OooO0o0 && (oooOOO5 = this.f30689OooOo0) != null) {
            oooOOO5.OooO0OO(o000000o2);
            return;
        }
        if (t == o000oOoO.f10231Oooo00O && (oooOOO4 = this.f30689OooOo0) != null) {
            oooOOO4.OooO0o(o000000o2);
            return;
        }
        if (t == o000oOoO.f10232Oooo00o && (oooOOO3 = this.f30689OooOo0) != null) {
            oooOOO3.OooO0Oo(o000000o2);
            return;
        }
        if (t == o000oOoO.f10229Oooo0 && (oooOOO2 = this.f30689OooOo0) != null) {
            oooOOO2.OooO0o0(o000000o2);
        } else {
            if (t != o000oOoO.f10233Oooo0O0 || (oooOOO = this.f30689OooOo0) == null) {
                return;
            }
            oooOOO.OooO0oO(o000000o2);
        }
    }

    public final int[] OooO0oO(int[] iArr) {
        o0OOO0o o0ooo0o2 = this.f30685OooOOOo;
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
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
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
    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradientOooO;
        if (this.f30672OooO0O0) {
            return;
        }
        this.f30675OooO0o.reset();
        for (int i2 = 0; i2 < this.f30670OooO.size(); i2++) {
            this.f30675OooO0o.addPath(((o0OoOo0) this.f30670OooO.get(i2)).OooO00o(), matrix);
        }
        this.f30675OooO0o.computeBounds(this.f30678OooO0oo, false);
        if (this.f30679OooOO0 == GradientType.LINEAR) {
            long jOooO = OooO();
            radialGradientOooO = this.f30674OooO0Oo.OooO(jOooO, null);
            if (radialGradientOooO == null) {
                PointF pointFOooO0o = this.f30683OooOOO0.OooO0o();
                PointF pointFOooO0o2 = this.f30682OooOOO.OooO0o();
                o000000 o000000VarOooO0o = this.f30680OooOO0O.OooO0o();
                LinearGradient linearGradient = new LinearGradient(pointFOooO0o.x, pointFOooO0o.y, pointFOooO0o2.x, pointFOooO0o2.y, OooO0oO(o000000VarOooO0o.f30996OooO0O0), o000000VarOooO0o.f30995OooO00o, Shader.TileMode.CLAMP);
                this.f30674OooO0Oo.OooOO0o(jOooO, linearGradient);
                radialGradientOooO = linearGradient;
            }
        } else {
            long jOooO2 = OooO();
            radialGradientOooO = this.f30676OooO0o0.OooO(jOooO2, null);
            if (radialGradientOooO == null) {
                PointF pointFOooO0o3 = this.f30683OooOOO0.OooO0o();
                PointF pointFOooO0o4 = this.f30682OooOOO.OooO0o();
                o000000 o000000VarOooO0o2 = this.f30680OooOO0O.OooO0o();
                int[] iArrOooO0oO = OooO0oO(o000000VarOooO0o2.f30996OooO0O0);
                float[] fArr = o000000VarOooO0o2.f30995OooO00o;
                float f = pointFOooO0o3.x;
                float f2 = pointFOooO0o3.y;
                float fHypot = (float) Math.hypot(pointFOooO0o4.x - f, pointFOooO0o4.y - f2);
                radialGradientOooO = new RadialGradient(f, f2, fHypot <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0.001f : fHypot, iArrOooO0oO, fArr, Shader.TileMode.CLAMP);
                this.f30676OooO0o0.OooOO0o(jOooO2, radialGradientOooO);
            }
        }
        radialGradientOooO.setLocalMatrix(matrix);
        this.f30677OooO0oO.setShader(radialGradientOooO);
        OooOO0O<ColorFilter, ColorFilter> oooOO0O = this.f30684OooOOOO;
        if (oooOO0O != null) {
            this.f30677OooO0oO.setColorFilter(oooOO0O.OooO0o());
        }
        OooOO0O<Float, Float> oooOO0O2 = this.f30688OooOOoo;
        if (oooOO0O2 != null) {
            float fFloatValue = oooOO0O2.OooO0o().floatValue();
            if (fFloatValue == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f30677OooO0oO.setMaskFilter(null);
            } else if (fFloatValue != this.f30690OooOo00) {
                this.f30677OooO0oO.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f30690OooOo00 = fFloatValue;
        }
        OooOOO oooOOO = this.f30689OooOo0;
        if (oooOOO != null) {
            oooOOO.OooO00o(this.f30677OooO0oO);
        }
        this.f30677OooO0oO.setAlpha(o000O0.OooO0OO((int) ((((i / 255.0f) * this.f30681OooOO0o.OooO0o().intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f30675OooO0o, this.f30677OooO0oO);
        OooO0o.OooO00o();
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30671OooO00o;
    }
}
