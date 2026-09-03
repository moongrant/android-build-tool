package p118o00O0Oo;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.o000oOoO;
import java.util.ArrayList;
import java.util.List;
import oo0oOO0.OooO00o;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOO;
import p120o00O0OoO.OooOOO0;
import p120o00O0OoO.OooOo;
import p120o00O0OoO.o0OOO0o;
import p125o00O0o0O.o00000OO;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements OooOOO0, OooOO0O.OooO00o, Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooOO0O<ColorFilter, ColorFilter> f30646OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f30647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f30648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f30649OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f30650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<o0OoOo0> f30651OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f30652OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0O<Integer, Integer> f30653OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0O<Integer, Integer> f30654OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final LottieDrawable f30655OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f30656OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f30657OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooOOO f30658OooOOO0;

    public OooOOOO(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, o00000OO o00000oo2) {
        Path path = new Path();
        this.f30647OooO00o = path;
        this.f30648OooO0O0 = new OooO00o(1);
        this.f30651OooO0o = new ArrayList();
        this.f30649OooO0OO = oooO00o;
        this.f30650OooO0Oo = o00000oo2.f31015OooO0OO;
        this.f30652OooO0o0 = o00000oo2.f31017OooO0o;
        this.f30655OooOO0 = lottieDrawable;
        if (oooO00o.OooOO0o() != null) {
            OooOO0O<Float, Float> oooOO0OOooO00o = oooO00o.OooOO0o().f31027OooO00o.OooO00o();
            this.f30656OooOO0O = oooOO0OOooO00o;
            oooOO0OOooO00o.OooO00o(this);
            oooO00o.OooO0oO(this.f30656OooOO0O);
        }
        if (oooO00o.OooOOO() != null) {
            this.f30658OooOOO0 = new OooOOO(this, oooO00o, oooO00o.OooOOO());
        }
        if (o00000oo2.f31016OooO0Oo == null || o00000oo2.f31018OooO0o0 == null) {
            this.f30653OooO0oO = null;
            this.f30654OooO0oo = null;
            return;
        }
        path.setFillType(o00000oo2.f31014OooO0O0);
        OooOO0O<Integer, Integer> oooOO0OOooO00o2 = o00000oo2.f31016OooO0Oo.OooO00o();
        this.f30653OooO0oO = (OooOOO0) oooOO0OOooO00o2;
        oooOO0OOooO00o2.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o2);
        OooOO0O<Integer, Integer> oooOO0OOooO00o3 = o00000oo2.f31018OooO0o0.OooO00o();
        this.f30654OooO0oo = (OooOo) oooOO0OOooO00o3;
        oooOO0OOooO00o3.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o3);
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30655OooOO0.invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        for (int i = 0; i < list2.size(); i++) {
            OooOO0 oooOO1 = list2.get(i);
            if (oooOO1 instanceof o0OoOo0) {
                this.f30651OooO0o.add((o0OoOo0) oooOO1);
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
        this.f30647OooO00o.reset();
        for (int i = 0; i < this.f30651OooO0o.size(); i++) {
            this.f30647OooO00o.addPath(((o0OoOo0) this.f30651OooO0o.get(i)).OooO00o(), matrix);
        }
        this.f30647OooO00o.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        OooOOO oooOOO;
        OooOOO oooOOO2;
        OooOOO oooOOO3;
        OooOOO oooOOO4;
        OooOOO oooOOO5;
        if (t == o000oOoO.f10199OooO00o) {
            this.f30653OooO0oO.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10202OooO0Oo) {
            this.f30654OooO0oo.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10234Oooo0OO) {
            OooOO0O<ColorFilter, ColorFilter> oooOO0O = this.f30646OooO;
            if (oooOO0O != null) {
                this.f30649OooO0OO.OooOOo(oooOO0O);
            }
            if (o000000o2 == null) {
                this.f30646OooO = null;
                return;
            }
            o0OOO0o o0ooo0o2 = new o0OOO0o(o000000o2, null);
            this.f30646OooO = o0ooo0o2;
            o0ooo0o2.OooO00o(this);
            this.f30649OooO0OO.OooO0oO(this.f30646OooO);
            return;
        }
        if (t == o000oOoO.f10207OooOO0) {
            OooOO0O<Float, Float> oooOO0O2 = this.f30656OooOO0O;
            if (oooOO0O2 != null) {
                oooOO0O2.OooOO0O(o000000o2);
                return;
            }
            o0OOO0o o0ooo0o3 = new o0OOO0o(o000000o2, null);
            this.f30656OooOO0O = o0ooo0o3;
            o0ooo0o3.OooO00o(this);
            this.f30649OooO0OO.OooO0oO(this.f30656OooOO0O);
            return;
        }
        if (t == o000oOoO.f10204OooO0o0 && (oooOOO5 = this.f30658OooOOO0) != null) {
            oooOOO5.OooO0OO(o000000o2);
            return;
        }
        if (t == o000oOoO.f10231Oooo00O && (oooOOO4 = this.f30658OooOOO0) != null) {
            oooOOO4.OooO0o(o000000o2);
            return;
        }
        if (t == o000oOoO.f10232Oooo00o && (oooOOO3 = this.f30658OooOOO0) != null) {
            oooOOO3.OooO0Oo(o000000o2);
            return;
        }
        if (t == o000oOoO.f10229Oooo0 && (oooOOO2 = this.f30658OooOOO0) != null) {
            oooOOO2.OooO0o0(o000000o2);
        } else {
            if (t != o000oOoO.f10233Oooo0O0 || (oooOOO = this.f30658OooOOO0) == null) {
                return;
            }
            oooOOO.OooO0oO(o000000o2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [o00O0OoO.OooOO0O, o00O0OoO.OooOO0O<java.lang.Integer, java.lang.Integer>, o00O0OoO.OooOOO0] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0oo(android.graphics.Canvas r5, android.graphics.Matrix r6, int r7) {
        /*
            r4 = this;
            boolean r0 = r4.f30652OooO0o0
            if (r0 == 0) goto L5
            return
        L5:
            oo0oOO0.OooO00o r0 = r4.f30648OooO0O0
            o00O0OoO.OooOO0O<java.lang.Integer, java.lang.Integer> r1 = r4.f30653OooO0oO
            o00O0oo0.o000OOo r2 = r1.OooO0O0()
            float r3 = r1.OooO0Oo()
            int r1 = r1.OooOO0o(r2, r3)
            r0.setColor(r1)
            float r7 = (float) r7
            r0 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 / r0
            o00O0OoO.OooOO0O<java.lang.Integer, java.lang.Integer> r1 = r4.f30654OooO0oo
            java.lang.Object r1 = r1.OooO0o()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            float r7 = r7 * r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r1
            float r7 = r7 * r0
            int r7 = (int) r7
            oo0oOO0.OooO00o r0 = r4.f30648OooO0O0
            r1 = 0
            int r7 = p129o00O0oOo.o000O0.OooO0OO(r7)
            r0.setAlpha(r7)
            o00O0OoO.OooOO0O<android.graphics.ColorFilter, android.graphics.ColorFilter> r7 = r4.f30646OooO
            if (r7 == 0) goto L4a
            oo0oOO0.OooO00o r0 = r4.f30648OooO0O0
            java.lang.Object r7 = r7.OooO0o()
            android.graphics.ColorFilter r7 = (android.graphics.ColorFilter) r7
            r0.setColorFilter(r7)
        L4a:
            o00O0OoO.OooOO0O<java.lang.Float, java.lang.Float> r7 = r4.f30656OooOO0O
            if (r7 == 0) goto L77
            java.lang.Object r7 = r7.OooO0o()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L64
            oo0oOO0.OooO00o r0 = r4.f30648OooO0O0
            r2 = 0
            r0.setMaskFilter(r2)
            goto L75
        L64:
            float r0 = r4.f30657OooOO0o
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L75
            com.airbnb.lottie.model.layer.OooO00o r0 = r4.f30649OooO0OO
            android.graphics.BlurMaskFilter r0 = r0.OooOOO0(r7)
            oo0oOO0.OooO00o r2 = r4.f30648OooO0O0
            r2.setMaskFilter(r0)
        L75:
            r4.f30657OooOO0o = r7
        L77:
            o00O0OoO.OooOOO r7 = r4.f30658OooOOO0
            if (r7 == 0) goto L80
            oo0oOO0.OooO00o r0 = r4.f30648OooO0O0
            r7.OooO00o(r0)
        L80:
            android.graphics.Path r7 = r4.f30647OooO00o
            r7.reset()
        L85:
            java.util.List<o00O0Oo.o0OoOo0> r7 = r4.f30651OooO0o
            int r7 = r7.size()
            if (r1 >= r7) goto La1
            android.graphics.Path r7 = r4.f30647OooO00o
            java.util.List<o00O0Oo.o0OoOo0> r0 = r4.f30651OooO0o
            java.lang.Object r0 = r0.get(r1)
            o00O0Oo.o0OoOo0 r0 = (p118o00O0Oo.o0OoOo0) r0
            android.graphics.Path r0 = r0.OooO00o()
            r7.addPath(r0, r6)
            int r1 = r1 + 1
            goto L85
        La1:
            android.graphics.Path r6 = r4.f30647OooO00o
            oo0oOO0.OooO00o r7 = r4.f30648OooO0O0
            r5.drawPath(r6, r7)
            com.airbnb.lottie.OooO0o.OooO00o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p118o00O0Oo.OooOOOO.OooO0oo(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30650OooO0Oo;
    }
}
