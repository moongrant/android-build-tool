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
import o00OO0.OooO;
import o00OO0.OooO0OO;
import o00OO0O0.OooO0o;
import o00OO0O0.OooOOO0;
import o00OO0O0.o0OoOo0;
import o00OOO0.OooOOOO;
import p028Oooo0oO.o0oOO;
import p134o00OO0o.o000000O;
import p135o00OO0o0.o00oO0o;
import p135o00OO0o0.o0ooOOo;
import p137o00OO0oo.Oooo0;
import p190o00o0O.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o implements OooO, o00OO0O0.OooO00o.InterfaceC0423OooO00o, o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RectF f11932OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p133o00OO00o.o0ooOOo f11937OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final p133o00OO00o.o0ooOOo f11939OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RectF f11940OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final RectF f11941OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final RectF f11942OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Matrix f11943OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Layer f11944OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LottieDrawable f11945OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final OooOOO0 f11946OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public OooO0o f11947OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public OooO00o f11948OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooO00o f11949OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public List<OooO00o> f11950OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public p133o00OO00o.o0ooOOo f11951OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o0OoOo0 f11952OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final ArrayList f11953OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f11954OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f11955OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public BlurMaskFilter f11956OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f11957OooOoO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f11933OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f11934OooO0O0 = new Matrix();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p133o00OO00o.o0ooOOo f11935OooO0OO = new p133o00OO00o.o0ooOOo(1);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p133o00OO00o.o0ooOOo f11936OooO0Oo = new p133o00OO00o.o0ooOOo(PorterDuff.Mode.DST_IN, 0);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p133o00OO00o.o0ooOOo f11938OooO0o0 = new p133o00OO00o.o0ooOOo(PorterDuff.Mode.DST_OUT, 0);

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.OooO00o$OooO00o, reason: collision with other inner class name */
    public static /* synthetic */ class C0190OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f11958OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f11959OooO0O0;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f11959OooO0O0 = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11959OooO0O0[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11959OooO0O0[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11959OooO0O0[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f11958OooO00o = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11958OooO00o[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11958OooO00o[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11958OooO00o[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11958OooO00o[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11958OooO00o[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11958OooO00o[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public OooO00o(LottieDrawable lottieDrawable, Layer layer) {
        p133o00OO00o.o0ooOOo o0ooooo = new p133o00OO00o.o0ooOOo(1);
        this.f11937OooO0o = o0ooooo;
        this.f11939OooO0oO = new p133o00OO00o.o0ooOOo(PorterDuff.Mode.CLEAR);
        this.f11940OooO0oo = new RectF();
        this.f11932OooO = new RectF();
        this.f11941OooOO0 = new RectF();
        this.f11942OooOO0O = new RectF();
        this.f11943OooOO0o = new Matrix();
        this.f11953OooOo00 = new ArrayList();
        this.f11954OooOo0O = true;
        this.f11957OooOoO0 = 0.0f;
        this.f11945OooOOO0 = lottieDrawable;
        this.f11944OooOOO = layer;
        o0oOO.OooO0O0(new StringBuilder(), layer.f11911OooO0OO, "#draw");
        if (layer.f11928OooOo0 == Layer.MatteType.INVERT) {
            o0ooooo.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            o0ooooo.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        o000000O o000000o2 = layer.f11908OooO;
        o000000o2.getClass();
        o0OoOo0 o0oooo1 = new o0OoOo0(o000000o2);
        this.f11952OooOo0 = o0oooo1;
        o0oooo1.OooO0O0(this);
        List<Mask> list = layer.f11916OooO0oo;
        if (list != null && !list.isEmpty()) {
            OooOOO0 oooOOO0 = new OooOOO0(list);
            this.f11946OooOOOO = oooOOO0;
            Iterator it = oooOOO0.f37262OooO00o.iterator();
            while (it.hasNext()) {
                ((o00OO0O0.OooO00o) it.next()).OooO00o(this);
            }
            for (o00OO0O0.OooO00o<?, ?> oooO00o : this.f11946OooOOOO.f37263OooO0O0) {
                OooO0oO(oooO00o);
                oooO00o.OooO00o(this);
            }
        }
        Layer layer2 = this.f11944OooOOO;
        if (layer2.f11929OooOo00.isEmpty()) {
            if (true != this.f11954OooOo0O) {
                this.f11954OooOo0O = true;
                this.f11945OooOOO0.invalidateSelf();
                return;
            }
            return;
        }
        OooO0o oooO0o = new OooO0o(layer2.f11929OooOo00);
        this.f11947OooOOOo = oooO0o;
        oooO0o.f37239OooO0O0 = true;
        oooO0o.OooO00o(new Oooo0(this));
        boolean z = this.f11947OooOOOo.OooO0o().floatValue() == 1.0f;
        if (z != this.f11954OooOo0O) {
            this.f11954OooOo0O = z;
            this.f11945OooOOO0.invalidateSelf();
        }
        OooO0oO(this.f11947OooOOOo);
    }

    public final void OooO() {
        if (this.f11950OooOOoo != null) {
            return;
        }
        if (this.f11948OooOOo == null) {
            this.f11950OooOOoo = Collections.emptyList();
            return;
        }
        this.f11950OooOOoo = new ArrayList();
        for (OooO00o oooO00o = this.f11948OooOOo; oooO00o != null; oooO00o = oooO00o.f11948OooOOo) {
            this.f11950OooOOoo.add(oooO00o);
        }
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f11945OooOOO0.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
    }

    @Override // p135o00OO0o0.o0ooOOo
    @CallSuper
    public void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        this.f11952OooOo0.OooO0OO(oooO0OO, obj);
    }

    @Override // o00OO0.OooO
    @CallSuper
    public void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f11940OooO0oo.set(0.0f, 0.0f, 0.0f, 0.0f);
        OooO();
        Matrix matrix2 = this.f11943OooOO0o;
        matrix2.set(matrix);
        if (z) {
            List<OooO00o> list = this.f11950OooOOoo;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(this.f11950OooOOoo.get(size).f11952OooOo0.OooO0Oo());
                    }
                }
            } else {
                OooO00o oooO00o = this.f11948OooOOo;
                if (oooO00o != null) {
                    matrix2.preConcat(oooO00o.f11952OooOo0.OooO0Oo());
                }
            }
        }
        matrix2.preConcat(this.f11952OooOo0.OooO0Oo());
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0o0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        OooO00o oooO00o = this.f11949OooOOo0;
        Layer layer = this.f11944OooOOO;
        if (oooO00o != null) {
            String str = oooO00o.f11944OooOOO.f11911OooO0OO;
            o00oo0o3.getClass();
            o00oO0o o00oo0o4 = new o00oO0o(o00oo0o3);
            o00oo0o4.f37327OooO00o.add(str);
            if (o00oo0o2.OooO00o(i, this.f11949OooOOo0.f11944OooOOO.f11911OooO0OO)) {
                OooO00o oooO00o2 = this.f11949OooOOo0;
                o00oO0o o00oo0o5 = new o00oO0o(o00oo0o4);
                o00oo0o5.f37328OooO0O0 = oooO00o2;
                arrayList.add(o00oo0o5);
            }
            if (o00oo0o2.OooO0Oo(i, layer.f11911OooO0OO)) {
                this.f11949OooOOo0.OooOOo0(o00oo0o2, o00oo0o2.OooO0O0(i, this.f11949OooOOo0.f11944OooOOO.f11911OooO0OO) + i, arrayList, o00oo0o4);
            }
        }
        if (o00oo0o2.OooO0OO(i, layer.f11911OooO0OO)) {
            String str2 = layer.f11911OooO0OO;
            if (!"__container".equals(str2)) {
                o00oo0o3.getClass();
                o00oO0o o00oo0o6 = new o00oO0o(o00oo0o3);
                o00oo0o6.f37327OooO00o.add(str2);
                if (o00oo0o2.OooO00o(i, str2)) {
                    o00oO0o o00oo0o7 = new o00oO0o(o00oo0o6);
                    o00oo0o7.f37328OooO0O0 = this;
                    arrayList.add(o00oo0o7);
                }
                o00oo0o3 = o00oo0o6;
            }
            if (o00oo0o2.OooO0Oo(i, str2)) {
                OooOOo0(o00oo0o2, o00oo0o2.OooO0O0(i, str2) + i, arrayList, o00oo0o3);
            }
        }
    }

    public final void OooO0oO(@Nullable o00OO0O0.OooO00o<?, ?> oooO00o) {
        if (oooO00o == null) {
            return;
        }
        this.f11953OooOo00.add(oooO00o);
    }

    @Override // o00OO0.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        float f;
        p133o00OO00o.o0ooOOo o0ooooo;
        boolean z;
        if (this.f11954OooOo0O) {
            Layer layer = this.f11944OooOOO;
            if (!layer.f11930OooOo0O) {
                OooO();
                Matrix matrix2 = this.f11934OooO0O0;
                matrix2.reset();
                matrix2.set(matrix);
                int i2 = 1;
                for (int size = this.f11950OooOOoo.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.f11950OooOOoo.get(size).f11952OooOo0.OooO0Oo());
                }
                com.airbnb.lottie.OooO0OO.OooO00o();
                o0OoOo0 o0oooo1 = this.f11952OooOo0;
                o00OO0O0.OooO00o<Integer, Integer> oooO00o = o0oooo1.f37289OooOO0;
                int iIntValue = (int) ((((i / 255.0f) * (oooO00o == null ? 100 : oooO00o.OooO0o().intValue())) / 100.0f) * 255.0f);
                if (!(this.f11949OooOOo0 != null) && !OooOOO()) {
                    matrix2.preConcat(o0oooo1.OooO0Oo());
                    OooOO0O(canvas, matrix2, iIntValue);
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    OooOOOO();
                    return;
                }
                RectF rectF = this.f11940OooO0oo;
                OooO0o(rectF, matrix2, false);
                if ((this.f11949OooOOo0 != null) && layer.f11928OooOo0 != Layer.MatteType.INVERT) {
                    RectF rectF2 = this.f11941OooOO0;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f11949OooOOo0.OooO0o(rectF2, matrix, true);
                    if (!rectF.intersect(rectF2)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix2.preConcat(o0oooo1.OooO0Oo());
                RectF rectF3 = this.f11932OooO;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean zOooOOO = OooOOO();
                Path path = this.f11933OooO00o;
                int i3 = 2;
                OooOOO0 oooOOO0 = this.f11946OooOOOO;
                if (!zOooOOO) {
                    f = 0.0f;
                    break;
                }
                int size2 = oooOOO0.f37264OooO0OO.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        Mask mask = oooOOO0.f37264OooO0OO.get(i4);
                        path.set((Path) ((o00OO0O0.OooO00o) oooOOO0.f37262OooO00o.get(i4)).OooO0o());
                        path.transform(matrix2);
                        int i5 = C0190OooO00o.f11959OooO0O0[mask.f11862OooO00o.ordinal()];
                        if (i5 != i2 && i5 != i3 && ((i5 != 3 && i5 != 4) || !mask.f11865OooO0Oo)) {
                            RectF rectF4 = this.f11942OooOO0O;
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
                    p133o00OO00o.o0ooOOo o0ooooo2 = this.f11935OooO0OO;
                    o0ooooo2.setAlpha(255);
                    OooOOOO.OooO00o oooO00o2 = OooOOOO.f37433OooO00o;
                    canvas.saveLayer(rectF, o0ooooo2);
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    OooOO0(canvas);
                    OooOO0O(canvas, matrix2, iIntValue);
                    com.airbnb.lottie.OooO0OO.OooO00o();
                    if (OooOOO()) {
                        p133o00OO00o.o0ooOOo o0ooooo3 = this.f11936OooO0Oo;
                        canvas.saveLayer(rectF, o0ooooo3);
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        if (Build.VERSION.SDK_INT < 28) {
                            OooOO0(canvas);
                        }
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        int i6 = 0;
                        while (i6 < oooOOO0.f37264OooO0OO.size()) {
                            List<Mask> list = oooOOO0.f37264OooO0OO;
                            Mask mask2 = list.get(i6);
                            ArrayList arrayList = oooOOO0.f37262OooO00o;
                            o00OO0O0.OooO00o oooO00o3 = (o00OO0O0.OooO00o) arrayList.get(i6);
                            o00OO0O0.OooO00o oooO00o4 = (o00OO0O0.OooO00o) oooOOO0.f37263OooO0O0.get(i6);
                            OooOOO0 oooOOO1 = oooOOO0;
                            int i7 = C0190OooO00o.f11959OooO0O0[mask2.f11862OooO00o.ordinal()];
                            if (i7 != 1) {
                                p133o00OO00o.o0ooOOo o0ooooo4 = this.f11938OooO0o0;
                                boolean z2 = mask2.f11865OooO0Oo;
                                if (i7 == 2) {
                                    if (i6 == 0) {
                                        o0ooooo2.setColor(-16777216);
                                        o0ooooo2.setAlpha(255);
                                        canvas.drawRect(rectF, o0ooooo2);
                                    }
                                    if (z2) {
                                        OooOOOO.OooO00o oooO00o5 = OooOOOO.f37433OooO00o;
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
                                            OooOOOO.OooO00o oooO00o6 = OooOOOO.f37433OooO00o;
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
                                    OooOOOO.OooO00o oooO00o7 = OooOOOO.f37433OooO00o;
                                    canvas.saveLayer(rectF, o0ooooo3);
                                    com.airbnb.lottie.OooO0OO.OooO00o();
                                    canvas.drawRect(rectF, o0ooooo2);
                                    o0ooooo4.setAlpha((int) (((Integer) oooO00o4.OooO0o()).intValue() * 2.55f));
                                    path.set((Path) oooO00o3.OooO0o());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, o0ooooo4);
                                    canvas.restore();
                                } else {
                                    OooOOOO.OooO00o oooO00o8 = OooOOOO.f37433OooO00o;
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
                                        if (list.get(i8).f11862OooO00o != Mask.MaskMode.MASK_MODE_NONE) {
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
                    if (this.f11949OooOOo0 != null) {
                        canvas.saveLayer(rectF, this.f11937OooO0o);
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        OooOO0(canvas);
                        this.f11949OooOOo0.OooO0oo(canvas, matrix, iIntValue);
                        canvas.restore();
                        com.airbnb.lottie.OooO0OO.OooO00o();
                        com.airbnb.lottie.OooO0OO.OooO00o();
                    }
                    canvas.restore();
                    com.airbnb.lottie.OooO0OO.OooO00o();
                }
                if (this.f11955OooOo0o && (o0ooooo = this.f11951OooOo) != null) {
                    o0ooooo.setStyle(Paint.Style.STROKE);
                    this.f11951OooOo.setColor(-251901);
                    this.f11951OooOo.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF, this.f11951OooOo);
                    this.f11951OooOo.setStyle(Paint.Style.FILL);
                    this.f11951OooOo.setColor(1357638635);
                    canvas.drawRect(rectF, this.f11951OooOo);
                }
                com.airbnb.lottie.OooO0OO.OooO00o();
                OooOOOO();
                return;
            }
        }
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    public final void OooOO0(Canvas canvas) {
        RectF rectF = this.f11940OooO0oo;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f11939OooO0oO);
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    public abstract void OooOO0O(Canvas canvas, Matrix matrix, int i);

    @Nullable
    public p136o00OO0oO.OooO0OO OooOO0o() {
        return this.f11944OooOOO.f11931OooOo0o;
    }

    public final boolean OooOOO() {
        OooOOO0 oooOOO0 = this.f11946OooOOOO;
        return (oooOOO0 == null || oooOOO0.f37262OooO00o.isEmpty()) ? false : true;
    }

    @Nullable
    public o00OO.OooOOOO OooOOO0() {
        return this.f11944OooOOO.f11927OooOo;
    }

    public final void OooOOOO() {
        com.airbnb.lottie.o0ooOOo o0ooooo = this.f11945OooOOO0.f11763OooO0o0.f11813OooO00o;
        String str = this.f11944OooOOO.f11911OooO0OO;
        if (o0ooooo.f12018OooO00o) {
            HashMap map = o0ooooo.f12020OooO0OO;
            o00OOO0.OooOOO0 oooOOO0 = (o00OOO0.OooOOO0) map.get(str);
            if (oooOOO0 == null) {
                oooOOO0 = new o00OOO0.OooOOO0();
                map.put(str, oooOOO0);
            }
            int i = oooOOO0.f37432OooO00o + 1;
            oooOOO0.f37432OooO00o = i;
            if (i == Integer.MAX_VALUE) {
                oooOOO0.f37432OooO00o = i / 2;
            }
            if (str.equals("__container")) {
                OooOO0O oooOO0O = o0ooooo.f12019OooO0O0;
                oooOO0O.getClass();
                OooOO0O.OooO00o oooO00o = new OooOO0O.OooO00o();
                while (oooO00o.hasNext()) {
                    ((com.airbnb.lottie.o0ooOOo.OooO00o) oooO00o.next()).OooO00o();
                }
            }
        }
    }

    public final void OooOOOo(o00OO0O0.OooO00o<?, ?> oooO00o) {
        this.f11953OooOo00.remove(oooO00o);
    }

    public void OooOOo(boolean z) {
        if (z && this.f11951OooOo == null) {
            this.f11951OooOo = new p133o00OO00o.o0ooOOo();
        }
        this.f11955OooOo0o = z;
    }

    public void OooOOo0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
    }

    public void OooOOoo(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        o0OoOo0 o0oooo1 = this.f11952OooOo0;
        o00OO0O0.OooO00o<Integer, Integer> oooO00o = o0oooo1.f37289OooOO0;
        if (oooO00o != null) {
            oooO00o.OooOO0(f);
        }
        o00OO0O0.OooO00o<?, Float> oooO00o2 = o0oooo1.f37293OooOOO0;
        if (oooO00o2 != null) {
            oooO00o2.OooOO0(f);
        }
        o00OO0O0.OooO00o<?, Float> oooO00o3 = o0oooo1.f37292OooOOO;
        if (oooO00o3 != null) {
            oooO00o3.OooOO0(f);
        }
        o00OO0O0.OooO00o<PointF, PointF> oooO00o4 = o0oooo1.f37285OooO0o;
        if (oooO00o4 != null) {
            oooO00o4.OooOO0(f);
        }
        o00OO0O0.OooO00o<?, PointF> oooO00o5 = o0oooo1.f37287OooO0oO;
        if (oooO00o5 != null) {
            oooO00o5.OooOO0(f);
        }
        o00OO0O0.OooO00o<o00OOO0O.OooO0o, o00OOO0O.OooO0o> oooO00o6 = o0oooo1.f37288OooO0oo;
        if (oooO00o6 != null) {
            oooO00o6.OooOO0(f);
        }
        o00OO0O0.OooO00o<Float, Float> oooO00o7 = o0oooo1.f37280OooO;
        if (oooO00o7 != null) {
            oooO00o7.OooOO0(f);
        }
        OooO0o oooO0o = o0oooo1.f37290OooOO0O;
        if (oooO0o != null) {
            oooO0o.OooOO0(f);
        }
        OooO0o oooO0o2 = o0oooo1.f37291OooOO0o;
        if (oooO0o2 != null) {
            oooO0o2.OooOO0(f);
        }
        int i = 0;
        OooOOO0 oooOOO0 = this.f11946OooOOOO;
        if (oooOOO0 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = oooOOO0.f37262OooO00o;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((o00OO0O0.OooO00o) arrayList.get(i2)).OooOO0(f);
                i2++;
            }
        }
        OooO0o oooO0o3 = this.f11947OooOOOo;
        if (oooO0o3 != null) {
            oooO0o3.OooOO0(f);
        }
        OooO00o oooO00o8 = this.f11949OooOOo0;
        if (oooO00o8 != null) {
            oooO00o8.OooOOoo(f);
        }
        while (true) {
            ArrayList arrayList2 = this.f11953OooOo00;
            if (i >= arrayList2.size()) {
                return;
            }
            ((o00OO0O0.OooO00o) arrayList2.get(i)).OooOO0(f);
            i++;
        }
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f11944OooOOO.f11911OooO0OO;
    }
}
