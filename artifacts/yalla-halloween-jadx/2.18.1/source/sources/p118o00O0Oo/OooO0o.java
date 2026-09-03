package p118o00O0Oo;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOO;
import p120o00O0OoO.OooOOOO;
import p120o00O0OoO.OooOo;
import p120o00O0OoO.o0OOO0o;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0o implements OooOO0O.OooO00o, Oooo0, OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oo0oOO0.OooO00o f30608OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f30613OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LottieDrawable f30614OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f30616OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0O<?, Float> f30617OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O<?, Integer> f30618OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final List<OooOO0O<?, Float>> f30619OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooOO0O<ColorFilter, ColorFilter> f30620OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final OooOO0O<?, Float> f30621OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f30622OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f30623OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooOOO f30624OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PathMeasure f30609OooO00o = new PathMeasure();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path f30610OooO0O0 = new Path();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Path f30611OooO0OO = new Path();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RectF f30612OooO0Oo = new RectF();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<OooO00o> f30615OooO0oO = new ArrayList();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<o0OoOo0> f30625OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o0ooOOo f30626OooO0O0;

        public OooO00o(o0ooOOo o0ooooo2) {
            this.f30626OooO0O0 = o0ooooo2;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public OooO0o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, Paint.Cap cap, Paint.Join join, float f, p123o00O0o0.OooOOO oooOOO, p123o00O0o0.OooOO0O oooOO0O, List<p123o00O0o0.OooOO0O> list, p123o00O0o0.OooOO0O oooOO0O2) {
        oo0oOO0.OooO00o oooO00o2 = new oo0oOO0.OooO00o(1);
        this.f30608OooO = oooO00o2;
        this.f30623OooOOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f30614OooO0o0 = lottieDrawable;
        this.f30613OooO0o = oooO00o;
        oooO00o2.setStyle(Paint.Style.STROKE);
        oooO00o2.setStrokeCap(cap);
        oooO00o2.setStrokeJoin(join);
        oooO00o2.setStrokeMiter(f);
        this.f30618OooOO0O = (OooOo) oooOOO.OooO00o();
        this.f30617OooOO0 = (OooOOOO) oooOO0O.OooO00o();
        if (oooOO0O2 == null) {
            this.f30621OooOOO0 = null;
        } else {
            this.f30621OooOOO0 = (OooOOOO) oooOO0O2.OooO00o();
        }
        this.f30619OooOO0o = new ArrayList(list.size());
        this.f30616OooO0oo = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f30619OooOO0o.add(list.get(i).OooO00o());
        }
        oooO00o.OooO0oO(this.f30618OooOO0O);
        oooO00o.OooO0oO(this.f30617OooOO0);
        for (int i2 = 0; i2 < this.f30619OooOO0o.size(); i2++) {
            oooO00o.OooO0oO(this.f30619OooOO0o.get(i2));
        }
        OooOO0O<?, Float> oooOO0O3 = this.f30621OooOOO0;
        if (oooOO0O3 != null) {
            oooO00o.OooO0oO(oooOO0O3);
        }
        this.f30618OooOO0O.OooO00o(this);
        this.f30617OooOO0.OooO00o(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f30619OooOO0o.get(i3).OooO00o(this);
        }
        OooOO0O<?, Float> oooOO0O4 = this.f30621OooOOO0;
        if (oooOO0O4 != null) {
            oooOO0O4.OooO00o(this);
        }
        if (oooO00o.OooOO0o() != null) {
            OooOO0O<Float, Float> oooOO0OOooO00o = oooO00o.OooOO0o().f31027OooO00o.OooO00o();
            this.f30622OooOOOO = oooOO0OOooO00o;
            oooOO0OOooO00o.OooO00o(this);
            oooO00o.OooO0oO(this.f30622OooOOOO);
        }
        if (oooO00o.OooOOO() != null) {
            this.f30624OooOOo0 = new OooOOO(this, oooO00o, oooO00o.OooOOO());
        }
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30614OooO0o0.invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o00O0Oo.OooO0o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList, java.util.List<o00O0Oo.OooO0o$OooO00o>] */
    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        ArrayList arrayList = (ArrayList) list;
        OooO00o oooO00o = null;
        o0ooOOo o0ooooo2 = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OooOO0 oooOO1 = (OooOO0) arrayList.get(size);
            if (oooOO1 instanceof o0ooOOo) {
                o0ooOOo o0ooooo3 = (o0ooOOo) oooOO1;
                if (o0ooooo3.f30739OooO0OO == ShapeTrimPath.Type.INDIVIDUALLY) {
                    o0ooooo2 = o0ooooo3;
                }
            }
        }
        if (o0ooooo2 != null) {
            o0ooooo2.OooO0Oo(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            OooOO0 oooOO2 = list2.get(size2);
            if (oooOO2 instanceof o0ooOOo) {
                o0ooOOo o0ooooo4 = (o0ooOOo) oooOO2;
                if (o0ooooo4.f30739OooO0OO == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (oooO00o != null) {
                        this.f30615OooO0oO.add(oooO00o);
                    }
                    OooO00o oooO00o2 = new OooO00o(o0ooooo4);
                    o0ooooo4.OooO0Oo(this);
                    oooO00o = oooO00o2;
                }
            }
            if (oooOO2 instanceof o0OoOo0) {
                if (oooO00o == null) {
                    oooO00o = new OooO00o(o0ooooo2);
                }
                oooO00o.f30625OooO00o.add((o0OoOo0) oooOO2);
            }
        }
        if (oooO00o != null) {
            this.f30615OooO0oO.add(oooO00o);
        }
    }

    @Override // p225o00oOOo.oo0oOO0
    public final void OooO0Oo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        o000O0.OooO0o0(o00o0ooo2, i, list, o00o0ooo3, this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.OooO0o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<o00O0Oo.OooO0o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [o00O0OoO.OooOO0O<?, java.lang.Float>, o00O0OoO.OooOOOO] */
    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f30610OooO0O0.reset();
        for (int i = 0; i < this.f30615OooO0oO.size(); i++) {
            OooO00o oooO00o = (OooO00o) this.f30615OooO0oO.get(i);
            for (int i2 = 0; i2 < oooO00o.f30625OooO00o.size(); i2++) {
                this.f30610OooO0O0.addPath(((o0OoOo0) oooO00o.f30625OooO00o.get(i2)).OooO00o(), matrix);
            }
        }
        this.f30610OooO0O0.computeBounds(this.f30612OooO0Oo, false);
        float fOooOO0o = this.f30617OooOO0.OooOO0o();
        RectF rectF2 = this.f30612OooO0Oo;
        float f = fOooOO0o / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f30612OooO0Oo);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.OooO0o.OooO00o();
    }

    @Override // p225o00oOOo.oo0oOO0
    @CallSuper
    public <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        OooOOO oooOOO;
        OooOOO oooOOO2;
        OooOOO oooOOO3;
        OooOOO oooOOO4;
        OooOOO oooOOO5;
        if (t == o000oOoO.f10202OooO0Oo) {
            this.f30618OooOO0O.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10216OooOOoo) {
            this.f30617OooOO0.OooOO0O(o000000o2);
            return;
        }
        if (t == o000oOoO.f10234Oooo0OO) {
            OooOO0O<ColorFilter, ColorFilter> oooOO0O = this.f30620OooOOO;
            if (oooOO0O != null) {
                this.f30613OooO0o.OooOOo(oooOO0O);
            }
            if (o000000o2 == null) {
                this.f30620OooOOO = null;
                return;
            }
            o0OOO0o o0ooo0o2 = new o0OOO0o(o000000o2, null);
            this.f30620OooOOO = o0ooo0o2;
            o0ooo0o2.OooO00o(this);
            this.f30613OooO0o.OooO0oO(this.f30620OooOOO);
            return;
        }
        if (t == o000oOoO.f10207OooOO0) {
            OooOO0O<Float, Float> oooOO0O2 = this.f30622OooOOOO;
            if (oooOO0O2 != null) {
                oooOO0O2.OooOO0O(o000000o2);
                return;
            }
            o0OOO0o o0ooo0o3 = new o0OOO0o(o000000o2, null);
            this.f30622OooOOOO = o0ooo0o3;
            o0ooo0o3.OooO00o(this);
            this.f30613OooO0o.OooO0oO(this.f30622OooOOOO);
            return;
        }
        if (t == o000oOoO.f10204OooO0o0 && (oooOOO5 = this.f30624OooOOo0) != null) {
            oooOOO5.OooO0OO(o000000o2);
            return;
        }
        if (t == o000oOoO.f10231Oooo00O && (oooOOO4 = this.f30624OooOOo0) != null) {
            oooOOO4.OooO0o(o000000o2);
            return;
        }
        if (t == o000oOoO.f10232Oooo00o && (oooOOO3 = this.f30624OooOOo0) != null) {
            oooOOO3.OooO0Oo(o000000o2);
            return;
        }
        if (t == o000oOoO.f10229Oooo0 && (oooOOO2 = this.f30624OooOOo0) != null) {
            oooOOO2.OooO0o0(o000000o2);
        } else {
            if (t != o000oOoO.f10233Oooo0O0 || (oooOOO = this.f30624OooOOo0) == null) {
                return;
            }
            oooOOO.OooO0oO(o000000o2);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<?, java.lang.Float>>] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<?, java.lang.Float>>] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<?, java.lang.Float>>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [o00O0OoO.OooOO0O<?, java.lang.Float>, o00O0OoO.OooOOOO] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r8v2, types: [o00O0OoO.OooOO0O, o00O0OoO.OooOO0O<?, java.lang.Integer>, o00O0OoO.OooOo] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList, java.util.List<o00O0Oo.OooO0o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.ArrayList, java.util.List<o00O0Oo.OooO0o$OooO00o>] */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v28 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // p118o00O0Oo.OooOOO0
    public void OooO0oo(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p118o00O0Oo.OooO0o.OooO0oo(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
