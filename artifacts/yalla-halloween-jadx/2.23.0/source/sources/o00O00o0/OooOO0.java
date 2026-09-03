package o00O00o0;

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
import com.airbnb.lottie.o00Oo0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import o00O0.OooOOOO;
import o00O000o.o000oOoO;
import o00O000o.o00O0O;
import oOO00O.OooOOO0;
import p113o00O00Oo.o0Oo0oo;
import p188o00o0O.OooOOO;
import p188o00o0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends com.airbnb.lottie.model.layer.OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final StringBuilder f36415OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Matrix f36416OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RectF f36417OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooO00o f36418OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO0O0 f36419OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public o00O0O f36420Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final LottieDrawable f36421Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final HashMap f36422Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooOo00<String> f36423Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final o000oOoO f36424Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final com.airbnb.lottie.OooOO0 f36425Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public final o00O000o.OooO0O0 f36426Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final o00O000o.OooO0O0 f36427Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public o00O0O f36428Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o00O0O f36429Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final o00O000o.OooO0o f36430Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public o00O0O f36431OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o00O0O f36432OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public final o00O000o.OooO0o f36433OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public o00O0O f36434OoooO0O;

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
        public static final /* synthetic */ int[] f36435OooO00o;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f36435OooO00o = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36435OooO00o[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36435OooO00o[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public OooOO0(LottieDrawable lottieDrawable, Layer layer) {
        o00O00OO.OooO0O0 oooO0O0;
        o00O00OO.OooO0O0 oooO0O1;
        o00O00OO.OooO00o oooO00o;
        o00O00OO.OooO00o oooO00o2;
        super(lottieDrawable, layer);
        this.f36415OooOoOO = new StringBuilder(2);
        this.f36417OooOoo0 = new RectF();
        this.f36416OooOoo = new Matrix();
        this.f36418OooOooO = new OooO00o();
        this.f36419OooOooo = new OooO0O0();
        this.f36422Oooo000 = new HashMap();
        this.f36423Oooo00O = new OooOo00<>();
        this.f36421Oooo0 = lottieDrawable;
        this.f36425Oooo0O0 = layer.f8820OooO0O0;
        o000oOoO o000oooo2 = new o000oOoO(layer.f8835OooOOo0.f36354OooO00o);
        this.f36424Oooo00o = o000oooo2;
        o000oooo2.OooO00o(this);
        OooO0oO(o000oooo2);
        o00O00OO.OooOo00 oooOo00 = layer.f8834OooOOo;
        if (oooOo00 != null && (oooO00o2 = oooOo00.f36350OooO00o) != null) {
            o00O000o.OooO00o<?, ?> OooO00o2 = oooO00o2.OooO00o();
            this.f36426Oooo0OO = (o00O000o.OooO0O0) OooO00o2;
            OooO00o2.OooO00o(this);
            OooO0oO(OooO00o2);
        }
        if (oooOo00 != null && (oooO00o = oooOo00.f36351OooO0O0) != null) {
            o00O000o.OooO00o<?, ?> OooO00o3 = oooO00o.OooO00o();
            this.f36427Oooo0o = (o00O000o.OooO0O0) OooO00o3;
            OooO00o3.OooO00o(this);
            OooO0oO(OooO00o3);
        }
        if (oooOo00 != null && (oooO0O1 = oooOo00.f36352OooO0OO) != null) {
            o00O000o.OooO00o<?, ?> OooO00o4 = oooO0O1.OooO00o();
            this.f36430Oooo0oo = (o00O000o.OooO0o) OooO00o4;
            OooO00o4.OooO00o(this);
            OooO0oO(OooO00o4);
        }
        if (oooOo00 == null || (oooO0O0 = oooOo00.f36353OooO0Oo) == null) {
            return;
        }
        o00O000o.OooO00o<?, ?> OooO00o5 = oooO0O0.OooO00o();
        this.f36433OoooO00 = (o00O000o.OooO0o) OooO00o5;
        OooO00o5.OooO00o(this);
        OooO0oO(OooO00o5);
    }

    public static void OooOo0(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void OooOo00(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = OooO0OO.f36435OooO00o[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else {
            if (i != 3) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    public static void OooOo0O(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, o00O000.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        com.airbnb.lottie.OooOO0 oooOO1 = this.f36425Oooo0O0;
        rectF.set(0.0f, 0.0f, oooOO1.f8731OooOO0.width(), oooOO1.f8731OooOO0.height());
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, oOO00O.OooO
    public final void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        super.OooO0o0(oooO0OO, obj);
        if (obj == o00Oo0.f8881OooO00o) {
            o00O0O o00o0o2 = this.f36428Oooo0o0;
            if (o00o0o2 != null) {
                OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f36428Oooo0o0 = null;
                return;
            }
            o00O0O o00o0o3 = new o00O0O(oooO0OO, null);
            this.f36428Oooo0o0 = o00o0o3;
            o00o0o3.OooO00o(this);
            OooO0oO(this.f36428Oooo0o0);
            return;
        }
        if (obj == o00Oo0.f8882OooO0O0) {
            o00O0O o00o0o4 = this.f36429Oooo0oO;
            if (o00o0o4 != null) {
                OooOOOo(o00o0o4);
            }
            if (oooO0OO == null) {
                this.f36429Oooo0oO = null;
                return;
            }
            o00O0O o00o0o5 = new o00O0O(oooO0OO, null);
            this.f36429Oooo0oO = o00o0o5;
            o00o0o5.OooO00o(this);
            OooO0oO(this.f36429Oooo0oO);
            return;
        }
        if (obj == o00Oo0.f8898OooOOoo) {
            o00O0O o00o0o6 = this.f36420Oooo;
            if (o00o0o6 != null) {
                OooOOOo(o00o0o6);
            }
            if (oooO0OO == null) {
                this.f36420Oooo = null;
                return;
            }
            o00O0O o00o0o7 = new o00O0O(oooO0OO, null);
            this.f36420Oooo = o00o0o7;
            o00o0o7.OooO00o(this);
            OooO0oO(this.f36420Oooo);
            return;
        }
        if (obj == o00Oo0.f8901OooOo00) {
            o00O0O o00o0o8 = this.f36432OoooO0;
            if (o00o0o8 != null) {
                OooOOOo(o00o0o8);
            }
            if (oooO0OO == null) {
                this.f36432OoooO0 = null;
                return;
            }
            o00O0O o00o0o9 = new o00O0O(oooO0OO, null);
            this.f36432OoooO0 = o00o0o9;
            o00o0o9.OooO00o(this);
            OooO0oO(this.f36432OoooO0);
            return;
        }
        if (obj == o00Oo0.f8912Oooo000) {
            o00O0O o00o0o10 = this.f36434OoooO0O;
            if (o00o0o10 != null) {
                OooOOOo(o00o0o10);
            }
            if (oooO0OO == null) {
                this.f36434OoooO0O = null;
                return;
            }
            o00O0O o00o0o11 = new o00O0O(oooO0OO, null);
            this.f36434OoooO0O = o00o0o11;
            o00o0o11.OooO00o(this);
            OooO0oO(this.f36434OoooO0O);
            return;
        }
        if (obj == o00Oo0.f8917Oooo0o) {
            o00O0O o00o0o12 = this.f36431OoooO;
            if (o00o0o12 != null) {
                OooOOOo(o00o0o12);
            }
            if (oooO0OO == null) {
                this.f36431OoooO = null;
                return;
            }
            o00O0O o00o0o13 = new o00O0O(oooO0OO, null);
            this.f36431OoooO = o00o0o13;
            o00o0o13.OooO00o(this);
            OooO0oO(this.f36431OoooO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0437  */
    /* JADX WARN: Code duplicated, block: B:143:0x0469  */
    /* JADX WARN: Code duplicated, block: B:146:0x0478  */
    /* JADX WARN: Code duplicated, block: B:158:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:161:0x04ac A[LOOP:7: B:144:0x0472->B:161:0x04ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:168:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:169:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:171:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:172:0x04de  */
    /* JADX WARN: Code duplicated, block: B:174:0x04e8 A[LOOP:8: B:173:0x04e6->B:174:0x04e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0506  */
    /* JADX WARN: Code duplicated, block: B:179:0x050d  */
    /* JADX WARN: Code duplicated, block: B:199:0x04b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x04bb A[EDGE_INSN: B:200:0x04bb->B:163:0x04bb BREAK  A[LOOP:7: B:144:0x0472->B:161:0x04ac], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(Canvas canvas, Matrix matrix, int i) {
        o00O00O.OooO00o oooO00o;
        Typeface typefaceCreate;
        Typeface typeface;
        Typeface typefaceCreateFromAsset;
        int i2;
        float fFloatValue;
        float fOooO0OO;
        List listAsList;
        int size;
        int i3;
        String str;
        int length;
        int iCodePointAt;
        int iCharCount;
        float f;
        long j;
        OooOo00<String> oooOo00;
        boolean z;
        StringBuilder sb;
        int iCharCount2;
        String str2;
        int iCodePointAt2;
        boolean z2;
        DocumentData.Justification justification;
        String str3;
        List list;
        OooO0O0 oooO0O0;
        OooO00o oooO00o2;
        DocumentData documentData;
        int i4;
        float fFloatValue2;
        OooO0O0 oooO0O1;
        OooO00o oooO00o3;
        OooOO0 oooOO1 = this;
        canvas.save();
        LottieDrawable lottieDrawable = oooOO1.f36421Oooo0;
        if (!(lottieDrawable.f8673OooO0o0.f8729OooO0oO.OooO() > 0)) {
            canvas.concat(matrix);
        }
        DocumentData documentDataOooO0o = oooOO1.f36424Oooo00o.OooO0o();
        com.airbnb.lottie.OooOO0 oooOO2 = oooOO1.f36425Oooo0O0;
        oOO00O.OooO0O0 oooO0O2 = oooOO2.f8728OooO0o0.get(documentDataOooO0o.f8763OooO0O0);
        if (oooO0O2 == null) {
            canvas.restore();
            return;
        }
        o00O0O o00o0o2 = oooOO1.f36428Oooo0o0;
        OooO00o oooO00o4 = oooOO1.f36418OooOooO;
        if (o00o0o2 != null) {
            oooO00o4.setColor(((Integer) o00o0o2.OooO0o()).intValue());
        } else {
            o00O000o.OooO0O0 oooO0O3 = oooOO1.f36426Oooo0OO;
            if (oooO0O3 != null) {
                oooO00o4.setColor(oooO0O3.OooO0o().intValue());
            } else {
                oooO00o4.setColor(documentDataOooO0o.f8769OooO0oo);
            }
        }
        o00O0O o00o0o3 = oooOO1.f36429Oooo0oO;
        OooO0O0 oooO0O4 = oooOO1.f36419OooOooo;
        if (o00o0o3 != null) {
            oooO0O4.setColor(((Integer) o00o0o3.OooO0o()).intValue());
        } else {
            o00O000o.OooO0O0 oooO0O5 = oooOO1.f36427Oooo0o;
            if (oooO0O5 != null) {
                oooO0O4.setColor(oooO0O5.OooO0o().intValue());
            } else {
                oooO0O4.setColor(documentDataOooO0o.f8761OooO);
            }
        }
        o00O000o.OooO00o<Integer, Integer> oooO00o5 = oooOO1.f8862OooOo0.f36324OooOO0;
        int iIntValue = ((oooO00o5 == null ? 100 : oooO00o5.OooO0o().intValue()) * 255) / 100;
        oooO00o4.setAlpha(iIntValue);
        oooO0O4.setAlpha(iIntValue);
        o00O0O o00o0o4 = oooOO1.f36420Oooo;
        if (o00o0o4 != null) {
            oooO0O4.setStrokeWidth(((Float) o00o0o4.OooO0o()).floatValue());
        } else {
            o00O000o.OooO0o oooO0o = oooOO1.f36430Oooo0oo;
            if (oooO0o != null) {
                oooO0O4.setStrokeWidth(oooO0o.OooO0o().floatValue());
            } else {
                oooO0O4.setStrokeWidth(OooOOOO.OooO0OO() * documentDataOooO0o.f8770OooOO0 * OooOOOO.OooO0Oo(matrix));
            }
        }
        boolean z3 = lottieDrawable.f8673OooO0o0.f8729OooO0oO.OooO() > 0;
        String str4 = "\n";
        o00O000o.OooO0o oooO0o2 = oooOO1.f36433OoooO00;
        boolean z4 = documentDataOooO0o.f8771OooOO0O;
        DocumentData.Justification justification2 = documentDataOooO0o.f8765OooO0Oo;
        int i5 = documentDataOooO0o.f8767OooO0o0;
        float f2 = documentDataOooO0o.f8766OooO0o;
        int i6 = i5;
        float f3 = documentDataOooO0o.f8764OooO0OO;
        String str5 = documentDataOooO0o.f8762OooO00o;
        OooO0O0 oooO0O6 = oooO0O4;
        ?? r10 = oooO0O2.f60834OooO0O0;
        OooO00o oooO00o6 = oooO00o4;
        ?? r9 = oooO0O2.f60833OooO00o;
        if (z3) {
            o00O0O o00o0o5 = oooOO1.f36434OoooO0O;
            float fFloatValue3 = (o00o0o5 != null ? ((Float) o00o0o5.OooO0o()).floatValue() : f3) / 100.0f;
            float fOooO0Oo = OooOOOO.OooO0Oo(matrix);
            float fOooO0OO2 = OooOOOO.OooO0OO() * f2;
            List listAsList2 = Arrays.asList(str5.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size2 = listAsList2.size();
            int i7 = 0;
            ?? r11 = r9;
            ?? r12 = r10;
            while (i7 < size2) {
                String str6 = (String) listAsList2.get(i7);
                List list2 = listAsList2;
                boolean z5 = z4;
                float fOooO0OO3 = 0.0f;
                int i8 = 0;
                ?? r13 = r11;
                ?? r14 = r12;
                while (i8 < str6.length()) {
                    DocumentData documentData2 = documentDataOooO0o;
                    LottieDrawable lottieDrawable2 = lottieDrawable;
                    oOO00O.OooO0OO oooO0OO = (oOO00O.OooO0OO) oooOO2.f8729OooO0oO.OooO0o(oOO00O.OooO0OO.OooO00o(r13, str6.charAt(i8), r14), null);
                    ?? r15 = r13;
                    ?? r2 = r14;
                    if (oooO0OO != null) {
                        fOooO0OO3 = (float) ((oooO0OO.f60838OooO0OO * ((double) fFloatValue3) * ((double) OooOOOO.OooO0OO()) * ((double) fOooO0Oo)) + ((double) fOooO0OO3));
                    }
                    i8++;
                    r14 = r2;
                    r13 = r15;
                    i7 = i7;
                    documentDataOooO0o = documentData2;
                    lottieDrawable = lottieDrawable2;
                    str6 = str6;
                }
                LottieDrawable lottieDrawable3 = lottieDrawable;
                DocumentData documentData3 = documentDataOooO0o;
                ?? r16 = r13;
                ?? r3 = r14;
                int i9 = i7;
                String str7 = str6;
                canvas.save();
                OooOo00(justification2, canvas, fOooO0OO3);
                canvas.translate(0.0f, (i9 * fOooO0OO2) - (((size2 - 1) * fOooO0OO2) / 2.0f));
                int i10 = 0;
                while (i10 < str7.length()) {
                    String str8 = str7;
                    oOO00O.OooO0OO oooO0OO2 = (oOO00O.OooO0OO) oooOO2.f8729OooO0oO.OooO0o(oOO00O.OooO0OO.OooO00o(r16, str8.charAt(i10), r3), null);
                    if (oooO0OO2 == null) {
                        size2 = size2;
                        oooOO2 = oooOO2;
                        justification = justification2;
                        str3 = str8;
                        i4 = i6;
                        oooO0O0 = oooO0O6;
                        oooO00o2 = oooO00o6;
                        documentData = documentData3;
                        lottieDrawable3 = lottieDrawable3;
                    } else {
                        HashMap map = oooOO1.f36422Oooo000;
                        if (map.containsKey(oooO0OO2)) {
                            list = (List) map.get(oooO0OO2);
                            justification = justification2;
                            str3 = str8;
                        } else {
                            List<o0Oo0oo> list3 = oooO0OO2.f60836OooO00o;
                            int size3 = list3.size();
                            ArrayList arrayList = new ArrayList(size3);
                            int i11 = 0;
                            while (i11 < size3) {
                                arrayList.add(new o00O000.OooO0o(lottieDrawable3, oooOO1, list3.get(i11)));
                                i11++;
                                str8 = str8;
                                list3 = list3;
                                justification2 = justification2;
                            }
                            justification = justification2;
                            str3 = str8;
                            map.put(oooO0OO2, arrayList);
                            list = arrayList;
                        }
                        int i12 = 0;
                        while (i12 < list.size()) {
                            Path pathOooO00o = ((o00O000.OooO0o) list.get(i12)).OooO00o();
                            pathOooO00o.computeBounds(oooOO1.f36417OooOoo0, false);
                            Matrix matrix2 = oooOO1.f36416OooOoo;
                            matrix2.set(matrix);
                            DocumentData documentData4 = documentData3;
                            List list4 = list;
                            matrix2.preTranslate(0.0f, (-documentData4.f8768OooO0oO) * OooOOOO.OooO0OO());
                            matrix2.preScale(fFloatValue3, fFloatValue3);
                            pathOooO00o.transform(matrix2);
                            if (z5) {
                                oooO00o3 = oooO00o6;
                                OooOo0O(pathOooO00o, oooO00o3, canvas);
                                oooO0O1 = oooO0O6;
                                OooOo0O(pathOooO00o, oooO0O1, canvas);
                            } else {
                                oooO0O1 = oooO0O6;
                                oooO00o3 = oooO00o6;
                                OooOo0O(pathOooO00o, oooO0O1, canvas);
                                OooOo0O(pathOooO00o, oooO00o3, canvas);
                            }
                            i12++;
                            oooO00o6 = oooO00o3;
                            oooO0O6 = oooO0O1;
                            list = list4;
                            documentData3 = documentData4;
                        }
                        oooO0O0 = oooO0O6;
                        oooO00o2 = oooO00o6;
                        documentData = documentData3;
                        float fOooO0OO4 = OooOOOO.OooO0OO() * ((float) oooO0OO2.f60838OooO0OO) * fFloatValue3 * fOooO0Oo;
                        i4 = i6;
                        float f4 = i4 / 10.0f;
                        o00O0O o00o0o6 = oooOO1.f36432OoooO0;
                        if (o00o0o6 != null) {
                            fFloatValue2 = ((Float) o00o0o6.OooO0o()).floatValue();
                        } else {
                            if (oooO0o2 != null) {
                                fFloatValue2 = oooO0o2.OooO0o().floatValue();
                            }
                            canvas.translate((f4 * fOooO0Oo) + fOooO0OO4, 0.0f);
                        }
                        f4 += fFloatValue2;
                        canvas.translate((f4 * fOooO0Oo) + fOooO0OO4, 0.0f);
                    }
                    i10++;
                    i6 = i4;
                    oooO00o6 = oooO00o2;
                    lottieDrawable3 = lottieDrawable3;
                    oooO0O6 = oooO0O0;
                    documentData3 = documentData;
                    size2 = size2;
                    oooOO2 = oooOO2;
                    str7 = str3;
                    justification2 = justification;
                }
                canvas.restore();
                listAsList2 = list2;
                r11 = r16;
                z4 = z5;
                r12 = r3;
                i7 = i9 + 1;
                lottieDrawable = lottieDrawable3;
                documentDataOooO0o = documentData3;
                justification2 = justification2;
            }
        } else {
            DocumentData.Justification justification3 = justification2;
            o00O0O o00o0o7 = oooOO1.f36431OoooO;
            if (o00o0o7 == null || (typeface = (Typeface) o00o0o7.OooO0o()) == null) {
                if (lottieDrawable.getCallback() == null) {
                    oooO00o = null;
                } else {
                    if (lottieDrawable.f8679OooOOO == null) {
                        lottieDrawable.f8679OooOOO = new o00O00O.OooO00o(lottieDrawable.getCallback());
                    }
                    oooO00o = lottieDrawable.f8679OooOOO;
                }
                if (oooO00o != null) {
                    OooOOO0<String> oooOOO0 = oooO00o.f36329OooO00o;
                    oooOOO0.f60849OooO00o = r9;
                    oooOOO0.f60850OooO0O0 = r10;
                    HashMap map2 = oooO00o.f36330OooO0O0;
                    Typeface typeface2 = (Typeface) map2.get(oooOOO0);
                    if (typeface2 != null) {
                        str5 = str5;
                        typefaceCreate = typeface2;
                        str4 = "\n";
                    } else {
                        ?? r1 = oooO00o.f36331OooO0OO;
                        Typeface typeface3 = (Typeface) r1.get(r9);
                        if (typeface3 != null) {
                            typefaceCreateFromAsset = typeface3;
                        } else {
                            typefaceCreateFromAsset = Typeface.createFromAsset(oooO00o.f36332OooO0Oo, "fonts/" + r9 + oooO00o.f36333OooO0o0);
                            r1.put(r9, typefaceCreateFromAsset);
                        }
                        boolean zContains = r10.contains("Italic");
                        boolean zContains2 = r10.contains("Bold");
                        if (zContains && zContains2) {
                            i2 = 3;
                        } else if (zContains) {
                            i2 = 2;
                        } else {
                            i2 = zContains2 ? 1 : 0;
                        }
                        typefaceCreate = typefaceCreateFromAsset.getStyle() == i2 ? typefaceCreateFromAsset : Typeface.create(typefaceCreateFromAsset, i2);
                        map2.put(oooOOO0, typefaceCreate);
                    }
                } else {
                    str5 = str5;
                    str4 = "\n";
                    typefaceCreate = null;
                }
                typeface = typefaceCreate != null ? typefaceCreate : oooO0O2.f60835OooO0OO;
            } else {
                str5 = str5;
                str4 = "\n";
            }
            if (typeface != null) {
                oooO00o6.setTypeface(typeface);
                o00O0O o00o0o8 = oooOO1.f36434OoooO0O;
                float fFloatValue4 = o00o0o8 != null ? ((Float) o00o0o8.OooO0o()).floatValue() : f3;
                oooO00o6.setTextSize(OooOOOO.OooO0OO() * fFloatValue4);
                oooO0O6.setTypeface(oooO00o6.getTypeface());
                oooO0O6.setTextSize(oooO00o6.getTextSize());
                float fOooO0OO5 = OooOOOO.OooO0OO() * f2;
                float f5 = i6 / 10.0f;
                o00O0O o00o0o9 = oooOO1.f36432OoooO0;
                if (o00o0o9 != null) {
                    fFloatValue = ((Float) o00o0o9.OooO0o()).floatValue();
                } else {
                    if (oooO0o2 != null) {
                        fFloatValue = oooO0o2.OooO0o().floatValue();
                    }
                    fOooO0OO = ((OooOOOO.OooO0OO() * f5) * fFloatValue4) / 100.0f;
                    listAsList = Arrays.asList(str5.replaceAll("\r\n", "\r").replaceAll(str4, "\r").split("\r"));
                    size = listAsList.size();
                    i3 = 0;
                    while (i3 < size) {
                        str = (String) listAsList.get(i3);
                        float length2 = ((str.length() - 1) * fOooO0OO) + oooO0O6.measureText(str);
                        canvas.save();
                        DocumentData.Justification justification4 = justification3;
                        OooOo00(justification4, canvas, length2);
                        canvas.translate(0.0f, (i3 * fOooO0OO5) - (((size - 1) * fOooO0OO5) / 2.0f));
                        length = 0;
                        while (length < str.length()) {
                            iCodePointAt = str.codePointAt(length);
                            iCharCount = Character.charCount(iCodePointAt) + length;
                            while (true) {
                                if (iCharCount < str.length()) {
                                    f = fOooO0OO5;
                                    break;
                                }
                                iCodePointAt2 = str.codePointAt(iCharCount);
                                f = fOooO0OO5;
                                if (Character.getType(iCodePointAt2) != 16 || Character.getType(iCodePointAt2) == 27 || Character.getType(iCodePointAt2) == 6 || Character.getType(iCodePointAt2) == 28 || Character.getType(iCodePointAt2) == 19) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    break;
                                }
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                fOooO0OO5 = f;
                            }
                            j = iCodePointAt;
                            oooOo00 = oooOO1.f36423Oooo00O;
                            if (oooOo00.f38802OooO0Oo) {
                                oooOo00.OooO0o();
                            }
                            List list5 = listAsList;
                            if (OooOOO.OooO0OO(oooOo00.f38804OooO0o0, oooOo00.f38805OooO0oO, j) >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                str2 = (String) oooOo00.OooO0oO(j, null);
                            } else {
                                sb = oooOO1.f36415OooOoOO;
                                sb.setLength(0);
                                iCharCount2 = length;
                                while (iCharCount2 < iCharCount) {
                                    int iCodePointAt3 = str.codePointAt(iCharCount2);
                                    sb.appendCodePoint(iCodePointAt3);
                                    iCharCount2 += Character.charCount(iCodePointAt3);
                                }
                                String string = sb.toString();
                                oooOo00.OooO(j, string);
                                str2 = string;
                            }
                            length += str2.length();
                            if (z4) {
                                OooOo0(str2, oooO00o6, canvas);
                                OooOo0(str2, oooO0O6, canvas);
                            } else {
                                OooOo0(str2, oooO0O6, canvas);
                                OooOo0(str2, oooO00o6, canvas);
                            }
                            canvas.translate(oooO00o6.measureText(str2) + fOooO0OO, 0.0f);
                            oooOO1 = this;
                            fOooO0OO5 = f;
                            listAsList = list5;
                        }
                        canvas.restore();
                        i3++;
                        oooOO1 = this;
                        fOooO0OO5 = fOooO0OO5;
                        justification3 = justification4;
                    }
                }
                f5 += fFloatValue;
                fOooO0OO = ((OooOOOO.OooO0OO() * f5) * fFloatValue4) / 100.0f;
                listAsList = Arrays.asList(str5.replaceAll("\r\n", "\r").replaceAll(str4, "\r").split("\r"));
                size = listAsList.size();
                i3 = 0;
                while (i3 < size) {
                    str = (String) listAsList.get(i3);
                    float length3 = ((str.length() - 1) * fOooO0OO) + oooO0O6.measureText(str);
                    canvas.save();
                    DocumentData.Justification justification5 = justification3;
                    OooOo00(justification5, canvas, length3);
                    canvas.translate(0.0f, (i3 * fOooO0OO5) - (((size - 1) * fOooO0OO5) / 2.0f));
                    length = 0;
                    while (length < str.length()) {
                        iCodePointAt = str.codePointAt(length);
                        iCharCount = Character.charCount(iCodePointAt) + length;
                        while (true) {
                            if (iCharCount < str.length()) {
                                f = fOooO0OO5;
                                break;
                            }
                            iCodePointAt2 = str.codePointAt(iCharCount);
                            f = fOooO0OO5;
                            if (Character.getType(iCodePointAt2) != 16) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (!z2) {
                                break;
                                break;
                            } else {
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                fOooO0OO5 = f;
                            }
                        }
                        j = iCodePointAt;
                        oooOo00 = oooOO1.f36423Oooo00O;
                        if (oooOo00.f38802OooO0Oo) {
                            oooOo00.OooO0o();
                        }
                        List list6 = listAsList;
                        if (OooOOO.OooO0OO(oooOo00.f38804OooO0o0, oooOo00.f38805OooO0oO, j) >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str2 = (String) oooOo00.OooO0oO(j, null);
                        } else {
                            sb = oooOO1.f36415OooOoOO;
                            sb.setLength(0);
                            iCharCount2 = length;
                            while (iCharCount2 < iCharCount) {
                                int iCodePointAt4 = str.codePointAt(iCharCount2);
                                sb.appendCodePoint(iCodePointAt4);
                                iCharCount2 += Character.charCount(iCodePointAt4);
                            }
                            String string2 = sb.toString();
                            oooOo00.OooO(j, string2);
                            str2 = string2;
                        }
                        length += str2.length();
                        if (z4) {
                            OooOo0(str2, oooO00o6, canvas);
                            OooOo0(str2, oooO0O6, canvas);
                        } else {
                            OooOo0(str2, oooO0O6, canvas);
                            OooOo0(str2, oooO00o6, canvas);
                        }
                        canvas.translate(oooO00o6.measureText(str2) + fOooO0OO, 0.0f);
                        oooOO1 = this;
                        fOooO0OO5 = f;
                        listAsList = list6;
                    }
                    canvas.restore();
                    i3++;
                    oooOO1 = this;
                    fOooO0OO5 = fOooO0OO5;
                    justification3 = justification5;
                }
            }
        }
        canvas.restore();
    }
}
