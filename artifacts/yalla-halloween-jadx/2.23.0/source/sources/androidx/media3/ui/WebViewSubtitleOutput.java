package androidx.media3.ui;

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
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.TextEmphasisSpan;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.collect.o0OoO00O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p023Oooo00o.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f6698OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CanvasSubtitleOutput f6699OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<Cue> f6700OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f6701OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public CaptionStyleCompat f6702OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f6703OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f6704OooOO0;

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
        public static final /* synthetic */ int[] f6705OooO00o;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f6705OooO00o = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6705OooO00o[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6705OooO00o[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6700OooO0o = Collections.emptyList();
        this.f6702OooO0oO = CaptionStyleCompat.f6460OooO0oO;
        this.f6703OooO0oo = 0.0533f;
        this.f6698OooO = 0;
        this.f6704OooOO0 = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f6699OooO0Oo = canvasSubtitleOutput;
        OooO00o oooO00o = new OooO00o(context, attributeSet);
        this.f6701OooO0o0 = oooO00o;
        oooO00o.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(oooO00o);
    }

    @Override // androidx.media3.ui.SubtitleView.OooO00o
    public final void OooO00o(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f6702OooO0oO = captionStyleCompat;
        this.f6703OooO0oo = f;
        this.f6698OooO = i;
        this.f6704OooOO0 = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.f6231OooO0Oo != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.f6700OooO0o.isEmpty() || !arrayList2.isEmpty()) {
            this.f6700OooO0o = arrayList2;
            OooO0OO();
        }
        this.f6699OooO0Oo.OooO00o(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    public final String OooO0O0(float f, int i) {
        float fOooO0O0 = o000.OooO0O0(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fOooO0O0 == -3.4028235E38f ? "unset" : o000O000.OooO0o.OooO0O0("%.2fpx", Float.valueOf(fOooO0O0 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0239  */
    /* JADX WARN: Code duplicated, block: B:102:0x0257 A[LOOP:2: B:101:0x0255->B:102:0x0257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x027a A[LOOP:3: B:104:0x0274->B:106:0x027a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0302  */
    /* JADX WARN: Code duplicated, block: B:117:0x0309  */
    /* JADX WARN: Code duplicated, block: B:118:0x0322  */
    /* JADX WARN: Code duplicated, block: B:120:0x0326  */
    /* JADX WARN: Code duplicated, block: B:122:0x032f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0335  */
    /* JADX WARN: Code duplicated, block: B:125:0x034e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0353  */
    /* JADX WARN: Code duplicated, block: B:128:0x0370  */
    /* JADX WARN: Code duplicated, block: B:130:0x0376  */
    /* JADX WARN: Code duplicated, block: B:132:0x037f  */
    /* JADX WARN: Code duplicated, block: B:133:0x038b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0390  */
    /* JADX WARN: Code duplicated, block: B:137:0x0399  */
    /* JADX WARN: Code duplicated, block: B:139:0x039c  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:151:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:153:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x03db  */
    /* JADX WARN: Code duplicated, block: B:194:0x0457  */
    /* JADX WARN: Code duplicated, block: B:197:0x0465  */
    /* JADX WARN: Code duplicated, block: B:199:0x0475  */
    /* JADX WARN: Code duplicated, block: B:202:0x048a  */
    /* JADX WARN: Code duplicated, block: B:208:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:211:0x04de A[LOOP:6: B:209:0x04d8->B:211:0x04de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x04fb A[LOOP:7: B:213:0x04f5->B:215:0x04fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x0531  */
    /* JADX WARN: Code duplicated, block: B:223:0x0545  */
    /* JADX WARN: Code duplicated, block: B:227:0x0552  */
    /* JADX WARN: Code duplicated, block: B:231:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:233:0x05a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:236:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:238:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:241:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:243:0x05f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:244:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:245:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:246:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:248:0x0614  */
    /* JADX WARN: Code duplicated, block: B:266:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x020f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219  */
    /* JADX WARN: Code duplicated, block: B:98:0x021f  */
    public final void OooO0OO() {
        String strOooO0O0;
        float f;
        String strOooO0O1;
        int i;
        String strOooO0O2;
        int i2;
        Object obj;
        Object obj2;
        String str;
        String strOooO0O3;
        int i3;
        String str2;
        String str3;
        int i4;
        String str4;
        float f2;
        StringBuilder sb;
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
        String str7;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i6;
        String str8;
        StringBuilder sb2;
        int i7;
        int i8;
        o0000O0.OooO00o oooO00o;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z;
        String str9;
        int i9;
        String strOooO0O4;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        float f3;
        String str10;
        int spanStart;
        int spanEnd;
        o0000O0.OooO0OO oooO0OO;
        o0000O0.OooO0OO oooO0OO2;
        String string;
        String str11;
        float f4;
        int i10;
        String strOooO0O5;
        String str12;
        Layout.Alignment alignment;
        int i11;
        Object obj4;
        String str13;
        String str14;
        boolean z2;
        String strOooO0O6;
        int i12;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr = new Object[4];
        int i13 = 0;
        objArr[0] = OooO0o.OooO00o(webViewSubtitleOutput.f6702OooO0oO.f6461OooO00o);
        int i14 = 1;
        objArr[1] = webViewSubtitleOutput.OooO0O0(webViewSubtitleOutput.f6703OooO0oo, webViewSubtitleOutput.f6698OooO);
        int i15 = 2;
        objArr[2] = Float.valueOf(1.2f);
        CaptionStyleCompat captionStyleCompat = webViewSubtitleOutput.f6702OooO0oO;
        int i16 = captionStyleCompat.f6464OooO0Oo;
        int i17 = captionStyleCompat.f6466OooO0o0;
        if (i16 == 1) {
            strOooO0O0 = o000O000.OooO0o.OooO0O0("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", OooO0o.OooO00o(i17));
        } else if (i16 == 2) {
            strOooO0O0 = o000O000.OooO0o.OooO0O0("0.1em 0.12em 0.15em %s", OooO0o.OooO00o(i17));
        } else if (i16 != 3) {
            strOooO0O0 = i16 != 4 ? "unset" : o000O000.OooO0o.OooO0O0("-0.05em -0.05em 0.15em %s", OooO0o.OooO00o(i17));
        } else {
            strOooO0O0 = o000O000.OooO0o.OooO0O0("0.06em 0.08em 0.15em %s", OooO0o.OooO00o(i17));
        }
        objArr[3] = strOooO0O0;
        sb3.append(o000O000.OooO0o.OooO0O0("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr));
        HashMap map2 = new HashMap();
        String str15 = "background-color:%s;";
        map2.put(".default_bg,.default_bg *", o000O000.OooO0o.OooO0O0("background-color:%s;", OooO0o.OooO00o(webViewSubtitleOutput.f6702OooO0oO.f6462OooO0O0)));
        int i18 = 0;
        while (i13 < webViewSubtitleOutput.f6700OooO0o.size()) {
            Cue cue = webViewSubtitleOutput.f6700OooO0o.get(i13);
            float f5 = cue.f6235OooO0oo;
            float f6 = f5 != -3.4028235E38f ? f5 * 100.0f : 50.0f;
            int i19 = cue.f6227OooO;
            int i20 = i19 != i14 ? i19 != i15 ? i18 : -100 : -50;
            float f7 = cue.f6233OooO0o0;
            int i21 = cue.f6242OooOOOo;
            if (f7 != -3.4028235E38f) {
                if (cue.f6232OooO0o != i14) {
                    Object[] objArr2 = new Object[i14];
                    objArr2[i18] = Float.valueOf(f7 * 100.0f);
                    strOooO0O6 = o000O000.OooO0o.OooO0O0("%.2f%%", objArr2);
                    int i22 = cue.f6234OooO0oO;
                    if (i21 == i14) {
                        i12 = -(i22 != i14 ? i22 != i15 ? i18 : -100 : -50);
                    } else if (i22 != i14) {
                        i12 = i22 != i15 ? i18 : -100;
                    } else {
                        i12 = -50;
                    }
                    i = i12;
                } else if (f7 >= 0.0f) {
                    Object[] objArr3 = new Object[i14];
                    objArr3[i18] = Float.valueOf(f7 * 1.2f);
                    strOooO0O6 = o000O000.OooO0o.OooO0O0("%.2fem", objArr3);
                    i = i18;
                } else {
                    Object[] objArr4 = new Object[i14];
                    objArr4[i18] = Float.valueOf(((-f7) - 1.0f) * 1.2f);
                    i = i18;
                    i18 = i14;
                    strOooO0O1 = o000O000.OooO0o.OooO0O0("%.2fem", objArr4);
                    f = 100.0f;
                }
                strOooO0O1 = strOooO0O6;
                f = 100.0f;
            } else {
                Object[] objArr5 = new Object[i14];
                f = 100.0f;
                objArr5[i18] = Float.valueOf((1.0f - webViewSubtitleOutput.f6704OooOO0) * 100.0f);
                strOooO0O1 = o000O000.OooO0o.OooO0O0("%.2f%%", objArr5);
                i = -100;
            }
            float f8 = cue.f6236OooOO0;
            if (f8 != -3.4028235E38f) {
                Object[] objArr6 = new Object[i14];
                objArr6[0] = Float.valueOf(f8 * f);
                strOooO0O2 = o000O000.OooO0o.OooO0O0("%.2f%%", objArr6);
            } else {
                strOooO0O2 = "fit-content";
            }
            Layout.Alignment alignment2 = cue.f6229OooO0O0;
            if (alignment2 == null) {
                i2 = 2;
                obj2 = "start";
            } else {
                int i23 = OooO0O0.f6705OooO00o[alignment2.ordinal()];
                if (i23 != i14) {
                    i2 = 2;
                    obj2 = "start";
                    if (i23 == 2) {
                        obj = "end";
                    }
                } else {
                    i2 = 2;
                    obj = "start";
                    obj2 = obj;
                }
                if (i21 != 1) {
                    str = "vertical-rl";
                } else if (i21 != i2) {
                    str = "horizontal-tb";
                } else {
                    str = "vertical-lr";
                }
                int i24 = i20;
                strOooO0O3 = webViewSubtitleOutput.OooO0O0(cue.f6241OooOOOO, cue.f6239OooOOO);
                if (cue.f6238OooOO0o) {
                    i3 = cue.f6240OooOOO0;
                } else {
                    i3 = webViewSubtitleOutput.f6702OooO0oO.f6463OooO0OO;
                }
                String strOooO00o = OooO0o.OooO00o(i3);
                str2 = ViewHierarchyConstants.DIMENSION_LEFT_KEY;
                str3 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
                if (i21 != 1) {
                    if (i18 == 0) {
                        str2 = "right";
                    }
                    i4 = 2;
                    str3 = str2;
                    str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
                } else if (i21 != 2) {
                    if (i18 != 0) {
                        str3 = "bottom";
                    }
                    i4 = 2;
                } else {
                    if (i18 != 0) {
                        str2 = "right";
                    }
                    i4 = 2;
                    str3 = str2;
                    str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
                }
                if (i21 != i4 || i21 == 1) {
                    str4 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
                } else {
                    str4 = ViewHierarchyConstants.DIMENSION_WIDTH_KEY;
                    i24 = i;
                    i = i24;
                }
                f2 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = o0000O0.f6742OooO00o;
                sb = sb3;
                charSequence = cue.f6228OooO00o;
                if (charSequence == null) {
                    oooO00o = new o0000O0.OooO00o("", o0OoO00O.f19626OooOO0);
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
                            map.put(oO00Oo00.OooO00o(".", strOooO00o2, ",.", strOooO00o2, " *"), o000O000.OooO0o.OooO0O0(str15, OooO0o.OooO00o(iIntValue)));
                            it = it;
                            strOooO0O3 = strOooO0O3;
                            str = str;
                        }
                        str6 = str;
                        str7 = strOooO0O3;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        length2 = spans.length;
                        i6 = 0;
                        while (i6 < length2) {
                            obj3 = spans[i6];
                            Object[] objArr7 = spans;
                            z = obj3 instanceof StrikethroughSpan;
                            String str16 = null;
                            if (z) {
                                i9 = length2;
                                str9 = str15;
                                strOooO0O4 = "<span style='text-decoration:line-through;'>";
                            } else {
                                str9 = str15;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    i9 = length2;
                                    strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='color:%s;'>", OooO0o.OooO00o(((ForegroundColorSpan) obj3).getForegroundColor()));
                                } else {
                                    i9 = length2;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        strOooO0O4 = o000O000.OooO0o.OooO0O0("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj3).getBackgroundColor()));
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f));
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='font-family:\"%s\";'>", family);
                                        } else {
                                            strOooO0O4 = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strOooO0O4 = "<b>";
                                        } else if (style != 2) {
                                            strOooO0O4 = "<i>";
                                        } else if (style != 3) {
                                            strOooO0O4 = null;
                                        } else {
                                            strOooO0O4 = "<b><i>";
                                        }
                                    } else {
                                        if (obj3 instanceof o000.OooO0OO) {
                                            ((o000.OooO0OO) obj3).getClass();
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strOooO0O4 = "<u>";
                                        } else if (obj3 instanceof TextEmphasisSpan) {
                                            ((TextEmphasisSpan) obj3).getClass();
                                            strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", "none", "over right");
                                        }
                                        strOooO0O4 = null;
                                    }
                                }
                            }
                            if (!z || (obj3 instanceof ForegroundColorSpan) || (obj3 instanceof BackgroundColorSpan) || (obj3 instanceof AbsoluteSizeSpan) || (obj3 instanceof RelativeSizeSpan) || (obj3 instanceof TextEmphasisSpan)) {
                                f3 = f2;
                                str10 = "</span>";
                            } else {
                                if (!(obj3 instanceof TypefaceSpan)) {
                                    if (obj3 instanceof StyleSpan) {
                                        int style2 = ((StyleSpan) obj3).getStyle();
                                        if (style2 == 1) {
                                            str11 = "</b>";
                                        } else if (style2 == 2) {
                                            str11 = "</i>";
                                        } else if (style2 == 3) {
                                            str11 = "</i></b>";
                                        }
                                        str16 = str11;
                                    } else {
                                        if (obj3 instanceof o000.OooO0OO) {
                                            f3 = f2;
                                            StringBuilder sb4 = new StringBuilder("<rt>");
                                            ((o000.OooO0OO) obj3).getClass();
                                            sb4.append(o0000O0.OooO00o(null));
                                            sb4.append("</rt></ruby>");
                                            string = sb4.toString();
                                        } else {
                                            f3 = f2;
                                            if (obj3 instanceof UnderlineSpan) {
                                                string = "</u>";
                                            }
                                        }
                                        str16 = string;
                                    }
                                    str10 = str16;
                                } else if (((TypefaceSpan) obj3).getFamily() != null) {
                                    f3 = f2;
                                    str10 = "</span>";
                                }
                                f3 = f2;
                                str10 = str16;
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strOooO0O4 != null) {
                                str10.getClass();
                                o0000O0.OooO0O0 oooO0O0 = new o0000O0.OooO0O0(spanStart, spanEnd, strOooO0O4, str10);
                                oooO0OO = (o0000O0.OooO0OO) sparseArray.get(spanStart);
                                if (oooO0OO == null) {
                                    oooO0OO = new o0000O0.OooO0OO();
                                    sparseArray.put(spanStart, oooO0OO);
                                }
                                oooO0OO.f6751OooO00o.add(oooO0O0);
                                oooO0OO2 = (o0000O0.OooO0OO) sparseArray.get(spanEnd);
                                if (oooO0OO2 == null) {
                                    oooO0OO2 = new o0000O0.OooO0OO();
                                    sparseArray.put(spanEnd, oooO0OO2);
                                }
                                oooO0OO2.f6752OooO0O0.add(oooO0O0);
                            }
                            i6++;
                            spans = objArr7;
                            str15 = str9;
                            length2 = i9;
                            f2 = f3;
                        }
                        str8 = str15;
                        sb2 = new StringBuilder(spanned.length());
                        i7 = 0;
                        i8 = 0;
                        while (i7 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i7);
                            sb2.append(o0000O0.OooO00o(spanned.subSequence(i8, iKeyAt)));
                            o0000O0.OooO0OO oooO0OO3 = (o0000O0.OooO0OO) sparseArray.get(iKeyAt);
                            Collections.sort(oooO0OO3.f6752OooO0O0, o0000O0.OooO0O0.f6745OooO0o);
                            it2 = oooO0OO3.f6752OooO0O0.iterator();
                            while (it2.hasNext()) {
                                sb2.append(((o0000O0.OooO0O0) it2.next()).f6750OooO0Oo);
                            }
                            ArrayList arrayList = oooO0OO3.f6751OooO00o;
                            Collections.sort(arrayList, o0000O0.OooO0O0.f6746OooO0o0);
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                sb2.append(((o0000O0.OooO0O0) it3.next()).f6749OooO0OO);
                            }
                            i7++;
                            i8 = iKeyAt;
                        }
                        sb2.append(o0000O0.OooO00o(spanned.subSequence(i8, spanned.length())));
                        oooO00o = new o0000O0.OooO00o(sb2.toString(), map);
                    } else {
                        oooO00o = new o0000O0.OooO00o(o0000O0.OooO00o(charSequence), o0OoO00O.f19626OooOO0);
                    }
                    for (String str17 : map2.keySet()) {
                        str14 = (String) map2.put(str17, (String) map2.get(str17));
                        if (str14 != null || str14.equals(map2.get(str17))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o000O000.OooO00o.OooO0O0(z2);
                    }
                    Object[] objArr8 = new Object[14];
                    objArr8[0] = Integer.valueOf(i13);
                    objArr8[1] = str2;
                    objArr8[2] = Float.valueOf(f6);
                    objArr8[3] = str3;
                    objArr8[4] = strOooO0O1;
                    objArr8[5] = str4;
                    objArr8[6] = strOooO0O2;
                    objArr8[7] = obj;
                    objArr8[8] = str6;
                    objArr8[9] = str7;
                    objArr8[10] = strOooO00o;
                    objArr8[11] = Integer.valueOf(i);
                    objArr8[12] = Integer.valueOf(i24);
                    f4 = cue.f6243OooOOo0;
                    if (f4 != 0.0f) {
                        i10 = 1;
                        if (i21 != 2 || i21 == 1) {
                            str13 = "skewY";
                        } else {
                            str13 = "skewX";
                        }
                        strOooO0O5 = o000O000.OooO0o.OooO0O0("%s(%.2fdeg)", str13, Float.valueOf(f4));
                    } else {
                        i10 = 1;
                        strOooO0O5 = str5;
                    }
                    objArr8[13] = strOooO0O5;
                    sb.append(o000O000.OooO0o.OooO0O0("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr8));
                    Object[] objArr9 = new Object[i10];
                    objArr9[0] = "default_bg";
                    sb.append(o000O000.OooO0o.OooO0O0("<span class='%s'>", objArr9));
                    str12 = oooO00o.f6743OooO00o;
                    alignment = cue.f6230OooO0OO;
                    if (alignment != null) {
                        Object[] objArr10 = new Object[i10];
                        i11 = OooO0O0.f6705OooO00o[alignment.ordinal()];
                        i15 = 2;
                        if (i11 != i10) {
                            obj4 = obj2;
                        } else if (i11 != 2) {
                            obj4 = "center";
                        } else {
                            obj4 = "end";
                        }
                        objArr10[0] = obj4;
                        sb.append(o000O000.OooO0o.OooO0O0("<span style='display:inline-block; text-align:%s;'>", objArr10));
                        sb.append(str12);
                        sb.append("</span>");
                    } else {
                        sb.append(str12);
                        i15 = 2;
                    }
                    sb.append("</span></div>");
                    i13++;
                    i14 = 1;
                    sb3 = sb;
                    str15 = str8;
                    i18 = 0;
                    webViewSubtitleOutput = this;
                }
                str8 = str15;
                str6 = str;
                str7 = strOooO0O3;
                while (r0.hasNext()) {
                    str14 = (String) map2.put(str17, (String) map2.get(str17));
                    if (str14 != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    o000O000.OooO00o.OooO0O0(z2);
                }
                Object[] objArr11 = new Object[14];
                objArr11[0] = Integer.valueOf(i13);
                objArr11[1] = str2;
                objArr11[2] = Float.valueOf(f6);
                objArr11[3] = str3;
                objArr11[4] = strOooO0O1;
                objArr11[5] = str4;
                objArr11[6] = strOooO0O2;
                objArr11[7] = obj;
                objArr11[8] = str6;
                objArr11[9] = str7;
                objArr11[10] = strOooO00o;
                objArr11[11] = Integer.valueOf(i);
                objArr11[12] = Integer.valueOf(i24);
                f4 = cue.f6243OooOOo0;
                if (f4 != 0.0f) {
                    i10 = 1;
                    if (i21 != 2) {
                        str13 = "skewY";
                    } else {
                        str13 = "skewY";
                    }
                    strOooO0O5 = o000O000.OooO0o.OooO0O0("%s(%.2fdeg)", str13, Float.valueOf(f4));
                } else {
                    i10 = 1;
                    strOooO0O5 = str5;
                }
                objArr11[13] = strOooO0O5;
                sb.append(o000O000.OooO0o.OooO0O0("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr11));
                Object[] objArr12 = new Object[i10];
                objArr12[0] = "default_bg";
                sb.append(o000O000.OooO0o.OooO0O0("<span class='%s'>", objArr12));
                str12 = oooO00o.f6743OooO00o;
                alignment = cue.f6230OooO0OO;
                if (alignment != null) {
                    Object[] objArr13 = new Object[i10];
                    i11 = OooO0O0.f6705OooO00o[alignment.ordinal()];
                    i15 = 2;
                    if (i11 != i10) {
                        obj4 = obj2;
                    } else if (i11 != 2) {
                        obj4 = "center";
                    } else {
                        obj4 = "end";
                    }
                    objArr13[0] = obj4;
                    sb.append(o000O000.OooO0o.OooO0O0("<span style='display:inline-block; text-align:%s;'>", objArr13));
                    sb.append(str12);
                    sb.append("</span>");
                } else {
                    sb.append(str12);
                    i15 = 2;
                }
                sb.append("</span></div>");
                i13++;
                i14 = 1;
                sb3 = sb;
                str15 = str8;
                i18 = 0;
                webViewSubtitleOutput = this;
            }
            obj = "center";
            if (i21 != 1) {
                str = "vertical-rl";
            } else if (i21 != i2) {
                str = "horizontal-tb";
            } else {
                str = "vertical-lr";
            }
            int i25 = i20;
            strOooO0O3 = webViewSubtitleOutput.OooO0O0(cue.f6241OooOOOO, cue.f6239OooOOO);
            if (cue.f6238OooOO0o) {
                i3 = cue.f6240OooOOO0;
            } else {
                i3 = webViewSubtitleOutput.f6702OooO0oO.f6463OooO0OO;
            }
            String strOooO00o3 = OooO0o.OooO00o(i3);
            str2 = ViewHierarchyConstants.DIMENSION_LEFT_KEY;
            str3 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
            if (i21 != 1) {
                if (i18 == 0) {
                    str2 = "right";
                }
                i4 = 2;
                str3 = str2;
                str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
            } else if (i21 != 2) {
                if (i18 != 0) {
                    str3 = "bottom";
                }
                i4 = 2;
            } else {
                if (i18 != 0) {
                    str2 = "right";
                }
                i4 = 2;
                str3 = str2;
                str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
            }
            if (i21 != i4) {
                str4 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
            } else {
                str4 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
            }
            f2 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = o0000O0.f6742OooO00o;
            sb = sb3;
            charSequence = cue.f6228OooO00o;
            if (charSequence == null) {
                oooO00o = new o0000O0.OooO00o("", o0OoO00O.f19626OooOO0);
                str5 = "";
            } else {
                str5 = "";
                if (charSequence instanceof Spanned) {
                    oooO00o = new o0000O0.OooO00o(o0000O0.OooO00o(charSequence), o0OoO00O.f19626OooOO0);
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
                        map.put(oO00Oo00.OooO00o(".", strOooO00o4, ",.", strOooO00o4, " *"), o000O000.OooO0o.OooO0O0(str15, OooO0o.OooO00o(iIntValue2)));
                        it = it;
                        strOooO0O3 = strOooO0O3;
                        str = str;
                    }
                    str6 = str;
                    str7 = strOooO0O3;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    length2 = spans.length;
                    i6 = 0;
                    while (i6 < length2) {
                        obj3 = spans[i6];
                        Object[] objArr14 = spans;
                        z = obj3 instanceof StrikethroughSpan;
                        String str18 = null;
                        if (z) {
                            i9 = length2;
                            str9 = str15;
                            strOooO0O4 = "<span style='text-decoration:line-through;'>";
                        } else {
                            str9 = str15;
                            if (obj3 instanceof ForegroundColorSpan) {
                                i9 = length2;
                                strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='color:%s;'>", OooO0o.OooO00o(((ForegroundColorSpan) obj3).getForegroundColor()));
                            } else {
                                i9 = length2;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    strOooO0O4 = o000O000.OooO0o.OooO0O0("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj3).getBackgroundColor()));
                                } else if (obj3 instanceof AbsoluteSizeSpan) {
                                    absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                    if (absoluteSizeSpan.getDip()) {
                                        size = absoluteSizeSpan.getSize();
                                    } else {
                                        size = absoluteSizeSpan.getSize() / f2;
                                    }
                                    strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
                                } else if (obj3 instanceof RelativeSizeSpan) {
                                    strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f));
                                } else if (obj3 instanceof TypefaceSpan) {
                                    family = ((TypefaceSpan) obj3).getFamily();
                                    if (family != null) {
                                        strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='font-family:\"%s\";'>", family);
                                    } else {
                                        strOooO0O4 = null;
                                    }
                                } else if (obj3 instanceof StyleSpan) {
                                    style = ((StyleSpan) obj3).getStyle();
                                    if (style != 1) {
                                        strOooO0O4 = "<b>";
                                    } else if (style != 2) {
                                        strOooO0O4 = "<i>";
                                    } else if (style != 3) {
                                        strOooO0O4 = null;
                                    } else {
                                        strOooO0O4 = "<b><i>";
                                    }
                                } else {
                                    if (obj3 instanceof o000.OooO0OO) {
                                        ((o000.OooO0OO) obj3).getClass();
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strOooO0O4 = "<u>";
                                    } else if (obj3 instanceof TextEmphasisSpan) {
                                        ((TextEmphasisSpan) obj3).getClass();
                                        strOooO0O4 = o000O000.OooO0o.OooO0O0("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", "none", "over right");
                                    }
                                    strOooO0O4 = null;
                                }
                            }
                        }
                        if (z) {
                            f3 = f2;
                            str10 = "</span>";
                        } else {
                            f3 = f2;
                            str10 = "</span>";
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strOooO0O4 != null) {
                            str10.getClass();
                            o0000O0.OooO0O0 oooO0O1 = new o0000O0.OooO0O0(spanStart, spanEnd, strOooO0O4, str10);
                            oooO0OO = (o0000O0.OooO0OO) sparseArray.get(spanStart);
                            if (oooO0OO == null) {
                                oooO0OO = new o0000O0.OooO0OO();
                                sparseArray.put(spanStart, oooO0OO);
                            }
                            oooO0OO.f6751OooO00o.add(oooO0O1);
                            oooO0OO2 = (o0000O0.OooO0OO) sparseArray.get(spanEnd);
                            if (oooO0OO2 == null) {
                                oooO0OO2 = new o0000O0.OooO0OO();
                                sparseArray.put(spanEnd, oooO0OO2);
                            }
                            oooO0OO2.f6752OooO0O0.add(oooO0O1);
                        }
                        i6++;
                        spans = objArr14;
                        str15 = str9;
                        length2 = i9;
                        f2 = f3;
                    }
                    str8 = str15;
                    sb2 = new StringBuilder(spanned.length());
                    i7 = 0;
                    i8 = 0;
                    while (i7 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i7);
                        sb2.append(o0000O0.OooO00o(spanned.subSequence(i8, iKeyAt2)));
                        o0000O0.OooO0OO oooO0OO4 = (o0000O0.OooO0OO) sparseArray.get(iKeyAt2);
                        Collections.sort(oooO0OO4.f6752OooO0O0, o0000O0.OooO0O0.f6745OooO0o);
                        it2 = oooO0OO4.f6752OooO0O0.iterator();
                        while (it2.hasNext()) {
                            sb2.append(((o0000O0.OooO0O0) it2.next()).f6750OooO0Oo);
                        }
                        ArrayList arrayList2 = oooO0OO4.f6751OooO00o;
                        Collections.sort(arrayList2, o0000O0.OooO0O0.f6746OooO0o0);
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            sb2.append(((o0000O0.OooO0O0) it3.next()).f6749OooO0OO);
                        }
                        i7++;
                        i8 = iKeyAt2;
                    }
                    sb2.append(o0000O0.OooO00o(spanned.subSequence(i8, spanned.length())));
                    oooO00o = new o0000O0.OooO00o(sb2.toString(), map);
                }
                while (r0.hasNext()) {
                    str14 = (String) map2.put(str17, (String) map2.get(str17));
                    if (str14 != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    o000O000.OooO00o.OooO0O0(z2);
                }
                Object[] objArr15 = new Object[14];
                objArr15[0] = Integer.valueOf(i13);
                objArr15[1] = str2;
                objArr15[2] = Float.valueOf(f6);
                objArr15[3] = str3;
                objArr15[4] = strOooO0O1;
                objArr15[5] = str4;
                objArr15[6] = strOooO0O2;
                objArr15[7] = obj;
                objArr15[8] = str6;
                objArr15[9] = str7;
                objArr15[10] = strOooO00o3;
                objArr15[11] = Integer.valueOf(i);
                objArr15[12] = Integer.valueOf(i25);
                f4 = cue.f6243OooOOo0;
                if (f4 != 0.0f) {
                    i10 = 1;
                    if (i21 != 2) {
                        str13 = "skewY";
                    } else {
                        str13 = "skewY";
                    }
                    strOooO0O5 = o000O000.OooO0o.OooO0O0("%s(%.2fdeg)", str13, Float.valueOf(f4));
                } else {
                    i10 = 1;
                    strOooO0O5 = str5;
                }
                objArr15[13] = strOooO0O5;
                sb.append(o000O000.OooO0o.OooO0O0("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr15));
                Object[] objArr16 = new Object[i10];
                objArr16[0] = "default_bg";
                sb.append(o000O000.OooO0o.OooO0O0("<span class='%s'>", objArr16));
                str12 = oooO00o.f6743OooO00o;
                alignment = cue.f6230OooO0OO;
                if (alignment != null) {
                    Object[] objArr17 = new Object[i10];
                    i11 = OooO0O0.f6705OooO00o[alignment.ordinal()];
                    i15 = 2;
                    if (i11 != i10) {
                        obj4 = obj2;
                    } else if (i11 != 2) {
                        obj4 = "center";
                    } else {
                        obj4 = "end";
                    }
                    objArr17[0] = obj4;
                    sb.append(o000O000.OooO0o.OooO0O0("<span style='display:inline-block; text-align:%s;'>", objArr17));
                    sb.append(str12);
                    sb.append("</span>");
                } else {
                    sb.append(str12);
                    i15 = 2;
                }
                sb.append("</span></div>");
                i13++;
                i14 = 1;
                sb3 = sb;
                str15 = str8;
                i18 = 0;
                webViewSubtitleOutput = this;
            }
            str8 = str15;
            str6 = str;
            str7 = strOooO0O3;
            while (r0.hasNext()) {
                str14 = (String) map2.put(str17, (String) map2.get(str17));
                if (str14 != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                o000O000.OooO00o.OooO0O0(z2);
            }
            Object[] objArr18 = new Object[14];
            objArr18[0] = Integer.valueOf(i13);
            objArr18[1] = str2;
            objArr18[2] = Float.valueOf(f6);
            objArr18[3] = str3;
            objArr18[4] = strOooO0O1;
            objArr18[5] = str4;
            objArr18[6] = strOooO0O2;
            objArr18[7] = obj;
            objArr18[8] = str6;
            objArr18[9] = str7;
            objArr18[10] = strOooO00o3;
            objArr18[11] = Integer.valueOf(i);
            objArr18[12] = Integer.valueOf(i25);
            f4 = cue.f6243OooOOo0;
            if (f4 != 0.0f) {
                i10 = 1;
                if (i21 != 2) {
                    str13 = "skewY";
                } else {
                    str13 = "skewY";
                }
                strOooO0O5 = o000O000.OooO0o.OooO0O0("%s(%.2fdeg)", str13, Float.valueOf(f4));
            } else {
                i10 = 1;
                strOooO0O5 = str5;
            }
            objArr18[13] = strOooO0O5;
            sb.append(o000O000.OooO0o.OooO0O0("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr18));
            Object[] objArr19 = new Object[i10];
            objArr19[0] = "default_bg";
            sb.append(o000O000.OooO0o.OooO0O0("<span class='%s'>", objArr19));
            str12 = oooO00o.f6743OooO00o;
            alignment = cue.f6230OooO0OO;
            if (alignment != null) {
                Object[] objArr110 = new Object[i10];
                i11 = OooO0O0.f6705OooO00o[alignment.ordinal()];
                i15 = 2;
                if (i11 != i10) {
                    obj4 = obj2;
                } else if (i11 != 2) {
                    obj4 = "center";
                } else {
                    obj4 = "end";
                }
                objArr110[0] = obj4;
                sb.append(o000O000.OooO0o.OooO0O0("<span style='display:inline-block; text-align:%s;'>", objArr110));
                sb.append(str12);
                sb.append("</span>");
            } else {
                sb.append(str12);
                i15 = 2;
            }
            sb.append("</span></div>");
            i13++;
            i14 = 1;
            sb3 = sb;
            str15 = str8;
            i18 = 0;
            webViewSubtitleOutput = this;
        }
        StringBuilder sb5 = sb3;
        sb5.append("</div></body></html>");
        StringBuilder sb6 = new StringBuilder("<html><head><style>");
        for (String str19 : map2.keySet()) {
            sb6.append(str19);
            sb6.append("{");
            sb6.append((String) map2.get(str19));
            sb6.append("}");
        }
        sb6.append("</style></head>");
        sb5.insert(0, sb6.toString());
        this.f6701OooO0o0.loadData(Base64.encodeToString(sb5.toString().getBytes(com.google.common.base.OooO.f19059OooO0OO), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f6700OooO0o.isEmpty()) {
            return;
        }
        OooO0OO();
    }
}
