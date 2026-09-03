package p315o0O0oOO;

import android.text.Layout;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.ttml.TtmlStyle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p318o0O0oOo.o00;
import p318o0O0oOo.o00000OO;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;
import p324o0O0oo0O.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 extends o0000Ooo {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final XmlPullParserFactory f36610OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Pattern f36602OooOOOO = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Pattern f36603OooOOOo = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Pattern f36605OooOOo0 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final Pattern f36604OooOOo = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Pattern f36606OooOOoo = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final Pattern f36608OooOo00 = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final OooO0O0 f36607OooOo0 = new OooO0O0(30.0f, 1, 1);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final OooO00o f36609OooOo0O = new OooO00o(15);

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36611OooO00o;

        public OooO00o(int i) {
            this.f36611OooO00o = i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f36612OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36613OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f36614OooO0OO;

        public OooO0O0(float f, int i, int i2) {
            this.f36612OooO00o = f;
            this.f36613OooO0O0 = i;
            this.f36614OooO0OO = i2;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36615OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36616OooO0O0;

        public OooO0OO(int i, int i2) {
            this.f36615OooO00o = i;
            this.f36616OooO0O0 = i2;
        }
    }

    public o0O0O00() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f36610OooOOO = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static TtmlStyle OooOO0O(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    public static boolean OooOO0o(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(ak.ax) || str.equals("span") || str.equals("br") || str.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE) || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static void OooOOO(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        int i = o000OOo0.f36740OooO00o;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f36605OooOOo0.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                int length = strArrSplit.length;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length);
                sb.append(".");
                throw new SubtitleDecoderException(sb.toString());
            }
            matcher = f36605OooOOo0.matcher(strArrSplit[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Invalid expression for fontSize: '");
            sb2.append(str);
            sb2.append("'.");
            throw new SubtitleDecoderException(sb2.toString());
        }
        String strGroup = matcher.group(3);
        Objects.requireNonNull(strGroup);
        switch (strGroup) {
            case "%":
                ttmlStyle.f14672OooOO0 = 3;
                break;
            case "em":
                ttmlStyle.f14672OooOO0 = 2;
                break;
            case "px":
                ttmlStyle.f14672OooOO0 = 1;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(strGroup.length() + 30);
                sb3.append("Invalid unit for fontSize: '");
                sb3.append(strGroup);
                sb3.append("'.");
                throw new SubtitleDecoderException(sb3.toString());
        }
        String strGroup2 = matcher.group(1);
        Objects.requireNonNull(strGroup2);
        ttmlStyle.f14673OooOO0O = Float.parseFloat(strGroup2);
    }

    public static OooO00o OooOOO0(XmlPullParser xmlPullParser, OooO00o oooO00o) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return oooO00o;
        }
        Matcher matcher = f36608OooOo00.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return oooO00o;
        }
        try {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            int i2 = Integer.parseInt(strGroup2);
            if (i != 0 && i2 != 0) {
                return new OooO00o(i2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(i);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(i2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return oooO00o;
        }
    }

    public static OooO0O0 OooOOOO(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = o000OOo0.f36740OooO00o;
            String[] strArrSplit = attributeValue2.split(ZegoConstants.ZegoVideoDataAuxPublishingStream, -1);
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        }
        OooO0O0 oooO0O0 = f36607OooOo0;
        int i3 = oooO0O0.f36613OooO0O0;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = oooO0O0.f36614OooO0OO;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new OooO0O0(i * f, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x021d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0225  */
    /* JADX WARN: Code duplicated, block: B:108:0x022a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0233  */
    /* JADX WARN: Code duplicated, block: B:140:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:65:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x0194  */
    /* JADX WARN: Code duplicated, block: B:70:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7  */
    public static Map<String, TtmlStyle> OooOOOo(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, OooO00o oooO00o, @Nullable OooO0OO oooO0OO, Map<String, o000000> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        String strOooO00o;
        o000000 o000000Var;
        float f;
        float f2;
        String strOooO00o2;
        Matcher matcher;
        Matcher matcher2;
        float f3;
        float f4;
        String strOooO00o3;
        float f5;
        int i;
        String strOooO00o4;
        int i2;
        String strOooo0;
        int iHashCode;
        byte b;
        String strOooo1;
        String str;
        String str2;
        do {
            xmlPullParser.next();
            if (o00.OooO0OO(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                String strOooO00o5 = o00.OooO00o(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                TtmlStyle ttmlStyleOooOOo = OooOOo(xmlPullParser, new TtmlStyle());
                if (strOooO00o5 != null) {
                    for (String str3 : OooOOoo(strOooO00o5)) {
                        ttmlStyleOooOOo.OooO00o(map.get(str3));
                    }
                }
                String str4 = ttmlStyleOooOOo.f14674OooOO0o;
                if (str4 != null) {
                    map.put(str4, ttmlStyleOooOOo);
                }
            } else if (o00.OooO0OO(xmlPullParser, "region")) {
                String strOooO00o6 = o00.OooO00o(xmlPullParser, "id");
                if (strOooO00o6 != null) {
                    String strOooO00o7 = o00.OooO00o(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    if (strOooO00o7 != null) {
                        Pattern pattern = f36604OooOOo;
                        Matcher matcher3 = pattern.matcher(strOooO00o7);
                        Pattern pattern2 = f36606OooOOoo;
                        Matcher matcher4 = pattern2.matcher(strOooO00o7);
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                Objects.requireNonNull(strGroup);
                                f = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                Objects.requireNonNull(strGroup2);
                                f2 = Float.parseFloat(strGroup2) / 100.0f;
                                strOooO00o2 = o00.OooO00o(xmlPullParser, "extent");
                                if (strOooO00o2 != null) {
                                    matcher = pattern.matcher(strOooO00o2);
                                    matcher2 = pattern2.matcher(strOooO00o2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            Objects.requireNonNull(strGroup3);
                                            float f6 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            Objects.requireNonNull(strGroup4);
                                            f3 = Float.parseFloat(strGroup4) / 100.0f;
                                            f4 = f6;
                                        } catch (NumberFormatException unused) {
                                            Log.w("TtmlDecoder", strOooO00o7.length() != 0 ? "Ignoring region with malformed extent: ".concat(strOooO00o7) : new String("Ignoring region with malformed extent: "));
                                            o000000Var = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        if (strOooO00o7.length() != 0) {
                                            str = "Ignoring region with unsupported extent: ".concat(strOooO00o7);
                                        } else {
                                            str = new String("Ignoring region with unsupported extent: ");
                                        }
                                        Log.w("TtmlDecoder", str);
                                    } else if (oooO0OO == null) {
                                        if (strOooO00o7.length() != 0) {
                                            str2 = "Ignoring region with missing tts:extent: ".concat(strOooO00o7);
                                        } else {
                                            str2 = new String("Ignoring region with missing tts:extent: ");
                                        }
                                        Log.w("TtmlDecoder", str2);
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            Objects.requireNonNull(strGroup5);
                                            int i3 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            Objects.requireNonNull(strGroup6);
                                            float f7 = Integer.parseInt(strGroup6);
                                            f4 = i3 / oooO0OO.f36615OooO00o;
                                            f3 = f7 / oooO0OO.f36616OooO0O0;
                                        } catch (NumberFormatException unused2) {
                                            Log.w("TtmlDecoder", strOooO00o7.length() != 0 ? "Ignoring region with malformed extent: ".concat(strOooO00o7) : new String("Ignoring region with malformed extent: "));
                                            o000000Var = null;
                                        }
                                    }
                                    strOooO00o3 = o00.OooO00o(xmlPullParser, "displayAlign");
                                    if (strOooO00o3 != null) {
                                        strOooo1 = o000OOo0.Oooo0(strOooO00o3);
                                        Objects.requireNonNull(strOooo1);
                                        if (!strOooo1.equals("center")) {
                                            f5 = (f3 / 2.0f) + f2;
                                            i = 1;
                                        } else if (strOooo1.equals("after")) {
                                            f5 = f2 + f3;
                                            i = 2;
                                        } else {
                                            f5 = f2;
                                            i = 0;
                                        }
                                    } else {
                                        f5 = f2;
                                        i = 0;
                                    }
                                    float f8 = 1.0f / oooO00o.f36611OooO00o;
                                    strOooO00o4 = o00.OooO00o(xmlPullParser, "writingMode");
                                    if (strOooO00o4 != null) {
                                        strOooo0 = o000OOo0.Oooo0(strOooO00o4);
                                        Objects.requireNonNull(strOooo0);
                                        iHashCode = strOooo0.hashCode();
                                        if (iHashCode != 3694) {
                                            if (iHashCode != 3553396) {
                                                if (iHashCode != 3553576 && strOooo0.equals("tbrl")) {
                                                    b = 2;
                                                } else {
                                                    b = -1;
                                                }
                                            } else if (strOooo0.equals("tblr")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                        } else if (strOooo0.equals("tb")) {
                                            b = 0;
                                        } else {
                                            b = -1;
                                        }
                                        if (b != 0 || b == 1) {
                                            i2 = 2;
                                        } else if (b != 2) {
                                            i2 = Integer.MIN_VALUE;
                                        } else {
                                            i2 = 1;
                                        }
                                    } else {
                                        i2 = Integer.MIN_VALUE;
                                    }
                                    o000000Var = new o000000(strOooO00o6, f, f5, 0, i, f4, f3, 1, f8, i2);
                                } else {
                                    Log.w("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                Log.w("TtmlDecoder", strOooO00o7.length() != 0 ? "Ignoring region with malformed origin: ".concat(strOooO00o7) : new String("Ignoring region with malformed origin: "));
                            }
                        } else if (!matcher4.matches()) {
                            Log.w("TtmlDecoder", strOooO00o7.length() != 0 ? "Ignoring region with unsupported origin: ".concat(strOooO00o7) : new String("Ignoring region with unsupported origin: "));
                        } else if (oooO0OO == null) {
                            Log.w("TtmlDecoder", strOooO00o7.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(strOooO00o7) : new String("Ignoring region with missing tts:extent: "));
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                Objects.requireNonNull(strGroup7);
                                int i4 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                Objects.requireNonNull(strGroup8);
                                int i5 = Integer.parseInt(strGroup8);
                                float f9 = i4 / oooO0OO.f36615OooO00o;
                                float f10 = i5 / oooO0OO.f36616OooO0O0;
                                f = f9;
                                f2 = f10;
                                strOooO00o2 = o00.OooO00o(xmlPullParser, "extent");
                                if (strOooO00o2 != null) {
                                    matcher = pattern.matcher(strOooO00o2);
                                    matcher2 = pattern2.matcher(strOooO00o2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        Objects.requireNonNull(strGroup9);
                                        float f11 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        Objects.requireNonNull(strGroup10);
                                        f3 = Float.parseFloat(strGroup10) / 100.0f;
                                        f4 = f11;
                                    } else if (matcher2.matches()) {
                                        if (strOooO00o7.length() != 0) {
                                            str = "Ignoring region with unsupported extent: ".concat(strOooO00o7);
                                        } else {
                                            str = new String("Ignoring region with unsupported extent: ");
                                        }
                                        Log.w("TtmlDecoder", str);
                                    } else if (oooO0OO == null) {
                                        if (strOooO00o7.length() != 0) {
                                            str2 = "Ignoring region with missing tts:extent: ".concat(strOooO00o7);
                                        } else {
                                            str2 = new String("Ignoring region with missing tts:extent: ");
                                        }
                                        Log.w("TtmlDecoder", str2);
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        Objects.requireNonNull(strGroup11);
                                        int i6 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        Objects.requireNonNull(strGroup12);
                                        float f12 = Integer.parseInt(strGroup12);
                                        f4 = i6 / oooO0OO.f36615OooO00o;
                                        f3 = f12 / oooO0OO.f36616OooO0O0;
                                    }
                                    strOooO00o3 = o00.OooO00o(xmlPullParser, "displayAlign");
                                    if (strOooO00o3 != null) {
                                        strOooo1 = o000OOo0.Oooo0(strOooO00o3);
                                        Objects.requireNonNull(strOooo1);
                                        if (!strOooo1.equals("center")) {
                                            f5 = (f3 / 2.0f) + f2;
                                            i = 1;
                                        } else if (strOooo1.equals("after")) {
                                            f5 = f2;
                                            i = 0;
                                        } else {
                                            f5 = f2 + f3;
                                            i = 2;
                                        }
                                    } else {
                                        f5 = f2;
                                        i = 0;
                                    }
                                    float f13 = 1.0f / oooO00o.f36611OooO00o;
                                    strOooO00o4 = o00.OooO00o(xmlPullParser, "writingMode");
                                    if (strOooO00o4 != null) {
                                        strOooo0 = o000OOo0.Oooo0(strOooO00o4);
                                        Objects.requireNonNull(strOooo0);
                                        iHashCode = strOooo0.hashCode();
                                        if (iHashCode != 3694) {
                                            if (iHashCode != 3553396) {
                                                if (iHashCode != 3553576) {
                                                    b = -1;
                                                } else {
                                                    b = 2;
                                                }
                                            } else if (strOooo0.equals("tblr")) {
                                                b = -1;
                                            } else {
                                                b = 1;
                                            }
                                        } else if (strOooo0.equals("tb")) {
                                            b = -1;
                                        } else {
                                            b = 0;
                                        }
                                        if (b != 0) {
                                            i2 = 2;
                                        } else {
                                            i2 = 2;
                                        }
                                    } else {
                                        i2 = Integer.MIN_VALUE;
                                    }
                                    o000000Var = new o000000(strOooO00o6, f, f5, 0, i, f4, f3, 1, f13, i2);
                                } else {
                                    Log.w("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused4) {
                                Log.w("TtmlDecoder", strOooO00o7.length() != 0 ? "Ignoring region with malformed origin: ".concat(strOooO00o7) : new String("Ignoring region with malformed origin: "));
                            }
                        }
                    } else {
                        Log.w("TtmlDecoder", "Ignoring region without an origin");
                    }
                    o000000Var = null;
                } else {
                    o000000Var = null;
                }
                if (o000000Var != null) {
                    map2.put(o000000Var.f36580OooO00o, o000000Var);
                }
            } else if (o00.OooO0OO(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (o00.OooO0OO(xmlPullParser, "image") && (strOooO00o = o00.OooO00o(xmlPullParser, "id")) != null) {
                        map3.put(strOooO00o, xmlPullParser.nextText());
                    }
                } while (!o00.OooO0O0(xmlPullParser, "metadata"));
            }
        } while (!o00.OooO0O0(xmlPullParser, "head"));
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:130:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:192:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:193:0x02de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TtmlStyle OooOOo(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            Objects.requireNonNull(attributeName);
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = OooOO0O(ttmlStyle);
                    ttmlStyle.f14663OooO = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "fontFamily":
                    ttmlStyle = OooOO0O(ttmlStyle);
                    ttmlStyle.f14664OooO00o = attributeValue;
                    break;
                case "textAlign":
                    String strOooo0 = o000OOo0.Oooo0(attributeValue);
                    Objects.requireNonNull(strOooo0);
                    switch (strOooo0.hashCode()) {
                        case -1364013995:
                            if (strOooo0.equals("center")) {
                            }
                            break;
                        case 100571:
                            if (strOooo0.equals("end")) {
                            }
                            break;
                        case 3317767:
                            if (strOooo0.equals(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                            }
                            break;
                        case 108511772:
                            if (strOooo0.equals("right")) {
                            }
                            break;
                        case 109757538:
                            if (strOooo0.equals("start")) {
                            }
                            break;
                    }
                    if (r7 == 0) {
                        ttmlStyle = OooOO0O(ttmlStyle);
                        ttmlStyle.f14677OooOOOO = Layout.Alignment.ALIGN_CENTER;
                        break;
                    } else {
                        if (r7 == 1) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14677OooOOOO = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (r7 == 2) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14677OooOOOO = Layout.Alignment.ALIGN_NORMAL;
                        } else if (r7 == 3) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14677OooOOOO = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (r7 == 4) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14677OooOOOO = Layout.Alignment.ALIGN_NORMAL;
                        }
                        break;
                    }
                    break;
                case "textDecoration":
                    String strOooo1 = o000OOo0.Oooo0(attributeValue);
                    Objects.requireNonNull(strOooo1);
                    switch (strOooo1) {
                        case "nounderline":
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14670OooO0oO = 0;
                            break;
                        case "underline":
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14670OooO0oO = 1;
                            break;
                        case "nolinethrough":
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14668OooO0o = 0;
                            break;
                        case "linethrough":
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14668OooO0o = 1;
                            break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = OooOO0O(ttmlStyle);
                    ttmlStyle.f14671OooO0oo = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "id":
                    if (!AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE.equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ttmlStyle = OooOO0O(ttmlStyle);
                        ttmlStyle.f14674OooOO0o = attributeValue;
                        break;
                    }
                    break;
                case "ruby":
                    String strOooo2 = o000OOo0.Oooo0(attributeValue);
                    Objects.requireNonNull(strOooo2);
                    switch (strOooo2.hashCode()) {
                        case -618561360:
                            if (strOooo2.equals("baseContainer")) {
                            }
                            break;
                        case -410956671:
                            if (strOooo2.equals("container")) {
                            }
                            break;
                        case -250518009:
                            if (strOooo2.equals("delimiter")) {
                            }
                            break;
                        case -136074796:
                            if (strOooo2.equals("textContainer")) {
                            }
                            break;
                        case 3016401:
                            if (strOooo2.equals("base")) {
                            }
                            break;
                        case 3556653:
                            if (strOooo2.equals(ViewHierarchyConstants.TEXT_KEY)) {
                            }
                            break;
                    }
                    if (r7 != 0) {
                        if (r7 == 1) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14676OooOOO0 = 1;
                        } else if (r7 == 2) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14676OooOOO0 = 4;
                        } else if (r7 == 3) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14676OooOOO0 = 3;
                        } else if (r7 == 4) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14676OooOOO0 = 2;
                        } else if (r7 == 5) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14676OooOOO0 = 3;
                        }
                        break;
                    } else {
                        ttmlStyle = OooOO0O(ttmlStyle);
                        ttmlStyle.f14676OooOOO0 = 2;
                        break;
                    }
                    break;
                case "color":
                    ttmlStyle = OooOO0O(ttmlStyle);
                    try {
                        ttmlStyle.f14665OooO0O0 = o00000OO.OooO00o(attributeValue, false);
                        ttmlStyle.f14666OooO0OO = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        String strValueOf = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", strValueOf.length() != 0 ? "Failed parsing color value: ".concat(strValueOf) : new String("Failed parsing color value: "));
                        break;
                    }
                    break;
                case "textCombine":
                    String strOooo3 = o000OOo0.Oooo0(attributeValue);
                    Objects.requireNonNull(strOooo3);
                    if (!strOooo3.equals("all")) {
                        if (strOooo3.equals("none")) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14678OooOOOo = 0;
                        }
                        break;
                    } else {
                        ttmlStyle = OooOO0O(ttmlStyle);
                        ttmlStyle.f14678OooOOOo = 1;
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        ttmlStyle = OooOO0O(ttmlStyle);
                        OooOOO(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        String strValueOf2 = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", strValueOf2.length() != 0 ? "Failed parsing fontSize value: ".concat(strValueOf2) : new String("Failed parsing fontSize value: "));
                        break;
                    }
                    break;
                case "rubyPosition":
                    String strOooo4 = o000OOo0.Oooo0(attributeValue);
                    Objects.requireNonNull(strOooo4);
                    if (!strOooo4.equals("before")) {
                        if (strOooo4.equals("after")) {
                            ttmlStyle = OooOO0O(ttmlStyle);
                            ttmlStyle.f14675OooOOO = 2;
                        }
                        break;
                    } else {
                        ttmlStyle = OooOO0O(ttmlStyle);
                        ttmlStyle.f14675OooOOO = 1;
                        break;
                    }
                    break;
                case "backgroundColor":
                    ttmlStyle = OooOO0O(ttmlStyle);
                    try {
                        ttmlStyle.f14667OooO0Oo = o00000OO.OooO00o(attributeValue, false);
                        ttmlStyle.f14669OooO0o0 = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        String strValueOf3 = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", strValueOf3.length() != 0 ? "Failed parsing background value: ".concat(strValueOf3) : new String("Failed parsing background value: "));
                        break;
                    }
                    break;
            }
        }
        return ttmlStyle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    public static o000OOo OooOOo0(XmlPullParser xmlPullParser, @Nullable o000OOo o000ooo2, Map<String, o000000> map, OooO0O0 oooO0O0) throws SubtitleDecoderException {
        long j;
        long j2;
        byte b;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle ttmlStyleOooOOo = OooOOo(xmlPullParser2, null);
        String strSubstring = null;
        String str = "";
        long jOooOo00 = -9223372036854775807L;
        long jOooOo01 = -9223372036854775807L;
        long jOooOo02 = -9223372036854775807L;
        String[] strArr = null;
        int i = 0;
        while (i < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i);
            String attributeValue = xmlPullParser2.getAttributeValue(i);
            Objects.requireNonNull(attributeName);
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
                    jOooOo02 = OooOo00(attributeValue, oooO0O0);
                } else if (b == 2) {
                    jOooOo01 = OooOo00(attributeValue, oooO0O0);
                } else if (b == 3) {
                    jOooOo00 = OooOo00(attributeValue, oooO0O0);
                } else if (b == 4) {
                    String[] strArrOooOOoo = OooOOoo(attributeValue);
                    if (strArrOooOOoo.length > 0) {
                        strArr = strArrOooOOoo;
                    }
                } else if (b == 5 && attributeValue.startsWith("#")) {
                    strSubstring = attributeValue.substring(1);
                }
            } else if (map.containsKey(attributeValue)) {
                str = attributeValue;
            }
            i++;
            xmlPullParser2 = xmlPullParser;
        }
        if (o000ooo2 != null) {
            long j3 = o000ooo2.f36593OooO0Oo;
            j = -9223372036854775807L;
            if (j3 != -9223372036854775807L) {
                if (jOooOo00 != -9223372036854775807L) {
                    jOooOo00 += j3;
                }
                if (jOooOo01 != -9223372036854775807L) {
                    jOooOo01 += j3;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (jOooOo01 != j) {
            j2 = jOooOo01;
        } else if (jOooOo02 != j) {
            j2 = jOooOo00 + jOooOo02;
        } else if (o000ooo2 != null) {
            long j4 = o000ooo2.f36595OooO0o0;
            if (j4 != j) {
                j2 = j4;
            } else {
                j2 = jOooOo01;
            }
        } else {
            j2 = jOooOo01;
        }
        return new o000OOo(xmlPullParser.getName(), null, jOooOo00, j2, ttmlStyleOooOOo, strArr, str, strSubstring, o000ooo2);
    }

    public static String[] OooOOoo(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i = o000OOo0.f36740OooO00o;
        return strTrim.split("\\s+", -1);
    }

    @Nullable
    public static OooO0OO OooOo0(XmlPullParser xmlPullParser) {
        String strOooO00o = o00.OooO00o(xmlPullParser, "extent");
        if (strOooO00o == null) {
            return null;
        }
        Matcher matcher = f36606OooOOoo.matcher(strOooO00o);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", strOooO00o.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(strOooO00o) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            return new OooO0OO(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", strOooO00o.length() != 0 ? "Ignoring malformed tts extent: ".concat(strOooO00o) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x00a5  */
    public static long OooOo00(String str, OooO0O0 oooO0O0) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = f36602OooOOOO.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            double d3 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            double d4 = d3 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            Objects.requireNonNull(strGroup3);
            double d5 = d4 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / oooO0O0.f36612OooO00o : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) oooO0O0.f36613OooO0O0)) / ((double) oooO0O0.f36612OooO00o) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f36603OooOOOo.matcher(str);
        if (!matcher2.matches()) {
            String strValueOf = String.valueOf(str);
            throw new SubtitleDecoderException(strValueOf.length() != 0 ? "Malformed time expression: ".concat(strValueOf) : new String("Malformed time expression: "));
        }
        String strGroup7 = matcher2.group(1);
        Objects.requireNonNull(strGroup7);
        double d8 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        Objects.requireNonNull(strGroup8);
        switch (strGroup8) {
            case "f":
                d = oooO0O0.f36612OooO00o;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = oooO0O0.f36614OooO0OO;
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

    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<o0O0oOO.o000OOo>] */
    @Override // p324o0O0oo0O.o0000Ooo
    public final o0000O00 OooOO0(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        OooO0O0 oooO0O0;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f36610OooOOO.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new o000000("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            OooO0OO oooO0OOOooOo0 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            OooO0O0 oooO0O0OooOOOO = f36607OooOo0;
            OooO00o oooO00oOooOOO0 = f36609OooOo0O;
            o00000 o00000Var = null;
            int i2 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                o000OOo o000ooo2 = (o000OOo) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            oooO0O0OooOOOO = OooOOOO(xmlPullParserNewPullParser);
                            oooO00oOooOOO0 = OooOOO0(xmlPullParserNewPullParser, f36609OooOo0O);
                            oooO0OOOooOo0 = OooOo0(xmlPullParserNewPullParser);
                        }
                        OooO0OO oooO0OO = oooO0OOOooOo0;
                        OooO0O0 oooO0O1 = oooO0O0OooOOOO;
                        OooO00o oooO00o = oooO00oOooOOO0;
                        if (!OooOO0o(name)) {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            Log.i("TtmlDecoder", strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                            i2++;
                            oooO0O0 = oooO0O1;
                        } else if ("head".equals(name)) {
                            oooO0O0 = oooO0O1;
                            OooOOOo(xmlPullParserNewPullParser, map, oooO00o, oooO0OO, map2, map3);
                        } else {
                            oooO0O0 = oooO0O1;
                            try {
                                o000OOo o000oooOooOOo0 = OooOOo0(xmlPullParserNewPullParser, o000ooo2, map2, oooO0O0);
                                arrayDeque.push(o000oooOooOOo0);
                                if (o000ooo2 != null) {
                                    o000ooo2.OooO00o(o000oooOooOOo0);
                                }
                            } catch (SubtitleDecoderException e) {
                                o0000oo.OooO0OO("TtmlDecoder", "Suppressing parser error", e);
                                i2++;
                            }
                        }
                        oooO0O0OooOOOO = oooO0O0;
                        oooO0OOOooOo0 = oooO0OO;
                        oooO00oOooOOO0 = oooO00o;
                    } else if (eventType == 4) {
                        Objects.requireNonNull(o000ooo2);
                        o000OOo o000oooOooO0O0 = o000OOo.OooO0O0(xmlPullParserNewPullParser.getText());
                        if (o000ooo2.f36601OooOOO0 == null) {
                            o000ooo2.f36601OooOOO0 = new ArrayList();
                        }
                        o000ooo2.f36601OooOOO0.add(o000oooOooO0O0);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            o000OOo o000ooo3 = (o000OOo) arrayDeque.peek();
                            Objects.requireNonNull(o000ooo3);
                            o00000Var = new o00000(o000ooo3, map, map2, map3);
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
            if (o00000Var != null) {
                return o00000Var;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }
}
