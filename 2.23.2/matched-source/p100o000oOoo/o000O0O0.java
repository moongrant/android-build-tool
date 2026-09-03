package p100o000oOoo;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.webvtt.WebvttCssStyle;
import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import o000O000.OooO;
import o000O000.OooOO0;
import org.jctools.util.Pow2;
import p070o000O0o.Oooo000;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f35352OooO00o = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f35353OooO0O0 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<String, Integer> f35354OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Map<String, Integer> f35355OooO0Oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o000OO0O f35356OooO0OO = new o000OO0O();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f35357OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35358OooO0O0;

        public OooO00o(OooO0O0 oooO0O0, int i) {
            this.f35357OooO00o = oooO0O0;
            this.f35358OooO0O0 = i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f35359OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35360OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f35361OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Set<String> f35362OooO0Oo;

        public OooO0O0(String str, int i, String str2, Set<String> set) {
            this.f35360OooO0O0 = i;
            this.f35359OooO00o = str;
            this.f35361OooO0OO = str2;
            this.f35362OooO0Oo = set;
        }
    }

    public static final class OooO0OO implements Comparable<OooO0OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f35363OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final WebvttCssStyle f35364OooO0o0;

        public OooO0OO(int i, WebvttCssStyle webvttCssStyle) {
            this.f35363OooO0Oo = i;
            this.f35364OooO0o0 = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0OO oooO0OO) {
            return Integer.compare(this.f35363OooO0Oo, oooO0OO.f35363OooO0Oo);
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public CharSequence f35368OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f35366OooO00o = 0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f35367OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35369OooO0Oo = 2;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f35371OooO0o0 = -3.4028235E38f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f35370OooO0o = 1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f35372OooO0oO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f35373OooO0oo = -3.4028235E38f;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f35365OooO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f35374OooOO0 = 1.0f;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f35375OooOO0O = Integer.MIN_VALUE;

        /* JADX WARN: Code duplicated, block: B:20:0x0032  */
        /* JADX WARN: Code duplicated, block: B:21:0x0034  */
        /* JADX WARN: Code duplicated, block: B:29:0x004f  */
        /* JADX WARN: Code duplicated, block: B:31:0x0055  */
        /* JADX WARN: Code duplicated, block: B:43:0x0072  */
        public final Cue.OooO00o OooO00o() {
            Layout.Alignment alignment;
            float f = this.f35373OooO0oo;
            float f2 = -3.4028235E38f;
            if (f == -3.4028235E38f) {
                int i = this.f35369OooO0Oo;
                if (i != 4) {
                    f = i != 5 ? 0.5f : 1.0f;
                } else {
                    f = 0.0f;
                }
            }
            int i2 = this.f35365OooO;
            if (i2 == Integer.MIN_VALUE) {
                int i3 = this.f35369OooO0Oo;
                if (i3 == 1) {
                    i2 = 0;
                } else if (i3 == 3) {
                    i2 = 2;
                } else if (i3 == 4) {
                    i2 = 0;
                } else if (i3 != 5) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
            }
            Cue.OooO00o oooO00o = new Cue.OooO00o();
            int i4 = this.f35369OooO0Oo;
            if (i4 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i4 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i4 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i4 == 4) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i4 != 5) {
                Oooo000.OooO00o("Unknown textAlignment: ", i4, "WebvttCueParser");
                alignment = null;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            oooO00o.f6917OooO0OO = alignment;
            float f3 = this.f35371OooO0o0;
            int i5 = this.f35370OooO0o;
            if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
                f2 = 1.0f;
            } else if (f3 != -3.4028235E38f) {
                f2 = f3;
            } else if (i5 == 0) {
                f2 = 1.0f;
            }
            oooO00o.f6920OooO0o0 = f2;
            oooO00o.f6919OooO0o = i5;
            oooO00o.f6921OooO0oO = this.f35372OooO0oO;
            oooO00o.f6922OooO0oo = f;
            oooO00o.f6914OooO = i2;
            float f4 = this.f35374OooOO0;
            if (i2 == 0) {
                f = 1.0f - f;
            } else if (i2 == 1) {
                f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            } else if (i2 != 2) {
                throw new IllegalStateException(String.valueOf(i2));
            }
            oooO00o.f6925OooOO0o = Math.min(f4, f);
            oooO00o.f6929OooOOOo = this.f35375OooOO0O;
            CharSequence charSequence = this.f35368OooO0OO;
            if (charSequence != null) {
                oooO00o.f6915OooO00o = charSequence;
            }
            return oooO00o;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f35354OooO0OO = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f35355OooO0Oo = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    public static void OooO00o(SpannableStringBuilder spannableStringBuilder, OooO0O0 oooO0O0, @Nullable String str, List list, List list2) {
        byte b;
        int i;
        int i2 = oooO0O0.f35360OooO0O0;
        int length = spannableStringBuilder.length();
        String str2 = oooO0O0.f35359OooO00o;
        str2.getClass();
        int iHashCode = str2.hashCode();
        int i3 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                            } else if (str2.equals("c")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str2.equals("b")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b = 7;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals("lang")) {
                    b = 6;
                } else {
                    b = -1;
                }
            } else if (str2.equals("i")) {
                b = 3;
            } else {
                b = -1;
            }
        } else if (str2.equals("")) {
            b = 0;
        } else {
            b = -1;
        }
        switch (b) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                for (String str3 : oooO0O0.f35362OooO0Oo) {
                    Map<String, Integer> map = f35354OooO0OO;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i2, length, 33);
                    } else {
                        Map<String, Integer> map2 = f35355OooO0Oo;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 7:
                int iOooO0OO = OooO0OO(list2, str, oooO0O0);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, OooO00o.f35356OooO0OO);
                int i4 = oooO0O0.f35360OooO0O0;
                int i5 = 0;
                int length2 = 0;
                while (i5 < arrayList.size()) {
                    if ("rt".equals(((OooO00o) arrayList.get(i5)).f35357OooO00o.f35359OooO00o)) {
                        OooO00o oooO00o = (OooO00o) arrayList.get(i5);
                        int iOooO0OO2 = OooO0OO(list2, str, oooO00o.f35357OooO00o);
                        if (iOooO0OO2 == i3) {
                            iOooO0OO2 = iOooO0OO != i3 ? iOooO0OO : 1;
                        }
                        int i6 = oooO00o.f35357OooO00o.f35360OooO0O0 - length2;
                        int i7 = oooO00o.f35358OooO0O0 - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i6, i7);
                        spannableStringBuilder.delete(i6, i7);
                        spannableStringBuilder.setSpan(new OooO(charSequenceSubSequence.toString(), iOooO0OO2), i4, i6, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i4 = i6;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListOooO0O0 = OooO0O0(list2, str, oooO0O0);
        for (int i8 = 0; i8 < arrayListOooO0O0.size(); i8++) {
            WebvttCssStyle webvttCssStyle = ((OooO0OO) arrayListOooO0O0.get(i8)).f35364OooO0o0;
            if (webvttCssStyle != null) {
                int i9 = webvttCssStyle.f8857OooOO0o;
                if (i9 == -1 && webvttCssStyle.f8859OooOOO0 == -1) {
                    i = -1;
                } else {
                    i = (webvttCssStyle.f8859OooOOO0 == 1 ? (char) 2 : (char) 0) | (i9 == 1 ? (char) 1 : (char) 0);
                }
                if (i != -1) {
                    int i10 = webvttCssStyle.f8857OooOO0o;
                    OooOO0.OooO00o(spannableStringBuilder, new StyleSpan((i10 == -1 && webvttCssStyle.f8859OooOOO0 == -1) ? -1 : (i10 == 1 ? 1 : 0) | (webvttCssStyle.f8859OooOOO0 == 1 ? 2 : 0)), i2, length);
                }
                if (webvttCssStyle.f8855OooOO0 == 1) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, length, 33);
                }
                if (webvttCssStyle.f8856OooOO0O == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (webvttCssStyle.f8853OooO0oO) {
                    if (!webvttCssStyle.f8853OooO0oO) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    OooOO0.OooO00o(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.f8851OooO0o), i2, length);
                }
                if (webvttCssStyle.f8846OooO) {
                    if (!webvttCssStyle.f8846OooO) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    OooOO0.OooO00o(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.f8854OooO0oo), i2, length);
                }
                if (webvttCssStyle.f8852OooO0o0 != null) {
                    OooOO0.OooO00o(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.f8852OooO0o0), i2, length);
                }
                int i11 = webvttCssStyle.f8858OooOOO;
                if (i11 == 1) {
                    OooOO0.OooO00o(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.f8860OooOOOO, true), i2, length);
                } else if (i11 == 2) {
                    OooOO0.OooO00o(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.f8860OooOOOO), i2, length);
                } else if (i11 == 3) {
                    OooOO0.OooO00o(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.f8860OooOOOO / 100.0f), i2, length);
                }
                if (webvttCssStyle.f8862OooOOo0) {
                    spannableStringBuilder.setSpan(new o000O000.OooO0OO(), i2, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList OooO0O0(List list, @Nullable String str, OooO0O0 oooO0O0) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle webvttCssStyle = (WebvttCssStyle) list.get(i);
            String str2 = oooO0O0.f35359OooO00o;
            if (webvttCssStyle.f8847OooO00o.isEmpty() && webvttCssStyle.f8848OooO0O0.isEmpty() && webvttCssStyle.f8849OooO0OO.isEmpty() && webvttCssStyle.f8850OooO0Oo.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iOooO00o = WebvttCssStyle.OooO00o(WebvttCssStyle.OooO00o(WebvttCssStyle.OooO00o(0, Pow2.MAX_POW2, webvttCssStyle.f8847OooO00o, str), 2, webvttCssStyle.f8848OooO0O0, str2), 4, webvttCssStyle.f8850OooO0Oo, oooO0O0.f35361OooO0OO);
                if (iOooO00o != -1) {
                    if (oooO0O0.f35362OooO0Oo.containsAll(webvttCssStyle.f8849OooO0OO)) {
                        size = iOooO00o + (webvttCssStyle.f8849OooO0OO.size() * 4);
                    } else {
                        r4 = 0;
                    }
                } else {
                    r4 = 0;
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new OooO0OO(r4, webvttCssStyle));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int OooO0OO(List<WebvttCssStyle> list, @Nullable String str, OooO0O0 oooO0O0) {
        ArrayList arrayListOooO0O0 = OooO0O0(list, str, oooO0O0);
        for (int i = 0; i < arrayListOooO0O0.size(); i++) {
            int i2 = ((OooO0OO) arrayListOooO0O0.get(i)).f35364OooO0o0.f8861OooOOOo;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Nullable
    public static o000O0Oo OooO0Oo(@Nullable String str, Matcher matcher, o000O000 o000o001, ArrayList arrayList) {
        OooO0o oooO0o = new OooO0o();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            oooO0o.f35366OooO00o = o000OO00.OooO0O0(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            oooO0o.f35367OooO0O0 = o000OO00.OooO0O0(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            OooO0o0(strGroup3, oooO0o);
            StringBuilder sb = new StringBuilder();
            String strOooO0oO = o000o001.OooO0oO();
            while (!TextUtils.isEmpty(strOooO0oO)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strOooO0oO.trim());
                strOooO0oO = o000o001.OooO0oO();
            }
            oooO0o.f35368OooO0OO = OooO0o(str, sb.toString(), arrayList);
            return new o000O0Oo(oooO0o.OooO00o().OooO00o(), oooO0o.f35366OooO00o, oooO0o.f35367OooO0O0);
        } catch (NumberFormatException unused) {
            Log.OooO0o("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    public static SpannedString OooO0o(@Nullable String str, String str2, List<WebvttCssStyle> list) {
        boolean z;
        char c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    OooO00o(spannableStringBuilder, (OooO0O0) arrayDeque.pop(), str, arrayList, list);
                }
                OooO00o(spannableStringBuilder, new OooO0O0("", 0, "", Collections.emptySet()), str, Collections.emptyList(), list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append(Typography.greater);
                            break;
                        case "lt":
                            spannableStringBuilder.append(Typography.less);
                            break;
                        case "amp":
                            spannableStringBuilder.append(Typography.amp);
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            Log.OooO0o("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z2 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z3 = str2.charAt(i2) == '/';
                    int i3 = i + (z2 ? 2 : 1);
                    if (!z3) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        o00Oo0.OooO00o(!strTrim2.isEmpty());
                        int i4 = o00.f34910OooO00o;
                        String str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                        if (z) {
                            if (z2) {
                                while (!arrayDeque.isEmpty()) {
                                    OooO0O0 oooO0O0 = (OooO0O0) arrayDeque.pop();
                                    OooO00o(spannableStringBuilder, oooO0O0, str, arrayList, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new OooO00o(oooO0O0, spannableStringBuilder.length()));
                                    }
                                    if (oooO0O0.f35359OooO00o.equals(str3)) {
                                    }
                                }
                            } else if (!z3) {
                                int length2 = spannableStringBuilder.length();
                                String strTrim3 = strSubstring2.trim();
                                o00Oo0.OooO00o(!strTrim3.isEmpty());
                                int iIndexOf4 = strTrim3.indexOf(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                                if (iIndexOf4 == -1) {
                                    c = 0;
                                } else {
                                    strTrim = strTrim3.substring(iIndexOf4).trim();
                                    c = 0;
                                    strTrim3 = strTrim3.substring(0, iIndexOf4);
                                }
                                String[] strArrSplit = strTrim3.split("\\.", -1);
                                String str4 = strArrSplit[c];
                                HashSet hashSet = new HashSet();
                                for (int i5 = 1; i5 < strArrSplit.length; i5++) {
                                    hashSet.add(strArrSplit[i5]);
                                }
                                arrayDeque.push(new OooO0O0(str4, length2, strTrim, hashSet));
                            }
                        }
                    }
                }
                i = length;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void OooO0o0(String str, OooO0o oooO0o) {
        int i;
        int i2;
        Matcher matcher = f35353OooO0O0.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i3 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    OooO0oO(strGroup2, oooO0o);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                Log.OooO0o("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        oooO0o.f35369OooO0Oo = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i3 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i3 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    break;
                                default:
                                    Log.OooO0o("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i3 = Integer.MIN_VALUE;
                                    break;
                            }
                            oooO0o.f35365OooO = i3;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        oooO0o.f35373OooO0oo = o000OO00.OooO00o(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        oooO0o.f35374OooOO0 = o000OO00.OooO00o(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i2 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i2 = 1;
                        } else {
                            Log.OooO0o("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i2 = Integer.MIN_VALUE;
                        }
                        oooO0o.f35375OooOO0O = i2;
                    } else {
                        Log.OooO0o("WebvttCueParser", "Unknown cue setting " + strGroup + CertificateUtil.DELIMITER + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                Log.OooO0o("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static void OooO0oO(String str, OooO0o oooO0o) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    Log.OooO0o("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            oooO0o.f35372OooO0oO = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            oooO0o.f35371OooO0o0 = o000OO00.OooO00o(str);
            oooO0o.f35370OooO0o = 0;
        } else {
            oooO0o.f35371OooO0o0 = Integer.parseInt(str);
            oooO0o.f35370OooO0o = 1;
        }
    }
}
