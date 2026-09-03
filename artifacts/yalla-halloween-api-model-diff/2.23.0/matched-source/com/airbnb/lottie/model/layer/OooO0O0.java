package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.o00Oo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00O0.OooOOOO;
import o00O000o.o00O0O;
import o00O00o0.OooO;
import o00O00o0.OooO0OO;
import o00O00o0.OooO0o;
import p188o00o0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends com.airbnb.lottie.model.layer.OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public o00O000o.OooO00o<Float, Float> f8870OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RectF f8871OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayList f8872OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f8873OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Paint f8874OooOooo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f8875OooO00o;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f8875OooO00o = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8875OooO00o[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public OooO0O0(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, OooOO0 oooOO1) {
        com.airbnb.lottie.model.layer.OooO00o oooO00o;
        com.airbnb.lottie.model.layer.OooO00o oooO0o;
        super(lottieDrawable, layer);
        this.f8872OooOoo0 = new ArrayList();
        this.f8871OooOoo = new RectF();
        this.f8873OooOooO = new RectF();
        this.f8874OooOooo = new Paint();
        o00O00OO.OooO0O0 oooO0O0 = layer.f8836OooOOoo;
        if (oooO0O0 != null) {
            o00O000o.OooO00o<Float, Float> OooO00o2 = oooO0O0.OooO00o();
            this.f8870OooOoOO = OooO00o2;
            OooO0oO(OooO00o2);
            this.f8870OooOoOO.OooO00o(this);
        } else {
            this.f8870OooOoOO = null;
        }
        OooOo00 oooOo00 = new OooOo00(oooOO1.f8722OooO.size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.OooO00o oooO00o2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < oooOo00.OooOO0O(); i++) {
                    com.airbnb.lottie.model.layer.OooO00o oooO00o3 = (com.airbnb.lottie.model.layer.OooO00o) oooOo00.OooO0oO(oooOo00.OooO0oo(i), null);
                    if (oooO00o3 != null && (oooO00o = (com.airbnb.lottie.model.layer.OooO00o) oooOo00.OooO0oO(oooO00o3.f8854OooOOO.f8823OooO0o, null)) != null) {
                        oooO00o3.f8858OooOOo = oooO00o;
                    }
                }
                return;
            }
            Layer layer2 = list.get(size);
            switch (com.airbnb.lottie.model.layer.OooO00o.C0171OooO00o.f8868OooO00o[layer2.f8824OooO0o0.ordinal()]) {
                case 1:
                    oooO0o = new OooO0o(lottieDrawable, layer2, this);
                    break;
                case 2:
                    oooO0o = new OooO0O0(lottieDrawable, layer2, oooOO1.f8725OooO0OO.get(layer2.f8825OooO0oO), oooOO1);
                    break;
                case 3:
                    oooO0o = new OooO(lottieDrawable, layer2);
                    break;
                case 4:
                    oooO0o = new o00O00o0.OooO0O0(lottieDrawable, layer2);
                    break;
                case 5:
                    oooO0o = new OooO0OO(lottieDrawable, layer2);
                    break;
                case 6:
                    oooO0o = new o00O00o0.OooOO0(lottieDrawable, layer2);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown layer type ");
                    sb.append(layer2.f8824OooO0o0);
                    o00O0.OooOO0.OooO0O0(sb.toString());
                    oooO0o = null;
                    break;
            }
            if (oooO0o != null) {
                oooOo00.OooO(oooO0o.f8854OooOOO.f8822OooO0Oo, oooO0o);
                if (oooO00o2 != null) {
                    oooO00o2.f8859OooOOo0 = oooO0o;
                    oooO00o2 = null;
                } else {
                    this.f8872OooOoo0.add(0, oooO0o);
                    int i2 = OooO00o.f8875OooO00o[layer2.f8838OooOo0.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        oooO00o2 = oooO0o;
                    }
                }
            }
            size--;
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, o00O000.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        ArrayList arrayList = this.f8872OooOoo0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f8871OooOoo;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((com.airbnb.lottie.model.layer.OooO00o) arrayList.get(size)).OooO0o(rectF2, this.f8853OooOO0o, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, oOO00O.OooO
    public final void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        super.OooO0o0(oooO0OO, obj);
        if (obj == o00Oo0.f8910OooOooo) {
            if (oooO0OO == null) {
                o00O000o.OooO00o<Float, Float> oooO00o = this.f8870OooOoOO;
                if (oooO00o != null) {
                    oooO00o.OooOO0O(null);
                    return;
                }
                return;
            }
            o00O0O o00o0o2 = new o00O0O(oooO0OO, null);
            this.f8870OooOoOO = o00o0o2;
            o00o0o2.OooO00o(this);
            OooO0oO(this.f8870OooOoOO);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f8873OooOooO;
        Layer layer = this.f8854OooOOO;
        rectF.set(0.0f, 0.0f, layer.f8832OooOOOO, layer.f8833OooOOOo);
        matrix.mapRect(rectF);
        boolean z = this.f8855OooOOO0.f8687OooOo00;
        ArrayList arrayList = this.f8872OooOoo0;
        boolean z2 = z && arrayList.size() > 1 && i != 255;
        if (z2) {
            Paint paint = this.f8874OooOooo;
            paint.setAlpha(i);
            OooOOOO.OooO00o oooO00o = OooOOOO.f35982OooO00o;
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
        Iterator it = this.f8872OooOoo0.iterator();
        while (it.hasNext()) {
            ((com.airbnb.lottie.model.layer.OooO00o) it.next()).OooOOo(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOo0(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f8872OooOoo0;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((com.airbnb.lottie.model.layer.OooO00o) arrayList2.get(i2)).OooO0Oo(oooO0o, i, arrayList, oooO0o2);
            i2++;
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOoo(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.OooOOoo(f);
        o00O000o.OooO00o<Float, Float> oooO00o = this.f8870OooOoOO;
        Layer layer = this.f8854OooOOO;
        if (oooO00o != null) {
            OooOO0 oooOO1 = this.f8855OooOOO0.f8673OooO0o0;
            f = ((oooO00o.OooO0o().floatValue() * layer.f8820OooO0O0.f8735OooOOO0) - layer.f8820OooO0O0.f8732OooOO0O) / ((oooOO1.f8733OooOO0o - oooOO1.f8732OooOO0O) + 0.01f);
        }
        if (this.f8870OooOoOO == null) {
            OooOO0 oooOO2 = layer.f8820OooO0O0;
            f -= layer.f8830OooOOO / (oooOO2.f8733OooOO0o - oooOO2.f8732OooOO0O);
        }
        if (layer.f8831OooOOO0 != 0.0f && !"__container".equals(layer.f8821OooO0OO)) {
            f /= layer.f8831OooOOO0;
        }
        ArrayList arrayList = this.f8872OooOoo0;
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
