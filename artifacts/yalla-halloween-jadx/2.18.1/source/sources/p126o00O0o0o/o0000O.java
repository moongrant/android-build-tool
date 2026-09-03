package p126o00O0o0o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import p021OooOooo.o00Ooo;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOO0;
import p120o00O0OoO.OooOOOO;
import p120o00O0OoO.o00oO0o;
import p120o00O0OoO.o0OOO0o;
import p123o00O0o0.OooOO0;
import p123o00O0o0.o0OoOo0;
import p124o00O0o00.OooO0o;
import p125o00O0o0O.o0000Ooo;
import p129o00O0oOo.o000O0Oo;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OO;
import p225o00oOOo.o00OO00O;
import p225o00oOOo.oo0o0O0;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O extends com.airbnb.lottie.model.layer.OooO00o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RectF f31028OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final StringBuilder f31029OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Matrix f31030OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO00o f31031OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f31032Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final o00oO0o f31033Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO0O0 f31034Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Map<o00O0OO, List<p118o00O0Oo.OooOO0O>> f31035Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final o00Ooo<String> f31036Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final LottieDrawable f31037Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final com.airbnb.lottie.OooOO0O f31038Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public OooOO0O<Integer, Integer> f31039Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public OooOO0O<Integer, Integer> f31040Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public OooOO0O<Integer, Integer> f31041Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public OooOO0O<Integer, Integer> f31042Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f31043OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f31044OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f31045OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public OooOO0O<Float, Float> f31046OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public OooOO0O<Typeface, Typeface> f31047OoooOO0;

    public class OooO00o extends Paint {
        public OooO00o() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    public class OooO0O0 extends Paint {
        public OooO0O0() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f31048OooO00o;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f31048OooO00o = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31048OooO00o[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31048OooO00o[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o0000O(LottieDrawable lottieDrawable, Layer layer) {
        p123o00O0o0.OooOO0O oooOO0O;
        p123o00O0o0.OooOO0O oooOO0O2;
        OooOO0 oooOO1;
        OooOO0 oooOO2;
        super(lottieDrawable, layer);
        this.f31029OooOoo0 = new StringBuilder(2);
        this.f31028OooOoo = new RectF();
        this.f31030OooOooO = new Matrix();
        this.f31031OooOooo = new OooO00o();
        this.f31034Oooo000 = new OooO0O0();
        this.f31035Oooo00O = new HashMap();
        this.f31036Oooo00o = new o00Ooo<>();
        this.f31037Oooo0O0 = lottieDrawable;
        this.f31038Oooo0OO = layer.f10141OooO0O0;
        o00oO0o o00oo0o2 = new o00oO0o(layer.f10156OooOOo0.f30971OooO00o);
        this.f31033Oooo0 = o00oo0o2;
        o00oo0o2.OooO00o(this);
        OooO0oO(o00oo0o2);
        o0OoOo0 o0oooo1 = layer.f10155OooOOo;
        if (o0oooo1 != null && (oooOO2 = o0oooo1.f30972OooO00o) != null) {
            OooOO0O<Integer, Integer> oooOO0OOooO00o = oooOO2.OooO00o();
            this.f31040Oooo0o0 = (OooOOO0) oooOO0OOooO00o;
            oooOO0OOooO00o.OooO00o(this);
            OooO0oO(this.f31040Oooo0o0);
        }
        if (o0oooo1 != null && (oooOO1 = o0oooo1.f30973OooO0O0) != null) {
            OooOO0O<Integer, Integer> oooOO0OOooO00o2 = oooOO1.OooO00o();
            this.f31041Oooo0oO = (OooOOO0) oooOO0OOooO00o2;
            oooOO0OOooO00o2.OooO00o(this);
            OooO0oO(this.f31041Oooo0oO);
        }
        if (o0oooo1 != null && (oooOO0O2 = o0oooo1.f30974OooO0OO) != null) {
            OooOO0O<Float, Float> oooOO0OOooO00o3 = oooOO0O2.OooO00o();
            this.f31032Oooo = (OooOOOO) oooOO0OOooO00o3;
            oooOO0OOooO00o3.OooO00o(this);
            OooO0oO(this.f31032Oooo);
        }
        if (o0oooo1 == null || (oooOO0O = o0oooo1.f30975OooO0Oo) == null) {
            return;
        }
        OooOO0O<Float, Float> oooOO0OOooO00o4 = oooOO0O.OooO00o();
        this.f31044OoooO0 = (OooOOOO) oooOO0OOooO00o4;
        oooOO0OOooO00o4.OooO00o(this);
        OooO0oO(this.f31044OoooO0);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        rectF.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f31038Oooo0OO.f10049OooOO0.width(), this.f31038Oooo0OO.f10049OooOO0.height());
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        super.OooO0o0(t, o000000o2);
        if (t == o000oOoO.f10199OooO00o) {
            OooOO0O<Integer, Integer> oooOO0O = this.f31039Oooo0o;
            if (oooOO0O != null) {
                OooOOo(oooOO0O);
            }
            if (o000000o2 == null) {
                this.f31039Oooo0o = null;
                return;
            }
            o0OOO0o o0ooo0o2 = new o0OOO0o(o000000o2, null);
            this.f31039Oooo0o = o0ooo0o2;
            o0ooo0o2.OooO00o(this);
            OooO0oO(this.f31039Oooo0o);
            return;
        }
        if (t == o000oOoO.f10200OooO0O0) {
            OooOO0O<Integer, Integer> oooOO0O2 = this.f31042Oooo0oo;
            if (oooOO0O2 != null) {
                OooOOo(oooOO0O2);
            }
            if (o000000o2 == null) {
                this.f31042Oooo0oo = null;
                return;
            }
            o0OOO0o o0ooo0o3 = new o0OOO0o(o000000o2, null);
            this.f31042Oooo0oo = o0ooo0o3;
            o0ooo0o3.OooO00o(this);
            OooO0oO(this.f31042Oooo0oo);
            return;
        }
        if (t == o000oOoO.f10216OooOOoo) {
            OooOO0O<Float, Float> oooOO0O3 = this.f31045OoooO00;
            if (oooOO0O3 != null) {
                OooOOo(oooOO0O3);
            }
            if (o000000o2 == null) {
                this.f31045OoooO00 = null;
                return;
            }
            o0OOO0o o0ooo0o4 = new o0OOO0o(o000000o2, null);
            this.f31045OoooO00 = o0ooo0o4;
            o0ooo0o4.OooO00o(this);
            OooO0oO(this.f31045OoooO00);
            return;
        }
        if (t == o000oOoO.f10219OooOo00) {
            OooOO0O<Float, Float> oooOO0O4 = this.f31046OoooO0O;
            if (oooOO0O4 != null) {
                OooOOo(oooOO0O4);
            }
            if (o000000o2 == null) {
                this.f31046OoooO0O = null;
                return;
            }
            o0OOO0o o0ooo0o5 = new o0OOO0o(o000000o2, null);
            this.f31046OoooO0O = o0ooo0o5;
            o0ooo0o5.OooO00o(this);
            OooO0oO(this.f31046OoooO0O);
            return;
        }
        if (t == o000oOoO.f10230Oooo000) {
            OooOO0O<Float, Float> oooOO0O5 = this.f31043OoooO;
            if (oooOO0O5 != null) {
                OooOOo(oooOO0O5);
            }
            if (o000000o2 == null) {
                this.f31043OoooO = null;
                return;
            }
            o0OOO0o o0ooo0o6 = new o0OOO0o(o000000o2, null);
            this.f31043OoooO = o0ooo0o6;
            o0ooo0o6.OooO00o(this);
            OooO0oO(this.f31043OoooO);
            return;
        }
        if (t == o000oOoO.f10235Oooo0o) {
            OooOO0O<Typeface, Typeface> oooOO0O6 = this.f31047OoooOO0;
            if (oooOO0O6 != null) {
                OooOOo(oooOO0O6);
            }
            if (o000000o2 == null) {
                this.f31047OoooOO0 = null;
                return;
            }
            o0OOO0o o0ooo0o7 = new o0OOO0o(o000000o2, null);
            this.f31047OoooOO0 = o0ooo0o7;
            o0ooo0o7.OooO00o(this);
            OooO0oO(this.f31047OoooOO0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:145:0x0414  */
    /* JADX WARN: Code duplicated, block: B:148:0x0423  */
    /* JADX WARN: Code duplicated, block: B:160:0x0451  */
    /* JADX WARN: Code duplicated, block: B:163:0x0455 A[LOOP:7: B:146:0x041d->B:163:0x0455, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x0467  */
    /* JADX WARN: Code duplicated, block: B:167:0x0471  */
    /* JADX WARN: Code duplicated, block: B:169:0x047a A[LOOP:8: B:168:0x0478->B:169:0x047a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x049d  */
    /* JADX WARN: Code duplicated, block: B:174:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:194:0x045e A[EDGE_INSN: B:194:0x045e->B:164:0x045e BREAK  A[LOOP:7: B:146:0x041d->B:163:0x0455], SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(Canvas canvas, Matrix matrix, int i) {
        OooO0o oooO0o;
        Typeface typefaceOooO0o;
        int i2;
        float fFloatValue;
        float fOooO0OO;
        List<String> listOooOoO;
        int size;
        int i3;
        String str;
        int length;
        int iCodePointAt;
        int iCharCount;
        long j;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        boolean z;
        int i4;
        String str2;
        List<p118o00O0Oo.OooOO0O> list;
        float fFloatValue2;
        canvas.save();
        int i5 = 1;
        if (!(this.f31037Oooo0O0.f9985Oooo0oO.f10047OooO0oO.OooOO0o() > 0)) {
            canvas.concat(matrix);
        }
        DocumentData documentDataOooO0o = this.f31033Oooo0.OooO0o();
        oo0o0O0 oo0o0o0 = this.f31038Oooo0OO.f10046OooO0o0.get(documentDataOooO0o.f10082OooO0O0);
        if (oo0o0o0 == null) {
            canvas.restore();
            return;
        }
        OooOO0O<Integer, Integer> oooOO0O = this.f31039Oooo0o;
        if (oooOO0O != null) {
            this.f31031OooOooo.setColor(oooOO0O.OooO0o().intValue());
        } else {
            OooOO0O<Integer, Integer> oooOO0O2 = this.f31040Oooo0o0;
            if (oooOO0O2 != null) {
                this.f31031OooOooo.setColor(oooOO0O2.OooO0o().intValue());
            } else {
                this.f31031OooOooo.setColor(documentDataOooO0o.f10088OooO0oo);
            }
        }
        OooOO0O<Integer, Integer> oooOO0O3 = this.f31042Oooo0oo;
        if (oooOO0O3 != null) {
            this.f31034Oooo000.setColor(oooOO0O3.OooO0o().intValue());
        } else {
            OooOO0O<Integer, Integer> oooOO0O4 = this.f31041Oooo0oO;
            if (oooOO0O4 != null) {
                this.f31034Oooo000.setColor(oooOO0O4.OooO0o().intValue());
            } else {
                this.f31034Oooo000.setColor(documentDataOooO0o.f10080OooO);
            }
        }
        OooOO0O<Integer, Integer> oooOO0O5 = this.f10185OooOo0O.f30811OooOO0;
        int iIntValue = ((oooOO0O5 == null ? 100 : oooOO0O5.OooO0o().intValue()) * KotlinVersion.MAX_COMPONENT_VALUE) / 100;
        this.f31031OooOooo.setAlpha(iIntValue);
        this.f31034Oooo000.setAlpha(iIntValue);
        OooOO0O<Float, Float> oooOO0O6 = this.f31045OoooO00;
        if (oooOO0O6 != null) {
            this.f31034Oooo000.setStrokeWidth(oooOO0O6.OooO0o().floatValue());
        } else {
            OooOO0O<Float, Float> oooOO0O7 = this.f31032Oooo;
            if (oooOO0O7 != null) {
                this.f31034Oooo000.setStrokeWidth(oooOO0O7.OooO0o().floatValue());
            } else {
                this.f31034Oooo000.setStrokeWidth(o000O0Oo.OooO0OO() * documentDataOooO0o.f10089OooOO0 * o000O0Oo.OooO0Oo(matrix));
            }
        }
        if (this.f31037Oooo0O0.f9985Oooo0oO.f10047OooO0oO.OooOO0o() > 0) {
            OooOO0O<Float, Float> oooOO0O8 = this.f31043OoooO;
            float fFloatValue3 = (oooOO0O8 != null ? oooOO0O8.OooO0o().floatValue() : documentDataOooO0o.f10083OooO0OO) / 100.0f;
            float fOooO0Oo = o000O0Oo.OooO0Oo(matrix);
            String str3 = documentDataOooO0o.f10081OooO00o;
            float fOooO0OO2 = o000O0Oo.OooO0OO() * documentDataOooO0o.f10085OooO0o;
            List<String> listOooOoO2 = OooOoO(str3);
            int size2 = listOooOoO2.size();
            int i6 = 0;
            while (i6 < size2) {
                String str4 = listOooOoO2.get(i6);
                float fOooO0OO3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                int i7 = 0;
                while (i7 < str4.length()) {
                    o00O0OO o00o0ooOooO0oO = this.f31038Oooo0OO.f10047OooO0oO.OooO0oO(o00O0OO.OooO00o(str4.charAt(i7), oo0o0o0.f33872OooO00o, oo0o0o0.f33873OooO0O0), null);
                    if (o00o0ooOooO0oO != null) {
                        fOooO0OO3 = (float) ((o00o0ooOooO0oO.f33858OooO0OO * ((double) fFloatValue3) * ((double) o000O0Oo.OooO0OO()) * ((double) fOooO0Oo)) + ((double) fOooO0OO3));
                    }
                    i7++;
                    str4 = str4;
                    fOooO0OO2 = fOooO0OO2;
                    i6 = i6;
                }
                float f = fOooO0OO2;
                int i8 = i6;
                String str5 = str4;
                canvas.save();
                OooOo0o(documentDataOooO0o.f10084OooO0Oo, canvas, fOooO0OO3);
                canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (i8 * f) - (((size2 - 1) * f) / 2.0f));
                int i9 = 0;
                while (i9 < str5.length()) {
                    String str6 = str5;
                    o00O0OO o00o0ooOooO0oO2 = this.f31038Oooo0OO.f10047OooO0oO.OooO0oO(o00O0OO.OooO00o(str6.charAt(i9), oo0o0o0.f33872OooO00o, oo0o0o0.f33873OooO0O0), null);
                    if (o00o0ooOooO0oO2 == null) {
                        listOooOoO2 = listOooOoO2;
                        i4 = size2;
                        str2 = str6;
                    } else {
                        if (this.f31035Oooo00O.containsKey(o00o0ooOooO0oO2)) {
                            list = this.f31035Oooo00O.get(o00o0ooOooO0oO2);
                            i4 = size2;
                            str2 = str6;
                        } else {
                            List<o0000Ooo> list2 = o00o0ooOooO0oO2.f33856OooO00o;
                            int size3 = list2.size();
                            ArrayList arrayList = new ArrayList(size3);
                            int i10 = 0;
                            while (i10 < size3) {
                                arrayList.add(new p118o00O0Oo.OooOO0O(this.f31037Oooo0O0, this, list2.get(i10)));
                                i10++;
                                str6 = str6;
                                size2 = size2;
                                list2 = list2;
                            }
                            i4 = size2;
                            str2 = str6;
                            this.f31035Oooo00O.put(o00o0ooOooO0oO2, arrayList);
                            list = arrayList;
                        }
                        int i11 = 0;
                        while (i11 < list.size()) {
                            Path pathOooO00o = list.get(i11).OooO00o();
                            pathOooO00o.computeBounds(this.f31028OooOoo, false);
                            this.f31030OooOooO.set(matrix);
                            List<p118o00O0Oo.OooOO0O> list3 = list;
                            this.f31030OooOooO.preTranslate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (-documentDataOooO0o.f10087OooO0oO) * o000O0Oo.OooO0OO());
                            this.f31030OooOooO.preScale(fFloatValue3, fFloatValue3);
                            pathOooO00o.transform(this.f31030OooOooO);
                            if (documentDataOooO0o.f10090OooOO0O) {
                                OooOoO0(pathOooO00o, this.f31031OooOooo, canvas);
                                OooOoO0(pathOooO00o, this.f31034Oooo000, canvas);
                            } else {
                                OooOoO0(pathOooO00o, this.f31034Oooo000, canvas);
                                OooOoO0(pathOooO00o, this.f31031OooOooo, canvas);
                            }
                            i11++;
                            list = list3;
                        }
                        float fOooO0OO4 = o000O0Oo.OooO0OO() * ((float) o00o0ooOooO0oO2.f33858OooO0OO) * fFloatValue3 * fOooO0Oo;
                        float f2 = documentDataOooO0o.f10086OooO0o0 / 10.0f;
                        OooOO0O<Float, Float> oooOO0O9 = this.f31046OoooO0O;
                        if (oooOO0O9 != null) {
                            fFloatValue2 = oooOO0O9.OooO0o().floatValue();
                        } else {
                            OooOO0O<Float, Float> oooOO0O10 = this.f31044OoooO0;
                            if (oooOO0O10 != null) {
                                fFloatValue2 = oooOO0O10.OooO0o().floatValue();
                            }
                            canvas.translate((f2 * fOooO0Oo) + fOooO0OO4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        }
                        f2 += fFloatValue2;
                        canvas.translate((f2 * fOooO0Oo) + fOooO0OO4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    }
                    i9++;
                    listOooOoO2 = listOooOoO2;
                    str5 = str2;
                    size2 = i4;
                }
                canvas.restore();
                i6 = i8 + 1;
                fOooO0OO2 = f;
            }
        } else {
            OooOO0O<Typeface, Typeface> oooOO0O11 = this.f31047OoooOO0;
            if (oooOO0O11 == null || (typefaceOooO0o = oooOO0O11.OooO0o()) == null) {
                LottieDrawable lottieDrawable = this.f31037Oooo0O0;
                String str7 = oo0o0o0.f33872OooO00o;
                String str8 = oo0o0o0.f33873OooO0O0;
                if (lottieDrawable.getCallback() == null) {
                    oooO0o = null;
                } else {
                    if (lottieDrawable.f9994OoooOo0 == null) {
                        lottieDrawable.f9994OoooOo0 = new OooO0o(lottieDrawable.getCallback());
                    }
                    oooO0o = lottieDrawable.f9994OoooOo0;
                }
                if (oooO0o != null) {
                    o00OO00O<String> o00oo00o = oooO0o.f30981OooO00o;
                    o00oo00o.f33870OooO00o = str7;
                    o00oo00o.f33871OooO0O0 = str8;
                    Typeface typefaceCreate = oooO0o.f30982OooO0O0.get(o00oo00o);
                    if (typefaceCreate == null) {
                        typefaceCreate = oooO0o.f30983OooO0OO.get(str7);
                        if (typefaceCreate == null) {
                            StringBuilder sbOooO00o = Oooo0.OooO00o("fonts/", str7);
                            sbOooO00o.append(oooO0o.f30985OooO0o0);
                            typefaceCreate = Typeface.createFromAsset(oooO0o.f30984OooO0Oo, sbOooO00o.toString());
                            oooO0o.f30983OooO0OO.put(str7, typefaceCreate);
                        }
                        boolean zContains = str8.contains("Italic");
                        boolean zContains2 = str8.contains("Bold");
                        if (zContains && zContains2) {
                            i2 = 3;
                        } else if (zContains) {
                            i2 = 2;
                        } else {
                            i2 = zContains2 ? 1 : 0;
                        }
                        if (typefaceCreate.getStyle() != i2) {
                            typefaceCreate = Typeface.create(typefaceCreate, i2);
                        }
                        oooO0o.f30982OooO0O0.put(oooO0o.f30981OooO00o, typefaceCreate);
                    }
                    typefaceOooO0o = typefaceCreate;
                } else {
                    typefaceOooO0o = null;
                }
                if (typefaceOooO0o == null) {
                    typefaceOooO0o = oo0o0o0.f33874OooO0OO;
                }
            }
            if (typefaceOooO0o != null) {
                String str9 = documentDataOooO0o.f10081OooO00o;
                Objects.requireNonNull(this.f31037Oooo0O0);
                this.f31031OooOooo.setTypeface(typefaceOooO0o);
                OooOO0O<Float, Float> oooOO0O12 = this.f31043OoooO;
                float fFloatValue4 = oooOO0O12 != null ? oooOO0O12.OooO0o().floatValue() : documentDataOooO0o.f10083OooO0OO;
                this.f31031OooOooo.setTextSize(o000O0Oo.OooO0OO() * fFloatValue4);
                this.f31034Oooo000.setTypeface(this.f31031OooOooo.getTypeface());
                this.f31034Oooo000.setTextSize(this.f31031OooOooo.getTextSize());
                float fOooO0OO5 = o000O0Oo.OooO0OO() * documentDataOooO0o.f10085OooO0o;
                float f3 = documentDataOooO0o.f10086OooO0o0 / 10.0f;
                OooOO0O<Float, Float> oooOO0O13 = this.f31046OoooO0O;
                if (oooOO0O13 != null) {
                    fFloatValue = oooOO0O13.OooO0o().floatValue();
                } else {
                    OooOO0O<Float, Float> oooOO0O14 = this.f31044OoooO0;
                    if (oooOO0O14 != null) {
                        fFloatValue = oooOO0O14.OooO0o().floatValue();
                    }
                    fOooO0OO = ((o000O0Oo.OooO0OO() * f3) * fFloatValue4) / 100.0f;
                    listOooOoO = OooOoO(str9);
                    size = listOooOoO.size();
                    i3 = 0;
                    while (i3 < size) {
                        str = listOooOoO.get(i3);
                        float length2 = ((str.length() - i5) * fOooO0OO) + this.f31034Oooo000.measureText(str);
                        canvas.save();
                        OooOo0o(documentDataOooO0o.f10084OooO0Oo, canvas, length2);
                        canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (i3 * fOooO0OO5) - (((size - 1) * fOooO0OO5) / 2.0f));
                        length = 0;
                        while (length < str.length()) {
                            iCodePointAt = str.codePointAt(length);
                            iCharCount = Character.charCount(iCodePointAt) + length;
                            while (iCharCount < str.length()) {
                                iCodePointAt2 = str.codePointAt(iCharCount);
                                if (Character.getType(iCodePointAt2) != 16 || Character.getType(iCodePointAt2) == 27 || Character.getType(iCodePointAt2) == 6 || Character.getType(iCodePointAt2) == 28 || Character.getType(iCodePointAt2) == 19) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    break;
                                }
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                            }
                            j = iCodePointAt;
                            if (this.f31036Oooo00o.OooO0o(j)) {
                                string = this.f31036Oooo00o.OooO(j, null);
                            } else {
                                this.f31029OooOoo0.setLength(0);
                                iCharCount2 = length;
                                while (iCharCount2 < iCharCount) {
                                    int iCodePointAt3 = str.codePointAt(iCharCount2);
                                    this.f31029OooOoo0.appendCodePoint(iCodePointAt3);
                                    iCharCount2 += Character.charCount(iCodePointAt3);
                                }
                                string = this.f31029OooOoo0.toString();
                                this.f31036Oooo00o.OooOO0o(j, string);
                            }
                            length += string.length();
                            if (documentDataOooO0o.f10090OooOO0O) {
                                OooOo(string, this.f31031OooOooo, canvas);
                                OooOo(string, this.f31034Oooo000, canvas);
                            } else {
                                OooOo(string, this.f31034Oooo000, canvas);
                                OooOo(string, this.f31031OooOooo, canvas);
                            }
                            canvas.translate(this.f31031OooOooo.measureText(string) + fOooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        }
                        canvas.restore();
                        i3++;
                        i5 = 1;
                    }
                }
                f3 += fFloatValue;
                fOooO0OO = ((o000O0Oo.OooO0OO() * f3) * fFloatValue4) / 100.0f;
                listOooOoO = OooOoO(str9);
                size = listOooOoO.size();
                i3 = 0;
                while (i3 < size) {
                    str = listOooOoO.get(i3);
                    float length3 = ((str.length() - i5) * fOooO0OO) + this.f31034Oooo000.measureText(str);
                    canvas.save();
                    OooOo0o(documentDataOooO0o.f10084OooO0Oo, canvas, length3);
                    canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (i3 * fOooO0OO5) - (((size - 1) * fOooO0OO5) / 2.0f));
                    length = 0;
                    while (length < str.length()) {
                        iCodePointAt = str.codePointAt(length);
                        iCharCount = Character.charCount(iCodePointAt) + length;
                        while (iCharCount < str.length()) {
                            iCodePointAt2 = str.codePointAt(iCharCount);
                            if (Character.getType(iCodePointAt2) != 16) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                break;
                                break;
                            } else {
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                            }
                        }
                        j = iCodePointAt;
                        if (this.f31036Oooo00o.OooO0o(j)) {
                            string = this.f31036Oooo00o.OooO(j, null);
                        } else {
                            this.f31029OooOoo0.setLength(0);
                            iCharCount2 = length;
                            while (iCharCount2 < iCharCount) {
                                int iCodePointAt4 = str.codePointAt(iCharCount2);
                                this.f31029OooOoo0.appendCodePoint(iCodePointAt4);
                                iCharCount2 += Character.charCount(iCodePointAt4);
                            }
                            string = this.f31029OooOoo0.toString();
                            this.f31036Oooo00o.OooOO0o(j, string);
                        }
                        length += string.length();
                        if (documentDataOooO0o.f10090OooOO0O) {
                            OooOo(string, this.f31031OooOooo, canvas);
                            OooOo(string, this.f31034Oooo000, canvas);
                        } else {
                            OooOo(string, this.f31034Oooo000, canvas);
                            OooOo(string, this.f31031OooOooo, canvas);
                        }
                        canvas.translate(this.f31031OooOooo.measureText(string) + fOooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    }
                    canvas.restore();
                    i3++;
                    i5 = 1;
                }
            }
        }
        canvas.restore();
    }

    public final void OooOo(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        canvas.drawText(str, 0, str.length(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, paint);
    }

    public final void OooOo0o(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = OooO0OO.f31048OooO00o[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else {
            if (i != 3) {
                return;
            }
            canvas.translate((-f) / 2.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    public final List<String> OooOoO(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public final void OooOoO0(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        canvas.drawPath(path, paint);
    }
}
