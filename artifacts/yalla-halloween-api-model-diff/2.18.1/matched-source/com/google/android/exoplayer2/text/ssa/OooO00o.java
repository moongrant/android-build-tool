package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p311o0O0oO.OooO0OO;
import p311o0O0oO.OooO0o;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;
import p324o0O0oo0O.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends o0000Ooo {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Pattern f14648OooOOoo = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f14649OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final OooO0OO f14650OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Map<String, SsaStyle> f14651OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f14653OooOOo0 = -3.4028235E38f;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f14652OooOOo = -3.4028235E38f;

    public OooO00o(@Nullable List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f14649OooOOO = false;
            this.f14650OooOOOO = null;
            return;
        }
        this.f14649OooOOO = true;
        String strOooOO0o = o000OOo0.OooOO0o(list.get(0));
        o00000O0.OooO00o(strOooOO0o.startsWith("Format:"));
        OooO0OO oooO0OOOooO00o = OooO0OO.OooO00o(strOooOO0o);
        Objects.requireNonNull(oooO0OOOooO00o);
        this.f14650OooOOOO = oooO0OOOooO00o;
        OooOOO0(new o000(list.get(1)));
    }

    public static int OooOO0O(long j, List<Long> list, List<List<Cue>> list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    public static float OooOO0o(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static long OooOOO(String str) {
        Matcher matcher = f14648OooOOoo.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = o000OOo0.f36740OooO00o;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(strGroup) * 60 * 60 * 1000000);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ssa.SsaStyle>] */
    @Override // p324o0O0oo0O.o0000Ooo
    public final o0000O00 OooOO0(byte[] bArr, int i, boolean z) {
        o000 o000Var;
        Layout.Alignment alignment;
        int i2;
        int i3;
        float fOooOO0o;
        float fOooOO0o2;
        int iOooO00o;
        int i4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        o000 o000Var2 = new o000(bArr, i);
        if (!this.f14649OooOOO) {
            OooOOO0(o000Var2);
        }
        OooO0OO oooO0OOOooO00o = this.f14649OooOOO ? this.f14650OooOOOO : null;
        while (true) {
            String strOooO0o0 = o000Var2.OooO0o0();
            if (strOooO0o0 == null) {
                return new OooO0o(arrayList, arrayList2);
            }
            if (strOooO0o0.startsWith("Format:")) {
                oooO0OOOooO00o = OooO0OO.OooO00o(strOooO0o0);
            } else {
                if (strOooO0o0.startsWith("Dialogue:")) {
                    if (oooO0OOOooO00o == null) {
                        Log.w("SsaDecoder", strOooO0o0.length() != 0 ? "Skipping dialogue line before complete format: ".concat(strOooO0o0) : new String("Skipping dialogue line before complete format: "));
                    } else {
                        o00000O0.OooO00o(strOooO0o0.startsWith("Dialogue:"));
                        String[] strArrSplit = strOooO0o0.substring(9).split(",", oooO0OOOooO00o.f36504OooO0o0);
                        if (strArrSplit.length != oooO0OOOooO00o.f36504OooO0o0) {
                            Log.w("SsaDecoder", strOooO0o0.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(strOooO0o0) : new String("Skipping dialogue line with fewer columns than format: "));
                        } else {
                            long jOooOOO = OooOOO(strArrSplit[oooO0OOOooO00o.f36500OooO00o]);
                            if (jOooOOO == -9223372036854775807L) {
                                Log.w("SsaDecoder", strOooO0o0.length() != 0 ? "Skipping invalid timing: ".concat(strOooO0o0) : new String("Skipping invalid timing: "));
                            } else {
                                long jOooOOO2 = OooOOO(strArrSplit[oooO0OOOooO00o.f36501OooO0O0]);
                                if (jOooOOO2 == -9223372036854775807L) {
                                    Log.w("SsaDecoder", strOooO0o0.length() != 0 ? "Skipping invalid timing: ".concat(strOooO0o0) : new String("Skipping invalid timing: "));
                                } else {
                                    ?? r5 = this.f14651OooOOOo;
                                    SsaStyle ssaStyle = (r5 == 0 || (i4 = oooO0OOOooO00o.f36502OooO0OO) == -1) ? null : (SsaStyle) r5.get(strArrSplit[i4].trim());
                                    String str = strArrSplit[oooO0OOOooO00o.f36503OooO0Oo];
                                    Matcher matcher = SsaStyle.OooO0O0.f14659OooO00o.matcher(str);
                                    PointF pointF = null;
                                    int i5 = -1;
                                    while (true) {
                                        o000Var = o000Var2;
                                        if (matcher.find()) {
                                            String strGroup = matcher.group(1);
                                            Objects.requireNonNull(strGroup);
                                            try {
                                                PointF pointFOooO00o = SsaStyle.OooO0O0.OooO00o(strGroup);
                                                if (pointFOooO00o != null) {
                                                    pointF = pointFOooO00o;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = SsaStyle.OooO0O0.f14662OooO0Oo.matcher(strGroup);
                                                if (matcher2.find()) {
                                                    String strGroup2 = matcher2.group(1);
                                                    Objects.requireNonNull(strGroup2);
                                                    iOooO00o = SsaStyle.OooO00o(strGroup2);
                                                } else {
                                                    iOooO00o = -1;
                                                }
                                                if (iOooO00o != -1) {
                                                    i5 = iOooO00o;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            o000Var2 = o000Var;
                                        } else {
                                            String strReplace = SsaStyle.OooO0O0.f14659OooO00o.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                            float f = this.f14653OooOOo0;
                                            float f2 = this.f14652OooOOo;
                                            if (i5 == -1) {
                                                i5 = ssaStyle != null ? ssaStyle.f14655OooO0O0 : -1;
                                            }
                                            switch (i5) {
                                                case 0:
                                                default:
                                                    o00O00O.OooO0OO.OooO0O0(30, "Unknown alignment: ", i5, "SsaDecoder");
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
                                            Layout.Alignment alignment2 = alignment;
                                            switch (i5) {
                                                case 0:
                                                default:
                                                    o00O00O.OooO0OO.OooO0O0(30, "Unknown alignment: ", i5, "SsaDecoder");
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
                                            switch (i5) {
                                                case 0:
                                                default:
                                                    o00O00O.OooO0OO.OooO0O0(30, "Unknown alignment: ", i5, "SsaDecoder");
                                                case -1:
                                                    i3 = Integer.MIN_VALUE;
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                    i3 = 2;
                                                    break;
                                                case 4:
                                                case 5:
                                                case 6:
                                                    i3 = 1;
                                                    break;
                                                case 7:
                                                case 8:
                                                case 9:
                                                    i3 = 0;
                                                    break;
                                            }
                                            if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                                fOooOO0o = OooOO0o(i2);
                                                fOooOO0o2 = OooOO0o(i3);
                                            } else {
                                                float f3 = pointF.x / f;
                                                fOooOO0o2 = pointF.y / f2;
                                                fOooOO0o = f3;
                                            }
                                            Cue cue = new Cue(strReplace, alignment2, null, fOooOO0o2, 0, i3, fOooOO0o, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE);
                                            int iOooOO0O = OooOO0O(jOooOOO2, arrayList2, arrayList);
                                            for (int iOooOO0O2 = OooOO0O(jOooOOO, arrayList2, arrayList); iOooOO0O2 < iOooOO0O; iOooOO0O2++) {
                                                ((List) arrayList.get(iOooOO0O2)).add(cue);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    o000Var = o000Var2;
                } else {
                    o000Var = o000Var2;
                }
                o000Var2 = o000Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0162 A[SYNTHETIC] */
    public final void OooOOO0(o000 o000Var) {
        SsaStyle ssaStyle;
        while (true) {
            String strOooO0o0 = o000Var.OooO0o0();
            if (strOooO0o0 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strOooO0o0)) {
                while (true) {
                    String strOooO0o1 = o000Var.OooO0o0();
                    if (strOooO0o1 == null || (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 != 0 && o000Var.OooO00o() == 91)) {
                        break;
                    }
                    String[] strArrSplit = strOooO0o1.split(CertificateUtil.DELIMITER);
                    if (strArrSplit.length == 2) {
                        String strOooo0 = o000OOo0.Oooo0(strArrSplit[0].trim());
                        Objects.requireNonNull(strOooo0);
                        if (strOooo0.equals("playresx")) {
                            this.f14653OooOOo0 = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strOooo0.equals("playresy")) {
                            try {
                                this.f14652OooOOo = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strOooO0o0)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    SsaStyle.OooO00o oooO00o = null;
                    while (true) {
                        String strOooO0o2 = o000Var.OooO0o0();
                        if (strOooO0o2 == null || (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 != 0 && o000Var.OooO00o() == 91)) {
                            break;
                        }
                        if (strOooO0o2.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strOooO0o2.substring(7), ",");
                            int i = -1;
                            int i2 = -1;
                            for (int i3 = 0; i3 < strArrSplit2.length; i3++) {
                                String strOooo1 = o000OOo0.Oooo0(strArrSplit2[i3].trim());
                                Objects.requireNonNull(strOooo1);
                                if (strOooo1.equals("name")) {
                                    i = i3;
                                } else if (strOooo1.equals("alignment")) {
                                    i2 = i3;
                                }
                            }
                            if (i != -1) {
                                oooO00o = new SsaStyle.OooO00o(i, i2, strArrSplit2.length);
                            }
                        } else if (strOooO0o2.startsWith("Style:")) {
                            if (oooO00o == null) {
                                Log.w("SsaDecoder", strOooO0o2.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(strOooO0o2) : new String("Skipping 'Style:' line before 'Format:' line: "));
                            } else {
                                o00000O0.OooO00o(strOooO0o2.startsWith("Style:"));
                                String[] strArrSplit3 = TextUtils.split(strOooO0o2.substring(6), ",");
                                int length = strArrSplit3.length;
                                int i4 = oooO00o.f14658OooO0OO;
                                if (length != i4) {
                                    Log.w("SsaStyle", o000OOo0.OooOO0O("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i4), Integer.valueOf(strArrSplit3.length), strOooO0o2));
                                } else {
                                    try {
                                        ssaStyle = new SsaStyle(strArrSplit3[oooO00o.f14656OooO00o].trim(), SsaStyle.OooO00o(strArrSplit3[oooO00o.f14657OooO0O0]));
                                    } catch (RuntimeException e) {
                                        StringBuilder sb = new StringBuilder(strOooO0o2.length() + 36);
                                        sb.append("Skipping malformed 'Style:' line: '");
                                        sb.append(strOooO0o2);
                                        sb.append("'");
                                        o0000oo.OooO0OO("SsaStyle", sb.toString(), e);
                                        ssaStyle = null;
                                    }
                                    if (ssaStyle != null) {
                                        linkedHashMap.put(ssaStyle.f14654OooO00o, ssaStyle);
                                    }
                                }
                                ssaStyle = null;
                                if (ssaStyle != null) {
                                    linkedHashMap.put(ssaStyle.f14654OooO00o, ssaStyle);
                                }
                            }
                        }
                    }
                }
                this.f14651OooOOOo = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strOooO0o0)) {
                Log.i("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strOooO0o0)) {
                return;
            }
        }
    }
}
