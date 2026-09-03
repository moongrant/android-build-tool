package p118o00O0Oo;

import android.graphics.ColorFilter;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o000oOoO;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOO0;
import p120o00O0OoO.o0OOO0o;
import p131o00O0oo0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends OooO0o {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final OooO00o f30732OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final String f30733OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooOO0O<Integer, Integer> f30734OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final boolean f30735OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public OooOO0O<ColorFilter, ColorFilter> f30736OooOo0O;

    public o00oO0o(LottieDrawable lottieDrawable, OooO00o oooO00o, ShapeStroke shapeStroke) {
        super(lottieDrawable, oooO00o, shapeStroke.f10128OooO0oO.OooO00o(), shapeStroke.f10129OooO0oo.OooO00o(), shapeStroke.f10121OooO, shapeStroke.f10127OooO0o0, shapeStroke.f10126OooO0o, shapeStroke.f10124OooO0OO, shapeStroke.f10123OooO0O0);
        this.f30732OooOOo = oooO00o;
        this.f30733OooOOoo = shapeStroke.f10122OooO00o;
        this.f30735OooOo00 = shapeStroke.f10130OooOO0;
        OooOO0O<Integer, Integer> oooOO0OOooO00o = shapeStroke.f10125OooO0Oo.OooO00o();
        this.f30734OooOo0 = (OooOOO0) oooOO0OOooO00o;
        oooOO0OOooO00o.OooO00o(this);
        oooO00o.OooO0oO(oooOO0OOooO00o);
    }

    @Override // p118o00O0Oo.OooO0o, p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        super.OooO0o0(t, o000000o2);
        if (t == o000oOoO.f10200OooO0O0) {
            this.f30734OooOo0.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10234Oooo0OO) {
            OooOO0O<ColorFilter, ColorFilter> oooOO0O = this.f30736OooOo0O;
            if (oooOO0O != null) {
                this.f30732OooOOo.OooOOo(oooOO0O);
            }
            if (o000000o2 == null) {
                this.f30736OooOo0O = null;
                return;
            }
            o0OOO0o o0ooo0o2 = new o0OOO0o(o000000o2, null);
            this.f30736OooOo0O = o0ooo0o2;
            o0ooo0o2.OooO00o(this);
            this.f30732OooOOo.OooO0oO(this.f30734OooOo0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o00O0OoO.OooOO0O, o00O0OoO.OooOO0O<java.lang.Integer, java.lang.Integer>, o00O0OoO.OooOOO0] */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v1 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // p118o00O0Oo.OooO0o, p118o00O0Oo.OooOOO0
    public final void OooO0oo(android.graphics.Canvas r5, android.graphics.Matrix r6, int r7) {
        /*
            r4 = this;
            boolean r0 = r4.f30735OooOo00
            if (r0 == 0) goto L5
            return
        L5:
            oo0oOO0.OooO00o r0 = r4.f30608OooO
            o00O0OoO.OooOO0O<java.lang.Integer, java.lang.Integer> r1 = r4.f30734OooOo0
            o00O0oo0.o000OOo r2 = r1.OooO0O0()
            float r3 = r1.OooO0Oo()
            int r1 = r1.OooOO0o(r2, r3)
            r0.setColor(r1)
            o00O0OoO.OooOO0O<android.graphics.ColorFilter, android.graphics.ColorFilter> r0 = r4.f30736OooOo0O
            if (r0 == 0) goto L27
            oo0oOO0.OooO00o r1 = r4.f30608OooO
            java.lang.Object r0 = r0.OooO0o()
            android.graphics.ColorFilter r0 = (android.graphics.ColorFilter) r0
            r1.setColorFilter(r0)
        L27:
            super.OooO0oo(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p118o00O0Oo.o00oO0o.OooO0oo(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30733OooOOoo;
    }
}
