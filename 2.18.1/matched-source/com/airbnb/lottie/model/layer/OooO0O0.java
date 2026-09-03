package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.OooO0o;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import p021OooOooo.o00Ooo;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.o0OOO0o;
import p126o00O0o0o.o0000O;
import p126o00O0o0o.o0000O0;
import p126o00O0o0o.o0000O0O;
import p126o00O0o0o.o0000oo;
import p126o00O0o0o.o000OO;
import p129o00O0oOo.o000O0Oo;
import p129o00O0oOo.o000Oo0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends com.airbnb.lottie.model.layer.OooO00o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final List<com.airbnb.lottie.model.layer.OooO00o> f10192OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f10193OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f10194OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final RectF f10195OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Paint f10196Oooo000;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f10197OooO00o;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f10197OooO00o = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10197OooO00o[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    public OooO0O0(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, com.airbnb.lottie.OooOO0O oooOO0O) {
        com.airbnb.lottie.model.layer.OooO00o oooO00o;
        com.airbnb.lottie.model.layer.OooO00o o0000o0o2;
        super(lottieDrawable, layer);
        this.f10192OooOoo = new ArrayList();
        this.f10194OooOooO = new RectF();
        this.f10195OooOooo = new RectF();
        this.f10196Oooo000 = new Paint();
        p123o00O0o0.OooOO0O oooOO0O2 = layer.f10157OooOOoo;
        if (oooOO0O2 != null) {
            OooOO0O<Float, Float> oooOO0OOooO00o = oooOO0O2.OooO00o();
            this.f10193OooOoo0 = oooOO0OOooO00o;
            OooO0oO(oooOO0OOooO00o);
            this.f10193OooOoo0.OooO00o(this);
        } else {
            this.f10193OooOoo0 = null;
        }
        o00Ooo o00ooo2 = new o00Ooo(oooOO0O.f10040OooO.size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.OooO00o oooO00o2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < o00ooo2.OooOOO(); i++) {
                    com.airbnb.lottie.model.layer.OooO00o oooO00o3 = (com.airbnb.lottie.model.layer.OooO00o) o00ooo2.OooO(o00ooo2.OooOO0O(i), null);
                    if (oooO00o3 != null && (oooO00o = (com.airbnb.lottie.model.layer.OooO00o) o00ooo2.OooO(oooO00o3.f10177OooOOOO.f10144OooO0o, null)) != null) {
                        oooO00o3.f10181OooOOoo = oooO00o;
                    }
                }
                return;
            }
            Layer layer2 = list.get(size);
            switch (com.airbnb.lottie.model.layer.OooO00o.C0073OooO00o.f10190OooO00o[layer2.f10145OooO0o0.ordinal()]) {
                case 1:
                    o0000o0o2 = new o0000O0O(lottieDrawable, layer2, this);
                    break;
                case 2:
                    o0000o0o2 = new OooO0O0(lottieDrawable, layer2, oooOO0O.f10043OooO0OO.get(layer2.f10146OooO0oO), oooOO0O);
                    break;
                case 3:
                    o0000o0o2 = new o000OO(lottieDrawable, layer2);
                    break;
                case 4:
                    o0000o0o2 = new o0000oo(lottieDrawable, layer2);
                    break;
                case 5:
                    o0000o0o2 = new o0000O0(lottieDrawable, layer2);
                    break;
                case 6:
                    o0000o0o2 = new o0000O(lottieDrawable, layer2);
                    break;
                default:
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown layer type ");
                    sbOooO0o0.append(layer2.f10145OooO0o0);
                    o000Oo0.OooO0OO(sbOooO0o0.toString());
                    o0000o0o2 = null;
                    break;
            }
            if (o0000o0o2 != null) {
                o00ooo2.OooOO0o(o0000o0o2.f10177OooOOOO.f10143OooO0Oo, o0000o0o2);
                if (oooO00o2 != null) {
                    oooO00o2.f10179OooOOo = o0000o0o2;
                    oooO00o2 = null;
                } else {
                    this.f10192OooOoo.add(0, o0000o0o2);
                    int i2 = OooO00o.f10197OooO00o[layer2.f10159OooOo0.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        oooO00o2 = o0000o0o2;
                    }
                }
            }
            size--;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    @Override // com.airbnb.lottie.model.layer.OooO00o, p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        for (int size = this.f10192OooOoo.size() - 1; size >= 0; size--) {
            this.f10194OooOooO.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            ((com.airbnb.lottie.model.layer.OooO00o) this.f10192OooOoo.get(size)).OooO0o(this.f10194OooOooO, this.f10176OooOOO0, true);
            rectF.union(this.f10194OooOooO);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        super.OooO0o0(t, o000000o2);
        if (t == o000oOoO.f10228OooOooo) {
            if (o000000o2 == null) {
                OooOO0O<Float, Float> oooOO0O = this.f10193OooOoo0;
                if (oooOO0O != null) {
                    oooOO0O.OooOO0O(null);
                    return;
                }
                return;
            }
            o0OOO0o o0ooo0o2 = new o0OOO0o(o000000o2, null);
            this.f10193OooOoo0 = o0ooo0o2;
            o0ooo0o2.OooO00o(this);
            OooO0oO(this.f10193OooOoo0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f10195OooOooo;
        Layer layer = this.f10177OooOOOO;
        rectF.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, layer.f10153OooOOOO, layer.f10154OooOOOo);
        matrix.mapRect(this.f10195OooOooo);
        boolean z = this.f10175OooOOO.f10000OooooOO && this.f10192OooOoo.size() > 1 && i != 255;
        if (z) {
            this.f10196Oooo000.setAlpha(i);
            o000O0Oo.OooO0o(canvas, this.f10195OooOooo, this.f10196Oooo000, 31);
        } else {
            canvas.save();
        }
        if (z) {
            i = KotlinVersion.MAX_COMPONENT_VALUE;
        }
        for (int size = this.f10192OooOoo.size() - 1; size >= 0; size--) {
            if (!this.f10195OooOooo.isEmpty() ? canvas.clipRect(this.f10195OooOooo) : true) {
                ((com.airbnb.lottie.model.layer.OooO00o) this.f10192OooOoo.get(size)).OooO0oo(canvas, matrix, i);
            }
        }
        canvas.restore();
        OooO0o.OooO00o();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOoo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        for (int i2 = 0; i2 < this.f10192OooOoo.size(); i2++) {
            ((com.airbnb.lottie.model.layer.OooO00o) this.f10192OooOoo.get(i2)).OooO0Oo(o00o0ooo2, i, list, o00o0ooo3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOo0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.OooOo0(f);
        OooOO0O<Float, Float> oooOO0O = this.f10193OooOoo0;
        if (oooOO0O != null) {
            com.airbnb.lottie.OooOO0O oooOO0O2 = this.f10175OooOOO.f9985Oooo0oO;
            f = ((oooOO0O.OooO0o().floatValue() * this.f10177OooOOOO.f10141OooO0O0.f10053OooOOO0) - this.f10177OooOOOO.f10141OooO0O0.f10050OooOO0O) / ((oooOO0O2.f10051OooOO0o - oooOO0O2.f10050OooOO0O) + 0.01f);
        }
        if (this.f10193OooOoo0 == null) {
            Layer layer = this.f10177OooOOOO;
            float f2 = layer.f10151OooOOO;
            com.airbnb.lottie.OooOO0O oooOO0O3 = layer.f10141OooO0O0;
            f -= f2 / (oooOO0O3.f10051OooOO0o - oooOO0O3.f10050OooOO0O);
        }
        Layer layer2 = this.f10177OooOOOO;
        if (layer2.f10152OooOOO0 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !"__container".equals(layer2.f10142OooO0OO)) {
            f /= this.f10177OooOOOO.f10152OooOOO0;
        }
        int size = this.f10192OooOoo.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((com.airbnb.lottie.model.layer.OooO00o) this.f10192OooOoo.get(size)).OooOo0(f);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.model.layer.OooO00o>] */
    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOo00(boolean z) {
        if (z && this.f10188OooOoO0 == null) {
            this.f10188OooOoO0 = new oo0oOO0.OooO00o();
        }
        this.f10182OooOo = z;
        Iterator it = this.f10192OooOoo.iterator();
        while (it.hasNext()) {
            ((com.airbnb.lottie.model.layer.OooO00o) it.next()).OooOo00(z);
        }
    }
}
