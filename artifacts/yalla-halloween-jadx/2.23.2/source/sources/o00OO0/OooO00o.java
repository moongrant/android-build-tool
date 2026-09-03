package o00OO0;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import p133o00OO00o.o0ooOOo;
import p134o00OO0o.oo000o;
import p135o00OO0o0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o implements o00OO0O0.OooO00o.InterfaceC0423OooO00o, OooOo00, OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0ooOOo f36921OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f36926OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LottieDrawable f36927OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f36929OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00OO0O0.OooO0o f36930OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00OO0O0.OooOO0 f36931OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f36932OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public o00OO0O0.o00O0O f36933OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO0o f36934OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public o00OO0O0.OooO00o<Float, Float> f36935OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f36936OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO0OO f36937OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PathMeasure f36922OooO00o = new PathMeasure();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path f36923OooO0O0 = new Path();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Path f36924OooO0OO = new Path();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RectF f36925OooO0Oo = new RectF();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f36928OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: o00OO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0418OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f36938OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o00Ooo f36939OooO0O0;

        public C0418OooO00o(o00Ooo o00ooo2) {
            this.f36939OooO0O0 = o00ooo2;
        }
    }

    public OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, Paint.Cap cap, Paint.Join join, float f, p134o00OO0o.o0ooOOo o0ooooo, oo000o oo000oVar, List<oo000o> list, oo000o oo000oVar2) {
        o0ooOOo o0ooooo2 = new o0ooOOo(1);
        this.f36921OooO = o0ooooo2;
        this.f36936OooOOOo = 0.0f;
        this.f36927OooO0o0 = lottieDrawable;
        this.f36926OooO0o = oooO00o;
        o0ooooo2.setStyle(Paint.Style.STROKE);
        o0ooooo2.setStrokeCap(cap);
        o0ooooo2.setStrokeJoin(join);
        o0ooooo2.setStrokeMiter(f);
        this.f36931OooOO0O = (o00OO0O0.OooOO0) o0ooooo.OooO00o();
        this.f36930OooOO0 = (o00OO0O0.OooO0o) oo000oVar.OooO00o();
        if (oo000oVar2 == null) {
            this.f36934OooOOO0 = null;
        } else {
            this.f36934OooOOO0 = (o00OO0O0.OooO0o) oo000oVar2.OooO00o();
        }
        this.f36932OooOO0o = new ArrayList(list.size());
        this.f36929OooO0oo = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f36932OooOO0o.add(list.get(i).OooO00o());
        }
        oooO00o.OooO0oO(this.f36931OooOO0O);
        oooO00o.OooO0oO(this.f36930OooOO0);
        for (int i2 = 0; i2 < this.f36932OooOO0o.size(); i2++) {
            oooO00o.OooO0oO((o00OO0O0.OooO00o) this.f36932OooOO0o.get(i2));
        }
        o00OO0O0.OooO0o oooO0o = this.f36934OooOOO0;
        if (oooO0o != null) {
            oooO00o.OooO0oO(oooO0o);
        }
        this.f36931OooOO0O.OooO00o(this);
        this.f36930OooOO0.OooO00o(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((o00OO0O0.OooO00o) this.f36932OooOO0o.get(i3)).OooO00o(this);
        }
        o00OO0O0.OooO0o oooO0o2 = this.f36934OooOOO0;
        if (oooO0o2 != null) {
            oooO0o2.OooO00o(this);
        }
        if (oooO00o.OooOO0o() != null) {
            o00OO0O0.OooO00o<Float, Float> OooO00o2 = oooO00o.OooOO0o().f37341OooO00o.OooO00o();
            this.f36935OooOOOO = OooO00o2;
            OooO00o2.OooO00o(this);
            oooO00o.OooO0oO(this.f36935OooOOOO);
        }
        if (oooO00o.OooOOO0() != null) {
            this.f36937OooOOo0 = new o00OO0O0.OooO0OO(this, oooO00o, oooO00o.OooOOO0());
        }
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f36927OooO0o0.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0418OooO00o c0418OooO00o = null;
        o00Ooo o00ooo2 = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            OooO0OO oooO0OO = (OooO0OO) arrayList2.get(size);
            if (oooO0OO instanceof o00Ooo) {
                o00Ooo o00ooo3 = (o00Ooo) oooO0OO;
                if (o00ooo3.f37049OooO0OO == ShapeTrimPath.Type.INDIVIDUALLY) {
                    o00ooo2 = o00ooo3;
                }
            }
        }
        if (o00ooo2 != null) {
            o00ooo2.OooO0Oo(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f36928OooO0oO;
            if (size2 < 0) {
                break;
            }
            OooO0OO oooO0OO2 = list2.get(size2);
            if (oooO0OO2 instanceof o00Ooo) {
                o00Ooo o00ooo4 = (o00Ooo) oooO0OO2;
                if (o00ooo4.f37049OooO0OO == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (c0418OooO00o != null) {
                        arrayList.add(c0418OooO00o);
                    }
                    C0418OooO00o c0418OooO00o2 = new C0418OooO00o(o00ooo4);
                    o00ooo4.OooO0Oo(this);
                    c0418OooO00o = c0418OooO00o2;
                }
            }
            if (oooO0OO2 instanceof Oooo000) {
                if (c0418OooO00o == null) {
                    c0418OooO00o = new C0418OooO00o(o00ooo2);
                }
                c0418OooO00o.f36938OooO00o.add((Oooo000) oooO0OO2);
            }
        }
        if (c0418OooO00o != null) {
            arrayList.add(c0418OooO00o);
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    @CallSuper
    public void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        if (obj == com.airbnb.lottie.o00Oo0.f11974OooO0Oo) {
            this.f36931OooOO0O.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11988OooOOoo) {
            this.f36930OooOO0.OooOO0O(oooO0OO);
            return;
        }
        ColorFilter colorFilter = com.airbnb.lottie.o00Oo0.f12006Oooo0OO;
        com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f36926OooO0o;
        if (obj == colorFilter) {
            o00OO0O0.o00O0O o00o0o2 = this.f36933OooOOO;
            if (o00o0o2 != null) {
                oooO00o.OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f36933OooOOO = null;
                return;
            }
            o00OO0O0.o00O0O o00o0o3 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f36933OooOOO = o00o0o3;
            o00o0o3.OooO00o(this);
            oooO00o.OooO0oO(this.f36933OooOOO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11979OooOO0) {
            o00OO0O0.OooO00o<Float, Float> oooO00o2 = this.f36935OooOOOO;
            if (oooO00o2 != null) {
                oooO00o2.OooOO0O(oooO0OO);
                return;
            }
            o00OO0O0.o00O0O o00o0o4 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f36935OooOOOO = o00o0o4;
            o00o0o4.OooO00o(this);
            oooO00o.OooO0oO(this.f36935OooOOOO);
            return;
        }
        Integer num = com.airbnb.lottie.o00Oo0.f11976OooO0o0;
        o00OO0O0.OooO0OO oooO0OO2 = this.f36937OooOOo0;
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
        Path path = this.f36923OooO0O0;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36928OooO0oO;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f36925OooO0Oo;
                path.computeBounds(rectF2, false);
                float fOooOO0o = this.f36930OooOO0.OooOO0o() / 2.0f;
                rectF2.set(rectF2.left - fOooOO0o, rectF2.top - fOooOO0o, rectF2.right + fOooOO0o, rectF2.bottom + fOooOO0o);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                com.airbnb.lottie.OooO0OO.OooO00o();
                return;
            }
            C0418OooO00o c0418OooO00o = (C0418OooO00o) arrayList.get(i);
            for (int i2 = 0; i2 < c0418OooO00o.f36938OooO00o.size(); i2++) {
                path.addPath(((Oooo000) c0418OooO00o.f36938OooO00o.get(i2)).OooO00o(), matrix);
            }
            i++;
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0o0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        o00OOO0.OooOOO.OooO0Oo(o00oo0o2, i, arrayList, o00oo0o3, this);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01fb  */
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
    public void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        float[] fArr;
        boolean z;
        float f;
        BlurMaskFilter blurMaskFilter;
        OooO00o oooO00o = this;
        float[] fArr2 = o00OOO0.OooOOOO.f37436OooO0Oo.get();
        boolean z2 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            com.airbnb.lottie.OooO0OO.OooO00o();
            return;
        }
        o00OO0O0.OooOO0 oooOO1 = oooO00o.f36931OooOO0O;
        float fOooOO0o = (i / 255.0f) * oooOO1.OooOO0o(oooOO1.OooO0O0(), oooOO1.OooO0Oo());
        float f2 = 100.0f;
        PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
        int iMax = Math.max(0, Math.min(255, (int) ((fOooOO0o / 100.0f) * 255.0f)));
        o0ooOOo o0ooooo = oooO00o.f36921OooO;
        o0ooooo.setAlpha(iMax);
        o0ooooo.setStrokeWidth(o00OOO0.OooOOOO.OooO0Oo(matrix) * oooO00o.f36930OooOO0.OooOO0o());
        if (o0ooooo.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.OooO0OO.OooO00o();
            return;
        }
        ArrayList arrayList = oooO00o.f36932OooOO0o;
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.OooO0OO.OooO00o();
        } else {
            float fOooO0Oo = o00OOO0.OooOOOO.OooO0Oo(matrix);
            int i2 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = oooO00o.f36929OooO0oo;
                if (i2 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((o00OO0O0.OooO00o) arrayList.get(i2)).OooO0o()).floatValue();
                fArr[i2] = fFloatValue;
                if (i2 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i2] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i2] = 0.1f;
                }
                fArr[i2] = fArr[i2] * fOooO0Oo;
                i2++;
            }
            o00OO0O0.OooO0o oooO0o = oooO00o.f36934OooOOO0;
            o0ooooo.setPathEffect(new DashPathEffect(fArr, oooO0o == null ? 0.0f : oooO0o.OooO0o().floatValue() * fOooO0Oo));
            com.airbnb.lottie.OooO0OO.OooO00o();
        }
        o00OO0O0.o00O0O o00o0o2 = oooO00o.f36933OooOOO;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        o00OO0O0.OooO00o<Float, Float> oooO00o2 = oooO00o.f36935OooOOOO;
        if (oooO00o2 != null) {
            float fFloatValue2 = oooO00o2.OooO0o().floatValue();
            if (fFloatValue2 == 0.0f) {
                o0ooooo.setMaskFilter(null);
            } else if (fFloatValue2 != oooO00o.f36936OooOOOo) {
                com.airbnb.lottie.model.layer.OooO00o oooO00o3 = oooO00o.f36926OooO0o;
                if (oooO00o3.f11957OooOoO0 == fFloatValue2) {
                    blurMaskFilter = oooO00o3.f11956OooOoO;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    oooO00o3.f11956OooOoO = blurMaskFilter2;
                    oooO00o3.f11957OooOoO0 = fFloatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                o0ooooo.setMaskFilter(blurMaskFilter);
            }
            oooO00o.f36936OooOOOo = fFloatValue2;
        }
        o00OO0O0.OooO0OO oooO0OO = oooO00o.f36937OooOOo0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(o0ooooo);
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = oooO00o.f36928OooO0oO;
            if (i3 >= arrayList2.size()) {
                com.airbnb.lottie.OooO0OO.OooO00o();
                return;
            }
            C0418OooO00o c0418OooO00o = (C0418OooO00o) arrayList2.get(i3);
            o00Ooo o00ooo2 = c0418OooO00o.f36939OooO0O0;
            Path path = oooO00o.f36923OooO0O0;
            ArrayList arrayList3 = c0418OooO00o.f36938OooO00o;
            if (o00ooo2 != null) {
                path.reset();
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        path.addPath(((Oooo000) arrayList3.get(size2)).OooO00o(), matrix);
                    }
                }
                PathMeasure pathMeasure = oooO00o.f36922OooO00o;
                pathMeasure.setPath(path, z2);
                float length = pathMeasure.getLength();
                while (pathMeasure.nextContour()) {
                    length += pathMeasure.getLength();
                }
                o00Ooo o00ooo3 = c0418OooO00o.f36939OooO0O0;
                float fFloatValue3 = (o00ooo3.f37051OooO0o.OooO0o().floatValue() * length) / 360.0f;
                float fFloatValue4 = ((o00ooo3.f37050OooO0Oo.OooO0o().floatValue() / f2) * length) + fFloatValue3;
                float fFloatValue5 = ((o00ooo3.f37052OooO0o0.OooO0o().floatValue() / f2) * length) + fFloatValue3;
                int size3 = arrayList3.size() - 1;
                float f3 = 0.0f;
                while (size3 >= 0) {
                    Path path2 = oooO00o.f36924OooO0OO;
                    path2.set(((Oooo000) arrayList3.get(size3)).OooO00o());
                    path2.transform(matrix);
                    pathMeasure.setPath(path2, z2);
                    float length2 = pathMeasure.getLength();
                    if (fFloatValue5 > length) {
                        float f4 = fFloatValue5 - length;
                        if (f4 >= f3 + length2 || f3 >= f4) {
                            f = f3 + length2;
                            if (f < fFloatValue4 && f3 <= fFloatValue5) {
                                if (f > fFloatValue5 || fFloatValue4 >= f3) {
                                    o00OOO0.OooOOOO.OooO00o(path2, fFloatValue4 < f3 ? 0.0f : (fFloatValue4 - f3) / length2, fFloatValue5 > f ? 1.0f : (fFloatValue5 - f3) / length2, 0.0f);
                                    canvas.drawPath(path2, o0ooooo);
                                } else {
                                    canvas.drawPath(path2, o0ooooo);
                                }
                            }
                        } else {
                            o00OOO0.OooOOOO.OooO00o(path2, fFloatValue4 > length ? (fFloatValue4 - length) / length2 : 0.0f, Math.min(f4 / length2, 1.0f), 0.0f);
                            canvas.drawPath(path2, o0ooooo);
                        }
                    } else {
                        f = f3 + length2;
                        if (f < fFloatValue4) {
                        }
                    }
                    f3 += length2;
                    size3--;
                    oooO00o = this;
                    z2 = false;
                }
                com.airbnb.lottie.OooO0OO.OooO00o();
                z = true;
            } else {
                path.reset();
                z = true;
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((Oooo000) arrayList3.get(size4)).OooO00o(), matrix);
                }
                com.airbnb.lottie.OooO0OO.OooO00o();
                canvas.drawPath(path, o0ooooo);
                com.airbnb.lottie.OooO0OO.OooO00o();
            }
            i3++;
            oooO00o = this;
            z2 = false;
            f2 = 100.0f;
        }
    }
}
