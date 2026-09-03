package o00OO0;

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
import p133o00OO00o.o0ooOOo;
import p135o00OO0o0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements OooO, o00OO0O0.OooO00o.InterfaceC0423OooO00o, OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00OO0O0.o00O0O f36960OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f36961OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo f36962OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f36963OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f36964OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f36965OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f36966OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO0O0.OooO0O0 f36967OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00OO0O0.OooOO0 f36968OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final LottieDrawable f36969OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o00OO0O0.OooO00o<Float, Float> f36970OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f36971OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO0OO f36972OooOOO0;

    public OooOO0O(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, p136o00OO0oO.OooOo00 oooOo00) {
        p134o00OO0o.o0ooOOo o0ooooo;
        Path path = new Path();
        this.f36961OooO00o = path;
        this.f36962OooO0O0 = new o0ooOOo(1);
        this.f36965OooO0o = new ArrayList();
        this.f36963OooO0OO = oooO00o;
        this.f36964OooO0Oo = oooOo00.f37375OooO0OO;
        this.f36966OooO0o0 = oooOo00.f37377OooO0o;
        this.f36969OooOO0 = lottieDrawable;
        if (oooO00o.OooOO0o() != null) {
            o00OO0O0.OooO00o<Float, Float> OooO00o2 = oooO00o.OooOO0o().f37341OooO00o.OooO00o();
            this.f36970OooOO0O = OooO00o2;
            OooO00o2.OooO00o(this);
            oooO00o.OooO0oO(this.f36970OooOO0O);
        }
        if (oooO00o.OooOOO0() != null) {
            this.f36972OooOOO0 = new o00OO0O0.OooO0OO(this, oooO00o, oooO00o.OooOOO0());
        }
        p134o00OO0o.o00Ooo o00ooo2 = oooOo00.f37376OooO0Oo;
        if (o00ooo2 == null || (o0ooooo = oooOo00.f37378OooO0o0) == null) {
            this.f36967OooO0oO = null;
            this.f36968OooO0oo = null;
            return;
        }
        path.setFillType(oooOo00.f37374OooO0O0);
        o00OO0O0.OooO00o<Integer, Integer> OooO00o3 = o00ooo2.OooO00o();
        this.f36967OooO0oO = (o00OO0O0.OooO0O0) OooO00o3;
        OooO00o3.OooO00o(this);
        oooO00o.OooO0oO(OooO00o3);
        o00OO0O0.OooO00o<Integer, Integer> OooO00o4 = o0ooooo.OooO00o();
        this.f36968OooO0oo = (o00OO0O0.OooOO0) OooO00o4;
        OooO00o4.OooO00o(this);
        oooO00o.OooO0oO(OooO00o4);
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f36969OooOO0.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        for (int i = 0; i < list2.size(); i++) {
            OooO0OO oooO0OO = list2.get(i);
            if (oooO0OO instanceof Oooo000) {
                this.f36965OooO0o.add((Oooo000) oooO0OO);
            }
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        if (obj == com.airbnb.lottie.o00Oo0.f11971OooO00o) {
            this.f36967OooO0oO.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11974OooO0Oo) {
            this.f36968OooO0oo.OooOO0O(oooO0OO);
            return;
        }
        ColorFilter colorFilter = com.airbnb.lottie.o00Oo0.f12006Oooo0OO;
        com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f36963OooO0OO;
        if (obj == colorFilter) {
            o00OO0O0.o00O0O o00o0o2 = this.f36960OooO;
            if (o00o0o2 != null) {
                oooO00o.OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f36960OooO = null;
                return;
            }
            o00OO0O0.o00O0O o00o0o3 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f36960OooO = o00o0o3;
            o00o0o3.OooO00o(this);
            oooO00o.OooO0oO(this.f36960OooO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11979OooOO0) {
            o00OO0O0.OooO00o<Float, Float> oooO00o2 = this.f36970OooOO0O;
            if (oooO00o2 != null) {
                oooO00o2.OooOO0O(oooO0OO);
                return;
            }
            o00OO0O0.o00O0O o00o0o4 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f36970OooOO0O = o00o0o4;
            o00o0o4.OooO00o(this);
            oooO00o.OooO0oO(this.f36970OooOO0O);
            return;
        }
        Integer num = com.airbnb.lottie.o00Oo0.f11976OooO0o0;
        o00OO0O0.OooO0OO oooO0OO2 = this.f36972OooOOO0;
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
        Path path = this.f36961OooO00o;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36965OooO0o;
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
        BlurMaskFilter blurMaskFilter;
        if (this.f36966OooO0o0) {
            return;
        }
        o00OO0O0.OooO0O0 oooO0O0 = this.f36967OooO0oO;
        int iOooOO0o = oooO0O0.OooOO0o(oooO0O0.OooO0O0(), oooO0O0.OooO0Oo());
        o0ooOOo o0ooooo = this.f36962OooO0O0;
        o0ooooo.setColor(iOooOO0o);
        int iIntValue = (int) ((((i / 255.0f) * this.f36968OooO0oo.OooO0o().intValue()) / 100.0f) * 255.0f);
        PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
        int i2 = 0;
        o0ooooo.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        o00OO0O0.o00O0O o00o0o2 = this.f36960OooO;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        o00OO0O0.OooO00o<Float, Float> oooO00o = this.f36970OooOO0O;
        if (oooO00o != null) {
            float fFloatValue = oooO00o.OooO0o().floatValue();
            if (fFloatValue == 0.0f) {
                o0ooooo.setMaskFilter(null);
            } else if (fFloatValue != this.f36971OooOO0o) {
                com.airbnb.lottie.model.layer.OooO00o oooO00o2 = this.f36963OooO0OO;
                if (oooO00o2.f11957OooOoO0 == fFloatValue) {
                    blurMaskFilter = oooO00o2.f11956OooOoO;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    oooO00o2.f11956OooOoO = blurMaskFilter2;
                    oooO00o2.f11957OooOoO0 = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                o0ooooo.setMaskFilter(blurMaskFilter);
            }
            this.f36971OooOO0o = fFloatValue;
        }
        o00OO0O0.OooO0OO oooO0OO = this.f36972OooOOO0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(o0ooooo);
        }
        Path path = this.f36961OooO00o;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f36965OooO0o;
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

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f36964OooO0Oo;
    }
}
