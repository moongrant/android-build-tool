package androidx.media3.extractor.text.ssa;

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
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.OooO0OO;
import com.google.common.base.OooOO0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p070o000O0o.Oooo000;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o0OO00O;
import p092o000o0O0.o0Oo0oo;
import p096o000o0o0.o00000;
import p096o000o0o0.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o extends o0Oo0oo {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final Pattern f8788OooOOo = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final o000000O f8789OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f8790OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public LinkedHashMap f8791OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f8792OooOOOo = -3.4028235E38f;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f8793OooOOo0 = -3.4028235E38f;

    public OooO00o(@Nullable List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f8790OooOOO0 = false;
            this.f8789OooOOO = null;
            return;
        }
        this.f8790OooOOO0 = true;
        String strOooOOOO = o00.OooOOOO(list.get(0));
        o00Oo0.OooO00o(strOooOOOO.startsWith("Format:"));
        o000000O o000000oOooO00o = o000000O.OooO00o(strOooOOOO);
        o000000oOooO00o.getClass();
        this.f8789OooOOO = o000000oOooO00o;
        OooO(new o000O000(list.get(1)), OooOO0.f18592OooO0OO);
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
        Matcher matcher = f8788OooOOo.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = o00.f34910OooO00o;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * AnimationKt.MillisToNanos) + (Long.parseLong(matcher.group(2)) * 60 * AnimationKt.MillisToNanos) + (Long.parseLong(strGroup) * 60 * 60 * AnimationKt.MillisToNanos);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OooO(o000O000 o000o001, Charset charset) {
        int i;
        SsaStyle ssaStyle;
        float f;
        int i2;
        while (true) {
            String strOooO0oo = o000o001.OooO0oo(charset);
            if (strOooO0oo == null) {
                return;
            }
            int i3 = 2;
            char c = '[';
            int i4 = 0;
            if ("[Script Info]".equalsIgnoreCase(strOooO0oo)) {
                while (true) {
                    String strOooO0oo2 = o000o001.OooO0oo(charset);
                    if (strOooO0oo2 == null || (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 != 0 && o000o001.OooO0O0(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strOooO0oo2.split(CertificateUtil.DELIMITER);
                    if (strArrSplit.length == 2) {
                        String strOooO00o = OooO0OO.OooO00o(strArrSplit[0].trim());
                        strOooO00o.getClass();
                        if (strOooO00o.equals("playresx")) {
                            this.f8792OooOOOo = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strOooO00o.equals("playresy")) {
                            try {
                                this.f8793OooOOo0 = Float.parseFloat(strArrSplit[1].trim());
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
                        String strOooO0oo3 = o000o001.OooO0oo(charset);
                        if (strOooO0oo3 != null && (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 == 0 || o000o001.OooO0O0(charset) != c)) {
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
                                    String strOooO00o2 = OooO0OO.OooO00o(strArrSplit2[i15].trim());
                                    strOooO00o2.getClass();
                                    switch (strOooO00o2.hashCode()) {
                                        case -1178781136:
                                            i = strOooO00o2.equals("italic") ? i4 : -1;
                                            break;
                                        case -1026963764:
                                            i = strOooO00o2.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i = strOooO00o2.equals("strikeout") ? i3 : -1;
                                            break;
                                        case -70925746:
                                            i = strOooO00o2.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i = strOooO00o2.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i = strOooO00o2.equals("name") ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i = strOooO00o2.equals("fontsize") ? 6 : -1;
                                            break;
                                        case 767321349:
                                            i = strOooO00o2.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i = strOooO00o2.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i = strOooO00o2.equals("outlinecolour") ? 9 : -1;
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
                                        o00Oo0.OooO00o(strOooO0oo3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strOooO0oo3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i16 = oooO00o.f8814OooOO0O;
                                        if (length != i16) {
                                            Object[] objArr = new Object[3];
                                            objArr[i4] = Integer.valueOf(i16);
                                            objArr[1] = Integer.valueOf(strArrSplit3.length);
                                            objArr[i3] = strOooO0oo3;
                                            Log.OooO0o("SsaStyle", o00.OooOOO("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[oooO00o.f8805OooO00o].trim();
                                                int i17 = oooO00o.f8806OooO0O0;
                                                int iOooO00o = i17 != -1 ? SsaStyle.OooO00o(strArrSplit3[i17].trim()) : -1;
                                                int i18 = oooO00o.f8807OooO0OO;
                                                Integer numOooO0OO = i18 != -1 ? SsaStyle.OooO0OO(strArrSplit3[i18].trim()) : null;
                                                int i19 = oooO00o.f8808OooO0Oo;
                                                Integer numOooO0OO2 = i19 != -1 ? SsaStyle.OooO0OO(strArrSplit3[i19].trim()) : null;
                                                int i20 = oooO00o.f8810OooO0o0;
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
                                                int i21 = oooO00o.f8809OooO0o;
                                                boolean z = i21 != -1 && SsaStyle.OooO0O0(strArrSplit3[i21].trim());
                                                int i22 = oooO00o.f8811OooO0oO;
                                                boolean z2 = i22 != -1 && SsaStyle.OooO0O0(strArrSplit3[i22].trim());
                                                int i23 = oooO00o.f8812OooO0oo;
                                                boolean z3 = i23 != -1 && SsaStyle.OooO0O0(strArrSplit3[i23].trim());
                                                int i24 = oooO00o.f8804OooO;
                                                boolean z4 = i24 != -1 && SsaStyle.OooO0O0(strArrSplit3[i24].trim());
                                                int i25 = oooO00o.f8813OooOO0;
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
                                                linkedHashMap.put(ssaStyle.f8795OooO00o, ssaStyle);
                                            }
                                        }
                                        ssaStyle = null;
                                        if (ssaStyle != null) {
                                            linkedHashMap.put(ssaStyle.f8795OooO00o, ssaStyle);
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
                this.f8791OooOOOO = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strOooO0oo)) {
                Log.OooO0o0("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strOooO0oo)) {
                return;
            }
        }
    }

    @Override // p092o000o0O0.o0Oo0oo
    public final o0OO00O OooO0oO(byte[] bArr, int i, boolean z) {
        o000O000 o000o001;
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
        o000O000 o000o002 = new o000O000(bArr, i);
        Charset charsetOooOoo = o000o002.OooOoo();
        if (charsetOooOoo == null) {
            charsetOooOoo = OooOO0.f18592OooO0OO;
        }
        boolean z2 = oooO00o.f8790OooOOO0;
        if (!z2) {
            oooO00o.OooO(o000o002, charsetOooOoo);
        }
        o000000O o000000oOooO00o = z2 ? oooO00o.f8789OooOOO : null;
        while (true) {
            String strOooO0oo = o000o002.OooO0oo(charsetOooOoo);
            if (strOooO0oo == null) {
                return new o00000(arrayList, arrayList2);
            }
            if (strOooO0oo.startsWith("Format:")) {
                o000000oOooO00o = o000000O.OooO00o(strOooO0oo);
            } else {
                if (strOooO0oo.startsWith("Dialogue:")) {
                    if (o000000oOooO00o == null) {
                        Log.OooO0o("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strOooO0oo));
                    } else {
                        o00Oo0.OooO00o(strOooO0oo.startsWith("Dialogue:"));
                        String strSubstring = strOooO0oo.substring(9);
                        int i6 = o000000oOooO00o.f35283OooO0o0;
                        String[] strArrSplit = strSubstring.split(",", i6);
                        if (strArrSplit.length != i6) {
                            Log.OooO0o("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strOooO0oo));
                        } else {
                            long jOooOO0 = OooOO0(strArrSplit[o000000oOooO00o.f35279OooO00o]);
                            if (jOooOO0 == -9223372036854775807L) {
                                Log.OooO0o("SsaDecoder", "Skipping invalid timing: ".concat(strOooO0oo));
                            } else {
                                o000o001 = o000o002;
                                charset = charsetOooOoo;
                                long jOooOO1 = OooOO0(strArrSplit[o000000oOooO00o.f35280OooO0O0]);
                                if (jOooOO1 == -9223372036854775807L) {
                                    Log.OooO0o("SsaDecoder", "Skipping invalid timing: ".concat(strOooO0oo));
                                    o000000oOooO00o = o000000oOooO00o;
                                } else {
                                    LinkedHashMap linkedHashMap = oooO00o.f8791OooOOOO;
                                    int i7 = -1;
                                    SsaStyle ssaStyle = (linkedHashMap == null || (i5 = o000000oOooO00o.f35281OooO0OO) == -1) ? null : (SsaStyle) linkedHashMap.get(strArrSplit[i5].trim());
                                    String str = strArrSplit[o000000oOooO00o.f35282OooO0Oo];
                                    Matcher matcher = SsaStyle.OooO0O0.f8815OooO00o.matcher(str);
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
                                            Matcher matcher2 = SsaStyle.OooO0O0.f8818OooO0Oo.matcher(strGroup);
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
                                    String strReplace = SsaStyle.OooO0O0.f8815OooO00o.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f2 = oooO00o.f8792OooOOOo;
                                    float f3 = oooO00o.f8793OooOOo0;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    Cue.OooO00o oooO00o2 = new Cue.OooO00o();
                                    oooO00o2.f6915OooO00o = spannableString;
                                    if (ssaStyle != null) {
                                        Integer num2 = ssaStyle.f8797OooO0OO;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (ssaStyle.f8803OooOO0 == 3 && (num = ssaStyle.f8798OooO0Oo) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f4 = ssaStyle.f8800OooO0o0;
                                        if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                            oooO00o2.f6924OooOO0O = f4 / f3;
                                            oooO00o2.f6923OooOO0 = 1;
                                        }
                                        boolean z3 = ssaStyle.f8801OooO0oO;
                                        boolean z4 = ssaStyle.f8799OooO0o;
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
                                        if (ssaStyle.f8802OooO0oo) {
                                            spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i3);
                                        }
                                        if (ssaStyle.f8794OooO) {
                                            spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i3);
                                        }
                                    } else {
                                        jOooOO1 = jOooOO1;
                                        o000000oOooO00o = o000000oOooO00o;
                                    }
                                    if (i7 == -1) {
                                        i7 = ssaStyle != null ? ssaStyle.f8796OooO0O0 : -1;
                                    }
                                    switch (i7) {
                                        case 0:
                                        default:
                                            Oooo000.OooO00o("Unknown alignment: ", i7, "SsaDecoder");
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
                                    oooO00o2.f6917OooO0OO = alignment;
                                    int i8 = Integer.MIN_VALUE;
                                    switch (i7) {
                                        case 0:
                                        default:
                                            Oooo000.OooO00o("Unknown alignment: ", i7, "SsaDecoder");
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
                                    oooO00o2.f6914OooO = i2;
                                    switch (i7) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            Oooo000.OooO00o("Unknown alignment: ", i7, "SsaDecoder");
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
                                    oooO00o2.f6921OooO0oO = i8;
                                    if (pointF == null || f3 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                        int i9 = oooO00o2.f6914OooO;
                                        float f5 = 0.95f;
                                        if (i9 == 0) {
                                            f = 0.05f;
                                        } else if (i9 != 1) {
                                            f = i9 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            f = 0.5f;
                                        }
                                        oooO00o2.f6922OooO0oo = f;
                                        if (i8 == 0) {
                                            f5 = 0.05f;
                                        } else if (i8 == 1) {
                                            f5 = 0.5f;
                                        } else if (i8 != 2) {
                                            f5 = -3.4028235E38f;
                                        }
                                        oooO00o2.f6920OooO0o0 = f5;
                                        oooO00o2.f6919OooO0o = 0;
                                    } else {
                                        oooO00o2.f6922OooO0oo = pointF.x / f2;
                                        oooO00o2.f6920OooO0o0 = pointF.y / f3;
                                        oooO00o2.f6919OooO0o = 0;
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
                    o000o001 = o000o002;
                    charset = charsetOooOoo;
                    o000000oOooO00o = o000000oOooO00o;
                } else {
                    o000o001 = o000o002;
                    charset = charsetOooOoo;
                    o000000oOooO00o = o000000oOooO00o;
                }
                oooO00o = this;
                charsetOooOoo = charset;
                o000000oOooO00o = o000000oOooO00o;
                o000o002 = o000o001;
            }
        }
    }
}
