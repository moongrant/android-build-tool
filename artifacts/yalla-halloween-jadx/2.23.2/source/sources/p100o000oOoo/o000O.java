package p100o000oOoo;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.webvtt.WebvttCssStyle;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.OooO0OO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o0OO00O;
import p092o000o0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000O extends o0Oo0oo {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000O000 f35345OooOOO0 = new o000O000();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000O0 f35344OooOOO = new o000O0();

    /* JADX WARN: Code duplicated, block: B:135:0x022e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0239  */
    /* JADX WARN: Code duplicated, block: B:138:0x0242  */
    /* JADX WARN: Code duplicated, block: B:139:0x024c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0254  */
    /* JADX WARN: Code duplicated, block: B:143:0x025c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0260  */
    /* JADX WARN: Code duplicated, block: B:146:0x0268  */
    /* JADX WARN: Code duplicated, block: B:147:0x026f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0277  */
    /* JADX WARN: Code duplicated, block: B:155:0x028a  */
    /* JADX WARN: Code duplicated, block: B:157:0x028f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0297  */
    /* JADX WARN: Code duplicated, block: B:161:0x029f  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:167:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02db  */
    /* JADX WARN: Code duplicated, block: B:175:0x02df  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:180:0x0311  */
    /* JADX WARN: Code duplicated, block: B:182:0x0321  */
    /* JADX WARN: Code duplicated, block: B:184:0x0325  */
    /* JADX WARN: Code duplicated, block: B:191:0x0335  */
    /* JADX WARN: Code duplicated, block: B:194:0x033e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0340  */
    /* JADX WARN: Code duplicated, block: B:197:0x0348  */
    /* JADX WARN: Code duplicated, block: B:198:0x034a  */
    /* JADX WARN: Code duplicated, block: B:200:0x034d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0350  */
    /* JADX WARN: Code duplicated, block: B:204:0x0353  */
    /* JADX WARN: Code duplicated, block: B:207:0x035c  */
    /* JADX WARN: Code duplicated, block: B:208:0x0360  */
    /* JADX WARN: Code duplicated, block: B:210:0x0373  */
    /* JADX WARN: Code duplicated, block: B:212:0x0376  */
    /* JADX WARN: Code duplicated, block: B:236:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:255:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Instruction removed from duplicated block: B:179:0x02f7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p092o000o0O0.o0Oo0oo
    public final o0OO00O OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        int i2;
        o000O0Oo o000o0ooOooO0Oo;
        String strSubstring;
        int i3;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b;
        boolean z2;
        o000O o000o = this;
        o000O000 o000o001 = o000o.f35345OooOOO0;
        o000o001.OooOooo(i, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            int i4 = o000OO00.f35379OooO00o;
            int i5 = o000o001.f34963OooO0O0;
            String strOooO0oO = o000o001.OooO0oO();
            int i6 = 0;
            int i7 = 1;
            if (!(strOooO0oO != null && strOooO0oO.startsWith("WEBVTT"))) {
                o000o001.Oooo00O(i5);
                throw ParserException.OooO00o("Expected WEBVTT. Got " + o000o001.OooO0oO(), null);
            }
            while (!TextUtils.isEmpty(o000o001.OooO0oO())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i8 = -1;
                int i9 = -1;
                int i10 = i6;
                while (i9 == -1) {
                    i10 = o000o001.f34963OooO0O0;
                    String strOooO0oO2 = o000o001.OooO0oO();
                    if (strOooO0oO2 == null) {
                        i9 = i6;
                    } else if ("STYLE".equals(strOooO0oO2)) {
                        i9 = 2;
                    } else {
                        i9 = strOooO0oO2.startsWith("NOTE") ? i7 : 3;
                    }
                }
                o000o001.Oooo00O(i10);
                if (i9 == 0) {
                    return new o00(arrayList2);
                }
                if (i9 == i7) {
                    while (!TextUtils.isEmpty(o000o001.OooO0oO())) {
                    }
                } else {
                    if (i9 != 2) {
                        i2 = i7;
                        if (i9 == 3) {
                            Pattern pattern = o000O0O0.f35352OooO00o;
                            String strOooO0oO3 = o000o001.OooO0oO();
                            if (strOooO0oO3 == null) {
                                o000o0ooOooO0Oo = null;
                            } else {
                                Pattern pattern2 = o000O0O0.f35352OooO00o;
                                Matcher matcher2 = pattern2.matcher(strOooO0oO3);
                                if (matcher2.matches()) {
                                    o000o0ooOooO0Oo = o000O0O0.OooO0Oo(null, matcher2, o000o001, arrayList);
                                } else {
                                    String strOooO0oO4 = o000o001.OooO0oO();
                                    if (strOooO0oO4 == null) {
                                        o000o0ooOooO0Oo = null;
                                    } else {
                                        Matcher matcher3 = pattern2.matcher(strOooO0oO4);
                                        if (matcher3.matches()) {
                                            o000o0ooOooO0Oo = o000O0O0.OooO0Oo(strOooO0oO3.trim(), matcher3, o000o001, arrayList);
                                        } else {
                                            o000o0ooOooO0Oo = null;
                                        }
                                    }
                                }
                            }
                            if (o000o0ooOooO0Oo != null) {
                                arrayList2.add(o000o0ooOooO0Oo);
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new SubtitleDecoderException("A style block was found after the first cue.");
                        }
                        o000o001.OooO0oO();
                        o000O0 o000o0 = o000o.f35344OooOOO;
                        StringBuilder sb = o000o0.f35349OooO0O0;
                        sb.setLength(i6);
                        int i11 = o000o001.f34963OooO0O0;
                        while (!TextUtils.isEmpty(o000o001.OooO0oO())) {
                            i6 = 0;
                        }
                        byte[] bArr2 = o000o001.f34962OooO00o;
                        int i12 = o000o001.f34963OooO0O0;
                        o000O000 o000o002 = o000o0.f35348OooO00o;
                        o000o002.OooOooo(i12, bArr2);
                        o000o002.Oooo00O(i11);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            o000O0.OooO0OO(o000o002);
                            if (o000o002.f34964OooO0OO - o000o002.f34963OooO0O0 >= 5 && "::cue".equals(o000o002.OooOOoo(5))) {
                                int i13 = o000o002.f34963OooO0O0;
                                String strOooO0O0 = o000O0.OooO0O0(o000o002, sb);
                                if (strOooO0O0 == null) {
                                    strSubstring = null;
                                } else if ("{".equals(strOooO0O0)) {
                                    o000o002.Oooo00O(i13);
                                    strSubstring = "";
                                } else {
                                    if ("(".equals(strOooO0O0)) {
                                        int i14 = o000o002.f34963OooO0O0;
                                        int i15 = o000o002.f34964OooO0OO;
                                        int i16 = i6;
                                        while (i14 < i15 && i16 == 0) {
                                            int i17 = i14 + 1;
                                            i16 = ((char) o000o002.f34962OooO00o[i14]) == ')' ? i7 : i6;
                                            i14 = i17;
                                        }
                                        strSubstring = o000o002.OooOOoo((i14 - 1) - o000o002.f34963OooO0O0).trim();
                                    } else {
                                        strSubstring = null;
                                    }
                                    if (!")".equals(o000O0.OooO0O0(o000o002, sb))) {
                                        strSubstring = null;
                                    }
                                }
                            } else {
                                strSubstring = null;
                            }
                            if (strSubstring == null || !"{".equals(o000O0.OooO0O0(o000o002, sb))) {
                                break;
                            }
                            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
                            if (!"".equals(strSubstring)) {
                                int iIndexOf = strSubstring.indexOf(91);
                                if (iIndexOf != i8) {
                                    Matcher matcher4 = o000O0.f35346OooO0OO.matcher(strSubstring.substring(iIndexOf));
                                    if (matcher4.matches()) {
                                        String strGroup2 = matcher4.group(i7);
                                        strGroup2.getClass();
                                        webvttCssStyle.f8850OooO0Oo = strGroup2;
                                    }
                                    strSubstring = strSubstring.substring(i6, iIndexOf);
                                }
                                int i18 = o00.f34910OooO00o;
                                String[] strArrSplit = strSubstring.split("\\.", i8);
                                String str = strArrSplit[i6];
                                int iIndexOf2 = str.indexOf(35);
                                if (iIndexOf2 != i8) {
                                    webvttCssStyle.f8848OooO0O0 = str.substring(i6, iIndexOf2);
                                    webvttCssStyle.f8847OooO00o = str.substring(iIndexOf2 + 1);
                                } else {
                                    webvttCssStyle.f8848OooO0O0 = str;
                                }
                                if (strArrSplit.length > i7) {
                                    int length = strArrSplit.length;
                                    o00Oo0.OooO00o(length <= strArrSplit.length ? i7 : i6);
                                    webvttCssStyle.f8849OooO0OO = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                }
                            }
                            int i19 = i6;
                            String str2 = null;
                            while (i19 == 0) {
                                int i20 = o000o002.f34963OooO0O0;
                                String strOooO0O1 = o000O0.OooO0O0(o000o002, sb);
                                int i21 = (strOooO0O1 == null || "}".equals(strOooO0O1)) ? i7 : i6;
                                if (i21 == 0) {
                                    o000o002.Oooo00O(i20);
                                    o000O0.OooO0OO(o000o002);
                                    String strOooO00o = o000O0.OooO00o(o000o002, sb);
                                    if (!"".equals(strOooO00o) && CertificateUtil.DELIMITER.equals(o000O0.OooO0O0(o000o002, sb))) {
                                        o000O0.OooO0OO(o000o002);
                                        StringBuilder sb2 = new StringBuilder();
                                        boolean z3 = false;
                                        while (true) {
                                            if (z3) {
                                                string = sb2.toString();
                                                break;
                                            }
                                            int i22 = o000o002.f34963OooO0O0;
                                            boolean z4 = z3;
                                            String strOooO0O2 = o000O0.OooO0O0(o000o002, sb);
                                            if (strOooO0O2 == null) {
                                                string = null;
                                                break;
                                            }
                                            if ("}".equals(strOooO0O2) || ";".equals(strOooO0O2)) {
                                                o000o002.Oooo00O(i22);
                                                z3 = true;
                                            } else {
                                                sb2.append(strOooO0O2);
                                                z3 = z4;
                                            }
                                        }
                                        if (string == null || "".equals(string)) {
                                            i3 = 1;
                                        } else {
                                            int i23 = o000o002.f34963OooO0O0;
                                            String strOooO0O3 = o000O0.OooO0O0(o000o002, sb);
                                            if (";".equals(strOooO0O3)) {
                                                if ("color".equals(strOooO00o)) {
                                                    webvttCssStyle.f8851OooO0o = p080o000OoO.o0OO00O.OooO00o(string, true);
                                                    webvttCssStyle.f8853OooO0oO = true;
                                                } else if ("background-color".equals(strOooO00o)) {
                                                    webvttCssStyle.f8854OooO0oo = p080o000OoO.o0OO00O.OooO00o(string, true);
                                                    webvttCssStyle.f8846OooO = true;
                                                } else if ("ruby-position".equals(strOooO00o)) {
                                                    if ("over".equals(string)) {
                                                        webvttCssStyle.f8861OooOOOo = 1;
                                                    } else if ("under".equals(string)) {
                                                        webvttCssStyle.f8861OooOOOo = 2;
                                                        i3 = 1;
                                                    }
                                                } else if ("text-combine-upright".equals(strOooO00o)) {
                                                    if ("all".equals(string)) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    webvttCssStyle.f8862OooOOo0 = z2;
                                                } else if ("text-decoration".equals(strOooO00o)) {
                                                    if ("underline".equals(string)) {
                                                        webvttCssStyle.f8856OooOO0O = 1;
                                                        i3 = 1;
                                                    }
                                                } else if ("font-family".equals(strOooO00o)) {
                                                    webvttCssStyle.f8852OooO0o0 = OooO0OO.OooO00o(string);
                                                } else if ("font-weight".equals(strOooO00o)) {
                                                    if ("bold".equals(string)) {
                                                        webvttCssStyle.f8857OooOO0o = 1;
                                                    }
                                                } else if ("font-style".equals(strOooO00o)) {
                                                    if ("italic".equals(string)) {
                                                        webvttCssStyle.f8859OooOOO0 = 1;
                                                    }
                                                } else if ("font-size".equals(strOooO00o)) {
                                                    matcher = o000O0.f35347OooO0Oo.matcher(OooO0OO.OooO00o(string));
                                                    if (matcher.matches()) {
                                                        strGroup = matcher.group(2);
                                                        strGroup.getClass();
                                                        iHashCode = strGroup.hashCode();
                                                        if (iHashCode != 37) {
                                                            if (iHashCode != 3240) {
                                                                if (iHashCode != 3592) {
                                                                    b = -1;
                                                                } else {
                                                                    b = 2;
                                                                }
                                                            } else if (strGroup.equals(UserDataStore.EMAIL)) {
                                                                b = 1;
                                                            } else {
                                                                b = -1;
                                                            }
                                                        } else if (strGroup.equals("%")) {
                                                            b = 0;
                                                        } else {
                                                            b = -1;
                                                        }
                                                        if (b != 0) {
                                                            i3 = 1;
                                                            if (b != 1) {
                                                                webvttCssStyle.f8858OooOOO = 2;
                                                            } else {
                                                                if (b == 2) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                webvttCssStyle.f8858OooOOO = 1;
                                                            }
                                                        } else {
                                                            i3 = 1;
                                                            webvttCssStyle.f8858OooOOO = 3;
                                                        }
                                                        String strGroup3 = matcher.group(i3);
                                                        strGroup3.getClass();
                                                        webvttCssStyle.f8860OooOOOO = Float.parseFloat(strGroup3);
                                                    } else {
                                                        Log.OooO0o("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                    }
                                                }
                                                i3 = 1;
                                            } else if ("}".equals(strOooO0O3)) {
                                                o000o002.Oooo00O(i23);
                                                if ("color".equals(strOooO00o)) {
                                                    webvttCssStyle.f8851OooO0o = p080o000OoO.o0OO00O.OooO00o(string, true);
                                                    webvttCssStyle.f8853OooO0oO = true;
                                                } else if ("background-color".equals(strOooO00o)) {
                                                    webvttCssStyle.f8854OooO0oo = p080o000OoO.o0OO00O.OooO00o(string, true);
                                                    webvttCssStyle.f8846OooO = true;
                                                } else if ("ruby-position".equals(strOooO00o)) {
                                                    if ("over".equals(string)) {
                                                        webvttCssStyle.f8861OooOOOo = 1;
                                                    } else if ("under".equals(string)) {
                                                        webvttCssStyle.f8861OooOOOo = 2;
                                                        i3 = 1;
                                                    }
                                                } else if ("text-combine-upright".equals(strOooO00o)) {
                                                    if ("all".equals(string) || string.startsWith("digits")) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    webvttCssStyle.f8862OooOOo0 = z2;
                                                } else if ("text-decoration".equals(strOooO00o)) {
                                                    if ("underline".equals(string)) {
                                                        webvttCssStyle.f8856OooOO0O = 1;
                                                        i3 = 1;
                                                    }
                                                } else if ("font-family".equals(strOooO00o)) {
                                                    webvttCssStyle.f8852OooO0o0 = OooO0OO.OooO00o(string);
                                                } else if ("font-weight".equals(strOooO00o)) {
                                                    if ("bold".equals(string)) {
                                                        webvttCssStyle.f8857OooOO0o = 1;
                                                    }
                                                } else if ("font-style".equals(strOooO00o)) {
                                                    if ("italic".equals(string)) {
                                                        webvttCssStyle.f8859OooOOO0 = 1;
                                                    }
                                                } else if ("font-size".equals(strOooO00o)) {
                                                    matcher = o000O0.f35347OooO0Oo.matcher(OooO0OO.OooO00o(string));
                                                    if (matcher.matches()) {
                                                        Log.OooO0o("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                    } else {
                                                        strGroup = matcher.group(2);
                                                        strGroup.getClass();
                                                        iHashCode = strGroup.hashCode();
                                                        if (iHashCode != 37) {
                                                            if (iHashCode != 3240) {
                                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                                    b = 2;
                                                                } else {
                                                                    b = -1;
                                                                }
                                                            } else if (strGroup.equals(UserDataStore.EMAIL)) {
                                                                b = -1;
                                                            } else {
                                                                b = 1;
                                                            }
                                                        } else if (strGroup.equals("%")) {
                                                            b = -1;
                                                        } else {
                                                            b = 0;
                                                        }
                                                        if (b != 0) {
                                                            i3 = 1;
                                                            if (b != 1) {
                                                                webvttCssStyle.f8858OooOOO = 2;
                                                            } else {
                                                                if (b == 2) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                webvttCssStyle.f8858OooOOO = 1;
                                                            }
                                                        } else {
                                                            i3 = 1;
                                                            webvttCssStyle.f8858OooOOO = 3;
                                                        }
                                                        String strGroup4 = matcher.group(i3);
                                                        strGroup4.getClass();
                                                        webvttCssStyle.f8860OooOOOO = Float.parseFloat(strGroup4);
                                                    }
                                                }
                                                i3 = 1;
                                            } else {
                                                i3 = 1;
                                            }
                                        }
                                    } else {
                                        i3 = i7;
                                    }
                                } else {
                                    i3 = i7;
                                }
                                i7 = i3;
                                str2 = strOooO0O1;
                                i19 = i21;
                                i6 = 0;
                            }
                            int i24 = i7;
                            if ("}".equals(str2)) {
                                arrayList3.add(webvttCssStyle);
                            }
                            i8 = -1;
                            i7 = i24;
                            i6 = 0;
                        }
                        i2 = i7;
                        arrayList.addAll(arrayList3);
                    }
                    o000o = this;
                    i7 = i2;
                    i6 = 0;
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
