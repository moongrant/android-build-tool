package o00O000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import p113o00O00Oo.o0OOO0o;
import p233o00oOoo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements OooO, o00O000o.OooO00o.InterfaceC0420OooO00o, OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00O000o.o00O0O f36160OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f36161OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo f36162OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f36163OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f36164OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f36165OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f36166OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00O000o.OooO0O0 f36167OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O000o.OooOO0 f36168OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final LottieDrawable f36169OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o00O000o.OooO00o<Float, Float> f36170OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f36171OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final o00O000o.OooO0OO f36172OooOOO0;

    public OooOO0O(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, o0OOO0o o0ooo0o2) {
        o00O00OO.OooO0o oooO0o;
        Path path = new Path();
        this.f36161OooO00o = path;
        this.f36162OooO0O0 = new o0ooOOo(1);
        this.f36165OooO0o = new ArrayList();
        this.f36163OooO0OO = oooO00o;
        this.f36164OooO0Oo = o0ooo0o2.f36377OooO0OO;
        this.f36166OooO0o0 = o0ooo0o2.f36379OooO0o;
        this.f36169OooOO0 = lottieDrawable;
        if (oooO00o.OooOO0o() != null) {
            o00O000o.OooO00o<Float, Float> OooO00o2 = oooO00o.OooOO0o().f36355OooO00o.OooO00o();
            this.f36170OooOO0O = OooO00o2;
            OooO00o2.OooO00o(this);
            oooO00o.OooO0oO(this.f36170OooOO0O);
        }
        if (oooO00o.OooOOO0() != null) {
            this.f36172OooOOO0 = new o00O000o.OooO0OO(this, oooO00o, oooO00o.OooOOO0());
        }
        o00O00OO.OooO00o oooO00o2 = o0ooo0o2.f36378OooO0Oo;
        if (oooO00o2 == null || (oooO0o = o0ooo0o2.f36380OooO0o0) == null) {
            this.f36167OooO0oO = null;
            this.f36168OooO0oo = null;
            return;
        }
        path.setFillType(o0ooo0o2.f36376OooO0O0);
        o00O000o.OooO00o<Integer, Integer> OooO00o3 = oooO00o2.OooO00o();
        this.f36167OooO0oO = (o00O000o.OooO0O0) OooO00o3;
        OooO00o3.OooO00o(this);
        oooO00o.OooO0oO(OooO00o3);
        o00O000o.OooO00o<Integer, Integer> OooO00o4 = oooO0o.OooO00o();
        this.f36168OooO0oo = (o00O000o.OooOO0) OooO00o4;
        OooO00o4.OooO00o(this);
        oooO00o.OooO0oO(OooO00o4);
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f36169OooOO0.invalidateSelf();
    }

    @Override // o00O000.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        for (int i = 0; i < list2.size(); i++) {
            OooO0OO oooO0OO = list2.get(i);
            if (oooO0OO instanceof Oooo000) {
                this.f36165OooO0o.add((Oooo000) oooO0OO);
            }
        }
    }

    @Override // oOO00O.OooO
    public final void OooO0Oo(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
        o00O0.OooOOO.OooO0Oo(oooO0o, i, arrayList, oooO0o2, this);
    }

    @Override // o00O000.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f36161OooO00o;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36165OooO0o;
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

    @Override // oOO00O.OooO
    public final void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        if (obj == com.airbnb.lottie.o00Oo0.f8881OooO00o) {
            this.f36167OooO0oO.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8884OooO0Oo) {
            this.f36168OooO0oo.OooOO0O(oooO0OO);
            return;
        }
        ColorFilter colorFilter = com.airbnb.lottie.o00Oo0.f8916Oooo0OO;
        com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f36163OooO0OO;
        if (obj == colorFilter) {
            o00O000o.o00O0O o00o0o2 = this.f36160OooO;
            if (o00o0o2 != null) {
                oooO00o.OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f36160OooO = null;
                return;
            }
            o00O000o.o00O0O o00o0o3 = new o00O000o.o00O0O(oooO0OO, null);
            this.f36160OooO = o00o0o3;
            o00o0o3.OooO00o(this);
            oooO00o.OooO0oO(this.f36160OooO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8889OooOO0) {
            o00O000o.OooO00o<Float, Float> oooO00o2 = this.f36170OooOO0O;
            if (oooO00o2 != null) {
                oooO00o2.OooOO0O(oooO0OO);
                return;
            }
            o00O000o.o00O0O o00o0o4 = new o00O000o.o00O0O(oooO0OO, null);
            this.f36170OooOO0O = o00o0o4;
            o00o0o4.OooO00o(this);
            oooO00o.OooO0oO(this.f36170OooOO0O);
            return;
        }
        Integer num = com.airbnb.lottie.o00Oo0.f8886OooO0o0;
        o00O000o.OooO0OO oooO0OO2 = this.f36172OooOOO0;
        if (obj == num && oooO0OO2 != null) {
            oooO0OO2.f36288OooO0O0.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8913Oooo00O && oooO0OO2 != null) {
            oooO0OO2.OooO0OO(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8914Oooo00o && oooO0OO2 != null) {
            oooO0OO2.f36290OooO0Oo.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8911Oooo0 && oooO0OO2 != null) {
            oooO0OO2.f36292OooO0o0.OooOO0O(oooO0OO);
        } else {
            if (obj != com.airbnb.lottie.o00Oo0.f8915Oooo0O0 || oooO0OO2 == null) {
                return;
            }
            oooO0OO2.f36291OooO0o.OooOO0O(oooO0OO);
        }
    }

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
    @Override // o00O000.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.f36166OooO0o0) {
            return;
        }
        o00O000o.OooO0O0 oooO0O0 = this.f36167OooO0oO;
        int iOooOO0o = oooO0O0.OooOO0o(oooO0O0.OooO0O0(), oooO0O0.OooO0Oo());
        o0ooOOo o0ooooo = this.f36162OooO0O0;
        o0ooooo.setColor(iOooOO0o);
        int iIntValue = (int) ((((i / 255.0f) * this.f36168OooO0oo.OooO0o().intValue()) / 100.0f) * 255.0f);
        PointF pointF = o00O0.OooOOO.f35980OooO00o;
        int i2 = 0;
        o0ooooo.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        o00O000o.o00O0O o00o0o2 = this.f36160OooO;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        o00O000o.OooO00o<Float, Float> oooO00o = this.f36170OooOO0O;
        if (oooO00o != null) {
            float fFloatValue = oooO00o.OooO0o().floatValue();
            if (fFloatValue == 0.0f) {
                o0ooooo.setMaskFilter(null);
            } else if (fFloatValue != this.f36171OooOO0o) {
                com.airbnb.lottie.model.layer.OooO00o oooO00o2 = this.f36163OooO0OO;
                if (oooO00o2.f8867OooOoO0 == fFloatValue) {
                    blurMaskFilter = oooO00o2.f8866OooOoO;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    oooO00o2.f8866OooOoO = blurMaskFilter2;
                    oooO00o2.f8867OooOoO0 = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                o0ooooo.setMaskFilter(blurMaskFilter);
            }
            this.f36171OooOO0o = fFloatValue;
        }
        o00O000o.OooO0OO oooO0OO = this.f36172OooOOO0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(o0ooooo);
        }
        Path path = this.f36161OooO00o;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f36165OooO0o;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, o0ooooo);
                com.airbnb.lottie.OooO0OO.OooO00o();
                return;
            } else {
                path.addPath(((Oooo000) arrayList.get(i2)).OooO00o(), matrix);
                i2++;
            }
        }
    }

    @Override // o00O000.OooO0OO
    public final String getName() {
        return this.f36164OooO0Oo;
    }
}
