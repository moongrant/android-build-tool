package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.OooOO0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00OOO0O.OooO0OO;
import p134o00OO0o.oo000o;
import p135o00OO0o0.o00oO0o;
import p137o00OO0oo.o000oOoO;
import p137o00OO0oo.o00O0O;
import p137o00OO0oo.o00Oo0;
import p137o00OO0oo.o00Ooo;
import p137o00OO0oo.o0OoOo0;
import p190o00o0O.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends com.airbnb.lottie.model.layer.OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public o00OO0O0.OooO00o<Float, Float> f11960OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RectF f11961OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayList f11962OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f11963OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Paint f11964OooOooo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f11965OooO00o;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f11965OooO00o = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11965OooO00o[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public OooO0O0(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, OooOO0 oooOO1) {
        com.airbnb.lottie.model.layer.OooO00o oooO00o;
        com.airbnb.lottie.model.layer.OooO00o o00o0o2;
        super(lottieDrawable, layer);
        this.f11962OooOoo0 = new ArrayList();
        this.f11961OooOoo = new RectF();
        this.f11963OooOooO = new RectF();
        this.f11964OooOooo = new Paint();
        oo000o oo000oVar = layer.f11926OooOOoo;
        if (oo000oVar != null) {
            o00OO0O0.OooO00o<Float, Float> OooO00o2 = oo000oVar.OooO00o();
            this.f11960OooOoOO = OooO00o2;
            OooO0oO(OooO00o2);
            this.f11960OooOoOO.OooO00o(this);
        } else {
            this.f11960OooOoOO = null;
        }
        OooOOOO oooOOOO = new OooOOOO(oooOO1.f11812OooO.size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.OooO00o oooO00o2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < oooOOOO.OooOO0O(); i++) {
                    com.airbnb.lottie.model.layer.OooO00o oooO00o3 = (com.airbnb.lottie.model.layer.OooO00o) oooOOOO.OooO0oO(oooOOOO.OooO0oo(i), null);
                    if (oooO00o3 != null && (oooO00o = (com.airbnb.lottie.model.layer.OooO00o) oooOOOO.OooO0oO(oooO00o3.f11944OooOOO.f11913OooO0o, null)) != null) {
                        oooO00o3.f11948OooOOo = oooO00o;
                    }
                }
                return;
            }
            Layer layer2 = list.get(size);
            switch (com.airbnb.lottie.model.layer.OooO00o.C0190OooO00o.f11958OooO00o[layer2.f11914OooO0o0.ordinal()]) {
                case 1:
                    o00o0o2 = new o00O0O(lottieDrawable, layer2, this);
                    break;
                case 2:
                    o00o0o2 = new OooO0O0(lottieDrawable, layer2, oooOO1.f11815OooO0OO.get(layer2.f11915OooO0oO), oooOO1);
                    break;
                case 3:
                    o00o0o2 = new o00Oo0(lottieDrawable, layer2);
                    break;
                case 4:
                    o00o0o2 = new o000oOoO(lottieDrawable, layer2);
                    break;
                case 5:
                    o00o0o2 = new o0OoOo0(lottieDrawable, layer2);
                    break;
                case 6:
                    o00o0o2 = new o00Ooo(lottieDrawable, layer2);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown layer type ");
                    sb.append(layer2.f11914OooO0o0);
                    o00OOO0.OooOO0.OooO0O0(sb.toString());
                    o00o0o2 = null;
                    break;
            }
            if (o00o0o2 != null) {
                oooOOOO.OooO(o00o0o2.f11944OooOOO.f11912OooO0Oo, o00o0o2);
                if (oooO00o2 != null) {
                    oooO00o2.f11949OooOOo0 = o00o0o2;
                    oooO00o2 = null;
                } else {
                    this.f11962OooOoo0.add(0, o00o0o2);
                    int i2 = OooO00o.f11965OooO00o[layer2.f11928OooOo0.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        oooO00o2 = o00o0o2;
                    }
                }
            }
            size--;
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable OooO0OO oooO0OO, Object obj) {
        super.OooO0Oo(oooO0OO, obj);
        if (obj == com.airbnb.lottie.o00Oo0.f12000OooOooo) {
            if (oooO0OO == null) {
                o00OO0O0.OooO00o<Float, Float> oooO00o = this.f11960OooOoOO;
                if (oooO00o != null) {
                    oooO00o.OooOO0O(null);
                    return;
                }
                return;
            }
            o00OO0O0.o00O0O o00o0o2 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f11960OooOoOO = o00o0o2;
            o00o0o2.OooO00o(this);
            OooO0oO(this.f11960OooOoOO);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, o00OO0.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        ArrayList arrayList = this.f11962OooOoo0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f11961OooOoo;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((com.airbnb.lottie.model.layer.OooO00o) arrayList.get(size)).OooO0o(rectF2, this.f11943OooOO0o, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f11963OooOooO;
        Layer layer = this.f11944OooOOO;
        rectF.set(0.0f, 0.0f, layer.f11922OooOOOO, layer.f11923OooOOOo);
        matrix.mapRect(rectF);
        boolean z = this.f11945OooOOO0.f11777OooOo00;
        ArrayList arrayList = this.f11962OooOoo0;
        boolean z2 = z && arrayList.size() > 1 && i != 255;
        if (z2) {
            Paint paint = this.f11964OooOooo;
            paint.setAlpha(i);
            o00OOO0.OooOOOO.OooO00o oooO00o = o00OOO0.OooOOOO.f37433OooO00o;
            canvas.saveLayer(rectF, paint);
            com.airbnb.lottie.OooO0OO.OooO00o();
        } else {
            canvas.save();
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!rectF.isEmpty() ? canvas.clipRect(rectF) : true) {
                ((com.airbnb.lottie.model.layer.OooO00o) arrayList.get(size)).OooO0oo(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOo(boolean z) {
        super.OooOOo(z);
        Iterator it = this.f11962OooOoo0.iterator();
        while (it.hasNext()) {
            ((com.airbnb.lottie.model.layer.OooO00o) it.next()).OooOOo(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOo0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f11962OooOoo0;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((com.airbnb.lottie.model.layer.OooO00o) arrayList2.get(i2)).OooO0o0(o00oo0o2, i, arrayList, o00oo0o3);
            i2++;
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOoo(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.OooOOoo(f);
        o00OO0O0.OooO00o<Float, Float> oooO00o = this.f11960OooOoOO;
        Layer layer = this.f11944OooOOO;
        if (oooO00o != null) {
            OooOO0 oooOO1 = this.f11945OooOOO0.f11763OooO0o0;
            f = ((oooO00o.OooO0o().floatValue() * layer.f11910OooO0O0.f11825OooOOO0) - layer.f11910OooO0O0.f11822OooOO0O) / ((oooOO1.f11823OooOO0o - oooOO1.f11822OooOO0O) + 0.01f);
        }
        if (this.f11960OooOoOO == null) {
            OooOO0 oooOO2 = layer.f11910OooO0O0;
            f -= layer.f11920OooOOO / (oooOO2.f11823OooOO0o - oooOO2.f11822OooOO0O);
        }
        if (layer.f11921OooOOO0 != 0.0f && !"__container".equals(layer.f11911OooO0OO)) {
            f /= layer.f11921OooOOO0;
        }
        ArrayList arrayList = this.f11962OooOoo0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((com.airbnb.lottie.model.layer.OooO00o) arrayList.get(size)).OooOOoo(f);
            }
        }
    }
}
