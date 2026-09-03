package p097o000o0oO;

import android.text.Layout;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.ttml.TextEmphasis;
import androidx.media3.extractor.text.ttml.TtmlStyle;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o00O0O0O;
import com.google.common.collect.o0O0O0Oo;
import com.google.common.collect.o0O0oo0o;
import com.google.common.collect.o0oO0O0o;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;
import o000Oo0.o0OoOo0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p004OooO0oO.o000oOoO;
import p022Oooo00O.OooOO0;
import p022Oooo00O.o00O00OO;
import p080o000OoO.o00;
import p080o000OoO.o00O0000;
import p080o000OoO.o0OO00O;
import p092o000o0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000O000 extends o0Oo0oo {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final XmlPullParserFactory f35293OooOOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final Pattern f35284OooOOO = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Pattern f35285OooOOOO = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Pattern f35286OooOOOo = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Pattern f35288OooOOo0 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final Pattern f35287OooOOo = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Pattern f35289OooOOoo = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final Pattern f35291OooOo00 = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final OooO0O0 f35290OooOo0 = new OooO0O0(1, 30.0f, 1);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final OooO00o f35292OooOo0O = new OooO00o(15);

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35294OooO00o;

        public OooO00o(int i) {
            this.f35294OooO00o = i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f35295OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35296OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f35297OooO0OO;

        public OooO0O0(int i, float f, int i2) {
            this.f35295OooO00o = f;
            this.f35296OooO0O0 = i;
            this.f35297OooO0OO = i2;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35298OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35299OooO0O0;

        public OooO0OO(int i, int i2) {
            this.f35298OooO00o = i;
            this.f35299OooO0O0 = i2;
        }
    }

    public o000O000() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f35293OooOOO0 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static boolean OooO(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE) || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static TtmlStyle OooO0oo(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    @Nullable
    public static Layout.Alignment OooOO0(String str) {
        String strOooO00o = com.google.common.base.OooO0OO.OooO00o(str);
        strOooO00o.getClass();
        switch (strOooO00o) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static OooO00o OooOO0O(XmlPullParser xmlPullParser, OooO00o oooO00o) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return oooO00o;
        }
        Matcher matcher = f35291OooOo00.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.OooO0o("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return oooO00o;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i != 0 && i2 != 0) {
                return new OooO00o(i2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i + ZegoConstants.ZegoVideoDataAuxPublishingStream + i2);
        } catch (NumberFormatException unused) {
            Log.OooO0o("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return oooO00o;
        }
    }

    public static void OooOO0o(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        int i = o00.f34910OooO00o;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f35286OooOOOo;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(OooOO0.OooO00o(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            Log.OooO0o("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(o000oOoO.OooO0O0("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                ttmlStyle.f8836OooOO0 = 3;
                break;
            case "em":
                ttmlStyle.f8836OooOO0 = 2;
                break;
            case "px":
                ttmlStyle.f8836OooOO0 = 1;
                break;
            default:
                throw new SubtitleDecoderException(o000oOoO.OooO0O0("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        ttmlStyle.f8837OooOO0O = Float.parseFloat(strGroup2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0127  */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:57:0x0177  */
    /* JADX WARN: Code duplicated, block: B:58:0x0181  */
    /* JADX WARN: Code duplicated, block: B:61:0x0194  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f6  */
    public static void OooOOO(XmlPullParser xmlPullParser, HashMap map, OooO00o oooO00o, @Nullable OooO0OO oooO0OO, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strOooO00o;
        o000Oo0 o000oo1;
        float f;
        float f2;
        String strOooO00o2;
        Matcher matcher;
        Matcher matcher2;
        float f3;
        float f4;
        String strOooO00o3;
        int i;
        float f5;
        String strOooO00o4;
        int i2;
        String strOooO00o5;
        String strOooO00o6;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (o00O0000.OooO0OO(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                String strOooO00o7 = o00O0000.OooO00o(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                TtmlStyle ttmlStyleOooOOOo = OooOOOo(xmlPullParser, new TtmlStyle());
                if (strOooO00o7 != null) {
                    String strTrim = strOooO00o7.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i3 = o00.f34910OooO00o;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        ttmlStyleOooOOOo.OooO00o((TtmlStyle) map.get(str));
                    }
                }
                String str2 = ttmlStyleOooOOOo.f8838OooOO0o;
                if (str2 != null) {
                    map.put(str2, ttmlStyleOooOOOo);
                }
            } else if (o00O0000.OooO0OO(xmlPullParser, "region")) {
                String strOooO00o8 = o00O0000.OooO00o(xmlPullParser, "id");
                if (strOooO00o8 != null) {
                    String strOooO00o9 = o00O0000.OooO00o(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    if (strOooO00o9 != null) {
                        Pattern pattern = f35287OooOOo;
                        Matcher matcher3 = pattern.matcher(strOooO00o9);
                        Pattern pattern2 = f35289OooOOoo;
                        Matcher matcher4 = pattern2.matcher(strOooO00o9);
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                f = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f2 = Float.parseFloat(strGroup2) / 100.0f;
                                strOooO00o2 = o00O0000.OooO00o(xmlPullParser, "extent");
                                if (strOooO00o2 != null) {
                                    matcher = pattern.matcher(strOooO00o2);
                                    matcher2 = pattern2.matcher(strOooO00o2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            f3 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f4 = Float.parseFloat(strGroup4) / 100.0f;
                                        } catch (NumberFormatException unused) {
                                            Log.OooO0o("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strOooO00o9));
                                            o000oo1 = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        Log.OooO0o("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strOooO00o9));
                                    } else if (oooO0OO == null) {
                                        Log.OooO0o("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strOooO00o9));
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i4 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            int i5 = Integer.parseInt(strGroup6);
                                            f3 = i4 / oooO0OO.f35298OooO00o;
                                            f4 = i5 / oooO0OO.f35299OooO0O0;
                                        } catch (NumberFormatException unused2) {
                                            Log.OooO0o("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strOooO00o9));
                                            o000oo1 = null;
                                        }
                                    }
                                    strOooO00o3 = o00O0000.OooO00o(xmlPullParser, "displayAlign");
                                    if (strOooO00o3 != null) {
                                        strOooO00o6 = com.google.common.base.OooO0OO.OooO00o(strOooO00o3);
                                        strOooO00o6.getClass();
                                        if (!strOooO00o6.equals("center")) {
                                            f5 = (f4 / 2.0f) + f2;
                                            i = 1;
                                        } else if (strOooO00o6.equals("after")) {
                                            f5 = f2 + f4;
                                            i = 2;
                                        } else {
                                            i = 0;
                                            f5 = f2;
                                        }
                                    } else {
                                        i = 0;
                                        f5 = f2;
                                    }
                                    float f6 = 1.0f / oooO00o.f35294OooO00o;
                                    strOooO00o4 = o00O0000.OooO00o(xmlPullParser, "writingMode");
                                    if (strOooO00o4 != null) {
                                        strOooO00o5 = com.google.common.base.OooO0OO.OooO00o(strOooO00o4);
                                        strOooO00o5.getClass();
                                        switch (strOooO00o5) {
                                            case "tb":
                                            case "tblr":
                                                i2 = 2;
                                                break;
                                            case "tbrl":
                                                i2 = 1;
                                                break;
                                            default:
                                                i2 = Integer.MIN_VALUE;
                                                break;
                                        }
                                    } else {
                                        i2 = Integer.MIN_VALUE;
                                    }
                                    o000oo1 = new o000Oo0(strOooO00o8, f, f5, 0, i, f3, f4, 1, f6, i2);
                                } else {
                                    Log.OooO0o("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                Log.OooO0o("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strOooO00o9));
                            }
                        } else if (!matcher4.matches()) {
                            Log.OooO0o("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(strOooO00o9));
                        } else if (oooO0OO == null) {
                            Log.OooO0o("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strOooO00o9));
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i6 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i7 = Integer.parseInt(strGroup8);
                                float f7 = i6 / oooO0OO.f35298OooO00o;
                                float f8 = i7 / oooO0OO.f35299OooO0O0;
                                f = f7;
                                f2 = f8;
                                strOooO00o2 = o00O0000.OooO00o(xmlPullParser, "extent");
                                if (strOooO00o2 != null) {
                                    matcher = pattern.matcher(strOooO00o2);
                                    matcher2 = pattern2.matcher(strOooO00o2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        f3 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f4 = Float.parseFloat(strGroup10) / 100.0f;
                                    } else if (matcher2.matches()) {
                                        Log.OooO0o("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strOooO00o9));
                                    } else if (oooO0OO == null) {
                                        Log.OooO0o("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strOooO00o9));
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i8 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        int i9 = Integer.parseInt(strGroup12);
                                        f3 = i8 / oooO0OO.f35298OooO00o;
                                        f4 = i9 / oooO0OO.f35299OooO0O0;
                                    }
                                    strOooO00o3 = o00O0000.OooO00o(xmlPullParser, "displayAlign");
                                    if (strOooO00o3 != null) {
                                        strOooO00o6 = com.google.common.base.OooO0OO.OooO00o(strOooO00o3);
                                        strOooO00o6.getClass();
                                        if (!strOooO00o6.equals("center")) {
                                            f5 = (f4 / 2.0f) + f2;
                                            i = 1;
                                        } else if (strOooO00o6.equals("after")) {
                                            i = 0;
                                            f5 = f2;
                                        } else {
                                            f5 = f2 + f4;
                                            i = 2;
                                        }
                                    } else {
                                        i = 0;
                                        f5 = f2;
                                    }
                                    float f9 = 1.0f / oooO00o.f35294OooO00o;
                                    strOooO00o4 = o00O0000.OooO00o(xmlPullParser, "writingMode");
                                    if (strOooO00o4 != null) {
                                        strOooO00o5 = com.google.common.base.OooO0OO.OooO00o(strOooO00o4);
                                        strOooO00o5.getClass();
                                        switch (strOooO00o5) {
                                            case 3694:
                                                if (!strOooO00o5.equals("tb")) {
                                                }
                                                break;
                                            case 3553396:
                                                if (!strOooO00o5.equals("tblr")) {
                                                }
                                                break;
                                            case 3553576:
                                                if (!strOooO00o5.equals("tbrl")) {
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        /*  JADX ERROR: Method code generation error
                                            java.lang.NullPointerException: Switch insn not found in header
                                            	at java.base/java.util.Objects.requireNonNull(Objects.java:248)
                                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 626
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: p097o000o0oO.o000O000.OooOOO(org.xmlpull.v1.XmlPullParser, java.util.HashMap, o000o0oO.o000O000$OooO00o, o000o0oO.o000O000$OooO0OO, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    public static OooO0O0 OooOOO0(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
                                        float f;
                                        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
                                        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                                        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
                                        if (attributeValue2 != null) {
                                            int i2 = o00.f34910OooO00o;
                                            String[] strArrSplit = attributeValue2.split(ZegoConstants.ZegoVideoDataAuxPublishingStream, -1);
                                            if (strArrSplit.length != 2) {
                                                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
                                            }
                                            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                                        } else {
                                            f = 1.0f;
                                        }
                                        OooO0O0 oooO0O0 = f35290OooOo0;
                                        int i3 = oooO0O0.f35296OooO0O0;
                                        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
                                        if (attributeValue3 != null) {
                                            i3 = Integer.parseInt(attributeValue3);
                                        }
                                        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
                                        return new OooO0O0(i3, i * f, attributeValue4 != null ? Integer.parseInt(attributeValue4) : oooO0O0.f35297OooO0OO);
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
                                    /* JADX WARN: Code duplicated, block: B:80:0x0115  */
                                    public static o000O0o OooOOOO(XmlPullParser xmlPullParser, @Nullable o000O0o o000o0o2, HashMap map, OooO0O0 oooO0O0) throws SubtitleDecoderException {
                                        long j;
                                        long j2;
                                        byte b;
                                        String[] strArrSplit;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        TtmlStyle ttmlStyleOooOOOo = OooOOOo(xmlPullParser, null);
                                        String[] strArr = null;
                                        String strSubstring = null;
                                        String str = "";
                                        long jOooOOo0 = -9223372036854775807L;
                                        long jOooOOo1 = -9223372036854775807L;
                                        long jOooOOo2 = -9223372036854775807L;
                                        for (int i = 0; i < attributeCount; i++) {
                                            String attributeName = xmlPullParser.getAttributeName(i);
                                            String attributeValue = xmlPullParser.getAttributeValue(i);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "region":
                                                    b = 0;
                                                    break;
                                                case "dur":
                                                    b = 1;
                                                    break;
                                                case "end":
                                                    b = 2;
                                                    break;
                                                case "begin":
                                                    b = 3;
                                                    break;
                                                case "style":
                                                    b = 4;
                                                    break;
                                                case "backgroundImage":
                                                    b = 5;
                                                    break;
                                                default:
                                                    b = -1;
                                                    break;
                                            }
                                            if (b != 0) {
                                                if (b == 1) {
                                                    jOooOOo2 = OooOOo0(attributeValue, oooO0O0);
                                                } else if (b == 2) {
                                                    jOooOOo1 = OooOOo0(attributeValue, oooO0O0);
                                                } else if (b == 3) {
                                                    jOooOOo0 = OooOOo0(attributeValue, oooO0O0);
                                                } else if (b == 4) {
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i2 = o00.f34910OooO00o;
                                                        strArrSplit = strTrim.split("\\s+", -1);
                                                    }
                                                    if (strArrSplit.length > 0) {
                                                        strArr = strArrSplit;
                                                    }
                                                } else if (b == 5 && attributeValue.startsWith("#")) {
                                                    strSubstring = attributeValue.substring(1);
                                                }
                                            } else if (map.containsKey(attributeValue)) {
                                                str = attributeValue;
                                            }
                                        }
                                        if (o000o0o2 != null) {
                                            long j3 = o000o0o2.f35309OooO0Oo;
                                            j = -9223372036854775807L;
                                            if (j3 != -9223372036854775807L) {
                                                if (jOooOOo0 != -9223372036854775807L) {
                                                    jOooOOo0 += j3;
                                                }
                                                if (jOooOOo1 != -9223372036854775807L) {
                                                    jOooOOo1 += j3;
                                                }
                                            }
                                        } else {
                                            j = -9223372036854775807L;
                                        }
                                        if (jOooOOo1 != j) {
                                            j2 = jOooOOo1;
                                        } else if (jOooOOo2 != j) {
                                            j2 = jOooOOo0 + jOooOOo2;
                                        } else if (o000o0o2 != null) {
                                            long j4 = o000o0o2.f35311OooO0o0;
                                            if (j4 != j) {
                                                j2 = j4;
                                            } else {
                                                j2 = jOooOOo1;
                                            }
                                        } else {
                                            j2 = jOooOOo1;
                                        }
                                        return new o000O0o(xmlPullParser.getName(), null, jOooOOo0, j2, ttmlStyleOooOOOo, strArr, str, strSubstring, o000o0o2);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:105:0x0194  */
                                    /* JADX WARN: Code duplicated, block: B:124:0x01d5  */
                                    /* JADX WARN: Code duplicated, block: B:145:0x022e  */
                                    /* JADX WARN: Code duplicated, block: B:88:0x0148  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public static TtmlStyle OooOOOo(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
                                        float fMin;
                                        TextEmphasis textEmphasis;
                                        byte b;
                                        Object[] objArr;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        for (int i = 0; i < attributeCount; i++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i);
                                            String attributeName = xmlPullParser.getAttributeName(i);
                                            attributeName.getClass();
                                            int i2 = 3;
                                            int i3 = -1;
                                            byte b2 = 1;
                                            switch (attributeName) {
                                                case "fontStyle":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    ttmlStyle.f8827OooO = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case "fontFamily":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    ttmlStyle.f8828OooO00o = attributeValue;
                                                    break;
                                                case "textAlign":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    ttmlStyle.f8841OooOOOO = OooOO0(attributeValue);
                                                    break;
                                                case "textDecoration":
                                                    String strOooO00o = com.google.common.base.OooO0OO.OooO00o(attributeValue);
                                                    strOooO00o.getClass();
                                                    strOooO00o.hashCode();
                                                    switch (strOooO00o) {
                                                        case "nounderline":
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8834OooO0oO = 0;
                                                            break;
                                                        case "underline":
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8834OooO0oO = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8832OooO0o = 0;
                                                            break;
                                                        case "linethrough":
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8832OooO0o = 1;
                                                            break;
                                                    }
                                                    break;
                                                case "fontWeight":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    ttmlStyle.f8835OooO0oo = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case "id":
                                                    if (!AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE.equals(xmlPullParser.getName())) {
                                                        break;
                                                    } else {
                                                        ttmlStyle = OooO0oo(ttmlStyle);
                                                        ttmlStyle.f8838OooOO0o = attributeValue;
                                                        break;
                                                    }
                                                    break;
                                                case "ruby":
                                                    String strOooO00o2 = com.google.common.base.OooO0OO.OooO00o(attributeValue);
                                                    strOooO00o2.getClass();
                                                    strOooO00o2.hashCode();
                                                    switch (strOooO00o2) {
                                                        case "baseContainer":
                                                        case "base":
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8840OooOOO0 = 2;
                                                            break;
                                                        case "container":
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8840OooOOO0 = 1;
                                                            break;
                                                        case "delimiter":
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8840OooOOO0 = 4;
                                                            break;
                                                        case "textContainer":
                                                        case "text":
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8840OooOOO0 = 3;
                                                            break;
                                                    }
                                                    break;
                                                case "color":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    try {
                                                        ttmlStyle.f8829OooO0O0 = o0OO00O.OooO00o(attributeValue, false);
                                                        ttmlStyle.f8830OooO0OO = true;
                                                        break;
                                                    } catch (IllegalArgumentException unused) {
                                                        o0OoOo0.OooO0O0("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "shear":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    Matcher matcher = f35288OooOOo0.matcher(attributeValue);
                                                    if (matcher.matches()) {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                            break;
                                                        } catch (NumberFormatException e) {
                                                            Log.OooO0oO("TtmlDecoder", "Failed to parse shear: " + attributeValue, e);
                                                            fMin = Float.MAX_VALUE;
                                                        }
                                                        ttmlStyle.f8845OooOOoo = fMin;
                                                        break;
                                                    } else {
                                                        o0OoOo0.OooO0O0("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    fMin = Float.MAX_VALUE;
                                                    ttmlStyle.f8845OooOOoo = fMin;
                                                    break;
                                                case "textCombine":
                                                    String strOooO00o3 = com.google.common.base.OooO0OO.OooO00o(attributeValue);
                                                    strOooO00o3.getClass();
                                                    if (!strOooO00o3.equals("all")) {
                                                        if (strOooO00o3.equals("none")) {
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8844OooOOo0 = 0;
                                                        }
                                                        break;
                                                    } else {
                                                        ttmlStyle = OooO0oo(ttmlStyle);
                                                        ttmlStyle.f8844OooOOo0 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case "fontSize":
                                                    try {
                                                        ttmlStyle = OooO0oo(ttmlStyle);
                                                        OooOO0o(attributeValue, ttmlStyle);
                                                        break;
                                                    } catch (SubtitleDecoderException unused2) {
                                                        o0OoOo0.OooO0O0("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "textEmphasis":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    Pattern pattern = TextEmphasis.f8819OooO0Oo;
                                                    if (attributeValue == null) {
                                                        textEmphasis = null;
                                                    } else {
                                                        String strOooO00o4 = com.google.common.base.OooO0OO.OooO00o(attributeValue.trim());
                                                        if (strOooO00o4.isEmpty()) {
                                                            textEmphasis = null;
                                                        } else {
                                                            ImmutableSet immutableSetOooOO0o = ImmutableSet.OooOO0o(TextUtils.split(strOooO00o4, TextEmphasis.f8819OooO0Oo));
                                                            String str = (String) o00O0O0O.OooO0Oo("outside", new o0oO0O0o(o0O0O0Oo.OooO0Oo(TextEmphasis.f8823OooO0oo, immutableSetOooOO0o)));
                                                            int iHashCode = str.hashCode();
                                                            if (iHashCode != -1392885889) {
                                                                if (iHashCode != -1106037339) {
                                                                    if (iHashCode == 92734940 && str.equals("after")) {
                                                                        b = 0;
                                                                    } else {
                                                                        b = -1;
                                                                    }
                                                                } else if (str.equals("outside")) {
                                                                    b = 1;
                                                                } else {
                                                                    b = -1;
                                                                }
                                                            } else if (str.equals("before")) {
                                                                b = 2;
                                                            } else {
                                                                b = -1;
                                                            }
                                                            int i4 = b != 0 ? b != 1 ? 1 : -2 : 2;
                                                            o0O0oo0o o0o0oo0oOooO0Oo = o0O0O0Oo.OooO0Oo(TextEmphasis.f8821OooO0o0, immutableSetOooOO0o);
                                                            if (o0o0oo0oOooO0Oo.isEmpty()) {
                                                                o0O0oo0o o0o0oo0oOooO0Oo2 = o0O0O0Oo.OooO0Oo(TextEmphasis.f8822OooO0oO, immutableSetOooOO0o);
                                                                o0O0oo0o o0o0oo0oOooO0Oo3 = o0O0O0Oo.OooO0Oo(TextEmphasis.f8820OooO0o, immutableSetOooOO0o);
                                                                if (o0o0oo0oOooO0Oo2.isEmpty() && o0o0oo0oOooO0Oo3.isEmpty()) {
                                                                    textEmphasis = new TextEmphasis(-1, 0, i4);
                                                                } else {
                                                                    String str2 = (String) o00O0O0O.OooO0Oo("filled", new o0oO0O0o(o0o0oo0oOooO0Oo2));
                                                                    int iHashCode2 = str2.hashCode();
                                                                    if (iHashCode2 != -1274499742) {
                                                                        if (iHashCode2 == 3417674 && str2.equals("open")) {
                                                                            objArr = 0;
                                                                        } else {
                                                                            objArr = -1;
                                                                        }
                                                                    } else if (str2.equals("filled")) {
                                                                        objArr = 1;
                                                                    } else {
                                                                        objArr = -1;
                                                                    }
                                                                    int i5 = objArr != 0 ? 1 : 2;
                                                                    String str3 = (String) o00O0O0O.OooO0Oo("circle", new o0oO0O0o(o0o0oo0oOooO0Oo3));
                                                                    int iHashCode3 = str3.hashCode();
                                                                    if (iHashCode3 != -1360216880) {
                                                                        if (iHashCode3 != -905816648) {
                                                                            if (iHashCode3 == 99657 && str3.equals("dot")) {
                                                                                i3 = 0;
                                                                            }
                                                                        } else if (str3.equals("sesame")) {
                                                                            i3 = 1;
                                                                        }
                                                                    } else if (str3.equals("circle")) {
                                                                        i3 = 2;
                                                                    }
                                                                    if (i3 == 0) {
                                                                        i2 = 2;
                                                                    } else if (i3 != 1) {
                                                                        i2 = 1;
                                                                    }
                                                                    textEmphasis = new TextEmphasis(i2, i5, i4);
                                                                }
                                                            } else {
                                                                String str4 = (String) new o0oO0O0o(o0o0oo0oOooO0Oo).next();
                                                                int iHashCode4 = str4.hashCode();
                                                                if (iHashCode4 != 3005871) {
                                                                    if (iHashCode4 == 3387192 && str4.equals("none")) {
                                                                        b2 = 0;
                                                                    } else {
                                                                        b2 = -1;
                                                                    }
                                                                } else if (!str4.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                                                                    b2 = -1;
                                                                }
                                                                textEmphasis = new TextEmphasis(b2 == 0 ? 0 : -1, 0, i4);
                                                            }
                                                        }
                                                    }
                                                    ttmlStyle.f8843OooOOo = textEmphasis;
                                                    break;
                                                case "rubyPosition":
                                                    String strOooO00o5 = com.google.common.base.OooO0OO.OooO00o(attributeValue);
                                                    strOooO00o5.getClass();
                                                    if (!strOooO00o5.equals("before")) {
                                                        if (strOooO00o5.equals("after")) {
                                                            ttmlStyle = OooO0oo(ttmlStyle);
                                                            ttmlStyle.f8839OooOOO = 2;
                                                        }
                                                        break;
                                                    } else {
                                                        ttmlStyle = OooO0oo(ttmlStyle);
                                                        ttmlStyle.f8839OooOOO = 1;
                                                        break;
                                                    }
                                                    break;
                                                case "backgroundColor":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    try {
                                                        ttmlStyle.f8831OooO0Oo = o0OO00O.OooO00o(attributeValue, false);
                                                        ttmlStyle.f8833OooO0o0 = true;
                                                        break;
                                                    } catch (IllegalArgumentException unused3) {
                                                        o0OoOo0.OooO0O0("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "multiRowAlign":
                                                    ttmlStyle = OooO0oo(ttmlStyle);
                                                    ttmlStyle.f8842OooOOOo = OooOO0(attributeValue);
                                                    break;
                                            }
                                        }
                                        return ttmlStyle;
                                    }

                                    @Nullable
                                    public static OooO0OO OooOOo(XmlPullParser xmlPullParser) {
                                        String strOooO00o = o00O0000.OooO00o(xmlPullParser, "extent");
                                        if (strOooO00o == null) {
                                            return null;
                                        }
                                        Matcher matcher = f35289OooOOoo.matcher(strOooO00o);
                                        if (!matcher.matches()) {
                                            Log.OooO0o("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strOooO00o));
                                            return null;
                                        }
                                        try {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            int i = Integer.parseInt(strGroup);
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            return new OooO0OO(i, Integer.parseInt(strGroup2));
                                        } catch (NumberFormatException unused) {
                                            Log.OooO0o("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strOooO00o));
                                            return null;
                                        }
                                    }

                                    public static long OooOOo0(String str, OooO0O0 oooO0O0) throws SubtitleDecoderException {
                                        double d;
                                        double d2;
                                        Matcher matcher = f35284OooOOO.matcher(str);
                                        if (matcher.matches()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            double d3 = Long.parseLong(strGroup) * 3600;
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            double d4 = d3 + (Long.parseLong(strGroup2) * 60);
                                            String strGroup3 = matcher.group(3);
                                            strGroup3.getClass();
                                            double d5 = d4 + Long.parseLong(strGroup3);
                                            String strGroup4 = matcher.group(4);
                                            double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                            String strGroup5 = matcher.group(5);
                                            double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / oooO0O0.f35295OooO00o : 0.0d);
                                            String strGroup6 = matcher.group(6);
                                            return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) oooO0O0.f35296OooO0O0)) / ((double) oooO0O0.f35295OooO00o) : 0.0d)) * 1000000.0d);
                                        }
                                        Matcher matcher2 = f35285OooOOOO.matcher(str);
                                        if (!matcher2.matches()) {
                                            throw new SubtitleDecoderException(o00O00OO.OooO00o("Malformed time expression: ", str));
                                        }
                                        String strGroup7 = matcher2.group(1);
                                        strGroup7.getClass();
                                        double d8 = Double.parseDouble(strGroup7);
                                        String strGroup8 = matcher2.group(2);
                                        strGroup8.getClass();
                                        strGroup8.hashCode();
                                        switch (strGroup8) {
                                            case "f":
                                                d = oooO0O0.f35295OooO00o;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            case "h":
                                                d2 = 3600.0d;
                                                break;
                                            case "m":
                                                d2 = 60.0d;
                                                break;
                                            case "t":
                                                d = oooO0O0.f35297OooO0OO;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            case "ms":
                                                d = 1000.0d;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            default:
                                                return (long) (d8 * 1000000.0d);
                                        }
                                        d8 *= d2;
                                        return (long) (d8 * 1000000.0d);
                                    }

                                    @Override // p092o000o0O0.o0Oo0oo
                                    public final p092o000o0O0.o0OO00O OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
                                        OooO00o oooO00o;
                                        OooO0O0 oooO0O0;
                                        try {
                                            XmlPullParser xmlPullParserNewPullParser = this.f35293OooOOO0.newPullParser();
                                            HashMap map = new HashMap();
                                            HashMap map2 = new HashMap();
                                            HashMap map3 = new HashMap();
                                            map2.put("", new o000Oo0("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                            OooO0OO oooO0OOOooOOo = null;
                                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            OooO0O0 oooO0O0OooOOO0 = f35290OooOo0;
                                            OooO00o oooO00o2 = f35292OooOo0O;
                                            int i2 = 0;
                                            o000O00O o000o00o2 = null;
                                            OooO00o oooO00oOooOO0O = oooO00o2;
                                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                o000O0o o000o0o2 = (o000O0o) arrayDeque.peek();
                                                if (i2 == 0) {
                                                    String name = xmlPullParserNewPullParser.getName();
                                                    if (eventType == 2) {
                                                        if ("tt".equals(name)) {
                                                            oooO0O0OooOOO0 = OooOOO0(xmlPullParserNewPullParser);
                                                            oooO00oOooOO0O = OooOO0O(xmlPullParserNewPullParser, oooO00o2);
                                                            oooO0OOOooOOo = OooOOo(xmlPullParserNewPullParser);
                                                        }
                                                        OooO00o oooO00o3 = oooO00oOooOO0O;
                                                        OooO0OO oooO0OO = oooO0OOOooOOo;
                                                        OooO0O0 oooO0O1 = oooO0O0OooOOO0;
                                                        if (!OooO(name)) {
                                                            Log.OooO0o0("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                            i2++;
                                                            oooO00o = oooO00o3;
                                                            oooO0O0 = oooO0O1;
                                                        } else if ("head".equals(name)) {
                                                            oooO00o = oooO00o3;
                                                            oooO0O0 = oooO0O1;
                                                            OooOOO(xmlPullParserNewPullParser, map, oooO00o3, oooO0OO, map2, map3);
                                                        } else {
                                                            oooO00o = oooO00o3;
                                                            oooO0O0 = oooO0O1;
                                                            try {
                                                                o000O0o o000o0oOooOOOO = OooOOOO(xmlPullParserNewPullParser, o000o0o2, map2, oooO0O0);
                                                                arrayDeque.push(o000o0oOooOOOO);
                                                                if (o000o0o2 != null) {
                                                                    if (o000o0o2.f35317OooOOO0 == null) {
                                                                        o000o0o2.f35317OooOOO0 = new ArrayList();
                                                                    }
                                                                    o000o0o2.f35317OooOOO0.add(o000o0oOooOOOO);
                                                                }
                                                            } catch (SubtitleDecoderException e) {
                                                                Log.OooO0oO("TtmlDecoder", "Suppressing parser error", e);
                                                                i2++;
                                                            }
                                                        }
                                                        oooO00oOooOO0O = oooO00o;
                                                        oooO0O0OooOOO0 = oooO0O0;
                                                        oooO0OOOooOOo = oooO0OO;
                                                    } else if (eventType == 4) {
                                                        o000o0o2.getClass();
                                                        o000O0o o000o0oOooO00o = o000O0o.OooO00o(xmlPullParserNewPullParser.getText());
                                                        if (o000o0o2.f35317OooOOO0 == null) {
                                                            o000o0o2.f35317OooOOO0 = new ArrayList();
                                                        }
                                                        o000o0o2.f35317OooOOO0.add(o000o0oOooO00o);
                                                    } else if (eventType == 3) {
                                                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                            o000O0o o000o0o3 = (o000O0o) arrayDeque.peek();
                                                            o000o0o3.getClass();
                                                            o000o00o2 = new o000O00O(o000o0o3, map, map2, map3);
                                                        }
                                                        arrayDeque.pop();
                                                    }
                                                } else if (eventType == 2) {
                                                    i2++;
                                                } else if (eventType == 3) {
                                                    i2--;
                                                }
                                                xmlPullParserNewPullParser.next();
                                            }
                                            if (o000o00o2 != null) {
                                                return o000o00o2;
                                            }
                                            throw new SubtitleDecoderException("No TTML subtitles found");
                                        } catch (IOException e2) {
                                            throw new IllegalStateException("Unexpected error when reading input.", e2);
                                        } catch (XmlPullParserException e3) {
                                            throw new SubtitleDecoderException("Unable to decode source", e3);
                                        }
                                    }
                                }
