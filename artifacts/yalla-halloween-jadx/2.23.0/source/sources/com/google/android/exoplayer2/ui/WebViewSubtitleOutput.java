package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.TextEmphasisSpan;
import com.google.common.collect.o0OoO00O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p023Oooo00o.oO00Oo00;
import p234o00oOoo0.o000O;
import p234o00oOoo0.o000OO0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14025OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CanvasSubtitleOutput f14026OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<Cue> f14027OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f14028OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public CaptionStyleCompat f14029OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f14030OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f14031OooOO0;

    public class OooO00o extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f14032OooO00o;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f14032OooO00o = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14032OooO00o[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14032OooO00o[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14027OooO0o = Collections.emptyList();
        this.f14029OooO0oO = CaptionStyleCompat.f13748OooO0oO;
        this.f14030OooO0oo = 0.0533f;
        this.f14025OooO = 0;
        this.f14031OooOO0 = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f14026OooO0Oo = canvasSubtitleOutput;
        OooO00o oooO00o = new OooO00o(context, attributeSet);
        this.f14028OooO0o0 = oooO00o;
        oooO00o.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(oooO00o);
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.OooO00o
    public final void OooO00o(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f14029OooO0oO = captionStyleCompat;
        this.f14030OooO0oo = f;
        this.f14025OooO = i;
        this.f14031OooOO0 = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.f13405OooO0oO != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.f14027OooO0o.isEmpty() || !arrayList2.isEmpty()) {
            this.f14027OooO0o = arrayList2;
            OooO0OO();
        }
        this.f14026OooO0Oo.OooO00o(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    public final String OooO0O0(float f, int i) {
        float fOooO0O0 = o0000oo.OooO0O0(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fOooO0O0 == -3.4028235E38f ? "unset" : o0O00.OooOO0o("%.2fpx", Float.valueOf(fOooO0O0 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0243  */
    /* JADX WARN: Code duplicated, block: B:102:0x0261 A[LOOP:2: B:101:0x025f->B:102:0x0261, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0284 A[LOOP:3: B:104:0x027e->B:106:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:111:0x02de  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x0314  */
    /* JADX WARN: Code duplicated, block: B:118:0x031b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0333  */
    /* JADX WARN: Code duplicated, block: B:121:0x0337  */
    /* JADX WARN: Code duplicated, block: B:122:0x033a  */
    /* JADX WARN: Code duplicated, block: B:124:0x033e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0347  */
    /* JADX WARN: Code duplicated, block: B:127:0x034d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0365  */
    /* JADX WARN: Code duplicated, block: B:131:0x036a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0387  */
    /* JADX WARN: Code duplicated, block: B:134:0x038f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0398  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x040e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0412  */
    /* JADX WARN: Code duplicated, block: B:174:0x0418  */
    /* JADX WARN: Code duplicated, block: B:176:0x0420  */
    /* JADX WARN: Code duplicated, block: B:178:0x0423 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0425  */
    /* JADX WARN: Code duplicated, block: B:181:0x0428  */
    /* JADX WARN: Code duplicated, block: B:182:0x042c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0432  */
    /* JADX WARN: Code duplicated, block: B:184:0x0438  */
    /* JADX WARN: Code duplicated, block: B:185:0x043e  */
    /* JADX WARN: Code duplicated, block: B:188:0x044c  */
    /* JADX WARN: Code duplicated, block: B:189:0x044f  */
    /* JADX WARN: Code duplicated, block: B:231:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:234:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:236:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:239:0x0507  */
    /* JADX WARN: Code duplicated, block: B:245:0x053b  */
    /* JADX WARN: Code duplicated, block: B:248:0x0563 A[LOOP:6: B:246:0x055d->B:248:0x0563, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x0580 A[LOOP:7: B:250:0x057a->B:252:0x0580, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:258:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:260:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:264:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:268:0x0624  */
    /* JADX WARN: Code duplicated, block: B:270:0x062a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x0630  */
    /* JADX WARN: Code duplicated, block: B:275:0x0644  */
    /* JADX WARN: Code duplicated, block: B:278:0x066c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0679 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:281:0x067b  */
    /* JADX WARN: Code duplicated, block: B:282:0x067e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0681  */
    /* JADX WARN: Code duplicated, block: B:285:0x0698  */
    /* JADX WARN: Code duplicated, block: B:303:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01de  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0216  */
    /* JADX WARN: Code duplicated, block: B:96:0x0220  */
    /* JADX WARN: Code duplicated, block: B:98:0x0226  */
    public final void OooO0OO() {
        String strOooOO0o;
        float f;
        String strOooOO0o2;
        int i;
        String strOooOO0o3;
        Object obj;
        int i2;
        Object obj2;
        String str;
        int i3;
        String str2;
        String str3;
        int i4;
        String str4;
        float f2;
        CharSequence charSequence;
        String str5;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i5;
        HashMap map;
        Iterator it;
        String str6;
        Object obj3;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i6;
        String str7;
        String str8;
        String str9;
        StringBuilder sb;
        int i7;
        int i8;
        o00O0O.OooO00o oooO00o;
        Iterator it2;
        Iterator it3;
        Object obj4;
        boolean z;
        String str10;
        int i9;
        TextEmphasisSpan textEmphasisSpan;
        int i10;
        StringBuilder sb2;
        int i11;
        int i12;
        String str11;
        String strOooOO0o4;
        String strOooOO0o5;
        int i13;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str12;
        int spanStart;
        int spanEnd;
        o00O0O.OooO0OO oooO0OO;
        o00O0O.OooO0OO oooO0OO2;
        String str13;
        float f3;
        int i14;
        String strOooOO0o6;
        String str14;
        Layout.Alignment alignment;
        int i15;
        Object obj5;
        String str15;
        String str16;
        boolean z2;
        String strOooOO0o7;
        int i16;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr = new Object[4];
        int i17 = 0;
        objArr[0] = OooO0o.OooO00o(webViewSubtitleOutput.f14029OooO0oO.f13749OooO00o);
        int i18 = 1;
        objArr[1] = webViewSubtitleOutput.OooO0O0(webViewSubtitleOutput.f14030OooO0oo, webViewSubtitleOutput.f14025OooO);
        int i19 = 2;
        objArr[2] = Float.valueOf(1.2f);
        CaptionStyleCompat captionStyleCompat = webViewSubtitleOutput.f14029OooO0oO;
        int i20 = captionStyleCompat.f13752OooO0Oo;
        int i21 = captionStyleCompat.f13754OooO0o0;
        if (i20 == 1) {
            strOooOO0o = o0O00.OooOO0o("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", OooO0o.OooO00o(i21));
        } else if (i20 == 2) {
            strOooOO0o = o0O00.OooOO0o("0.1em 0.12em 0.15em %s", OooO0o.OooO00o(i21));
        } else if (i20 != 3) {
            strOooOO0o = i20 != 4 ? "unset" : o0O00.OooOO0o("-0.05em -0.05em 0.15em %s", OooO0o.OooO00o(i21));
        } else {
            strOooOO0o = o0O00.OooOO0o("0.06em 0.08em 0.15em %s", OooO0o.OooO00o(i21));
        }
        objArr[3] = strOooOO0o;
        sb3.append(o0O00.OooOO0o("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr));
        HashMap map2 = new HashMap();
        String str17 = "background-color:%s;";
        map2.put(".default_bg,.default_bg *", o0O00.OooOO0o("background-color:%s;", OooO0o.OooO00o(webViewSubtitleOutput.f14029OooO0oO.f13750OooO0O0)));
        int i22 = 0;
        while (i17 < webViewSubtitleOutput.f14027OooO0o.size()) {
            Cue cue = webViewSubtitleOutput.f14027OooO0o.get(i17);
            float f4 = cue.f13408OooOO0O;
            float f5 = f4 != -3.4028235E38f ? f4 * 100.0f : 50.0f;
            int i23 = cue.f13409OooOO0o;
            int i24 = i23 != i18 ? i23 != i19 ? i22 : -100 : -50;
            float f6 = cue.f13406OooO0oo;
            int i25 = cue.f13416OooOOoo;
            if (f6 != -3.4028235E38f) {
                if (cue.f13401OooO != i18) {
                    Object[] objArr2 = new Object[i18];
                    objArr2[i22] = Float.valueOf(f6 * 100.0f);
                    strOooOO0o7 = o0O00.OooOO0o("%.2f%%", objArr2);
                    int i26 = cue.f13407OooOO0;
                    if (i25 == i18) {
                        i16 = -(i26 != i18 ? i26 != i19 ? i22 : -100 : -50);
                    } else if (i26 != i18) {
                        i16 = i26 != i19 ? i22 : -100;
                    } else {
                        i16 = -50;
                    }
                    i = i16;
                } else if (f6 >= 0.0f) {
                    Object[] objArr3 = new Object[i18];
                    objArr3[i22] = Float.valueOf(f6 * 1.2f);
                    strOooOO0o7 = o0O00.OooOO0o("%.2fem", objArr3);
                    i = i22;
                } else {
                    Object[] objArr4 = new Object[i18];
                    objArr4[i22] = Float.valueOf(((-f6) - 1.0f) * 1.2f);
                    strOooOO0o7 = o0O00.OooOO0o("%.2fem", objArr4);
                    i = i22;
                    i22 = i18;
                }
                strOooOO0o2 = strOooOO0o7;
                f = 100.0f;
            } else {
                Object[] objArr5 = new Object[i18];
                f = 100.0f;
                objArr5[i22] = Float.valueOf((1.0f - webViewSubtitleOutput.f14031OooOO0) * 100.0f);
                strOooOO0o2 = o0O00.OooOO0o("%.2f%%", objArr5);
                i = -100;
            }
            float f7 = cue.f13411OooOOO0;
            if (f7 != -3.4028235E38f) {
                Object[] objArr6 = new Object[i18];
                objArr6[0] = Float.valueOf(f7 * f);
                strOooOO0o3 = o0O00.OooOO0o("%.2f%%", objArr6);
            } else {
                strOooOO0o3 = "fit-content";
            }
            Layout.Alignment alignment2 = cue.f13404OooO0o0;
            if (alignment2 == null) {
                i2 = 2;
                obj = "start";
            } else {
                int i27 = OooO0O0.f14032OooO00o[alignment2.ordinal()];
                obj = "start";
                if (i27 == 1) {
                    i2 = 2;
                    obj2 = obj;
                } else if (i27 != 2) {
                    i2 = 2;
                } else {
                    i2 = 2;
                    obj2 = "end";
                }
                if (i25 != 1) {
                    str = "vertical-rl";
                } else if (i25 != i2) {
                    str = "horizontal-tb";
                } else {
                    str = "vertical-lr";
                }
                String strOooO0O0 = webViewSubtitleOutput.OooO0O0(cue.f13414OooOOo, cue.f13415OooOOo0);
                if (cue.f13412OooOOOO) {
                    i3 = cue.f13413OooOOOo;
                } else {
                    i3 = webViewSubtitleOutput.f14029OooO0oO.f13751OooO0OO;
                }
                String strOooO00o = OooO0o.OooO00o(i3);
                str2 = ViewHierarchyConstants.DIMENSION_LEFT_KEY;
                str3 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
                if (i25 != 1) {
                    if (i22 == 0) {
                        str2 = "right";
                    }
                    i4 = 2;
                    str3 = str2;
                    str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
                } else if (i25 != 2) {
                    if (i22 != 0) {
                        str3 = "bottom";
                    }
                    i4 = 2;
                } else {
                    if (i22 != 0) {
                        str2 = "right";
                    }
                    i4 = 2;
                    str3 = str2;
                    str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
                }
                if (i25 != i4 || i25 == 1) {
                    str4 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
                } else {
                    str4 = ViewHierarchyConstants.DIMENSION_WIDTH_KEY;
                    i24 = i;
                    i = i24;
                }
                f2 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = o00O0O.f14120OooO00o;
                StringBuilder sb4 = sb3;
                charSequence = cue.f13402OooO0Oo;
                if (charSequence == null) {
                    oooO00o = new o00O0O.OooO00o("", o0OoO00O.f19626OooOO0);
                    str5 = "";
                } else {
                    str5 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i5 = 0;
                        while (i5 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                            i5++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strOooO00o2 = android.support.v4.media.OooO00o.OooO00o("bg_", iIntValue);
                            map.put(oO00Oo00.OooO00o(".", strOooO00o2, ",.", strOooO00o2, " *"), o0O00.OooOO0o(str17, OooO0o.OooO00o(iIntValue)));
                            it = it;
                            str = str;
                            obj2 = obj2;
                        }
                        str6 = str;
                        obj3 = obj2;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        length2 = spans.length;
                        i6 = 0;
                        while (i6 < length2) {
                            obj4 = spans[i6];
                            Object[] objArr7 = spans;
                            z = obj4 instanceof StrikethroughSpan;
                            String str18 = null;
                            if (z) {
                                i9 = length2;
                                strOooOO0o4 = "<span style='text-decoration:line-through;'>";
                                str10 = str17;
                            } else {
                                str10 = str17;
                                if (obj4 instanceof ForegroundColorSpan) {
                                    i9 = length2;
                                    strOooOO0o5 = o0O00.OooOO0o("<span style='color:%s;'>", OooO0o.OooO00o(((ForegroundColorSpan) obj4).getForegroundColor()));
                                } else {
                                    i9 = length2;
                                    if (obj4 instanceof BackgroundColorSpan) {
                                        strOooOO0o5 = o0O00.OooOO0o("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj4).getBackgroundColor()));
                                    } else if (obj4 instanceof o000OO0O) {
                                        strOooOO0o5 = "<span style='text-combine-upright:all;'>";
                                    } else if (obj4 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj4;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        strOooOO0o5 = o0O00.OooOO0o("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
                                    } else {
                                        if (obj4 instanceof RelativeSizeSpan) {
                                            strOooOO0o5 = o0O00.OooOO0o("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj4).getSizeChange() * 100.0f));
                                        } else if (obj4 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj4).getFamily();
                                            if (family != null) {
                                                strOooOO0o5 = o0O00.OooOO0o("<span style='font-family:\"%s\";'>", family);
                                            } else {
                                                strOooOO0o4 = null;
                                            }
                                        } else if (obj4 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj4).getStyle();
                                            if (style != 1) {
                                                strOooOO0o5 = "<b>";
                                            } else if (style != 2) {
                                                strOooOO0o5 = "<i>";
                                            } else if (style != 3) {
                                                strOooOO0o4 = null;
                                            } else {
                                                strOooOO0o5 = "<b><i>";
                                            }
                                        } else if (obj4 instanceof o000O) {
                                            i13 = ((o000O) obj4).f40223OooO0O0;
                                            if (i13 != -1) {
                                                strOooOO0o5 = "<ruby style='ruby-position:unset;'>";
                                            } else if (i13 != 1) {
                                                strOooOO0o5 = "<ruby style='ruby-position:over;'>";
                                            } else if (i13 != 2) {
                                                strOooOO0o4 = null;
                                            } else {
                                                strOooOO0o5 = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj4 instanceof UnderlineSpan) {
                                            strOooOO0o5 = "<u>";
                                        } else if (obj4 instanceof TextEmphasisSpan) {
                                            textEmphasisSpan = (TextEmphasisSpan) obj4;
                                            i10 = textEmphasisSpan.f13435OooO00o;
                                            sb2 = new StringBuilder();
                                            i11 = textEmphasisSpan.f13436OooO0O0;
                                            if (i11 != 1) {
                                                i12 = 2;
                                                if (i11 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i12 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i10 != 0) {
                                                sb2.append("none");
                                            } else if (i10 != 1) {
                                                sb2.append("circle");
                                            } else if (i10 != i12) {
                                                sb2.append("dot");
                                            } else if (i10 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (textEmphasisSpan.f13437OooO0OO != 2) {
                                                str11 = "over right";
                                            } else {
                                                str11 = "under left";
                                            }
                                            strOooOO0o4 = o0O00.OooOO0o("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", string, str11);
                                        } else {
                                            strOooOO0o4 = null;
                                        }
                                        strOooOO0o4 = strOooOO0o5;
                                    }
                                }
                                strOooOO0o4 = strOooOO0o5;
                            }
                            if (!z || (obj4 instanceof ForegroundColorSpan) || (obj4 instanceof BackgroundColorSpan) || (obj4 instanceof o000OO0O) || (obj4 instanceof AbsoluteSizeSpan) || (obj4 instanceof RelativeSizeSpan) || (obj4 instanceof TextEmphasisSpan)) {
                                str12 = "</span>";
                            } else {
                                if (obj4 instanceof TypefaceSpan) {
                                    if (((TypefaceSpan) obj4).getFamily() != null) {
                                        str12 = "</span>";
                                    }
                                } else if (obj4 instanceof StyleSpan) {
                                    int style2 = ((StyleSpan) obj4).getStyle();
                                    if (style2 == 1) {
                                        str13 = "</b>";
                                    } else if (style2 == 2) {
                                        str13 = "</i>";
                                    } else if (style2 == 3) {
                                        str13 = "</i></b>";
                                    }
                                    str18 = str13;
                                } else {
                                    if (obj4 instanceof o000O) {
                                        str13 = "<rt>" + o00O0O.OooO00o(((o000O) obj4).f40222OooO00o) + "</rt></ruby>";
                                    } else if (obj4 instanceof UnderlineSpan) {
                                        str13 = "</u>";
                                    }
                                    str18 = str13;
                                }
                                str12 = str18;
                            }
                            spanStart = spanned.getSpanStart(obj4);
                            spanEnd = spanned.getSpanEnd(obj4);
                            if (strOooOO0o4 != null) {
                                str12.getClass();
                                o00O0O.OooO0O0 oooO0O0 = new o00O0O.OooO0O0(spanStart, spanEnd, strOooOO0o4, str12);
                                oooO0OO = (o00O0O.OooO0OO) sparseArray.get(spanStart);
                                if (oooO0OO == null) {
                                    oooO0OO = new o00O0O.OooO0OO();
                                    sparseArray.put(spanStart, oooO0OO);
                                }
                                oooO0OO.f14129OooO00o.add(oooO0O0);
                                oooO0OO2 = (o00O0O.OooO0OO) sparseArray.get(spanEnd);
                                if (oooO0OO2 == null) {
                                    oooO0OO2 = new o00O0O.OooO0OO();
                                    sparseArray.put(spanEnd, oooO0OO2);
                                }
                                oooO0OO2.f14130OooO0O0.add(oooO0O0);
                            }
                            i6++;
                            spans = objArr7;
                            str17 = str10;
                            length2 = i9;
                            f2 = f2;
                            strOooOO0o3 = strOooOO0o3;
                            str4 = str4;
                        }
                        str7 = str4;
                        str8 = str17;
                        str9 = strOooOO0o3;
                        sb = new StringBuilder(spanned.length());
                        i7 = 0;
                        i8 = 0;
                        while (i7 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i7);
                            sb.append(o00O0O.OooO00o(spanned.subSequence(i8, iKeyAt)));
                            o00O0O.OooO0OO oooO0OO3 = (o00O0O.OooO0OO) sparseArray.get(iKeyAt);
                            Collections.sort(oooO0OO3.f14130OooO0O0, o00O0O.OooO0O0.f14123OooO0o);
                            it2 = oooO0OO3.f14130OooO0O0.iterator();
                            while (it2.hasNext()) {
                                sb.append(((o00O0O.OooO0O0) it2.next()).f14128OooO0Oo);
                            }
                            ArrayList arrayList = oooO0OO3.f14129OooO00o;
                            Collections.sort(arrayList, o00O0O.OooO0O0.f14124OooO0o0);
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                sb.append(((o00O0O.OooO0O0) it3.next()).f14127OooO0OO);
                            }
                            i7++;
                            i8 = iKeyAt;
                        }
                        sb.append(o00O0O.OooO00o(spanned.subSequence(i8, spanned.length())));
                        oooO00o = new o00O0O.OooO00o(sb.toString(), map);
                    } else {
                        oooO00o = new o00O0O.OooO00o(o00O0O.OooO00o(charSequence), o0OoO00O.f19626OooOO0);
                    }
                    for (String str19 : map2.keySet()) {
                        str16 = (String) map2.put(str19, (String) map2.get(str19));
                        if (str16 != null || str16.equals(map2.get(str19))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o00O000o.OooO0Oo(z2);
                    }
                    Object[] objArr8 = new Object[14];
                    objArr8[0] = Integer.valueOf(i17);
                    objArr8[1] = str2;
                    objArr8[2] = Float.valueOf(f5);
                    objArr8[3] = str3;
                    objArr8[4] = strOooOO0o2;
                    objArr8[5] = str7;
                    objArr8[6] = str9;
                    objArr8[7] = obj3;
                    objArr8[8] = str6;
                    objArr8[9] = strOooO0O0;
                    objArr8[10] = strOooO00o;
                    objArr8[11] = Integer.valueOf(i);
                    objArr8[12] = Integer.valueOf(i24);
                    f3 = cue.f13417OooOo00;
                    if (f3 != 0.0f) {
                        i14 = 1;
                        if (i25 != 2 || i25 == 1) {
                            str15 = "skewY";
                        } else {
                            str15 = "skewX";
                        }
                        strOooOO0o6 = o0O00.OooOO0o("%s(%.2fdeg)", str15, Float.valueOf(f3));
                    } else {
                        i14 = 1;
                        strOooOO0o6 = str5;
                    }
                    objArr8[13] = strOooOO0o6;
                    sb3 = sb4;
                    sb3.append(o0O00.OooOO0o("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr8));
                    Object[] objArr9 = new Object[i14];
                    objArr9[0] = "default_bg";
                    sb3.append(o0O00.OooOO0o("<span class='%s'>", objArr9));
                    str14 = oooO00o.f14121OooO00o;
                    alignment = cue.f13403OooO0o;
                    if (alignment != null) {
                        Object[] objArr10 = new Object[i14];
                        i15 = OooO0O0.f14032OooO00o[alignment.ordinal()];
                        i19 = 2;
                        if (i15 != i14) {
                            obj5 = obj;
                        } else if (i15 != 2) {
                            obj5 = "center";
                        } else {
                            obj5 = "end";
                        }
                        objArr10[0] = obj5;
                        sb3.append(o0O00.OooOO0o("<span style='display:inline-block; text-align:%s;'>", objArr10));
                        sb3.append(str14);
                        sb3.append("</span>");
                    } else {
                        sb3.append(str14);
                        i19 = 2;
                    }
                    sb3.append("</span></div>");
                    i17++;
                    i18 = 1;
                    i22 = 0;
                    webViewSubtitleOutput = this;
                    str17 = str8;
                }
                str7 = str4;
                str8 = str17;
                str9 = strOooOO0o3;
                str6 = str;
                obj3 = obj2;
                while (r0.hasNext()) {
                    str16 = (String) map2.put(str19, (String) map2.get(str19));
                    if (str16 != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    o00O000o.OooO0Oo(z2);
                }
                Object[] objArr11 = new Object[14];
                objArr11[0] = Integer.valueOf(i17);
                objArr11[1] = str2;
                objArr11[2] = Float.valueOf(f5);
                objArr11[3] = str3;
                objArr11[4] = strOooOO0o2;
                objArr11[5] = str7;
                objArr11[6] = str9;
                objArr11[7] = obj3;
                objArr11[8] = str6;
                objArr11[9] = strOooO0O0;
                objArr11[10] = strOooO00o;
                objArr11[11] = Integer.valueOf(i);
                objArr11[12] = Integer.valueOf(i24);
                f3 = cue.f13417OooOo00;
                if (f3 != 0.0f) {
                    i14 = 1;
                    if (i25 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    strOooOO0o6 = o0O00.OooOO0o("%s(%.2fdeg)", str15, Float.valueOf(f3));
                } else {
                    i14 = 1;
                    strOooOO0o6 = str5;
                }
                objArr11[13] = strOooOO0o6;
                sb3 = sb4;
                sb3.append(o0O00.OooOO0o("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr11));
                Object[] objArr12 = new Object[i14];
                objArr12[0] = "default_bg";
                sb3.append(o0O00.OooOO0o("<span class='%s'>", objArr12));
                str14 = oooO00o.f14121OooO00o;
                alignment = cue.f13403OooO0o;
                if (alignment != null) {
                    Object[] objArr13 = new Object[i14];
                    i15 = OooO0O0.f14032OooO00o[alignment.ordinal()];
                    i19 = 2;
                    if (i15 != i14) {
                        obj5 = obj;
                    } else if (i15 != 2) {
                        obj5 = "center";
                    } else {
                        obj5 = "end";
                    }
                    objArr13[0] = obj5;
                    sb3.append(o0O00.OooOO0o("<span style='display:inline-block; text-align:%s;'>", objArr13));
                    sb3.append(str14);
                    sb3.append("</span>");
                } else {
                    sb3.append(str14);
                    i19 = 2;
                }
                sb3.append("</span></div>");
                i17++;
                i18 = 1;
                i22 = 0;
                webViewSubtitleOutput = this;
                str17 = str8;
            }
            obj2 = "center";
            if (i25 != 1) {
                str = "vertical-rl";
            } else if (i25 != i2) {
                str = "horizontal-tb";
            } else {
                str = "vertical-lr";
            }
            String strOooO0O1 = webViewSubtitleOutput.OooO0O0(cue.f13414OooOOo, cue.f13415OooOOo0);
            if (cue.f13412OooOOOO) {
                i3 = cue.f13413OooOOOo;
            } else {
                i3 = webViewSubtitleOutput.f14029OooO0oO.f13751OooO0OO;
            }
            String strOooO00o3 = OooO0o.OooO00o(i3);
            str2 = ViewHierarchyConstants.DIMENSION_LEFT_KEY;
            str3 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
            if (i25 != 1) {
                if (i22 == 0) {
                    str2 = "right";
                }
                i4 = 2;
                str3 = str2;
                str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
            } else if (i25 != 2) {
                if (i22 != 0) {
                    str3 = "bottom";
                }
                i4 = 2;
            } else {
                if (i22 != 0) {
                    str2 = "right";
                }
                i4 = 2;
                str3 = str2;
                str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
            }
            if (i25 != i4) {
                str4 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
            } else {
                str4 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
            }
            f2 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = o00O0O.f14120OooO00o;
            StringBuilder sb5 = sb3;
            charSequence = cue.f13402OooO0Oo;
            if (charSequence == null) {
                oooO00o = new o00O0O.OooO00o("", o0OoO00O.f19626OooOO0);
                str5 = "";
            } else {
                str5 = "";
                if (charSequence instanceof Spanned) {
                    oooO00o = new o00O0O.OooO00o(o00O0O.OooO00o(charSequence), o0OoO00O.f19626OooOO0);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i5 = 0;
                    while (i5 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                        i5++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strOooO00o4 = android.support.v4.media.OooO00o.OooO00o("bg_", iIntValue2);
                        map.put(oO00Oo00.OooO00o(".", strOooO00o4, ",.", strOooO00o4, " *"), o0O00.OooOO0o(str17, OooO0o.OooO00o(iIntValue2)));
                        it = it;
                        str = str;
                        obj2 = obj2;
                    }
                    str6 = str;
                    obj3 = obj2;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    length2 = spans.length;
                    i6 = 0;
                    while (i6 < length2) {
                        obj4 = spans[i6];
                        Object[] objArr14 = spans;
                        z = obj4 instanceof StrikethroughSpan;
                        String str110 = null;
                        if (z) {
                            i9 = length2;
                            strOooOO0o4 = "<span style='text-decoration:line-through;'>";
                            str10 = str17;
                        } else {
                            str10 = str17;
                            if (obj4 instanceof ForegroundColorSpan) {
                                i9 = length2;
                                strOooOO0o5 = o0O00.OooOO0o("<span style='color:%s;'>", OooO0o.OooO00o(((ForegroundColorSpan) obj4).getForegroundColor()));
                            } else {
                                i9 = length2;
                                if (obj4 instanceof BackgroundColorSpan) {
                                    strOooOO0o5 = o0O00.OooOO0o("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj4).getBackgroundColor()));
                                } else if (obj4 instanceof o000OO0O) {
                                    strOooOO0o5 = "<span style='text-combine-upright:all;'>";
                                } else if (obj4 instanceof AbsoluteSizeSpan) {
                                    absoluteSizeSpan = (AbsoluteSizeSpan) obj4;
                                    if (absoluteSizeSpan.getDip()) {
                                        size = absoluteSizeSpan.getSize();
                                    } else {
                                        size = absoluteSizeSpan.getSize() / f2;
                                    }
                                    strOooOO0o5 = o0O00.OooOO0o("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
                                } else {
                                    if (obj4 instanceof RelativeSizeSpan) {
                                        strOooOO0o5 = o0O00.OooOO0o("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj4).getSizeChange() * 100.0f));
                                    } else if (obj4 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj4).getFamily();
                                        if (family != null) {
                                            strOooOO0o5 = o0O00.OooOO0o("<span style='font-family:\"%s\";'>", family);
                                        } else {
                                            strOooOO0o4 = null;
                                        }
                                    } else if (obj4 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj4).getStyle();
                                        if (style != 1) {
                                            strOooOO0o5 = "<b>";
                                        } else if (style != 2) {
                                            strOooOO0o5 = "<i>";
                                        } else if (style != 3) {
                                            strOooOO0o4 = null;
                                        } else {
                                            strOooOO0o5 = "<b><i>";
                                        }
                                    } else if (obj4 instanceof o000O) {
                                        i13 = ((o000O) obj4).f40223OooO0O0;
                                        if (i13 != -1) {
                                            strOooOO0o5 = "<ruby style='ruby-position:unset;'>";
                                        } else if (i13 != 1) {
                                            strOooOO0o5 = "<ruby style='ruby-position:over;'>";
                                        } else if (i13 != 2) {
                                            strOooOO0o4 = null;
                                        } else {
                                            strOooOO0o5 = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj4 instanceof UnderlineSpan) {
                                        strOooOO0o5 = "<u>";
                                    } else if (obj4 instanceof TextEmphasisSpan) {
                                        textEmphasisSpan = (TextEmphasisSpan) obj4;
                                        i10 = textEmphasisSpan.f13435OooO00o;
                                        sb2 = new StringBuilder();
                                        i11 = textEmphasisSpan.f13436OooO0O0;
                                        if (i11 != 1) {
                                            i12 = 2;
                                            if (i11 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i12 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i10 != 0) {
                                            sb2.append("none");
                                        } else if (i10 != 1) {
                                            sb2.append("circle");
                                        } else if (i10 != i12) {
                                            sb2.append("dot");
                                        } else if (i10 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (textEmphasisSpan.f13437OooO0OO != 2) {
                                            str11 = "over right";
                                        } else {
                                            str11 = "under left";
                                        }
                                        strOooOO0o4 = o0O00.OooOO0o("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", string2, str11);
                                    } else {
                                        strOooOO0o4 = null;
                                    }
                                    strOooOO0o4 = strOooOO0o5;
                                }
                            }
                            strOooOO0o4 = strOooOO0o5;
                        }
                        if (z) {
                            str12 = "</span>";
                        } else {
                            str12 = "</span>";
                        }
                        spanStart = spanned.getSpanStart(obj4);
                        spanEnd = spanned.getSpanEnd(obj4);
                        if (strOooOO0o4 != null) {
                            str12.getClass();
                            o00O0O.OooO0O0 oooO0O1 = new o00O0O.OooO0O0(spanStart, spanEnd, strOooOO0o4, str12);
                            oooO0OO = (o00O0O.OooO0OO) sparseArray.get(spanStart);
                            if (oooO0OO == null) {
                                oooO0OO = new o00O0O.OooO0OO();
                                sparseArray.put(spanStart, oooO0OO);
                            }
                            oooO0OO.f14129OooO00o.add(oooO0O1);
                            oooO0OO2 = (o00O0O.OooO0OO) sparseArray.get(spanEnd);
                            if (oooO0OO2 == null) {
                                oooO0OO2 = new o00O0O.OooO0OO();
                                sparseArray.put(spanEnd, oooO0OO2);
                            }
                            oooO0OO2.f14130OooO0O0.add(oooO0O1);
                        }
                        i6++;
                        spans = objArr14;
                        str17 = str10;
                        length2 = i9;
                        f2 = f2;
                        strOooOO0o3 = strOooOO0o3;
                        str4 = str4;
                    }
                    str7 = str4;
                    str8 = str17;
                    str9 = strOooOO0o3;
                    sb = new StringBuilder(spanned.length());
                    i7 = 0;
                    i8 = 0;
                    while (i7 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i7);
                        sb.append(o00O0O.OooO00o(spanned.subSequence(i8, iKeyAt2)));
                        o00O0O.OooO0OO oooO0OO4 = (o00O0O.OooO0OO) sparseArray.get(iKeyAt2);
                        Collections.sort(oooO0OO4.f14130OooO0O0, o00O0O.OooO0O0.f14123OooO0o);
                        it2 = oooO0OO4.f14130OooO0O0.iterator();
                        while (it2.hasNext()) {
                            sb.append(((o00O0O.OooO0O0) it2.next()).f14128OooO0Oo);
                        }
                        ArrayList arrayList2 = oooO0OO4.f14129OooO00o;
                        Collections.sort(arrayList2, o00O0O.OooO0O0.f14124OooO0o0);
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            sb.append(((o00O0O.OooO0O0) it3.next()).f14127OooO0OO);
                        }
                        i7++;
                        i8 = iKeyAt2;
                    }
                    sb.append(o00O0O.OooO00o(spanned.subSequence(i8, spanned.length())));
                    oooO00o = new o00O0O.OooO00o(sb.toString(), map);
                }
                while (r0.hasNext()) {
                    str16 = (String) map2.put(str19, (String) map2.get(str19));
                    if (str16 != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    o00O000o.OooO0Oo(z2);
                }
                Object[] objArr15 = new Object[14];
                objArr15[0] = Integer.valueOf(i17);
                objArr15[1] = str2;
                objArr15[2] = Float.valueOf(f5);
                objArr15[3] = str3;
                objArr15[4] = strOooOO0o2;
                objArr15[5] = str7;
                objArr15[6] = str9;
                objArr15[7] = obj3;
                objArr15[8] = str6;
                objArr15[9] = strOooO0O1;
                objArr15[10] = strOooO00o3;
                objArr15[11] = Integer.valueOf(i);
                objArr15[12] = Integer.valueOf(i24);
                f3 = cue.f13417OooOo00;
                if (f3 != 0.0f) {
                    i14 = 1;
                    if (i25 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    strOooOO0o6 = o0O00.OooOO0o("%s(%.2fdeg)", str15, Float.valueOf(f3));
                } else {
                    i14 = 1;
                    strOooOO0o6 = str5;
                }
                objArr15[13] = strOooOO0o6;
                sb3 = sb5;
                sb3.append(o0O00.OooOO0o("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr15));
                Object[] objArr16 = new Object[i14];
                objArr16[0] = "default_bg";
                sb3.append(o0O00.OooOO0o("<span class='%s'>", objArr16));
                str14 = oooO00o.f14121OooO00o;
                alignment = cue.f13403OooO0o;
                if (alignment != null) {
                    Object[] objArr17 = new Object[i14];
                    i15 = OooO0O0.f14032OooO00o[alignment.ordinal()];
                    i19 = 2;
                    if (i15 != i14) {
                        obj5 = obj;
                    } else if (i15 != 2) {
                        obj5 = "center";
                    } else {
                        obj5 = "end";
                    }
                    objArr17[0] = obj5;
                    sb3.append(o0O00.OooOO0o("<span style='display:inline-block; text-align:%s;'>", objArr17));
                    sb3.append(str14);
                    sb3.append("</span>");
                } else {
                    sb3.append(str14);
                    i19 = 2;
                }
                sb3.append("</span></div>");
                i17++;
                i18 = 1;
                i22 = 0;
                webViewSubtitleOutput = this;
                str17 = str8;
            }
            str7 = str4;
            str8 = str17;
            str9 = strOooOO0o3;
            str6 = str;
            obj3 = obj2;
            while (r0.hasNext()) {
                str16 = (String) map2.put(str19, (String) map2.get(str19));
                if (str16 != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                o00O000o.OooO0Oo(z2);
            }
            Object[] objArr18 = new Object[14];
            objArr18[0] = Integer.valueOf(i17);
            objArr18[1] = str2;
            objArr18[2] = Float.valueOf(f5);
            objArr18[3] = str3;
            objArr18[4] = strOooOO0o2;
            objArr18[5] = str7;
            objArr18[6] = str9;
            objArr18[7] = obj3;
            objArr18[8] = str6;
            objArr18[9] = strOooO0O1;
            objArr18[10] = strOooO00o3;
            objArr18[11] = Integer.valueOf(i);
            objArr18[12] = Integer.valueOf(i24);
            f3 = cue.f13417OooOo00;
            if (f3 != 0.0f) {
                i14 = 1;
                if (i25 != 2) {
                    str15 = "skewY";
                } else {
                    str15 = "skewY";
                }
                strOooOO0o6 = o0O00.OooOO0o("%s(%.2fdeg)", str15, Float.valueOf(f3));
            } else {
                i14 = 1;
                strOooOO0o6 = str5;
            }
            objArr18[13] = strOooOO0o6;
            sb3 = sb5;
            sb3.append(o0O00.OooOO0o("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr18));
            Object[] objArr19 = new Object[i14];
            objArr19[0] = "default_bg";
            sb3.append(o0O00.OooOO0o("<span class='%s'>", objArr19));
            str14 = oooO00o.f14121OooO00o;
            alignment = cue.f13403OooO0o;
            if (alignment != null) {
                Object[] objArr110 = new Object[i14];
                i15 = OooO0O0.f14032OooO00o[alignment.ordinal()];
                i19 = 2;
                if (i15 != i14) {
                    obj5 = obj;
                } else if (i15 != 2) {
                    obj5 = "center";
                } else {
                    obj5 = "end";
                }
                objArr110[0] = obj5;
                sb3.append(o0O00.OooOO0o("<span style='display:inline-block; text-align:%s;'>", objArr110));
                sb3.append(str14);
                sb3.append("</span>");
            } else {
                sb3.append(str14);
                i19 = 2;
            }
            sb3.append("</span></div>");
            i17++;
            i18 = 1;
            i22 = 0;
            webViewSubtitleOutput = this;
            str17 = str8;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb6 = new StringBuilder("<html><head><style>");
        for (String str20 : map2.keySet()) {
            sb6.append(str20);
            sb6.append("{");
            sb6.append((String) map2.get(str20));
            sb6.append("}");
        }
        sb6.append("</style></head>");
        sb3.insert(0, sb6.toString());
        this.f14028OooO0o0.loadData(Base64.encodeToString(sb3.toString().getBytes(com.google.common.base.OooO.f19059OooO0OO), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f14027OooO0o.isEmpty()) {
            return;
        }
        OooO0OO();
    }
}
