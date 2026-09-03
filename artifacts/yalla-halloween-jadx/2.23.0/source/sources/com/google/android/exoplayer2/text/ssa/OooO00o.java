package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.OooO;
import com.google.common.base.OooO0OO;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p101o000oo.Oooo000;
import p230o00oOoO0.o000;
import p230o00oOoO0.o0000OO0;
import p236o00oOooo.o00OOOO0;
import p236o00oOooo.o00OOOOo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o extends o0000OO0 {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final Pattern f13438OooOOo = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final o00OOOO0 f13439OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f13440OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public LinkedHashMap f13441OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f13442OooOOOo = -3.4028235E38f;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f13443OooOOo0 = -3.4028235E38f;

    public OooO00o(@Nullable List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f13440OooOOO0 = false;
            this.f13439OooOOO = null;
            return;
        }
        this.f13440OooOOO0 = true;
        String strOooOOO0 = o0O00.OooOOO0(list.get(0));
        o00O000o.OooO00o(strOooOOO0.startsWith("Format:"));
        o00OOOO0 o00oooo0OooO00o = o00OOOO0.OooO00o(strOooOOO0);
        o00oooo0OooO00o.getClass();
        this.f13439OooOOO = o00oooo0OooO00o;
        OooO(new o00Oo00(list.get(1)), OooO.f19059OooO0OO);
    }

    public static int OooO0oo(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long OooOO0(String str) {
        Matcher matcher = f13438OooOOo.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = o0O00.f40595OooO00o;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * AnimationKt.MillisToNanos) + (Long.parseLong(matcher.group(2)) * 60 * AnimationKt.MillisToNanos) + (Long.parseLong(strGroup) * 60 * 60 * AnimationKt.MillisToNanos);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OooO(o00Oo00 o00oo00, Charset charset) {
        int i;
        SsaStyle ssaStyle;
        float f;
        int i2;
        while (true) {
            String strOooO0oo = o00oo00.OooO0oo(charset);
            if (strOooO0oo == null) {
                return;
            }
            int i3 = 2;
            char c = '[';
            int i4 = 0;
            if ("[Script Info]".equalsIgnoreCase(strOooO0oo)) {
                while (true) {
                    String strOooO0oo2 = o00oo00.OooO0oo(charset);
                    if (strOooO0oo2 == null || (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 != 0 && o00oo00.OooO0O0(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strOooO0oo2.split(CertificateUtil.DELIMITER);
                    if (strArrSplit.length == 2) {
                        String strOooO0O0 = OooO0OO.OooO0O0(strArrSplit[0].trim());
                        strOooO0O0.getClass();
                        if (strOooO0O0.equals("playresx")) {
                            this.f13442OooOOOo = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strOooO0O0.equals("playresy")) {
                            try {
                                this.f13443OooOOo0 = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strOooO0oo)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    SsaStyle.OooO00o oooO00o = null;
                    while (true) {
                        String strOooO0oo3 = o00oo00.OooO0oo(charset);
                        if (strOooO0oo3 != null && (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 == 0 || o00oo00.OooO0O0(charset) != c)) {
                            if (strOooO0oo3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strOooO0oo3.substring(7), ",");
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = i4; i15 < strArrSplit2.length; i15++) {
                                    String strOooO0O1 = OooO0OO.OooO0O0(strArrSplit2[i15].trim());
                                    strOooO0O1.getClass();
                                    switch (strOooO0O1.hashCode()) {
                                        case -1178781136:
                                            i = strOooO0O1.equals("italic") ? i4 : -1;
                                            break;
                                        case -1026963764:
                                            i = strOooO0O1.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i = strOooO0O1.equals("strikeout") ? i3 : -1;
                                            break;
                                        case -70925746:
                                            i = strOooO0O1.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i = strOooO0O1.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i = strOooO0O1.equals("name") ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i = strOooO0O1.equals("fontsize") ? 6 : -1;
                                            break;
                                        case 767321349:
                                            i = strOooO0O1.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i = strOooO0O1.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i = strOooO0O1.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i11 = i15;
                                            break;
                                        case 1:
                                            i12 = i15;
                                            break;
                                        case 2:
                                            i13 = i15;
                                            break;
                                        case 3:
                                            i7 = i15;
                                            break;
                                        case 4:
                                            i10 = i15;
                                            break;
                                        case 5:
                                            i5 = i15;
                                            break;
                                        case 6:
                                            i9 = i15;
                                            break;
                                        case 7:
                                            i14 = i15;
                                            break;
                                        case 8:
                                            i6 = i15;
                                            break;
                                        case 9:
                                            i8 = i15;
                                            break;
                                    }
                                }
                                if (i5 != -1) {
                                    oooO00o = new SsaStyle.OooO00o(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length);
                                    c = '[';
                                } else {
                                    c = '[';
                                }
                            } else {
                                if (strOooO0oo3.startsWith("Style:")) {
                                    if (oooO00o == null) {
                                        Log.OooO0o("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strOooO0oo3));
                                    } else {
                                        o00O000o.OooO00o(strOooO0oo3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strOooO0oo3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i16 = oooO00o.f13464OooOO0O;
                                        if (length != i16) {
                                            Object[] objArr = new Object[3];
                                            objArr[i4] = Integer.valueOf(i16);
                                            objArr[1] = Integer.valueOf(strArrSplit3.length);
                                            objArr[i3] = strOooO0oo3;
                                            Log.OooO0o("SsaStyle", o0O00.OooOO0o("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[oooO00o.f13455OooO00o].trim();
                                                int i17 = oooO00o.f13456OooO0O0;
                                                int iOooO00o = i17 != -1 ? SsaStyle.OooO00o(strArrSplit3[i17].trim()) : -1;
                                                int i18 = oooO00o.f13457OooO0OO;
                                                Integer numOooO0OO = i18 != -1 ? SsaStyle.OooO0OO(strArrSplit3[i18].trim()) : null;
                                                int i19 = oooO00o.f13458OooO0Oo;
                                                Integer numOooO0OO2 = i19 != -1 ? SsaStyle.OooO0OO(strArrSplit3[i19].trim()) : null;
                                                int i20 = oooO00o.f13460OooO0o0;
                                                if (i20 != -1) {
                                                    String strTrim2 = strArrSplit3[i20].trim();
                                                    try {
                                                        f = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e) {
                                                        Log.OooO0oO("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                        f = -3.4028235E38f;
                                                    }
                                                } else {
                                                    f = -3.4028235E38f;
                                                }
                                                float f2 = f;
                                                int i21 = oooO00o.f13459OooO0o;
                                                boolean z = i21 != -1 && SsaStyle.OooO0O0(strArrSplit3[i21].trim());
                                                int i22 = oooO00o.f13461OooO0oO;
                                                boolean z2 = i22 != -1 && SsaStyle.OooO0O0(strArrSplit3[i22].trim());
                                                int i23 = oooO00o.f13462OooO0oo;
                                                boolean z3 = i23 != -1 && SsaStyle.OooO0O0(strArrSplit3[i23].trim());
                                                int i24 = oooO00o.f13454OooO;
                                                boolean z4 = i24 != -1 && SsaStyle.OooO0O0(strArrSplit3[i24].trim());
                                                int i25 = oooO00o.f13463OooOO0;
                                                if (i25 != -1) {
                                                    String strTrim3 = strArrSplit3[i25].trim();
                                                    try {
                                                        int i26 = Integer.parseInt(strTrim3.trim());
                                                        if (i26 == 1 || i26 == 3) {
                                                            i2 = i26;
                                                        } else {
                                                            Log.OooO0o("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                            i2 = -1;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                } else {
                                                    i2 = -1;
                                                }
                                                ssaStyle = new SsaStyle(strTrim, iOooO00o, numOooO0OO, numOooO0OO2, f2, z, z2, z3, z4, i2);
                                            } catch (RuntimeException e2) {
                                                Log.OooO0oO("SsaStyle", "Skipping malformed 'Style:' line: '" + strOooO0oo3 + "'", e2);
                                                ssaStyle = null;
                                            }
                                            if (ssaStyle != null) {
                                                linkedHashMap.put(ssaStyle.f13445OooO00o, ssaStyle);
                                            }
                                        }
                                        ssaStyle = null;
                                        if (ssaStyle != null) {
                                            linkedHashMap.put(ssaStyle.f13445OooO00o, ssaStyle);
                                        }
                                    }
                                }
                                i3 = 2;
                                c = '[';
                                i4 = 0;
                            }
                        }
                    }
                }
                this.f13441OooOOOO = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strOooO0oo)) {
                Log.OooO0o0("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strOooO0oo)) {
                return;
            }
        }
    }

    @Override // p230o00oOoO0.o0000OO0
    public final o000 OooO0oO(byte[] bArr, int i, boolean z) {
        o00Oo00 o00oo00;
        Charset charset;
        Layout.Alignment alignment;
        int i2;
        float f;
        int i3;
        int i4;
        Integer num;
        int iOooO00o;
        int i5;
        OooO00o oooO00o = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        o00Oo00 o00oo01 = new o00Oo00(bArr, i);
        Charset charsetOooOoo = o00oo01.OooOoo();
        if (charsetOooOoo == null) {
            charsetOooOoo = OooO.f19059OooO0OO;
        }
        boolean z2 = oooO00o.f13440OooOOO0;
        if (!z2) {
            oooO00o.OooO(o00oo01, charsetOooOoo);
        }
        o00OOOO0 o00oooo0OooO00o = z2 ? oooO00o.f13439OooOOO : null;
        while (true) {
            String strOooO0oo = o00oo01.OooO0oo(charsetOooOoo);
            if (strOooO0oo == null) {
                return new o00OOOOo(arrayList, arrayList2);
            }
            if (strOooO0oo.startsWith("Format:")) {
                o00oooo0OooO00o = o00OOOO0.OooO00o(strOooO0oo);
            } else {
                if (strOooO0oo.startsWith("Dialogue:")) {
                    if (o00oooo0OooO00o == null) {
                        Log.OooO0o("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strOooO0oo));
                    } else {
                        o00O000o.OooO00o(strOooO0oo.startsWith("Dialogue:"));
                        String strSubstring = strOooO0oo.substring(9);
                        int i6 = o00oooo0OooO00o.f40309OooO0o0;
                        String[] strArrSplit = strSubstring.split(",", i6);
                        if (strArrSplit.length != i6) {
                            Log.OooO0o("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strOooO0oo));
                        } else {
                            long jOooOO0 = OooOO0(strArrSplit[o00oooo0OooO00o.f40305OooO00o]);
                            if (jOooOO0 == -9223372036854775807L) {
                                Log.OooO0o("SsaDecoder", "Skipping invalid timing: ".concat(strOooO0oo));
                            } else {
                                o00oo00 = o00oo01;
                                charset = charsetOooOoo;
                                long jOooOO1 = OooOO0(strArrSplit[o00oooo0OooO00o.f40306OooO0O0]);
                                if (jOooOO1 == -9223372036854775807L) {
                                    Log.OooO0o("SsaDecoder", "Skipping invalid timing: ".concat(strOooO0oo));
                                    o00oooo0OooO00o = o00oooo0OooO00o;
                                } else {
                                    LinkedHashMap linkedHashMap = oooO00o.f13441OooOOOO;
                                    int i7 = -1;
                                    SsaStyle ssaStyle = (linkedHashMap == null || (i5 = o00oooo0OooO00o.f40307OooO0OO) == -1) ? null : (SsaStyle) linkedHashMap.get(strArrSplit[i5].trim());
                                    String str = strArrSplit[o00oooo0OooO00o.f40308OooO0Oo];
                                    Matcher matcher = SsaStyle.OooO0O0.f13465OooO00o.matcher(str);
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFOooO00o = SsaStyle.OooO0O0.OooO00o(strGroup);
                                            if (pointFOooO00o != null) {
                                                pointF = pointFOooO00o;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = SsaStyle.OooO0O0.f13468OooO0Oo.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iOooO00o = SsaStyle.OooO00o(strGroup2);
                                            } else {
                                                iOooO00o = -1;
                                            }
                                            if (iOooO00o != -1) {
                                                i7 = iOooO00o;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                    }
                                    String strReplace = SsaStyle.OooO0O0.f13465OooO00o.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f2 = oooO00o.f13442OooOOOo;
                                    float f3 = oooO00o.f13443OooOOo0;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    Cue.OooO00o oooO00o2 = new Cue.OooO00o();
                                    oooO00o2.f13419OooO00o = spannableString;
                                    if (ssaStyle != null) {
                                        Integer num2 = ssaStyle.f13447OooO0OO;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (ssaStyle.f13453OooOO0 == 3 && (num = ssaStyle.f13448OooO0Oo) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f4 = ssaStyle.f13450OooO0o0;
                                        if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                            oooO00o2.f13428OooOO0O = f4 / f3;
                                            oooO00o2.f13427OooOO0 = 1;
                                        }
                                        boolean z3 = ssaStyle.f13451OooO0oO;
                                        boolean z4 = ssaStyle.f13449OooO0o;
                                        if (z4 && z3) {
                                            i3 = 33;
                                            i4 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i3 = 33;
                                            i4 = 0;
                                            if (z4) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z3) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (ssaStyle.f13452OooO0oo) {
                                            spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i3);
                                        }
                                        if (ssaStyle.f13444OooO) {
                                            spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i3);
                                        }
                                    } else {
                                        jOooOO1 = jOooOO1;
                                        o00oooo0OooO00o = o00oooo0OooO00o;
                                    }
                                    if (i7 == -1) {
                                        i7 = ssaStyle != null ? ssaStyle.f13446OooO0O0 : -1;
                                    }
                                    switch (i7) {
                                        case 0:
                                        default:
                                            Oooo000.OooO0O0("Unknown alignment: ", i7, "SsaDecoder");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    oooO00o2.f13421OooO0OO = alignment;
                                    int i8 = Integer.MIN_VALUE;
                                    switch (i7) {
                                        case 0:
                                        default:
                                            Oooo000.OooO0O0("Unknown alignment: ", i7, "SsaDecoder");
                                        case -1:
                                            i2 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i2 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i2 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i2 = 2;
                                            break;
                                    }
                                    oooO00o2.f13418OooO = i2;
                                    switch (i7) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            Oooo000.OooO0O0("Unknown alignment: ", i7, "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i8 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i8 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i8 = 0;
                                            break;
                                    }
                                    oooO00o2.f13425OooO0oO = i8;
                                    if (pointF == null || f3 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                        int i9 = oooO00o2.f13418OooO;
                                        float f5 = 0.95f;
                                        if (i9 == 0) {
                                            f = 0.05f;
                                        } else if (i9 != 1) {
                                            f = i9 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            f = 0.5f;
                                        }
                                        oooO00o2.f13426OooO0oo = f;
                                        if (i8 == 0) {
                                            f5 = 0.05f;
                                        } else if (i8 == 1) {
                                            f5 = 0.5f;
                                        } else if (i8 != 2) {
                                            f5 = -3.4028235E38f;
                                        }
                                        oooO00o2.f13424OooO0o0 = f5;
                                        oooO00o2.f13423OooO0o = 0;
                                    } else {
                                        oooO00o2.f13426OooO0oo = pointF.x / f2;
                                        oooO00o2.f13424OooO0o0 = pointF.y / f3;
                                        oooO00o2.f13423OooO0o = 0;
                                    }
                                    Cue cueOooO00o = oooO00o2.OooO00o();
                                    int iOooO0oo = OooO0oo(jOooOO1, arrayList2, arrayList);
                                    for (int iOooO0oo2 = OooO0oo(jOooOO0, arrayList2, arrayList); iOooO0oo2 < iOooO0oo; iOooO0oo2++) {
                                        ((List) arrayList.get(iOooO0oo2)).add(cueOooO00o);
                                    }
                                }
                            }
                        }
                    }
                    o00oo00 = o00oo01;
                    charset = charsetOooOoo;
                    o00oooo0OooO00o = o00oooo0OooO00o;
                } else {
                    o00oo00 = o00oo01;
                    charset = charsetOooOoo;
                    o00oooo0OooO00o = o00oooo0OooO00o;
                }
                oooO00o = this;
                charsetOooOoo = charset;
                o00oooo0OooO00o = o00oooo0OooO00o;
                o00oo01 = o00oo00;
            }
        }
    }
}
