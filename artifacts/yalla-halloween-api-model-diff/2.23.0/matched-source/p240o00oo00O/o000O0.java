package p240o00oo00O;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.OooO;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p230o00oOoO0.o000;
import p230o00oOoO0.o0000OO0;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O0 extends o0000OO0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Pattern f40382OooOOOO = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Pattern f40383OooOOOo = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final StringBuilder f40385OooOOO0 = new StringBuilder();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList<String> f40384OooOOO = new ArrayList<>();

    public static long OooO0oo(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60 * 1000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:142:0x0208  */
    /* JADX WARN: Code duplicated, block: B:144:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x020d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0215  */
    /* JADX WARN: Code duplicated, block: B:149:0x0217  */
    /* JADX WARN: Code duplicated, block: B:152:0x021e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0221  */
    /* JADX WARN: Code duplicated, block: B:159:0x022b  */
    /* JADX WARN: Code duplicated, block: B:160:0x022d  */
    /* JADX WARN: Code duplicated, block: B:172:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x016d  */
    @Override // p230o00oOoO0.o0000OO0
    public final o000 OooO0oO(byte[] bArr, int i, boolean z) {
        String str;
        byte b;
        byte b2;
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        Cue cueOooO00o;
        o000O0 o000o0 = this;
        ArrayList arrayList = new ArrayList();
        long[] jArrCopyOf = new long[32];
        o00Oo00 o00oo00 = new o00Oo00(bArr, i);
        Charset charsetOooOoo = o00oo00.OooOoo();
        if (charsetOooOoo == null) {
            charsetOooOoo = OooO.f19059OooO0OO;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String strOooO0oo = o00oo00.OooO0oo(charsetOooOoo);
            if (strOooO0oo != null) {
                if (strOooO0oo.length() != 0) {
                    try {
                        Integer.parseInt(strOooO0oo);
                        String strOooO0oo2 = o00oo00.OooO0oo(charsetOooOoo);
                        if (strOooO0oo2 == null) {
                            Log.OooO0o("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f40382OooOOOO.matcher(strOooO0oo2);
                            if (matcher.matches()) {
                                long jOooO0oo = OooO0oo(matcher, 1);
                                if (i6 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6 * 2);
                                }
                                int i7 = i6 + 1;
                                jArrCopyOf[i6] = jOooO0oo;
                                long jOooO0oo2 = OooO0oo(matcher, 6);
                                if (i7 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7 * 2);
                                }
                                int i8 = i7 + 1;
                                jArrCopyOf[i7] = jOooO0oo2;
                                StringBuilder sb = o000o0.f40385OooOOO0;
                                sb.setLength(i5);
                                ArrayList<String> arrayList2 = o000o0.f40384OooOOO;
                                arrayList2.clear();
                                String strOooO0oo3 = o00oo00.OooO0oo(charsetOooOoo);
                                while (!TextUtils.isEmpty(strOooO0oo3)) {
                                    if (sb.length() > 0) {
                                        sb.append("<br>");
                                    }
                                    String strTrim = strOooO0oo3.trim();
                                    StringBuilder sb2 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f40383OooOOOo.matcher(strTrim);
                                    int i9 = i5;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i9;
                                        int length = strGroup.length();
                                        sb2.replace(iStart, iStart + length, "");
                                        i9 += length;
                                    }
                                    sb.append(sb2.toString());
                                    strOooO0oo3 = o00oo00.OooO0oo(charsetOooOoo);
                                    i5 = 0;
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                                int i10 = 0;
                                while (true) {
                                    if (i10 < arrayList2.size()) {
                                        str = arrayList2.get(i10);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i10++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                Cue.OooO00o oooO00o = new Cue.OooO00o();
                                oooO00o.f13419OooO00o = spannedFromHtml;
                                if (str == null) {
                                    cueOooO00o = oooO00o.OooO00o();
                                } else {
                                    switch (str) {
                                        case "{\an1}":
                                            b = 0;
                                            break;
                                        case "{\an2}":
                                            b = 6;
                                            break;
                                        case "{\an3}":
                                            b = 3;
                                            break;
                                        case "{\an4}":
                                            b = 1;
                                            break;
                                        case "{\an5}":
                                            b = 7;
                                            break;
                                        case "{\an6}":
                                            b = 4;
                                            break;
                                        case "{\an7}":
                                            b = 2;
                                            break;
                                        case "{\an8}":
                                            b = 8;
                                            break;
                                        case "{\an9}":
                                            b = 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    if (b == 0 || b == 1 || b == 2) {
                                        oooO00o.f13418OooO = 0;
                                    } else if (b == 3 || b == 4 || b == 5) {
                                        oooO00o.f13418OooO = 2;
                                    } else {
                                        oooO00o.f13418OooO = 1;
                                    }
                                    switch (str) {
                                        case "{\an1}":
                                            b2 = 0;
                                            break;
                                        case "{\an2}":
                                            b2 = 1;
                                            break;
                                        case "{\an3}":
                                            b2 = 2;
                                            break;
                                        case "{\an4}":
                                            b2 = 6;
                                            break;
                                        case "{\an5}":
                                            b2 = 7;
                                            break;
                                        case "{\an6}":
                                            b2 = 8;
                                            break;
                                        case "{\an7}":
                                            b2 = 3;
                                            break;
                                        case "{\an8}":
                                            b2 = 4;
                                            break;
                                        case "{\an9}":
                                            b2 = 5;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    if (b2 == 0 || b2 == 1) {
                                        i2 = 2;
                                    } else {
                                        if (b2 != 2) {
                                            if (b2 == 3 || b2 == 4 || b2 == 5) {
                                                oooO00o.f13425OooO0oO = 0;
                                            } else {
                                                oooO00o.f13425OooO0oO = 1;
                                            }
                                            i2 = 2;
                                        } else {
                                            i2 = 2;
                                        }
                                        i3 = oooO00o.f13418OooO;
                                        f = 0.92f;
                                        if (i3 != 0) {
                                            f2 = 0.08f;
                                        } else if (i3 != 1) {
                                            f2 = 0.5f;
                                        } else {
                                            if (i3 == i2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f2 = 0.92f;
                                        }
                                        oooO00o.f13426OooO0oo = f2;
                                        i4 = oooO00o.f13425OooO0oO;
                                        if (i4 != 0) {
                                            f = 0.08f;
                                        } else if (i4 != 1) {
                                            f = 0.5f;
                                        } else if (i4 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        oooO00o.f13424OooO0o0 = f;
                                        oooO00o.f13423OooO0o = 0;
                                        cueOooO00o = oooO00o.OooO00o();
                                    }
                                    oooO00o.f13425OooO0oO = i2;
                                    i3 = oooO00o.f13418OooO;
                                    f = 0.92f;
                                    if (i3 != 0) {
                                        f2 = 0.08f;
                                    } else if (i3 != 1) {
                                        f2 = 0.5f;
                                    } else {
                                        if (i3 == i2) {
                                            throw new IllegalArgumentException();
                                        }
                                        f2 = 0.92f;
                                    }
                                    oooO00o.f13426OooO0oo = f2;
                                    i4 = oooO00o.f13425OooO0oO;
                                    if (i4 != 0) {
                                        f = 0.08f;
                                    } else if (i4 != 1) {
                                        f = 0.5f;
                                    } else if (i4 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    oooO00o.f13424OooO0o0 = f;
                                    oooO00o.f13423OooO0o = 0;
                                    cueOooO00o = oooO00o.OooO00o();
                                }
                                arrayList.add(cueOooO00o);
                                arrayList.add(Cue.f13383OooOo0);
                                i6 = i8;
                                jArrCopyOf = jArrCopyOf;
                            } else {
                                o00oo00 = o00oo00;
                                charsetOooOoo = charsetOooOoo;
                                Log.OooO0o("SubripDecoder", "Skipping invalid timing: ".concat(strOooO0oo2));
                            }
                            o000o0 = this;
                            o00oo00 = o00oo00;
                            charsetOooOoo = charsetOooOoo;
                            i5 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        o00oo00 = o00oo00;
                        charsetOooOoo = charsetOooOoo;
                        Log.OooO0o("SubripDecoder", "Skipping invalid index: ".concat(strOooO0oo));
                    }
                }
            }
        }
        return new o000O0Oo((Cue[]) arrayList.toArray(new Cue[i5]), Arrays.copyOf(jArrCopyOf, i6));
    }
}
