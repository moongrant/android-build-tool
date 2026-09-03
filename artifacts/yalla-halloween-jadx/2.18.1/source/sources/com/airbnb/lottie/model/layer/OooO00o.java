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
import com.airbnb.lottie.OooO0o;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.o00Ooo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import p021OooOooo.o0OoOo0;
import p058o0000OoO.OooO;
import p118o00O0Oo.OooOO0;
import p118o00O0Oo.OooOOO0;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOOO;
import p120o00O0OoO.Oooo0;
import p120o00O0OoO.o0ooOOo;
import p123o00O0o0.o00O0O;
import p125o00O0o0O.oo0o0Oo;
import p126o00O0o0o.o0000O00;
import p127o00O0oO.o00000O0;
import p129o00O0oOo.o000O00O;
import p129o00O0oOo.o000O0Oo;
import p131o00O0oo0.o00000;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;
import p225o00oOOo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o implements OooOOO0, OooOO0O.OooO00o, oo0oOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RectF f10163OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo0oOO0.OooO00o f10168OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oo0oOO0.OooO00o f10170OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RectF f10171OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final RectF f10172OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final RectF f10173OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final String f10174OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final LottieDrawable f10175OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Matrix f10176OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Layer f10177OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Oooo0 f10178OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public OooO00o f10179OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooOOOO f10180OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooO00o f10181OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f10182OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final List<OooOO0O<?, ?>> f10183OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public List<OooO00o> f10184OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o0ooOOo f10185OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f10186OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f10187OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public oo0oOO0.OooO00o f10188OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public BlurMaskFilter f10189OooOoOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f10164OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f10165OooO0O0 = new Matrix();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo0oOO0.OooO00o f10166OooO0OO = new oo0oOO0.OooO00o(1);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0oOO0.OooO00o f10167OooO0Oo = new oo0oOO0.OooO00o(1, PorterDuff.Mode.DST_IN);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo0oOO0.OooO00o f10169OooO0o0 = new oo0oOO0.OooO00o(1, PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.OooO00o$OooO00o, reason: collision with other inner class name */
    public static /* synthetic */ class C0073OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f10190OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f10191OooO0O0;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f10191OooO0O0 = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10191OooO0O0[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10191OooO0O0[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10191OooO0O0[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f10190OooO00o = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10190OooO00o[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10190OooO00o[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10190OooO00o[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10190OooO00o[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10190OooO00o[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10190OooO00o[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<o00O0o0O.o00000O, android.graphics.Path>>] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<java.lang.Integer, java.lang.Integer>>] */
    public OooO00o(LottieDrawable lottieDrawable, Layer layer) {
        oo0oOO0.OooO00o oooO00o = new oo0oOO0.OooO00o(1);
        this.f10168OooO0o = oooO00o;
        this.f10170OooO0oO = new oo0oOO0.OooO00o(PorterDuff.Mode.CLEAR);
        this.f10171OooO0oo = new RectF();
        this.f10163OooO = new RectF();
        this.f10172OooOO0 = new RectF();
        this.f10173OooOO0O = new RectF();
        this.f10176OooOOO0 = new Matrix();
        this.f10183OooOo0 = new ArrayList();
        this.f10186OooOo0o = true;
        this.f10187OooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f10175OooOOO = lottieDrawable;
        this.f10177OooOOOO = layer;
        this.f10174OooOO0o = OooO.OooO00o(new StringBuilder(), layer.f10142OooO0OO, "#draw");
        if (layer.f10159OooOo0 == Layer.MatteType.INVERT) {
            oooO00o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            oooO00o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        o00O0O o00o0o2 = layer.f10139OooO;
        Objects.requireNonNull(o00o0o2);
        o0ooOOo o0ooooo2 = new o0ooOOo(o00o0o2);
        this.f10185OooOo0O = o0ooooo2;
        o0ooooo2.OooO0O0(this);
        List<Mask> list = layer.f10147OooO0oo;
        if (list != null && !list.isEmpty()) {
            Oooo0 oooo0 = new Oooo0(layer.f10147OooO0oo);
            this.f10178OooOOOo = oooo0;
            Iterator it = oooo0.f30788OooO00o.iterator();
            while (it.hasNext()) {
                ((OooOO0O) it.next()).OooO00o(this);
            }
            for (OooOO0O<?, ?> oooOO0O : this.f10178OooOOOo.f30789OooO0O0) {
                OooO0oO(oooOO0O);
                oooOO0O.OooO00o(this);
            }
        }
        if (this.f10177OooOOOO.f10160OooOo00.isEmpty()) {
            OooOo0O(true);
            return;
        }
        OooOOOO oooOOOO = new OooOOOO(this.f10177OooOOOO.f10160OooOo00);
        this.f10180OooOOo0 = oooOOOO;
        oooOOOO.f30766OooO0O0 = true;
        oooOOOO.OooO00o(new o0000O00(this));
        OooOo0O(this.f10180OooOOo0.OooO0o().floatValue() == 1.0f);
        OooO0oO(this.f10180OooOOo0);
    }

    public final void OooO() {
        if (this.f10184OooOo00 != null) {
            return;
        }
        if (this.f10181OooOOoo == null) {
            this.f10184OooOo00 = Collections.emptyList();
            return;
        }
        this.f10184OooOo00 = new ArrayList();
        for (OooO00o oooO00o = this.f10181OooOOoo; oooO00o != null; oooO00o = oooO00o.f10181OooOOoo) {
            this.f10184OooOo00.add(oooO00o);
        }
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f10175OooOOO.invalidateSelf();
    }

    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
    }

    @Override // p225o00oOOo.oo0oOO0
    public final void OooO0Oo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        OooO00o oooO00o = this.f10179OooOOo;
        if (oooO00o != null) {
            o00O0OOO o00o0oooOooO00o = o00o0ooo3.OooO00o(oooO00o.f10177OooOOOO.f10142OooO0OO);
            if (o00o0ooo2.OooO0OO(this.f10179OooOOo.f10177OooOOOO.f10142OooO0OO, i)) {
                list.add(o00o0oooOooO00o.OooO0oO(this.f10179OooOOo));
            }
            if (o00o0ooo2.OooO0o(this.f10177OooOOOO.f10142OooO0OO, i)) {
                this.f10179OooOOo.OooOOoo(o00o0ooo2, o00o0ooo2.OooO0Oo(this.f10179OooOOo.f10177OooOOOO.f10142OooO0OO, i) + i, list, o00o0oooOooO00o);
            }
        }
        if (o00o0ooo2.OooO0o0(this.f10177OooOOOO.f10142OooO0OO, i)) {
            if (!"__container".equals(this.f10177OooOOOO.f10142OooO0OO)) {
                o00o0ooo3 = o00o0ooo3.OooO00o(this.f10177OooOOOO.f10142OooO0OO);
                if (o00o0ooo2.OooO0OO(this.f10177OooOOOO.f10142OooO0OO, i)) {
                    list.add(o00o0ooo3.OooO0oO(this));
                }
            }
            if (o00o0ooo2.OooO0o(this.f10177OooOOOO.f10142OooO0OO, i)) {
                OooOOoo(o00o0ooo2, o00o0ooo2.OooO0Oo(this.f10177OooOOOO.f10142OooO0OO, i) + i, list, o00o0ooo3);
            }
        }
    }

    @Override // p118o00O0Oo.OooOOO0
    @CallSuper
    public void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f10171OooO0oo.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        OooO();
        this.f10176OooOOO0.set(matrix);
        if (z) {
            List<OooO00o> list = this.f10184OooOo00;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.f10176OooOOO0.preConcat(this.f10184OooOo00.get(size).f10185OooOo0O.OooO0o0());
                    }
                }
            } else {
                OooO00o oooO00o = this.f10181OooOOoo;
                if (oooO00o != null) {
                    this.f10176OooOOO0.preConcat(oooO00o.f10185OooOo0O.OooO0o0());
                }
            }
        }
        this.f10176OooOOO0.preConcat(this.f10185OooOo0O.OooO0o0());
    }

    @Override // p225o00oOOo.oo0oOO0
    @CallSuper
    public <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        this.f10185OooOo0O.OooO0OO(t, o000000o2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<?, ?>>] */
    public final void OooO0oO(@Nullable OooOO0O<?, ?> oooOO0O) {
        if (oooOO0O == null) {
            return;
        }
        this.f10183OooOo0.add(oooOO0O);
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<o00O0o0O.o00000O, android.graphics.Path>>] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<java.lang.Integer, java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<o00O0o0O.o00000O, android.graphics.Path>>] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<o00O0o0O.o00000O, android.graphics.Path>>] */
    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        float f;
        oo0oOO0.OooO00o oooO00o;
        boolean z;
        if (!this.f10186OooOo0o || this.f10177OooOOOO.f10161OooOo0O) {
            OooO0o.OooO00o();
            return;
        }
        OooO();
        this.f10165OooO0O0.reset();
        this.f10165OooO0O0.set(matrix);
        int i2 = 1;
        for (int size = this.f10184OooOo00.size() - 1; size >= 0; size--) {
            this.f10165OooO0O0.preConcat(this.f10184OooOo00.get(size).f10185OooOo0O.OooO0o0());
        }
        OooO0o.OooO00o();
        OooOO0O<Integer, Integer> oooOO0O = this.f10185OooOo0O.f30811OooOO0;
        int iIntValue = (int) ((((i / 255.0f) * (oooOO0O == null ? 100 : oooOO0O.OooO0o().intValue())) / 100.0f) * 255.0f);
        if (!OooOOOo() && !OooOOOO()) {
            this.f10165OooO0O0.preConcat(this.f10185OooOo0O.OooO0o0());
            OooOO0O(canvas, this.f10165OooO0O0, iIntValue);
            OooO0o.OooO00o();
            OooO0o.OooO00o();
            OooOOo0();
            return;
        }
        boolean z2 = false;
        OooO0o(this.f10171OooO0oo, this.f10165OooO0O0, false);
        RectF rectF = this.f10171OooO0oo;
        if (OooOOOo() && this.f10177OooOOOO.f10159OooOo0 != Layer.MatteType.INVERT) {
            this.f10172OooOO0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f10179OooOOo.OooO0o(this.f10172OooOO0, matrix, true);
            if (!rectF.intersect(this.f10172OooOO0)) {
                rectF.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
        }
        this.f10165OooO0O0.preConcat(this.f10185OooOo0O.OooO0o0());
        RectF rectF2 = this.f10171OooO0oo;
        Matrix matrix2 = this.f10165OooO0O0;
        this.f10163OooO.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        int i3 = 3;
        int i4 = 4;
        if (!OooOOOO()) {
            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            break;
        }
        int size2 = this.f10178OooOOOo.f30790OooO0OO.size();
        int i5 = 0;
        while (true) {
            if (i5 < size2) {
                Mask mask = this.f10178OooOOOo.f30790OooO0OO.get(i5);
                this.f10164OooO00o.set((Path) ((OooOO0O) this.f10178OooOOOo.f30788OooO00o.get(i5)).OooO0o());
                this.f10164OooO00o.transform(matrix2);
                int i6 = C0073OooO00o.f10191OooO0O0[mask.f10091OooO00o.ordinal()];
                if (i6 != 1 && i6 != 2 && ((i6 != i3 && i6 != i4) || !mask.f10094OooO0Oo)) {
                    this.f10164OooO00o.computeBounds(this.f10173OooOO0O, z2);
                    if (i5 == 0) {
                        this.f10163OooO.set(this.f10173OooOO0O);
                    } else {
                        RectF rectF3 = this.f10163OooO;
                        rectF3.set(Math.min(rectF3.left, this.f10173OooOO0O.left), Math.min(this.f10163OooO.top, this.f10173OooOO0O.top), Math.max(this.f10163OooO.right, this.f10173OooOO0O.right), Math.max(this.f10163OooO.bottom, this.f10173OooOO0O.bottom));
                    }
                    i5++;
                    z2 = false;
                    i3 = 3;
                    i4 = 4;
                }
            } else if (!rectF2.intersect(this.f10163OooO)) {
                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                rectF2.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                break;
            }
            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            break;
        }
        if (!this.f10171OooO0oo.intersect(f, f, canvas.getWidth(), canvas.getHeight())) {
            this.f10171OooO0oo.set(f, f, f, f);
        }
        OooO0o.OooO00o();
        if (this.f10171OooO0oo.width() >= 1.0f && this.f10171OooO0oo.height() >= 1.0f) {
            this.f10166OooO0OO.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            o000O0Oo.OooO0o(canvas, this.f10171OooO0oo, this.f10166OooO0OO, 31);
            OooO0o.OooO00o();
            OooOO0(canvas);
            OooOO0O(canvas, this.f10165OooO0O0, iIntValue);
            OooO0o.OooO00o();
            if (OooOOOO()) {
                Matrix matrix3 = this.f10165OooO0O0;
                o000O0Oo.OooO0o(canvas, this.f10171OooO0oo, this.f10167OooO0Oo, 19);
                if (Build.VERSION.SDK_INT < 28) {
                    OooOO0(canvas);
                }
                OooO0o.OooO00o();
                int i7 = 0;
                while (i7 < this.f10178OooOOOo.f30790OooO0OO.size()) {
                    Mask mask2 = this.f10178OooOOOo.f30790OooO0OO.get(i7);
                    OooOO0O oooOO0O2 = (OooOO0O) this.f10178OooOOOo.f30788OooO00o.get(i7);
                    OooOO0O oooOO0O3 = (OooOO0O) this.f10178OooOOOo.f30789OooO0O0.get(i7);
                    int i8 = C0073OooO00o.f10191OooO0O0[mask2.f10091OooO00o.ordinal()];
                    if (i8 == i2) {
                        if (this.f10178OooOOOo.f30788OooO00o.isEmpty()) {
                            z = false;
                            break;
                        }
                        int i9 = 0;
                        while (true) {
                            if (i9 >= this.f10178OooOOOo.f30790OooO0OO.size()) {
                                z = true;
                                break;
                            } else {
                                if (this.f10178OooOOOo.f30790OooO0OO.get(i9).f10091OooO00o != Mask.MaskMode.MASK_MODE_NONE) {
                                    z = false;
                                    break;
                                }
                                i9++;
                            }
                        }
                        if (z) {
                            this.f10166OooO0OO.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                            canvas.drawRect(this.f10171OooO0oo, this.f10166OooO0OO);
                        }
                    } else if (i8 == 2) {
                        if (i7 == 0) {
                            this.f10166OooO0OO.setColor(-16777216);
                            this.f10166OooO0OO.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                            canvas.drawRect(this.f10171OooO0oo, this.f10166OooO0OO);
                        }
                        if (mask2.f10094OooO0Oo) {
                            o000O0Oo.OooO0o(canvas, this.f10171OooO0oo, this.f10169OooO0o0, 31);
                            canvas.drawRect(this.f10171OooO0oo, this.f10166OooO0OO);
                            this.f10169OooO0o0.setAlpha((int) (((Integer) oooOO0O3.OooO0o()).intValue() * 2.55f));
                            this.f10164OooO00o.set((Path) oooOO0O2.OooO0o());
                            this.f10164OooO00o.transform(matrix3);
                            canvas.drawPath(this.f10164OooO00o, this.f10169OooO0o0);
                            canvas.restore();
                        } else {
                            this.f10164OooO00o.set((Path) oooOO0O2.OooO0o());
                            this.f10164OooO00o.transform(matrix3);
                            canvas.drawPath(this.f10164OooO00o, this.f10169OooO0o0);
                        }
                    } else if (i8 != 3) {
                        if (i8 == 4) {
                            if (mask2.f10094OooO0Oo) {
                                o000O0Oo.OooO0o(canvas, this.f10171OooO0oo, this.f10166OooO0OO, 31);
                                canvas.drawRect(this.f10171OooO0oo, this.f10166OooO0OO);
                                this.f10164OooO00o.set((Path) oooOO0O2.OooO0o());
                                this.f10164OooO00o.transform(matrix3);
                                this.f10166OooO0OO.setAlpha((int) (((Integer) oooOO0O3.OooO0o()).intValue() * 2.55f));
                                canvas.drawPath(this.f10164OooO00o, this.f10169OooO0o0);
                                canvas.restore();
                            } else {
                                this.f10164OooO00o.set((Path) oooOO0O2.OooO0o());
                                this.f10164OooO00o.transform(matrix3);
                                this.f10166OooO0OO.setAlpha((int) (((Integer) oooOO0O3.OooO0o()).intValue() * 2.55f));
                                canvas.drawPath(this.f10164OooO00o, this.f10166OooO0OO);
                            }
                        }
                    } else if (mask2.f10094OooO0Oo) {
                        o000O0Oo.OooO0o(canvas, this.f10171OooO0oo, this.f10167OooO0Oo, 31);
                        canvas.drawRect(this.f10171OooO0oo, this.f10166OooO0OO);
                        this.f10169OooO0o0.setAlpha((int) (((Integer) oooOO0O3.OooO0o()).intValue() * 2.55f));
                        this.f10164OooO00o.set((Path) oooOO0O2.OooO0o());
                        this.f10164OooO00o.transform(matrix3);
                        canvas.drawPath(this.f10164OooO00o, this.f10169OooO0o0);
                        canvas.restore();
                    } else {
                        o000O0Oo.OooO0o(canvas, this.f10171OooO0oo, this.f10167OooO0Oo, 31);
                        this.f10164OooO00o.set((Path) oooOO0O2.OooO0o());
                        this.f10164OooO00o.transform(matrix3);
                        this.f10166OooO0OO.setAlpha((int) (((Integer) oooOO0O3.OooO0o()).intValue() * 2.55f));
                        canvas.drawPath(this.f10164OooO00o, this.f10166OooO0OO);
                        canvas.restore();
                    }
                    i7++;
                    i2 = 1;
                }
                canvas.restore();
                OooO0o.OooO00o();
            }
            if (OooOOOo()) {
                o000O0Oo.OooO0o(canvas, this.f10171OooO0oo, this.f10168OooO0o, 19);
                OooO0o.OooO00o();
                OooOO0(canvas);
                this.f10179OooOOo.OooO0oo(canvas, matrix, iIntValue);
                canvas.restore();
                OooO0o.OooO00o();
                OooO0o.OooO00o();
            }
            canvas.restore();
            OooO0o.OooO00o();
        }
        if (this.f10182OooOo && (oooO00o = this.f10188OooOoO0) != null) {
            oooO00o.setStyle(Paint.Style.STROKE);
            this.f10188OooOoO0.setColor(-251901);
            this.f10188OooOoO0.setStrokeWidth(4.0f);
            canvas.drawRect(this.f10171OooO0oo, this.f10188OooOoO0);
            this.f10188OooOoO0.setStyle(Paint.Style.FILL);
            this.f10188OooOoO0.setColor(1357638635);
            canvas.drawRect(this.f10171OooO0oo, this.f10188OooOoO0);
        }
        OooO0o.OooO00o();
        OooOOo0();
    }

    public final void OooOO0(Canvas canvas) {
        RectF rectF = this.f10171OooO0oo;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f10170OooO0oO);
        OooO0o.OooO00o();
    }

    public abstract void OooOO0O(Canvas canvas, Matrix matrix, int i);

    @Nullable
    public oo0o0Oo OooOO0o() {
        return this.f10177OooOOOO.f10162OooOo0o;
    }

    @Nullable
    public o00000O0 OooOOO() {
        return this.f10177OooOOOO.f10158OooOo;
    }

    public final BlurMaskFilter OooOOO0(float f) {
        if (this.f10187OooOoO == f) {
            return this.f10189OooOoOO;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f10189OooOoOO = blurMaskFilter;
        this.f10187OooOoO = f;
        return blurMaskFilter;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<o00O0o0O.o00000O, android.graphics.Path>>] */
    public final boolean OooOOOO() {
        Oooo0 oooo0 = this.f10178OooOOOo;
        return (oooo0 == null || oooo0.f30788OooO00o.isEmpty()) ? false : true;
    }

    public final boolean OooOOOo() {
        return this.f10179OooOOo != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<?, ?>>] */
    public final void OooOOo(OooOO0O<?, ?> oooOO0O) {
        this.f10183OooOo0.remove(oooOO0O);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [OooOooo.o0OoOo0, java.lang.Object, java.util.Set<com.airbnb.lottie.o00Ooo$OooO00o>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o00O0oOo.o000O00O>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, o00O0oOo.o000O00O>] */
    public final void OooOOo0() {
        o00Ooo o00ooo2 = this.f10175OooOOO.f9985Oooo0oO.f10041OooO00o;
        String str = this.f10177OooOOOO.f10142OooO0OO;
        if (o00ooo2.f10245OooO00o) {
            o000O00O o000o00o2 = (o000O00O) o00ooo2.f10247OooO0OO.get(str);
            if (o000o00o2 == null) {
                o000o00o2 = new o000O00O();
                o00ooo2.f10247OooO0OO.put(str, o000o00o2);
            }
            int i = o000o00o2.f31140OooO00o + 1;
            o000o00o2.f31140OooO00o = i;
            if (i == Integer.MAX_VALUE) {
                o000o00o2.f31140OooO00o = i / 2;
            }
            if (str.equals("__container")) {
                ?? r0 = o00ooo2.f10246OooO0O0;
                Objects.requireNonNull(r0);
                o0OoOo0.OooO00o oooO00o = new o0OoOo0.OooO00o();
                while (oooO00o.hasNext()) {
                    ((o00Ooo.OooO00o) oooO00o.next()).OooO00o();
                }
            }
        }
    }

    public void OooOOoo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<?, ?>>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<?, ?>>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<o00O0o0O.o00000O, android.graphics.Path>>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<o00O0o0O.o00000O, android.graphics.Path>>] */
    public void OooOo0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        o0ooOOo o0ooooo2 = this.f10185OooOo0O;
        OooOO0O<Integer, Integer> oooOO0O = o0ooooo2.f30811OooOO0;
        if (oooOO0O != null) {
            oooOO0O.OooOO0(f);
        }
        OooOO0O<?, Float> oooOO0O2 = o0ooooo2.f30815OooOOO0;
        if (oooOO0O2 != null) {
            oooOO0O2.OooOO0(f);
        }
        OooOO0O<?, Float> oooOO0O3 = o0ooooo2.f30814OooOOO;
        if (oooOO0O3 != null) {
            oooOO0O3.OooOO0(f);
        }
        OooOO0O<PointF, PointF> oooOO0O4 = o0ooooo2.f30807OooO0o;
        if (oooOO0O4 != null) {
            oooOO0O4.OooOO0(f);
        }
        OooOO0O<?, PointF> oooOO0O5 = o0ooooo2.f30809OooO0oO;
        if (oooOO0O5 != null) {
            oooOO0O5.OooOO0(f);
        }
        OooOO0O<o00000, o00000> oooOO0O6 = o0ooooo2.f30810OooO0oo;
        if (oooOO0O6 != null) {
            oooOO0O6.OooOO0(f);
        }
        OooOO0O<Float, Float> oooOO0O7 = o0ooooo2.f30802OooO;
        if (oooOO0O7 != null) {
            oooOO0O7.OooOO0(f);
        }
        OooOOOO oooOOOO = o0ooooo2.f30812OooOO0O;
        if (oooOOOO != null) {
            oooOOOO.OooOO0(f);
        }
        OooOOOO oooOOOO2 = o0ooooo2.f30813OooOO0o;
        if (oooOOOO2 != null) {
            oooOOOO2.OooOO0(f);
        }
        if (this.f10178OooOOOo != null) {
            for (int i = 0; i < this.f10178OooOOOo.f30788OooO00o.size(); i++) {
                ((OooOO0O) this.f10178OooOOOo.f30788OooO00o.get(i)).OooOO0(f);
            }
        }
        OooOOOO oooOOOO3 = this.f10180OooOOo0;
        if (oooOOOO3 != null) {
            oooOOOO3.OooOO0(f);
        }
        OooO00o oooO00o = this.f10179OooOOo;
        if (oooO00o != null) {
            oooO00o.OooOo0(f);
        }
        for (int i2 = 0; i2 < this.f10183OooOo0.size(); i2++) {
            ((OooOO0O) this.f10183OooOo0.get(i2)).OooOO0(f);
        }
    }

    public void OooOo00(boolean z) {
        if (z && this.f10188OooOoO0 == null) {
            this.f10188OooOoO0 = new oo0oOO0.OooO00o();
        }
        this.f10182OooOo = z;
    }

    public final void OooOo0O(boolean z) {
        if (z != this.f10186OooOo0o) {
            this.f10186OooOo0o = z;
            this.f10175OooOOO.invalidateSelf();
        }
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f10177OooOOOO.f10142OooO0OO;
    }
}
