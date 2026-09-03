package p318o0O0oOOO;

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
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.webvtt.WebvttCssStyle;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.text.Typography;
import p054o00000oo.o000OO00;
import p315o0O0oO0o.o00000O0;
import p319o0O0oOo.o00;
import p319o0O0oOo.o000O000;
import p468o0OooO0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f36655OooO00o = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f36656OooO0O0 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<String, Integer> f36657OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Map<String, Integer> f36658OooO0Oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f36659OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36660OooO0O0;

        public OooO00o(OooO0O0 oooO0O0, int i) {
            this.f36659OooO00o = oooO0O0;
            this.f36660OooO0O0 = i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f36661OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36662OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f36663OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Set<String> f36664OooO0Oo;

        public OooO0O0(String str, int i, String str2, Set<String> set) {
            this.f36662OooO0O0 = i;
            this.f36661OooO00o = str;
            this.f36663OooO0OO = str2;
            this.f36664OooO0Oo = set;
        }
    }

    public static final class OooO0OO implements Comparable<OooO0OO> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final int f36665Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final WebvttCssStyle f36666OoooO00;

        public OooO0OO(int i, WebvttCssStyle webvttCssStyle) {
            this.f36665Oooo = i;
            this.f36666OoooO00 = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0OO oooO0OO) {
            return Integer.compare(this.f36665Oooo, oooO0OO.f36665Oooo);
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public CharSequence f36670OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f36668OooO00o = 0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f36669OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f36671OooO0Oo = 2;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f36673OooO0o0 = -3.4028235E38f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f36672OooO0o = 1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f36674OooO0oO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f36675OooO0oo = -3.4028235E38f;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f36667OooO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f36676OooOO0 = 1.0f;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f36677OooOO0O = Integer.MIN_VALUE;

        /* JADX WARN: Code duplicated, block: B:20:0x0034  */
        /* JADX WARN: Code duplicated, block: B:21:0x0036  */
        /* JADX WARN: Code duplicated, block: B:29:0x0053  */
        /* JADX WARN: Code duplicated, block: B:31:0x0059  */
        /* JADX WARN: Code duplicated, block: B:43:0x0076  */
        public final Cue.OooO00o OooO00o() {
            Layout.Alignment alignment;
            float f = this.f36675OooO0oo;
            float f2 = -3.4028235E38f;
            if (f == -3.4028235E38f) {
                int i = this.f36671OooO0Oo;
                if (i != 4) {
                    f = i != 5 ? 0.5f : 1.0f;
                } else {
                    f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
            }
            int i2 = this.f36667OooO;
            if (i2 == Integer.MIN_VALUE) {
                int i3 = this.f36671OooO0Oo;
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
            int i4 = this.f36671OooO0Oo;
            if (i4 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i4 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i4 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i4 == 4) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i4 != 5) {
                o0O0O00.OooO00o(34, "Unknown textAlignment: ", i4, "WebvttCueParser");
                alignment = null;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            oooO00o.f14654OooO0OO = alignment;
            float f3 = this.f36673OooO0o0;
            int i5 = this.f36672OooO0o;
            if (f3 != -3.4028235E38f && i5 == 0 && (f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f3 > 1.0f)) {
                f2 = 1.0f;
            } else if (f3 != -3.4028235E38f) {
                f2 = f3;
            } else if (i5 == 0) {
                f2 = 1.0f;
            }
            oooO00o.f14655OooO0Oo = f2;
            oooO00o.f14657OooO0o0 = i5;
            oooO00o.f14656OooO0o = this.f36674OooO0oO;
            oooO00o.f14658OooO0oO = f;
            oooO00o.f14659OooO0oo = i2;
            float f4 = this.f36676OooOO0;
            if (i2 == 0) {
                f = 1.0f - f;
            } else if (i2 == 1) {
                f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            } else if (i2 != 2) {
                throw new IllegalStateException(String.valueOf(i2));
            }
            oooO00o.f14661OooOO0O = Math.min(f4, f);
            oooO00o.f14665OooOOOO = this.f36677OooOO0O;
            CharSequence charSequence = this.f36670OooO0OO;
            if (charSequence != null) {
                oooO00o.f14652OooO00o = charSequence;
            }
            return oooO00o;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f36657OooO0OO = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f36658OooO0Oo = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    public static void OooO00o(@Nullable String str, OooO0O0 oooO0O0, List<OooO00o> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        byte b;
        int i = oooO0O0.f36662OooO0O0;
        int length = spannableStringBuilder.length();
        String str2 = oooO0O0.f36661OooO00o;
        Objects.requireNonNull(str2);
        int iHashCode = str2.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals(ak.aE)) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                } else if (str2.equals(ak.aG)) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                            } else if (str2.equals(ak.aF)) {
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
            } else if (str2.equals(ak.aC)) {
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
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                for (String str3 : oooO0O0.f36664OooO0Oo) {
                    Map<String, Integer> map = f36657OooO0OO;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i, length, 33);
                    } else {
                        Map<String, Integer> map2 = f36658OooO0Oo;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                OooO0OO(list2, str, oooO0O0);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, new Comparator() { // from class: o0O0oOOO.o00O00O
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Integer.compare(((oOO00O.OooO00o) obj).f36659OooO00o.f36662OooO0O0, ((oOO00O.OooO00o) obj2).f36659OooO00o.f36662OooO0O0);
                    }
                });
                int i2 = oooO0O0.f36662OooO0O0;
                int length2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if ("rt".equals(((OooO00o) arrayList.get(i3)).f36659OooO00o.f36661OooO00o)) {
                        OooO00o oooO00o = (OooO00o) arrayList.get(i3);
                        OooO0OO(list2, str, oooO00o.f36659OooO00o);
                        int i4 = oooO00o.f36659OooO00o.f36662OooO0O0 - length2;
                        int i5 = oooO00o.f36660OooO0O0 - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i4, i5);
                        spannableStringBuilder.delete(i4, i5);
                        charSequenceSubSequence.toString();
                        spannableStringBuilder.setSpan(new RubySpan(), i2, i4, 33);
                        length2 += charSequenceSubSequence.length();
                        i2 = i4;
                    }
                }
                break;
            default:
                return;
        }
        List<OooO0OO> listOooO0O0 = OooO0O0(list2, str, oooO0O0);
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) listOooO0O0;
            if (i6 >= arrayList2.size()) {
                return;
            }
            WebvttCssStyle webvttCssStyle = ((OooO0OO) arrayList2.get(i6)).f36666OoooO00;
            if (webvttCssStyle != null) {
                if (webvttCssStyle.OooO00o() != -1) {
                    o000OO00.OooO00o(spannableStringBuilder, new StyleSpan(webvttCssStyle.OooO00o()), i, length);
                }
                if (webvttCssStyle.f14706OooOO0 == 1) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
                }
                if (webvttCssStyle.f14707OooOO0O == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (webvttCssStyle.f14704OooO0oO) {
                    if (!webvttCssStyle.f14704OooO0oO) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    o000OO00.OooO00o(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.f14702OooO0o), i, length);
                }
                if (webvttCssStyle.f14697OooO) {
                    if (!webvttCssStyle.f14697OooO) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    o000OO00.OooO00o(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.f14705OooO0oo), i, length);
                }
                if (webvttCssStyle.f14703OooO0o0 != null) {
                    o000OO00.OooO00o(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.f14703OooO0o0), i, length);
                }
                int i7 = webvttCssStyle.f14709OooOOO;
                if (i7 == 1) {
                    o000OO00.OooO00o(spannableStringBuilder, new AbsoluteSizeSpan((int) ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, true), i, length);
                } else if (i7 == 2 || i7 == 3) {
                    o000OO00.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), i, length);
                }
                if (webvttCssStyle.f14712OooOOOo) {
                    spannableStringBuilder.setSpan(new o00000O0(), i, length, 33);
                }
            }
            i6++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static List<OooO0OO> OooO0O0(List<WebvttCssStyle> list, @Nullable String str, OooO0O0 oooO0O0) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle webvttCssStyle = list.get(i);
            String str2 = oooO0O0.f36661OooO00o;
            Set<String> set = oooO0O0.f36664OooO0Oo;
            String str3 = oooO0O0.f36663OooO0OO;
            if (webvttCssStyle.f14698OooO00o.isEmpty() && webvttCssStyle.f14699OooO0O0.isEmpty() && webvttCssStyle.f14700OooO0OO.isEmpty() && webvttCssStyle.f14701OooO0Oo.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iOooO0O0 = WebvttCssStyle.OooO0O0(WebvttCssStyle.OooO0O0(WebvttCssStyle.OooO0O0(0, webvttCssStyle.f14698OooO00o, str, 1073741824), webvttCssStyle.f14699OooO0O0, str2, 2), webvttCssStyle.f14701OooO0Oo, str3, 4);
                if (iOooO0O0 == -1 || !set.containsAll(webvttCssStyle.f14700OooO0OO)) {
                    r4 = 0;
                } else {
                    size = iOooO0O0 + (webvttCssStyle.f14700OooO0OO.size() * 4);
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
        List<OooO0OO> listOooO0O0 = OooO0O0(list, str, oooO0O0);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listOooO0O0;
            if (i >= arrayList.size()) {
                return -1;
            }
            int i2 = ((OooO0OO) arrayList.get(i)).f36666OoooO00.f14711OooOOOO;
            if (i2 != -1) {
                return i2;
            }
            i++;
        }
    }

    @Nullable
    public static o00O00 OooO0Oo(@Nullable String str, Matcher matcher, o000O000 o000o001, List<WebvttCssStyle> list) {
        OooO0o oooO0o = new OooO0o();
        try {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            oooO0o.f36668OooO00o = o00O00o0.OooO0O0(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            oooO0o.f36669OooO0O0 = o00O00o0.OooO0O0(strGroup2);
            String strGroup3 = matcher.group(3);
            Objects.requireNonNull(strGroup3);
            OooO0o0(strGroup3, oooO0o);
            StringBuilder sb = new StringBuilder();
            String strOooO0o0 = o000o001.OooO0o0();
            while (!TextUtils.isEmpty(strOooO0o0)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strOooO0o0.trim());
                strOooO0o0 = o000o001.OooO0o0();
            }
            oooO0o.f36670OooO0OO = OooO0o(str, sb.toString(), list);
            return new o00O00(oooO0o.OooO00o().OooO00o(), oooO0o.f36668OooO00o, oooO0o.f36669OooO0O0);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0119  */
    public static SpannedString OooO0o(@Nullable String str, String str2, List<WebvttCssStyle> list) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            String strTrim = "";
            if (i2 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    OooO00o(str, (OooO0O0) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                OooO00o(str, new OooO0O0("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = str2.indexOf(59, i2);
                int iIndexOf2 = str2.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i2, iIndexOf);
                    Objects.requireNonNull(strSubstring);
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
                            StringBuilder sb = new StringBuilder(strSubstring.length() + 33);
                            sb.append("ignoring unsupported entity: '&");
                            sb.append(strSubstring);
                            sb.append(";'");
                            Log.w("WebvttCueParser", sb.toString());
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i2++;
            } else {
                int length = i2 + 1;
                if (length < str2.length()) {
                    boolean z2 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i3 = length - 2;
                    boolean z3 = str2.charAt(i3) == '/';
                    int i4 = i2 + (z2 ? 2 : 1);
                    if (!z3) {
                        i3 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i4, i3);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        p319o0O0oOo.o00000O0.OooO00o(!strTrim2.isEmpty());
                        int i5 = o00.f36680OooO00o;
                        String str3 = strTrim2.split("[ \\.]", 2)[i];
                        Objects.requireNonNull(str3);
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
                                    OooO00o(str, oooO0O0, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new OooO00o(oooO0O0, spannableStringBuilder.length()));
                                    }
                                    if (oooO0O0.f36661OooO00o.equals(str3)) {
                                    }
                                }
                            } else if (!z3) {
                                int length2 = spannableStringBuilder.length();
                                String strTrim3 = strSubstring2.trim();
                                p319o0O0oOo.o00000O0.OooO00o(!strTrim3.isEmpty());
                                int iIndexOf4 = strTrim3.indexOf(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                                if (iIndexOf4 != -1) {
                                    strTrim = strTrim3.substring(iIndexOf4).trim();
                                    strTrim3 = strTrim3.substring(i, iIndexOf4);
                                }
                                String[] strArrSplit = strTrim3.split("\\.", -1);
                                String str4 = strArrSplit[i];
                                HashSet hashSet = new HashSet();
                                for (int i6 = 1; i6 < strArrSplit.length; i6++) {
                                    hashSet.add(strArrSplit[i6]);
                                }
                                arrayDeque.push(new OooO0O0(str4, length2, strTrim, hashSet));
                            }
                        }
                    }
                    i2 = length;
                }
                i2 = length;
            }
            i = 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void OooO0o0(String str, OooO0o oooO0o) {
        Matcher matcher = f36656OooO0O0.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            try {
                if ("line".equals(strGroup)) {
                    OooO0oO(strGroup2, oooO0o);
                } else if ("align".equals(strGroup)) {
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
                            break;
                        default:
                            Log.w("WebvttCueParser", strGroup2.length() != 0 ? "Invalid alignment value: ".concat(strGroup2) : new String("Invalid alignment value: "));
                            i = 2;
                            break;
                    }
                    oooO0o.f36671OooO0Oo = i;
                } else if ("position".equals(strGroup)) {
                    OooO0oo(strGroup2, oooO0o);
                } else if ("size".equals(strGroup)) {
                    oooO0o.f36676OooOO0 = o00O00o0.OooO00o(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i = 2;
                    } else if (!strGroup2.equals("rl")) {
                        Log.w("WebvttCueParser", strGroup2.length() != 0 ? "Invalid 'vertical' value: ".concat(strGroup2) : new String("Invalid 'vertical' value: "));
                        i = Integer.MIN_VALUE;
                    }
                    oooO0o.f36677OooOO0O = i;
                } else {
                    StringBuilder sb = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(strGroup);
                    sb.append(CertificateUtil.DELIMITER);
                    sb.append(strGroup2);
                    Log.w("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String strValueOf = String.valueOf(matcher.group());
                Log.w("WebvttCueParser", strValueOf.length() != 0 ? "Skipping bad cue setting: ".concat(strValueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    public static void OooO0oO(String str, OooO0o oooO0o) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            Objects.requireNonNull(strSubstring);
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
                    Log.w("WebvttCueParser", strSubstring.length() != 0 ? "Invalid anchor value: ".concat(strSubstring) : new String("Invalid anchor value: "));
                    i = Integer.MIN_VALUE;
                    break;
            }
            oooO0o.f36674OooO0oO = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            oooO0o.f36673OooO0o0 = o00O00o0.OooO00o(str);
            oooO0o.f36672OooO0o = 0;
        } else {
            oooO0o.f36673OooO0o0 = Integer.parseInt(str);
            oooO0o.f36672OooO0o = 1;
        }
    }

    public static void OooO0oo(String str, OooO0o oooO0o) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            Objects.requireNonNull(strSubstring);
            int i = 2;
            switch (strSubstring) {
                case "line-left":
                case "start":
                    i = 0;
                    break;
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "line-right":
                case "end":
                    break;
                default:
                    Log.w("WebvttCueParser", strSubstring.length() != 0 ? "Invalid anchor value: ".concat(strSubstring) : new String("Invalid anchor value: "));
                    i = Integer.MIN_VALUE;
                    break;
            }
            oooO0o.f36667OooO = i;
            str = str.substring(0, iIndexOf);
        }
        oooO0o.f36675OooO0oo = o00O00o0.OooO00o(str);
    }
}
