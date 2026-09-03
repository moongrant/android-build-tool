package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o00O0.OooOOOO;
import o00O000.OooO;
import o00O000.OooO0OO;
import o00O000o.OooO0o;
import o00O000o.OooOOO0;
import o00O000o.o0OoOo0;
import o00O00OO.OooOo;
import p028Oooo0oO.o0O00o0;
import p113o00O00Oo.o000oOoO;
import p115o00O00oO.o0000Ooo;
import p233o00oOoo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o implements OooO, o00O000o.OooO00o.InterfaceC0420OooO00o, oOO00O.OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RectF f8842OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0ooOOo f8847OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0ooOOo f8849OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RectF f8850OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final RectF f8851OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final RectF f8852OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Matrix f8853OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Layer f8854OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LottieDrawable f8855OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final OooOOO0 f8856OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public OooO0o f8857OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public OooO00o f8858OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooO00o f8859OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public List<OooO00o> f8860OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public o0ooOOo f8861OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o0OoOo0 f8862OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final ArrayList f8863OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f8864OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f8865OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public BlurMaskFilter f8866OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f8867OooOoO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f8843OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f8844OooO0O0 = new Matrix();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0ooOOo f8845OooO0OO = new o0ooOOo(1);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0ooOOo f8846OooO0Oo = new o0ooOOo(PorterDuff.Mode.DST_IN, 0);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0ooOOo f8848OooO0o0 = new o0ooOOo(PorterDuff.Mode.DST_OUT, 0);

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.OooO00o$OooO00o, reason: collision with other inner class name */
    public static /* synthetic */ class C0171OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f8868OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f8869OooO0O0;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f8869OooO0O0 = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8869OooO0O0[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8869OooO0O0[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8869OooO0O0[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f8868OooO00o = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8868OooO00o[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8868OooO00o[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8868OooO00o[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8868OooO00o[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8868OooO00o[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8868OooO00o[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public OooO00o(LottieDrawable lottieDrawable, Layer layer) {
        o0ooOOo o0ooooo = new o0ooOOo(1);
        this.f8847OooO0o = o0ooooo;
        this.f8849OooO0oO = new o0ooOOo(PorterDuff.Mode.CLEAR);
        this.f8850OooO0oo = new RectF();
        this.f8842OooO = new RectF();
        this.f8851OooOO0 = new RectF();
        this.f8852OooOO0O = new RectF();
        this.f8853OooOO0o = new Matrix();
        this.f8863OooOo00 = new ArrayList();
        this.f8864OooOo0O = true;
        this.f8867OooOoO0 = 0.0f;
        this.f8855OooOOO0 = lottieDrawable;
        this.f8854OooOOO = layer;
        o0O00o0.OooO0O0(new StringBuilder(), layer.f8821OooO0OO, "#draw");
        if (layer.f8838OooOo0 == Layer.MatteType.INVERT) {
            o0ooooo.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            o0ooooo.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        OooOo oooOo = layer.f8818OooO;
        oooOo.getClass();
        o0OoOo0 o0oooo0 = new o0OoOo0(oooOo);
        this.f8862OooOo0 = o0oooo0;
        o0oooo0.OooO0O0(this);
        List<Mask> list = layer.f8826OooO0oo;
        if (list != null && !list.isEmpty()) {
            OooOOO0 oooOOO0 = new OooOOO0(list);
            this.f8856OooOOOO = oooOOO0;
            Iterator it = oooOOO0.f36297OooO00o.iterator();
            while (it.hasNext()) {
                ((o00O000o.OooO00o) it.next()).OooO00o(this);
            }
            for (o00O000o.OooO00o<?, ?> oooO00o : this.f8856OooOOOO.f36298OooO0O0) {
                OooO0oO(oooO00o);
                oooO00o.OooO00o(this);
            }
        }
        Layer layer2 = this.f8854OooOOO;
        if (layer2.f8839OooOo00.isEmpty()) {
            if (true != this.f8864OooOo0O) {
                this.f8864OooOo0O = true;
                this.f8855OooOOO0.invalidateSelf();
                return;
            }
            return;
        }
        OooO0o oooO0o = new OooO0o(layer2.f8839OooOo00);
        this.f8857OooOOOo = oooO0o;
        oooO0o.f36274OooO0O0 = true;
        oooO0o.OooO00o(new o00O00o0.OooO00o(this));
        boolean z = this.f8857OooOOOo.OooO0o().floatValue() == 1.0f;
        if (z != this.f8864OooOo0O) {
            this.f8864OooOo0O = z;
            this.f8855OooOOO0.invalidateSelf();
        }
        OooO0oO(this.f8857OooOOOo);
    }

    public final void OooO() {
        if (this.f8860OooOOoo != null) {
            return;
        }
        if (this.f8858OooOOo == null) {
            this.f8860OooOOoo = Collections.emptyList();
            return;
        }
        this.f8860OooOOoo = new ArrayList();
        for (OooO00o oooO00o = this.f8858OooOOo; oooO00o != null; oooO00o = oooO00o.f8858OooOOo) {
            this.f8860OooOOoo.add(oooO00o);
        }
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f8855OooOOO0.invalidateSelf();
    }

    @Override // o00O000.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
    }

    @Override // oOO00O.OooO
    public final void OooO0Oo(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
        OooO00o oooO00o = this.f8859OooOOo0;
        Layer layer = this.f8854OooOOO;
        if (oooO00o != null) {
            String str = oooO00o.f8854OooOOO.f8821OooO0OO;
            oooO0o2.getClass();
            oOO00O.OooO0o oooO0o3 = new oOO00O.OooO0o(oooO0o2);
            oooO0o3.f60842OooO00o.add(str);
            if (oooO0o.OooO00o(i, this.f8859OooOOo0.f8854OooOOO.f8821OooO0OO)) {
                OooO00o oooO00o2 = this.f8859OooOOo0;
                oOO00O.OooO0o oooO0o4 = new oOO00O.OooO0o(oooO0o3);
                oooO0o4.f60843OooO0O0 = oooO00o2;
                arrayList.add(oooO0o4);
            }
            if (oooO0o.OooO0Oo(i, layer.f8821OooO0OO)) {
                this.f8859OooOOo0.OooOOo0(oooO0o, oooO0o.OooO0O0(i, this.f8859OooOOo0.f8854OooOOO.f8821OooO0OO) + i, arrayList, oooO0o3);
            }
        }
        if (oooO0o.OooO0OO(i, layer.f8821OooO0OO)) {
            String str2 = layer.f8821OooO0OO;
            if (!"__container".equals(str2)) {
                oooO0o2.getClass();
                oOO00O.OooO0o oooO0o5 = new oOO00O.OooO0o(oooO0o2);
                oooO0o5.f60842OooO00o.add(str2);
                if (oooO0o.OooO00o(i, str2)) {
                    oOO00O.OooO0o oooO0o6 = new oOO00O.OooO0o(oooO0o5);
                    oooO0o6.f60843OooO0O0 = this;
                    arrayList.add(oooO0o6);
                }
                oooO0o2 = oooO0o5;
            }
            if (oooO0o.OooO0Oo(i, str2)) {
                OooOOo0(oooO0o, oooO0o.OooO0O0(i, str2) + i, arrayList, oooO0o2);
            }
        }
    }

    @Override // o00O000.OooO
    @CallSuper
    public void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f8850OooO0oo.set(0.0f, 0.0f, 0.0f, 0.0f);
        OooO();
        Matrix matrix2 = this.f8853OooOO0o;
        matrix2.set(matrix);
        if (z) {
            List<OooO00o> list = this.f8860OooOOoo;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(this.f8860OooOOoo.get(size).f8862OooOo0.OooO0Oo());
                    }
                }
            } else {
                OooO00o oooO00o = this.f8858OooOOo;
                if (oooO00o != null) {
                    matrix2.preConcat(oooO00o.f8862OooOo0.OooO0Oo());
                }
            }
        }
        matrix2.preConcat(this.f8862OooOo0.OooO0Oo());
    }

    @Override // oOO00O.OooO
    @CallSuper
    public void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        this.f8862OooOo0.OooO0OO(oooO0OO, obj);
    }

    public final void OooO0oO(@Nullable o00O000o.OooO00o<?, ?> oooO00o) {
        if (oooO00o == null) {
            return;
        }
        this.f8863OooOo00.add(oooO00o);
    }

    @Override // o00O000.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        float f;
        o0ooOOo o0ooooo;
        boolean z;
        if (this.f8864OooOo0O) {
            Layer layer = this.f8854OooOOO;
            if (!layer.f8840OooOo0O) {
                OooO();
                Matrix matrix2 = this.f8844OooO0O0;
                matrix2.reset();
                matrix2.set(matrix);
                int i2 = 1;
                for (int size = this.f8860OooOOoo.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.f8860OooOOoo.get(size).f8862OooOo0.OooO0Oo());
                }
                com.airbnb.lottie.OooO0OO.OooO00o();
                o0OoOo0 o0oooo0 = this.f8862OooOo0;
                o00O000o.OooO00o<Integer, Integer> oooO00o = o0oooo0.f36324OooOO0;
                int iIntValue = (int) ((((i / 255.0f) * (oooO00o == null ? 100 : oooO00o.OooO0o().intValue())) / 100.0f) * 255.0f);
                if (!(this.f8859OooOOo0 != null) && !OooOOO()) {
                    matrix2.preConcat(o0oooo0.OooO0Oo());
                    OooOO0O(canvas, matrix2, iIntValue);
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    OooOOOO();
                    return;
                }
                RectF rectF = this.f8850OooO0oo;
                OooO0o(rectF, matrix2, false);
                if ((this.f8859OooOOo0 != null) && layer.f8838OooOo0 != Layer.MatteType.INVERT) {
                    RectF rectF2 = this.f8851OooOO0;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f8859OooOOo0.OooO0o(rectF2, matrix, true);
                    if (!rectF.intersect(rectF2)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix2.preConcat(o0oooo0.OooO0Oo());
                RectF rectF3 = this.f8842OooO;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean zOooOOO = OooOOO();
                Path path = this.f8843OooO00o;
                int i3 = 2;
                OooOOO0 oooOOO0 = this.f8856OooOOOO;
                if (!zOooOOO) {
                    f = 0.0f;
                    break;
                }
                int size2 = oooOOO0.f36299OooO0OO.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        Mask mask = oooOOO0.f36299OooO0OO.get(i4);
                        path.set((Path) ((o00O000o.OooO00o) oooOOO0.f36297OooO00o.get(i4)).OooO0o());
                        path.transform(matrix2);
                        int i5 = C0171OooO00o.f8869OooO0O0[mask.f8772OooO00o.ordinal()];
                        if (i5 != i2 && i5 != i3 && ((i5 != 3 && i5 != 4) || !mask.f8775OooO0Oo)) {
                            RectF rectF4 = this.f8852OooOO0O;
                            path.computeBounds(rectF4, false);
                            if (i4 == 0) {
                                rectF3.set(rectF4);
                            } else {
                                rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                            }
                            i4++;
                            i2 = 1;
                            i3 = 2;
                        }
                    } else if (!rectF.intersect(rectF3)) {
                        f = 0.0f;
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        break;
                    }
                    f = 0.0f;
                    break;
                }
                if (!rectF.intersect(f, f, canvas.getWidth(), canvas.getHeight())) {
                    rectF.set(f, f, f, f);
                }
                com.airbnb.lottie.OooO0OO.OooO00o();
                if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                    o0ooOOo o0ooooo2 = this.f8845OooO0OO;
                    o0ooooo2.setAlpha(255);
                    OooOOOO.OooO00o oooO00o2 = OooOOOO.f35982OooO00o;
                    canvas.saveLayer(rectF, o0ooooo2);
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    OooOO0(canvas);
                    OooOO0O(canvas, matrix2, iIntValue);
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    if (OooOOO()) {
                        o0ooOOo o0ooooo3 = this.f8846OooO0Oo;
                        canvas.saveLayer(rectF, o0ooooo3);
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        if (Build.VERSION.SDK_INT < 28) {
                            OooOO0(canvas);
                        }
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        int i6 = 0;
                        while (i6 < oooOOO0.f36299OooO0OO.size()) {
                            List<Mask> list = oooOOO0.f36299OooO0OO;
                            Mask mask2 = list.get(i6);
                            ArrayList arrayList = oooOOO0.f36297OooO00o;
                            o00O000o.OooO00o oooO00o3 = (o00O000o.OooO00o) arrayList.get(i6);
                            o00O000o.OooO00o oooO00o4 = (o00O000o.OooO00o) oooOOO0.f36298OooO0O0.get(i6);
                            OooOOO0 oooOOO1 = oooOOO0;
                            int i7 = C0171OooO00o.f8869OooO0O0[mask2.f8772OooO00o.ordinal()];
                            if (i7 != 1) {
                                o0ooOOo o0ooooo4 = this.f8848OooO0o0;
                                boolean z2 = mask2.f8775OooO0Oo;
                                if (i7 == 2) {
                                    if (i6 == 0) {
                                        o0ooooo2.setColor(-16777216);
                                        o0ooooo2.setAlpha(255);
                                        canvas.drawRect(rectF, o0ooooo2);
                                    }
                                    if (z2) {
                                        OooOOOO.OooO00o oooO00o5 = OooOOOO.f35982OooO00o;
                                        canvas.saveLayer(rectF, o0ooooo4);
                                        com.airbnb.lottie.OooO0OO.OooO00o();
                                        canvas.drawRect(rectF, o0ooooo2);
                                        o0ooooo4.setAlpha((int) (((Integer) oooO00o4.OooO0o()).intValue() * 2.55f));
                                        path.set((Path) oooO00o3.OooO0o());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, o0ooooo4);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) oooO00o3.OooO0o());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, o0ooooo4);
                                    }
                                } else if (i7 != 3) {
                                    if (i7 == 4) {
                                        if (z2) {
                                            OooOOOO.OooO00o oooO00o6 = OooOOOO.f35982OooO00o;
                                            canvas.saveLayer(rectF, o0ooooo2);
                                            com.airbnb.lottie.OooO0OO.OooO00o();
                                            canvas.drawRect(rectF, o0ooooo2);
                                            path.set((Path) oooO00o3.OooO0o());
                                            path.transform(matrix2);
                                            o0ooooo2.setAlpha((int) (((Integer) oooO00o4.OooO0o()).intValue() * 2.55f));
                                            canvas.drawPath(path, o0ooooo4);
                                            canvas.restore();
                                        } else {
                                            path.set((Path) oooO00o3.OooO0o());
                                            path.transform(matrix2);
                                            o0ooooo2.setAlpha((int) (((Integer) oooO00o4.OooO0o()).intValue() * 2.55f));
                                            canvas.drawPath(path, o0ooooo2);
                                        }
                                    }
                                } else if (z2) {
                                    OooOOOO.OooO00o oooO00o7 = OooOOOO.f35982OooO00o;
                                    canvas.saveLayer(rectF, o0ooooo3);
                                    com.airbnb.lottie.OooO0OO.OooO00o();
                                    canvas.drawRect(rectF, o0ooooo2);
                                    o0ooooo4.setAlpha((int) (((Integer) oooO00o4.OooO0o()).intValue() * 2.55f));
                                    path.set((Path) oooO00o3.OooO0o());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, o0ooooo4);
                                    canvas.restore();
                                } else {
                                    OooOOOO.OooO00o oooO00o8 = OooOOOO.f35982OooO00o;
                                    canvas.saveLayer(rectF, o0ooooo3);
                                    com.airbnb.lottie.OooO0OO.OooO00o();
                                    path.set((Path) oooO00o3.OooO0o());
                                    path.transform(matrix2);
                                    o0ooooo2.setAlpha((int) (((Integer) oooO00o4.OooO0o()).intValue() * 2.55f));
                                    canvas.drawPath(path, o0ooooo2);
                                    canvas.restore();
                                }
                            } else {
                                if (arrayList.isEmpty()) {
                                    z = false;
                                    break;
                                }
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= list.size()) {
                                        z = true;
                                        break;
                                    } else {
                                        if (list.get(i8).f8772OooO00o != Mask.MaskMode.MASK_MODE_NONE) {
                                            z = false;
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                if (z) {
                                    o0ooooo2.setAlpha(255);
                                    canvas.drawRect(rectF, o0ooooo2);
                                }
                                i6++;
                                oooOOO0 = oooOOO1;
                            }
                            i6++;
                            oooOOO0 = oooOOO1;
                        }
                        canvas.restore();
                        com.airbnb.lottie.OooO0OO.OooO00o();
                    }
                    if (this.f8859OooOOo0 != null) {
                        canvas.saveLayer(rectF, this.f8847OooO0o);
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        OooOO0(canvas);
                        this.f8859OooOOo0.OooO0oo(canvas, matrix, iIntValue);
                        canvas.restore();
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        com.airbnb.lottie.OooO0OO.OooO00o();
                    }
                    canvas.restore();
                    com.airbnb.lottie.OooO0OO.OooO00o();
                }
                if (this.f8865OooOo0o && (o0ooooo = this.f8861OooOo) != null) {
                    o0ooooo.setStyle(Paint.Style.STROKE);
                    this.f8861OooOo.setColor(-251901);
                    this.f8861OooOo.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF, this.f8861OooOo);
                    this.f8861OooOo.setStyle(Paint.Style.FILL);
                    this.f8861OooOo.setColor(1357638635);
                    canvas.drawRect(rectF, this.f8861OooOo);
                }
                com.airbnb.lottie.OooO0OO.OooO00o();
                OooOOOO();
                return;
            }
        }
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    public final void OooOO0(Canvas canvas) {
        RectF rectF = this.f8850OooO0oo;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f8849OooO0oO);
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    public abstract void OooOO0O(Canvas canvas, Matrix matrix, int i);

    @Nullable
    public o000oOoO OooOO0o() {
        return this.f8854OooOOO.f8841OooOo0o;
    }

    public final boolean OooOOO() {
        OooOOO0 oooOOO0 = this.f8856OooOOOO;
        return (oooOOO0 == null || oooOOO0.f36297OooO00o.isEmpty()) ? false : true;
    }

    @Nullable
    public o0000Ooo OooOOO0() {
        return this.f8854OooOOO.f8837OooOo;
    }

    public final void OooOOOO() {
        com.airbnb.lottie.o0ooOOo o0ooooo = this.f8855OooOOO0.f8673OooO0o0.f8723OooO00o;
        String str = this.f8854OooOOO.f8821OooO0OO;
        if (o0ooooo.f8928OooO00o) {
            HashMap map = o0ooooo.f8930OooO0OO;
            o00O0.OooOOO0 oooOOO0 = (o00O0.OooOOO0) map.get(str);
            if (oooOOO0 == null) {
                oooOOO0 = new o00O0.OooOOO0();
                map.put(str, oooOOO0);
            }
            int i = oooOOO0.f35981OooO00o + 1;
            oooOOO0.f35981OooO00o = i;
            if (i == Integer.MAX_VALUE) {
                oooOOO0.f35981OooO00o = i / 2;
            }
            if (str.equals("__container")) {
                p188o00o0O.OooOOO0 oooOOO1 = o0ooooo.f8929OooO0O0;
                oooOOO1.getClass();
                o00o0O.OooOOO0.OooO00o oooO00o = new o00o0O.OooOOO0.OooO00o();
                while (oooO00o.hasNext()) {
                    ((com.airbnb.lottie.o0ooOOo.OooO00o) oooO00o.next()).OooO00o();
                }
            }
        }
    }

    public final void OooOOOo(o00O000o.OooO00o<?, ?> oooO00o) {
        this.f8863OooOo00.remove(oooO00o);
    }

    public void OooOOo(boolean z) {
        if (z && this.f8861OooOo == null) {
            this.f8861OooOo = new o0ooOOo();
        }
        this.f8865OooOo0o = z;
    }

    public void OooOOo0(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
    }

    public void OooOOoo(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        o0OoOo0 o0oooo0 = this.f8862OooOo0;
        o00O000o.OooO00o<Integer, Integer> oooO00o = o0oooo0.f36324OooOO0;
        if (oooO00o != null) {
            oooO00o.OooOO0(f);
        }
        o00O000o.OooO00o<?, Float> oooO00o2 = o0oooo0.f36328OooOOO0;
        if (oooO00o2 != null) {
            oooO00o2.OooOO0(f);
        }
        o00O000o.OooO00o<?, Float> oooO00o3 = o0oooo0.f36327OooOOO;
        if (oooO00o3 != null) {
            oooO00o3.OooOO0(f);
        }
        o00O000o.OooO00o<PointF, PointF> oooO00o4 = o0oooo0.f36320OooO0o;
        if (oooO00o4 != null) {
            oooO00o4.OooOO0(f);
        }
        o00O000o.OooO00o<?, PointF> oooO00o5 = o0oooo0.f36322OooO0oO;
        if (oooO00o5 != null) {
            oooO00o5.OooOO0(f);
        }
        o00O000o.OooO00o<o00O0O00.OooO0o, o00O0O00.OooO0o> oooO00o6 = o0oooo0.f36323OooO0oo;
        if (oooO00o6 != null) {
            oooO00o6.OooOO0(f);
        }
        o00O000o.OooO00o<Float, Float> oooO00o7 = o0oooo0.f36315OooO;
        if (oooO00o7 != null) {
            oooO00o7.OooOO0(f);
        }
        OooO0o oooO0o = o0oooo0.f36325OooOO0O;
        if (oooO0o != null) {
            oooO0o.OooOO0(f);
        }
        OooO0o oooO0o2 = o0oooo0.f36326OooOO0o;
        if (oooO0o2 != null) {
            oooO0o2.OooOO0(f);
        }
        int i = 0;
        OooOOO0 oooOOO0 = this.f8856OooOOOO;
        if (oooOOO0 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = oooOOO0.f36297OooO00o;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((o00O000o.OooO00o) arrayList.get(i2)).OooOO0(f);
                i2++;
            }
        }
        OooO0o oooO0o3 = this.f8857OooOOOo;
        if (oooO0o3 != null) {
            oooO0o3.OooOO0(f);
        }
        OooO00o oooO00o8 = this.f8859OooOOo0;
        if (oooO00o8 != null) {
            oooO00o8.OooOOoo(f);
        }
        while (true) {
            ArrayList arrayList2 = this.f8863OooOo00;
            if (i >= arrayList2.size()) {
                return;
            }
            ((o00O000o.OooO00o) arrayList2.get(i)).OooOO0(f);
            i++;
        }
    }

    @Override // o00O000.OooO0OO
    public final String getName() {
        return this.f8854OooOOO.f8821OooO0OO;
    }
}
