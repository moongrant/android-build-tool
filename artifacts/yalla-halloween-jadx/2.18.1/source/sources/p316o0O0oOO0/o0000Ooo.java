package p316o0O0oOO0;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p318o0O0oOo.o000;
import p324o0O0oo0O.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends p324o0O0oo0O.o0000Ooo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Pattern f36619OooOOOo = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Pattern f36620OooOOo0 = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final StringBuilder f36621OooOOO = new StringBuilder();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList<String> f36622OooOOOO = new ArrayList<>();

    public static float OooOO0O(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long OooOO0o(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        Objects.requireNonNull(strGroup2);
        long j2 = (Long.parseLong(strGroup2) * 60 * 1000) + j;
        String strGroup3 = matcher.group(i + 3);
        Objects.requireNonNull(strGroup3);
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:101:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01df  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:129:0x0216  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x014d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
    /* JADX WARN: Code duplicated, block: B:49:0x015b  */
    /* JADX WARN: Code duplicated, block: B:50:0x015e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0164  */
    /* JADX WARN: Code duplicated, block: B:53:0x0166  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0174  */
    /* JADX WARN: Code duplicated, block: B:59:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:62:0x017e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x018e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0194  */
    /* JADX WARN: Code duplicated, block: B:71:0x0196  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ce  */
    @Override // p324o0O0oo0O.o0000Ooo
    public final o0000O00 OooOO0(byte[] bArr, int i, boolean z) {
        byte b;
        int i2;
        byte b2;
        int i3;
        Cue cue;
        o0000Ooo o0000ooo = this;
        ArrayList arrayList = new ArrayList();
        long[] jArrCopyOf = new long[32];
        o000 o000Var = new o000(bArr, i);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String strOooO0o0 = o000Var.OooO0o0();
            if (strOooO0o0 != null) {
                if (strOooO0o0.length() != 0) {
                    try {
                        Integer.parseInt(strOooO0o0);
                        String strOooO0o1 = o000Var.OooO0o0();
                        if (strOooO0o1 == null) {
                            Log.w("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f36619OooOOOo.matcher(strOooO0o1);
                            if (matcher.matches()) {
                                long jOooOO0o = OooOO0o(matcher, 1);
                                if (i5 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i5 * 2);
                                }
                                int i6 = i5 + 1;
                                jArrCopyOf[i5] = jOooOO0o;
                                long jOooOO0o2 = OooOO0o(matcher, 6);
                                if (i6 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6 * 2);
                                }
                                int i7 = i6 + 1;
                                jArrCopyOf[i6] = jOooOO0o2;
                                o0000ooo.f36621OooOOO.setLength(i4);
                                o0000ooo.f36622OooOOOO.clear();
                                for (String strOooO0o2 = o000Var.OooO0o0(); !TextUtils.isEmpty(strOooO0o2); strOooO0o2 = o000Var.OooO0o0()) {
                                    if (o0000ooo.f36621OooOOO.length() > 0) {
                                        o0000ooo.f36621OooOOO.append("<br>");
                                    }
                                    StringBuilder sb = o0000ooo.f36621OooOOO;
                                    ArrayList<String> arrayList2 = o0000ooo.f36622OooOOOO;
                                    String strTrim = strOooO0o2.trim();
                                    StringBuilder sb2 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f36620OooOOo0.matcher(strTrim);
                                    int i8 = 0;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i8;
                                        int length = strGroup.length();
                                        sb2.replace(iStart, iStart + length, "");
                                        i8 += length;
                                    }
                                    sb.append(sb2.toString());
                                }
                                Spanned spannedFromHtml = Html.fromHtml(o0000ooo.f36621OooOOO.toString());
                                String str = null;
                                for (int i9 = 0; i9 < o0000ooo.f36622OooOOOO.size(); i9++) {
                                    String str2 = o0000ooo.f36622OooOOOO.get(i9);
                                    if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                        str = str2;
                                        if (str == null) {
                                            cue = new Cue(spannedFromHtml, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE);
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
                                            if (b != 0 || b == 1 || b == 2) {
                                                i2 = 0;
                                            } else {
                                                i2 = (b == 3 || b == 4 || b == 5) ? 2 : 1;
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
                                            if (b2 != 0 || b2 == 1 || b2 == 2) {
                                                i3 = 2;
                                            } else {
                                                i3 = (b2 == 3 || b2 == 4 || b2 == 5) ? 0 : 1;
                                            }
                                            cue = new Cue(spannedFromHtml, null, null, OooOO0O(i3), 0, i3, OooOO0O(i2), i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE);
                                        }
                                        arrayList.add(cue);
                                        arrayList.add(Cue.f14617OooOOOo);
                                        jArrCopyOf = jArrCopyOf;
                                        i5 = i7;
                                    }
                                }
                                if (str == null) {
                                    cue = new Cue(spannedFromHtml, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE);
                                } else {
                                    switch (str) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620586:
                                            if (!str.equals("{\\an5}")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    if (b != 0) {
                                        i2 = 0;
                                    } else {
                                        i2 = 0;
                                    }
                                    switch (str) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                b2 = 2;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                b2 = 6;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620586:
                                            if (!str.equals("{\\an5}")) {
                                                b2 = 7;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                b2 = 8;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                b2 = 4;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                b2 = 5;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    if (b2 != 0) {
                                        i3 = 2;
                                    } else {
                                        i3 = 2;
                                    }
                                    cue = new Cue(spannedFromHtml, null, null, OooOO0O(i3), 0, i3, OooOO0O(i2), i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE);
                                }
                                arrayList.add(cue);
                                arrayList.add(Cue.f14617OooOOOo);
                                jArrCopyOf = jArrCopyOf;
                                i5 = i7;
                            } else {
                                o000Var = o000Var;
                                Log.w("SubripDecoder", strOooO0o1.length() != 0 ? "Skipping invalid timing: ".concat(strOooO0o1) : new String("Skipping invalid timing: "));
                            }
                            o0000ooo = this;
                            o000Var = o000Var;
                            i4 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        o000Var = o000Var;
                        Log.w("SubripDecoder", strOooO0o0.length() != 0 ? "Skipping invalid index: ".concat(strOooO0o0) : new String("Skipping invalid index: "));
                    }
                }
            }
        }
        return new o0000((Cue[]) arrayList.toArray(new Cue[0]), Arrays.copyOf(jArrCopyOf, i5));
    }
}
