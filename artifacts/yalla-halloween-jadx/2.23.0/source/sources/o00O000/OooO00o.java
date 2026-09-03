package o00O000;

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
import p233o00oOoo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o implements o00O000o.OooO00o.InterfaceC0420OooO00o, OooOo00, OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0ooOOo f36121OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f36126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LottieDrawable f36127OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f36129OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O000o.OooO0o f36130OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00O000o.OooOO0 f36131OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f36132OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public o00O000o.o00O0O f36133OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final o00O000o.OooO0o f36134OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public o00O000o.OooO00o<Float, Float> f36135OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f36136OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final o00O000o.OooO0OO f36137OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PathMeasure f36122OooO00o = new PathMeasure();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path f36123OooO0O0 = new Path();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Path f36124OooO0OO = new Path();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RectF f36125OooO0Oo = new RectF();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f36128OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: o00O000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0418OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f36138OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o00Ooo f36139OooO0O0;

        public C0418OooO00o(o00Ooo o00ooo2) {
            this.f36139OooO0O0 = o00ooo2;
        }
    }

    public OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, Paint.Cap cap, Paint.Join join, float f, o00O00OO.OooO0o oooO0o, o00O00OO.OooO0O0 oooO0O0, List<o00O00OO.OooO0O0> list, o00O00OO.OooO0O0 oooO0O1) {
        o0ooOOo o0ooooo = new o0ooOOo(1);
        this.f36121OooO = o0ooooo;
        this.f36136OooOOOo = 0.0f;
        this.f36127OooO0o0 = lottieDrawable;
        this.f36126OooO0o = oooO00o;
        o0ooooo.setStyle(Paint.Style.STROKE);
        o0ooooo.setStrokeCap(cap);
        o0ooooo.setStrokeJoin(join);
        o0ooooo.setStrokeMiter(f);
        this.f36131OooOO0O = (o00O000o.OooOO0) oooO0o.OooO00o();
        this.f36130OooOO0 = (o00O000o.OooO0o) oooO0O0.OooO00o();
        if (oooO0O1 == null) {
            this.f36134OooOOO0 = null;
        } else {
            this.f36134OooOOO0 = (o00O000o.OooO0o) oooO0O1.OooO00o();
        }
        this.f36132OooOO0o = new ArrayList(list.size());
        this.f36129OooO0oo = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f36132OooOO0o.add(list.get(i).OooO00o());
        }
        oooO00o.OooO0oO(this.f36131OooOO0O);
        oooO00o.OooO0oO(this.f36130OooOO0);
        for (int i2 = 0; i2 < this.f36132OooOO0o.size(); i2++) {
            oooO00o.OooO0oO((o00O000o.OooO00o) this.f36132OooOO0o.get(i2));
        }
        o00O000o.OooO0o oooO0o2 = this.f36134OooOOO0;
        if (oooO0o2 != null) {
            oooO00o.OooO0oO(oooO0o2);
        }
        this.f36131OooOO0O.OooO00o(this);
        this.f36130OooOO0.OooO00o(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((o00O000o.OooO00o) this.f36132OooOO0o.get(i3)).OooO00o(this);
        }
        o00O000o.OooO0o oooO0o3 = this.f36134OooOOO0;
        if (oooO0o3 != null) {
            oooO0o3.OooO00o(this);
        }
        if (oooO00o.OooOO0o() != null) {
            o00O000o.OooO00o<Float, Float> OooO00o2 = oooO00o.OooOO0o().f36355OooO00o.OooO00o();
            this.f36135OooOOOO = OooO00o2;
            OooO00o2.OooO00o(this);
            oooO00o.OooO0oO(this.f36135OooOOOO);
        }
        if (oooO00o.OooOOO0() != null) {
            this.f36137OooOOo0 = new o00O000o.OooO0OO(this, oooO00o, oooO00o.OooOOO0());
        }
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f36127OooO0o0.invalidateSelf();
    }

    @Override // o00O000.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0418OooO00o c0418OooO00o = null;
        o00Ooo o00ooo2 = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            OooO0OO oooO0OO = (OooO0OO) arrayList2.get(size);
            if (oooO0OO instanceof o00Ooo) {
                o00Ooo o00ooo3 = (o00Ooo) oooO0OO;
                if (o00ooo3.f36249OooO0OO == ShapeTrimPath.Type.INDIVIDUALLY) {
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
            arrayList = this.f36128OooO0oO;
            if (size2 < 0) {
                break;
            }
            OooO0OO oooO0OO2 = list2.get(size2);
            if (oooO0OO2 instanceof o00Ooo) {
                o00Ooo o00ooo4 = (o00Ooo) oooO0OO2;
                if (o00ooo4.f36249OooO0OO == ShapeTrimPath.Type.INDIVIDUALLY) {
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
                c0418OooO00o.f36138OooO00o.add((Oooo000) oooO0OO2);
            }
        }
        if (c0418OooO00o != null) {
            arrayList.add(c0418OooO00o);
        }
    }

    @Override // oOO00O.OooO
    public final void OooO0Oo(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
        o00O0.OooOOO.OooO0Oo(oooO0o, i, arrayList, oooO0o2, this);
    }

    @Override // o00O000.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f36123OooO0O0;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36128OooO0oO;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f36125OooO0Oo;
                path.computeBounds(rectF2, false);
                float fOooOO0o = this.f36130OooOO0.OooOO0o() / 2.0f;
                rectF2.set(rectF2.left - fOooOO0o, rectF2.top - fOooOO0o, rectF2.right + fOooOO0o, rectF2.bottom + fOooOO0o);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                com.airbnb.lottie.OooO0OO.OooO00o();
                return;
            }
            C0418OooO00o c0418OooO00o = (C0418OooO00o) arrayList.get(i);
            for (int i2 = 0; i2 < c0418OooO00o.f36138OooO00o.size(); i2++) {
                path.addPath(((Oooo000) c0418OooO00o.f36138OooO00o.get(i2)).OooO00o(), matrix);
            }
            i++;
        }
    }

    @Override // oOO00O.OooO
    @CallSuper
    public void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        if (obj == com.airbnb.lottie.o00Oo0.f8884OooO0Oo) {
            this.f36131OooOO0O.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8898OooOOoo) {
            this.f36130OooOO0.OooOO0O(oooO0OO);
            return;
        }
        ColorFilter colorFilter = com.airbnb.lottie.o00Oo0.f8916Oooo0OO;
        com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f36126OooO0o;
        if (obj == colorFilter) {
            o00O000o.o00O0O o00o0o2 = this.f36133OooOOO;
            if (o00o0o2 != null) {
                oooO00o.OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f36133OooOOO = null;
                return;
            }
            o00O000o.o00O0O o00o0o3 = new o00O000o.o00O0O(oooO0OO, null);
            this.f36133OooOOO = o00o0o3;
            o00o0o3.OooO00o(this);
            oooO00o.OooO0oO(this.f36133OooOOO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8889OooOO0) {
            o00O000o.OooO00o<Float, Float> oooO00o2 = this.f36135OooOOOO;
            if (oooO00o2 != null) {
                oooO00o2.OooOO0O(oooO0OO);
                return;
            }
            o00O000o.o00O0O o00o0o4 = new o00O000o.o00O0O(oooO0OO, null);
            this.f36135OooOOOO = o00o0o4;
            o00o0o4.OooO00o(this);
            oooO00o.OooO0oO(this.f36135OooOOOO);
            return;
        }
        Integer num = com.airbnb.lottie.o00Oo0.f8886OooO0o0;
        o00O000o.OooO0OO oooO0OO2 = this.f36137OooOOo0;
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
    @Override // o00O000.OooO
    public void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        float[] fArr;
        boolean z;
        float f;
        BlurMaskFilter blurMaskFilter;
        OooO00o oooO00o = this;
        float[] fArr2 = o00O0.OooOOOO.f35985OooO0Oo.get();
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
        o00O000o.OooOO0 oooOO1 = oooO00o.f36131OooOO0O;
        float fOooOO0o = (i / 255.0f) * oooOO1.OooOO0o(oooOO1.OooO0O0(), oooOO1.OooO0Oo());
        float f2 = 100.0f;
        PointF pointF = o00O0.OooOOO.f35980OooO00o;
        int iMax = Math.max(0, Math.min(255, (int) ((fOooOO0o / 100.0f) * 255.0f)));
        o0ooOOo o0ooooo = oooO00o.f36121OooO;
        o0ooooo.setAlpha(iMax);
        o0ooooo.setStrokeWidth(o00O0.OooOOOO.OooO0Oo(matrix) * oooO00o.f36130OooOO0.OooOO0o());
        if (o0ooooo.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.OooO0OO.OooO00o();
            return;
        }
        ArrayList arrayList = oooO00o.f36132OooOO0o;
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.OooO0OO.OooO00o();
        } else {
            float fOooO0Oo = o00O0.OooOOOO.OooO0Oo(matrix);
            int i2 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = oooO00o.f36129OooO0oo;
                if (i2 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((o00O000o.OooO00o) arrayList.get(i2)).OooO0o()).floatValue();
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
            o00O000o.OooO0o oooO0o = oooO00o.f36134OooOOO0;
            o0ooooo.setPathEffect(new DashPathEffect(fArr, oooO0o == null ? 0.0f : oooO0o.OooO0o().floatValue() * fOooO0Oo));
            com.airbnb.lottie.OooO0OO.OooO00o();
        }
        o00O000o.o00O0O o00o0o2 = oooO00o.f36133OooOOO;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        o00O000o.OooO00o<Float, Float> oooO00o2 = oooO00o.f36135OooOOOO;
        if (oooO00o2 != null) {
            float fFloatValue2 = oooO00o2.OooO0o().floatValue();
            if (fFloatValue2 == 0.0f) {
                o0ooooo.setMaskFilter(null);
            } else if (fFloatValue2 != oooO00o.f36136OooOOOo) {
                com.airbnb.lottie.model.layer.OooO00o oooO00o3 = oooO00o.f36126OooO0o;
                if (oooO00o3.f8867OooOoO0 == fFloatValue2) {
                    blurMaskFilter = oooO00o3.f8866OooOoO;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    oooO00o3.f8866OooOoO = blurMaskFilter2;
                    oooO00o3.f8867OooOoO0 = fFloatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                o0ooooo.setMaskFilter(blurMaskFilter);
            }
            oooO00o.f36136OooOOOo = fFloatValue2;
        }
        o00O000o.OooO0OO oooO0OO = oooO00o.f36137OooOOo0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(o0ooooo);
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = oooO00o.f36128OooO0oO;
            if (i3 >= arrayList2.size()) {
                com.airbnb.lottie.OooO0OO.OooO00o();
                return;
            }
            C0418OooO00o c0418OooO00o = (C0418OooO00o) arrayList2.get(i3);
            o00Ooo o00ooo2 = c0418OooO00o.f36139OooO0O0;
            Path path = oooO00o.f36123OooO0O0;
            ArrayList arrayList3 = c0418OooO00o.f36138OooO00o;
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
                PathMeasure pathMeasure = oooO00o.f36122OooO00o;
                pathMeasure.setPath(path, z2);
                float length = pathMeasure.getLength();
                while (pathMeasure.nextContour()) {
                    length += pathMeasure.getLength();
                }
                o00Ooo o00ooo3 = c0418OooO00o.f36139OooO0O0;
                float fFloatValue3 = (o00ooo3.f36251OooO0o.OooO0o().floatValue() * length) / 360.0f;
                float fFloatValue4 = ((o00ooo3.f36250OooO0Oo.OooO0o().floatValue() / f2) * length) + fFloatValue3;
                float fFloatValue5 = ((o00ooo3.f36252OooO0o0.OooO0o().floatValue() / f2) * length) + fFloatValue3;
                int size3 = arrayList3.size() - 1;
                float f3 = 0.0f;
                while (size3 >= 0) {
                    Path path2 = oooO00o.f36124OooO0OO;
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
                                    o00O0.OooOOOO.OooO00o(path2, fFloatValue4 < f3 ? 0.0f : (fFloatValue4 - f3) / length2, fFloatValue5 > f ? 1.0f : (fFloatValue5 - f3) / length2, 0.0f);
                                    canvas.drawPath(path2, o0ooooo);
                                } else {
                                    canvas.drawPath(path2, o0ooooo);
                                }
                            }
                        } else {
                            o00O0.OooOOOO.OooO00o(path2, fFloatValue4 > length ? (fFloatValue4 - length) / length2 : 0.0f, Math.min(f4 / length2, 1.0f), 0.0f);
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
