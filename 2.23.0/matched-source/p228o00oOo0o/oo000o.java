package p228o00oOo0o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.material.TextFieldImplKt;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.upstream.OooOO0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.OooO;
import com.google.common.base.OooO0OO;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.OooO0o;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.ui.screen.message.YallaTeamImageMessageScreen;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.LongCompanionObject;
import org.conscrypt.PSKKeyManager;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p028Oooo0oO.o0O00o0;
import p214o00oO00o.o000;
import p244o00oo0Oo.o00oOoo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O000O;
import p245o00oo0o.o0OoO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends DefaultHandler implements OooOO0.OooO00o<o00Ooo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final XmlPullParserFactory f39993OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Pattern f39990OooO0o0 = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Pattern f39989OooO0o = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Pattern f39991OooO0oO = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final int[] f39992OooO0oo = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final List<o00oO0o> f39994OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOo f39995OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImmutableList<o00Oo0> f39996OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0O0O00 f39997OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final String f39998OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ArrayList<o00oO0o> f39999OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList<DrmInitData.SchemeData> f40000OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f40001OooO0oO = -1;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final List<o00oO0o> f40002OooO0oo;

        public OooO00o(OooOo oooOo, List list, o0O0O00 o0o0o00, @Nullable String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f39995OooO00o = oooOo;
            this.f39996OooO0O0 = ImmutableList.OooOO0O(list);
            this.f39997OooO0OO = o0o0o00;
            this.f39998OooO0Oo = str;
            this.f40000OooO0o0 = arrayList;
            this.f39999OooO0o = arrayList2;
            this.f40002OooO0oo = arrayList3;
            this.f39994OooO = arrayList4;
        }
    }

    public oo000o() {
        try {
            this.f39993OooO0Oo = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static o00oO0o OooO(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!o0OoO00O.OooO0O0(xmlPullParser, str));
        return new o00oO0o(attributeValue, attributeValue2, str2);
    }

    public static long OooO0O0(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = o0O00.f40595OooO00o;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new o0O0O00.OooO0o(j, j2));
            j += j2;
        }
        return j;
    }

    public static void OooO0OO(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (o0OoO00O.OooO0OO(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (o0OoO00O.OooO0OO(xmlPullParser)) {
                    i++;
                } else {
                    if (xmlPullParser.getEventType() == 3) {
                        i--;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00dd A[PHI: r0
      0x00dd: PHI (r0v34 int) = (r0v25 int), (r0v32 int), (r0v37 int) binds: [B:83:0x00f2, B:74:0x00db, B:44:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    public static int OooO0Oo(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iOooOO0o;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int iOooOO0o2 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iOooOO0o = OooOO0o(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                if (iOooOO0o > 0 && iOooOO0o < 33) {
                    iOooOO0o2 = iOooOO0o;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iOooOO0o2 = OooOO0o(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (attributeValue2 != null) {
                    String strOooO0O0 = OooO0OO.OooO0O0(attributeValue2);
                    strOooO0O0.getClass();
                    switch (strOooO0O0) {
                        case "4000":
                            iOooOO0o2 = 1;
                            break;
                        case "a000":
                            iOooOO0o2 = 2;
                            break;
                        case "f801":
                            iOooOO0o2 = 6;
                            break;
                        case "fa01":
                            iOooOO0o = 8;
                            iOooOO0o2 = iOooOO0o;
                            break;
                    }
                }
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                int iOooOO0o3 = OooOO0o(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                if (iOooOO0o3 >= 0) {
                    int[] iArr = f39992OooO0oo;
                    if (iOooOO0o3 < iArr.length) {
                        iOooOO0o2 = iArr[iOooOO0o3];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (attributeValue3 != null && (iOooOO0o = Integer.bitCount(Integer.parseInt(attributeValue3, 16))) != 0) {
                    iOooOO0o2 = iOooOO0o;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!o0OoO00O.OooO0O0(xmlPullParser, "AudioChannelConfiguration"));
        return iOooOO0o2;
    }

    public static ArrayList OooO0o(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                OooO0OO(xmlPullParser);
            }
        } while (!o0OoO00O.OooO0O0(xmlPullParser, "BaseURL"));
        if ((text == null || o0O000O.OooO00o(text)[0] == -1) ? false : true) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            o00Oo0[] o00oo0Arr = {new o00Oo0(i, i2, text, attributeValue3)};
            com.google.common.collect.oo000o.OooO0O0(1, "arraySize");
            ArrayList arrayList = new ArrayList(OooO0o.OooO0OO(((long) 1) + 5 + ((long) 0)));
            Collections.addAll(arrayList, o00oo0Arr);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            o00Oo0 o00oo1 = (o00Oo0) list.get(i3);
            String strOooO0OO = o0O000O.OooO0OO(o00oo1.f39935OooO00o, text);
            String str = attributeValue3 == null ? strOooO0OO : attributeValue3;
            if (z) {
                i = o00oo1.f39937OooO0OO;
                i2 = o00oo1.f39938OooO0Oo;
                str = o00oo1.f39936OooO0O0;
            }
            arrayList2.add(new o00Oo0(i, i2, strOooO0OO, str));
        }
        return arrayList2;
    }

    public static long OooO0o0(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        return "INF".equals(attributeValue) ? LongCompanionObject.MAX_VALUE : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    public static Pair OooO0oO(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        byte[] bArrOooO00o;
        String attributeValue2;
        UUID uuid2;
        boolean z;
        UUID uuid3;
        String attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue4 != null) {
            String strOooO0O0 = OooO0OO.OooO0O0(attributeValue4);
            strOooO0O0.getClass();
            switch (strOooO0O0) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid3 = C.f10898OooO0OO;
                    uuid = uuid3;
                    attributeValue = null;
                    bArrOooO00o = null;
                    attributeValue2 = null;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid3 = C.f10900OooO0o0;
                    uuid = uuid3;
                    attributeValue = null;
                    bArrOooO00o = null;
                    attributeValue2 = null;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid3 = C.f10899OooO0Oo;
                    uuid = uuid3;
                    attributeValue = null;
                    bArrOooO00o = null;
                    attributeValue2 = null;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            attributeValue3 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue3 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue3) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                        String[] strArrSplit = attributeValue3.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            uuidArr[i2] = UUID.fromString(strArrSplit[i2]);
                        }
                        uuid = C.f10897OooO0O0;
                        bArrOooO00o = o000.OooO00o(uuid, uuidArr, null);
                        attributeValue2 = null;
                        break;
                    } else {
                        uuid = null;
                        bArrOooO00o = null;
                        attributeValue2 = null;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    bArrOooO00o = null;
                    attributeValue2 = null;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            bArrOooO00o = null;
            attributeValue2 = null;
        }
        do {
            xmlPullParser.next();
            if (o0OoO00O.OooO0Oo(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                attributeValue2 = xmlPullParser.getText();
            } else if (o0OoO00O.OooO0Oo(xmlPullParser, "ms:laurl")) {
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (bArrOooO00o == null) {
                if (o0OoO00O.OooO0OO(xmlPullParser)) {
                    String name = xmlPullParser.getName();
                    int iIndexOf2 = name.indexOf(58);
                    if (iIndexOf2 != -1) {
                        name = name.substring(iIndexOf2 + 1);
                    }
                    if (name.equals("pssh")) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    o000.OooO00o oooO00oOooO0O0 = o000.OooO0O0(bArrDecode);
                    UUID uuid4 = oooO00oOooO0O0 == null ? null : oooO00oOooO0O0.f39655OooO00o;
                    if (uuid4 == null) {
                        Log.OooO0o("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        bArrOooO00o = null;
                    } else {
                        UUID uuid5 = uuid4;
                        bArrOooO00o = bArrDecode;
                        uuid = uuid5;
                    }
                } else if (bArrOooO00o == null) {
                    uuid2 = C.f10900OooO0o0;
                    if (!uuid2.equals(uuid)) {
                        OooO0OO(xmlPullParser);
                    } else {
                        OooO0OO(xmlPullParser);
                    }
                } else {
                    OooO0OO(xmlPullParser);
                }
            } else if (bArrOooO00o == null) {
                uuid2 = C.f10900OooO0o0;
                if (!uuid2.equals(uuid) && o0OoO00O.OooO0Oo(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    bArrOooO00o = o000.OooO00o(uuid2, null, Base64.decode(xmlPullParser.getText(), 0));
                } else {
                    OooO0OO(xmlPullParser);
                }
            } else {
                OooO0OO(xmlPullParser);
            }
        } while (!o0OoO00O.OooO0O0(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, MediaUtils.VIDEO_MP4, bArrOooO00o) : null);
    }

    public static int OooO0oo(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(attributeValue)) {
                return 2;
            }
            if (ViewHierarchyConstants.TEXT_KEY.equals(attributeValue)) {
                return 3;
            }
            if ("image".equals(attributeValue)) {
                return 4;
            }
        }
        return -1;
    }

    public static long OooOO0(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = o0O00.f40602OooO0oo.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j2 : j2;
    }

    public static float OooOO0O(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f39990OooO0o0.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
    }

    public static int OooOO0o(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:241:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:242:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:244:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:246:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:251:0x0809  */
    /* JADX WARN: Code duplicated, block: B:254:0x0817  */
    /* JADX WARN: Code duplicated, block: B:256:0x0823  */
    /* JADX WARN: Code duplicated, block: B:257:0x0826  */
    /* JADX WARN: Code duplicated, block: B:260:0x082f  */
    /* JADX WARN: Code duplicated, block: B:263:0x083a  */
    /* JADX WARN: Code duplicated, block: B:265:0x084c  */
    /* JADX WARN: Code duplicated, block: B:267:0x0854  */
    /* JADX WARN: Code duplicated, block: B:277:0x086f A[PHI: r0
      0x086f: PHI (r0v89 java.lang.String) = (r0v88 java.lang.String), (r0v116 java.lang.String) binds: [B:259:0x082d, B:275:0x086c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x087b  */
    /* JADX WARN: Code duplicated, block: B:283:0x088d  */
    /* JADX WARN: Code duplicated, block: B:286:0x0892  */
    /* JADX WARN: Code duplicated, block: B:290:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:297:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:299:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:304:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:306:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:307:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:309:0x0906 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:311:0x0909  */
    /* JADX WARN: Code duplicated, block: B:314:0x0912  */
    /* JADX WARN: Code duplicated, block: B:317:0x091b  */
    /* JADX WARN: Code duplicated, block: B:318:0x091d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0926  */
    /* JADX WARN: Code duplicated, block: B:322:0x0928  */
    /* JADX WARN: Code duplicated, block: B:325:0x0931  */
    /* JADX WARN: Code duplicated, block: B:326:0x0933  */
    /* JADX WARN: Code duplicated, block: B:329:0x093c  */
    /* JADX WARN: Code duplicated, block: B:330:0x093e  */
    /* JADX WARN: Code duplicated, block: B:333:0x0947  */
    /* JADX WARN: Code duplicated, block: B:334:0x0949  */
    /* JADX WARN: Code duplicated, block: B:336:0x094c  */
    /* JADX WARN: Code duplicated, block: B:338:0x094f  */
    /* JADX WARN: Code duplicated, block: B:340:0x0952 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:341:0x0954  */
    /* JADX WARN: Code duplicated, block: B:343:0x0957  */
    /* JADX WARN: Code duplicated, block: B:344:0x0959  */
    /* JADX WARN: Code duplicated, block: B:345:0x095b  */
    /* JADX WARN: Code duplicated, block: B:346:0x095e  */
    /* JADX WARN: Code duplicated, block: B:347:0x0960  */
    /* JADX WARN: Code duplicated, block: B:348:0x0963  */
    /* JADX WARN: Code duplicated, block: B:354:0x098b  */
    /* JADX WARN: Code duplicated, block: B:356:0x099b  */
    /* JADX WARN: Code duplicated, block: B:358:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:362:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:363:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:371:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:372:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:382:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:384:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:388:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:391:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:393:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:400:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:402:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:405:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:407:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:413:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:415:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:417:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:419:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:422:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:423:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:426:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:427:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:431:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:433:0x0b22 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:434:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:435:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:438:0x0b48 A[LOOP:11: B:193:0x05d0->B:438:0x0b48, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:473:0x0cd9  */
    /* JADX WARN: Code duplicated, block: B:475:0x0ced  */
    /* JADX WARN: Code duplicated, block: B:478:0x0cf3  */
    /* JADX WARN: Code duplicated, block: B:481:0x0d02  */
    /* JADX WARN: Code duplicated, block: B:484:0x0d0a  */
    /* JADX WARN: Code duplicated, block: B:486:0x0d1a  */
    /* JADX WARN: Code duplicated, block: B:493:0x0d2d  */
    /* JADX WARN: Code duplicated, block: B:496:0x0d35  */
    /* JADX WARN: Code duplicated, block: B:498:0x0d47  */
    /* JADX WARN: Code duplicated, block: B:501:0x0d5c  */
    /* JADX WARN: Code duplicated, block: B:505:0x0d6d  */
    /* JADX WARN: Code duplicated, block: B:507:0x0d77  */
    /* JADX WARN: Code duplicated, block: B:508:0x0d7a  */
    /* JADX WARN: Code duplicated, block: B:510:0x0d7e  */
    /* JADX WARN: Code duplicated, block: B:513:0x0d86  */
    /* JADX WARN: Code duplicated, block: B:515:0x0d90  */
    /* JADX WARN: Code duplicated, block: B:516:0x0d93  */
    /* JADX WARN: Code duplicated, block: B:518:0x0d97  */
    /* JADX WARN: Code duplicated, block: B:520:0x0d9b  */
    /* JADX WARN: Code duplicated, block: B:521:0x0d9e  */
    /* JADX WARN: Code duplicated, block: B:523:0x0da2  */
    /* JADX WARN: Code duplicated, block: B:526:0x0dad  */
    /* JADX WARN: Code duplicated, block: B:529:0x0db5 A[LOOP:9: B:511:0x0d80->B:529:0x0db5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:532:0x0dc3  */
    /* JADX WARN: Code duplicated, block: B:535:0x0de0  */
    /* JADX WARN: Code duplicated, block: B:536:0x0df8  */
    /* JADX WARN: Code duplicated, block: B:538:0x0dfc  */
    /* JADX WARN: Code duplicated, block: B:543:0x0e48 A[LOOP:5: B:129:0x03bf->B:543:0x0e48, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:632:0x11dd  */
    /* JADX WARN: Code duplicated, block: B:634:0x11e1  */
    /* JADX WARN: Code duplicated, block: B:635:0x11e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:637:0x11e7  */
    /* JADX WARN: Code duplicated, block: B:641:0x11f5  */
    /* JADX WARN: Code duplicated, block: B:643:0x1207  */
    /* JADX WARN: Code duplicated, block: B:645:0x120f A[LOOP:1: B:44:0x00e2->B:645:0x120f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:651:0x0e1e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x11d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0cc8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x0d25 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0d22 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0db8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0db1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x07de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0867 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x08ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x08a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x08cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0966 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x09da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0ad3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0a87 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x0ad3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static o00Ooo OooOOO(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        int i;
        boolean z;
        int i2;
        long j;
        int i3;
        long j2;
        String str;
        long j3;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList4;
        o0O0O00 o0o0o00OooOo00;
        String str7;
        long j4;
        ArrayList arrayList5;
        String str8;
        String str9;
        ArrayList arrayList6;
        long j5;
        ArrayList arrayList7;
        ArrayList arrayList8;
        String str10;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str11;
        String str12;
        String str13;
        int i4;
        float f;
        ArrayList arrayList11;
        int i5;
        int i6;
        String str14;
        String str15;
        String str16;
        ArrayList arrayList12;
        ArrayList arrayList13;
        int i7;
        ArrayList arrayList14;
        String str17;
        String str18;
        long j6;
        String str19;
        String str20;
        String str21;
        ArrayList arrayList15;
        o0O0O00 o0o0o00OooOOoo;
        ArrayList arrayList16;
        String str22;
        String str23;
        String str24;
        ArrayList arrayList17;
        int i8;
        ArrayList arrayList18;
        int i9;
        String str25;
        ArrayList arrayList19;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str26;
        XmlPullParser xmlPullParser2;
        String str27;
        String str28;
        String str29;
        boolean z2;
        String str30;
        ArrayList arrayList22;
        ArrayList arrayList23;
        String str31;
        ArrayList arrayList24;
        ArrayList arrayList25;
        String str32;
        int i10;
        String strOooO0Oo;
        String str33;
        String str34;
        int i11;
        int i12;
        String str35;
        ArrayList arrayList26;
        int i13;
        int iOooOOOo;
        int i14;
        int i15;
        int i16;
        Pair pairCreate;
        OooOo.OooO00o oooO00o;
        int iIntValue;
        int iIntValue2;
        int i17;
        int i18;
        int i19;
        o00oO0o o00oo0o2;
        String str36;
        int i20;
        int i21;
        o00oO0o o00oo0o3;
        String str37;
        o0O0O00 oooO;
        ArrayList arrayList27;
        int i22;
        String str38;
        String str39;
        boolean z3;
        o00oO0o o00oo0o4;
        String str40;
        String[] strArrSplit;
        o00oO0o o00oo0o5;
        boolean zOooO00o;
        String str41;
        int iOooOOOo2;
        byte b;
        o00oO0o o00oo0o6;
        o00oO0o o00oo0o7;
        String str42;
        int i23;
        int i24;
        ArrayList arrayList28;
        int i25;
        ArrayList arrayList29;
        OooOo.OooO00o oooO00o2;
        String str43;
        ArrayList<DrmInitData.SchemeData> arrayList30;
        String str44;
        ArrayList<o00oO0o> arrayList31;
        long j7;
        OooOo oooOo;
        ImmutableList<o00Oo0> immutableList;
        List<o00oO0o> list;
        List<o00oO0o> list2;
        o0O0O00 o0o0o00;
        oo0o0Oo oooO00o3;
        int i26;
        String str45;
        int i27;
        DrmInitData.SchemeData schemeData;
        int size;
        DrmInitData.SchemeData schemeData2;
        int i28;
        int i29;
        DrmInitData.SchemeData schemeData3;
        int i30;
        int i31;
        int i32;
        DrmInitData.SchemeData schemeData4;
        long jOooO0o0;
        int i33;
        long j8;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String[] strArrSplit2 = new String[0];
        String str46 = null;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit2 = attributeValue.split(",");
        }
        int length = strArrSplit2.length;
        int i34 = 0;
        while (true) {
            i = 1;
            if (i34 >= length) {
                z = false;
                break;
            }
            if (strArrSplit2[i34].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i34++;
        }
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "availabilityStartTime");
        long jOooo0o = attributeValue2 == null ? -9223372036854775807L : o0O00.Oooo0o(attributeValue2);
        long jOooOO0 = OooOO0(xmlPullParser3, "mediaPresentationDuration", -9223372036854775807L);
        long jOooOO1 = OooOO0(xmlPullParser3, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser3.getAttributeValue(null, "type"));
        long jOooOO2 = zEquals ? OooOO0(xmlPullParser3, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jOooOO3 = zEquals ? OooOO0(xmlPullParser3, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jOooOO4 = zEquals ? OooOO0(xmlPullParser3, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "publishTime");
        long jOooo0o2 = attributeValue3 == null ? -9223372036854775807L : o0O00.Oooo0o(attributeValue3);
        long j9 = zEquals ? 0L : -9223372036854775807L;
        o00Oo0[] o00oo0Arr = {new o00Oo0(z ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString())};
        com.google.common.collect.oo000o.OooO0O0(1, "arraySize");
        ArrayList arrayList32 = new ArrayList(OooO0o.OooO0OO(((long) 1) + 5 + ((long) 0)));
        Collections.addAll(arrayList32, o00oo0Arr);
        ArrayList arrayList33 = new ArrayList();
        ArrayList arrayList34 = new ArrayList();
        long j10 = zEquals ? -9223372036854775807L : 0L;
        long jOooO0o1 = j9;
        XmlPullParser xmlPullParser4 = xmlPullParser3;
        int i35 = 0;
        int i36 = 0;
        o0Oo0oo o0oo0oo2 = null;
        o00000 o00000Var = null;
        Uri uri2 = null;
        o000OOo o000ooo2 = null;
        while (true) {
            xmlPullParser.next();
            String str47 = "BaseURL";
            if (o0OoO00O.OooO0Oo(xmlPullParser4, "BaseURL")) {
                if (i35 == 0) {
                    jOooO0o1 = OooO0o0(xmlPullParser4, jOooO0o1);
                    i35 = i;
                }
                arrayList34.addAll(OooO0o(xmlPullParser4, arrayList32, z));
            } else {
                String str48 = "lang";
                if (o0OoO00O.OooO0Oo(xmlPullParser4, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser4.getAttributeValue(str46, "moreInformationURL");
                    String str49 = attributeValue4 == null ? str46 : attributeValue4;
                    String attributeValue5 = xmlPullParser4.getAttributeValue(str46, "lang");
                    String str50 = attributeValue5 == null ? str46 : attributeValue5;
                    String strNextText = str46;
                    String strNextText2 = strNextText;
                    String strNextText3 = strNextText2;
                    do {
                        xmlPullParser.next();
                        if (o0OoO00O.OooO0Oo(xmlPullParser4, YallaTeamImageMessageScreen.Key_Title)) {
                            strNextText = xmlPullParser.nextText();
                        } else if (o0OoO00O.OooO0Oo(xmlPullParser4, "Source")) {
                            strNextText2 = xmlPullParser.nextText();
                        } else if (o0OoO00O.OooO0Oo(xmlPullParser4, "Copyright")) {
                            strNextText3 = xmlPullParser.nextText();
                        } else {
                            OooO0OO(xmlPullParser);
                        }
                    } while (!o0OoO00O.OooO0O0(xmlPullParser4, "ProgramInformation"));
                    o0oo0oo2 = new o0Oo0oo(strNextText, strNextText2, strNextText3, str49, str50);
                } else {
                    String str51 = "schemeIdUri";
                    if (o0OoO00O.OooO0Oo(xmlPullParser4, "UTCTiming")) {
                        o00000Var = new o00000(xmlPullParser4.getAttributeValue(str46, "schemeIdUri"), xmlPullParser4.getAttributeValue(str46, AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    } else {
                        if (o0OoO00O.OooO0Oo(xmlPullParser4, "Location")) {
                            uri2 = Uri.parse(o0O000O.OooO0OO(uri.toString(), xmlPullParser.nextText()));
                        } else if (o0OoO00O.OooO0Oo(xmlPullParser4, "ServiceDescription")) {
                            float f2 = -3.4028235E38f;
                            float f3 = -3.4028235E38f;
                            long jOooOOO0 = -9223372036854775807L;
                            long jOooOOO1 = -9223372036854775807L;
                            long jOooOOO2 = -9223372036854775807L;
                            while (true) {
                                xmlPullParser.next();
                                if (o0OoO00O.OooO0Oo(xmlPullParser4, "Latency")) {
                                    j8 = jOooO0o1;
                                    jOooOOO0 = OooOOO0(xmlPullParser4, "target", -9223372036854775807L);
                                    jOooOOO1 = OooOOO0(xmlPullParser4, "min", -9223372036854775807L);
                                    jOooOOO2 = OooOOO0(xmlPullParser4, "max", -9223372036854775807L);
                                } else {
                                    j8 = jOooO0o1;
                                    if (o0OoO00O.OooO0Oo(xmlPullParser4, "PlaybackRate")) {
                                        String attributeValue6 = xmlPullParser4.getAttributeValue(null, "min");
                                        float f4 = attributeValue6 == null ? -3.4028235E38f : Float.parseFloat(attributeValue6);
                                        String attributeValue7 = xmlPullParser4.getAttributeValue(null, "max");
                                        f3 = attributeValue7 == null ? -3.4028235E38f : Float.parseFloat(attributeValue7);
                                        f2 = f4;
                                    }
                                }
                                float f5 = f2;
                                float f6 = f3;
                                long j11 = jOooOOO0;
                                long j12 = jOooOOO1;
                                long j13 = jOooOOO2;
                                if (o0OoO00O.OooO0O0(xmlPullParser4, "ServiceDescription")) {
                                    o000ooo2 = new o000OOo(j11, j12, j13, f5, f6);
                                    jOooO0o1 = j8;
                                    i2 = 0;
                                    j = -9223372036854775807L;
                                    i3 = 1;
                                } else {
                                    jOooO0o1 = j8;
                                    jOooOOO0 = j11;
                                    jOooOOO1 = j12;
                                    jOooOOO2 = j13;
                                    f2 = f5;
                                    f3 = f6;
                                }
                            }
                        } else {
                            long j14 = jOooO0o1;
                            if (o0OoO00O.OooO0Oo(xmlPullParser4, "Period") && i36 == 0) {
                                ArrayList arrayList35 = !arrayList34.isEmpty() ? arrayList34 : arrayList32;
                                String str52 = "id";
                                String attributeValue8 = xmlPullParser4.getAttributeValue(null, "id");
                                long jOooOO5 = OooOO0(xmlPullParser4, "start", j10);
                                ArrayList arrayList36 = arrayList32;
                                String str53 = AppMeasurementSdk.ConditionalUserProperty.VALUE;
                                long j15 = jOooo0o != -9223372036854775807L ? jOooo0o + jOooOO5 : -9223372036854775807L;
                                String str54 = "duration";
                                long jOooOO6 = OooOO0(xmlPullParser4, "duration", -9223372036854775807L);
                                ArrayList arrayList37 = new ArrayList();
                                Object obj = "Period";
                                ArrayList arrayList38 = new ArrayList();
                                ArrayList arrayList39 = new ArrayList();
                                long j16 = -9223372036854775807L;
                                XmlPullParser xmlPullParser5 = xmlPullParser3;
                                long jOooO0o2 = j14;
                                o0O0O00 o0o0o00OooOOo = null;
                                boolean z4 = false;
                                while (true) {
                                    xmlPullParser.next();
                                    if (o0OoO00O.OooO0Oo(xmlPullParser5, str47)) {
                                        if (!z4) {
                                            jOooO0o2 = OooO0o0(xmlPullParser5, jOooO0o2);
                                            z4 = true;
                                        }
                                        arrayList39.addAll(OooO0o(xmlPullParser5, arrayList35, z));
                                        str = str47;
                                        j3 = j10;
                                        str4 = str52;
                                        arrayList = arrayList33;
                                        arrayList34 = arrayList34;
                                        arrayList2 = arrayList35;
                                        str2 = str51;
                                        j2 = jOooO0o2;
                                        str3 = str48;
                                        arrayList39 = arrayList39;
                                        arrayList32 = arrayList36;
                                        str6 = str53;
                                        arrayList4 = arrayList38;
                                        arrayList3 = arrayList37;
                                        i2 = 0;
                                        j = -9223372036854775807L;
                                        i3 = 1;
                                        xmlPullParser3 = xmlPullParser;
                                        str5 = str54;
                                        z = z;
                                    } else {
                                        ArrayList arrayList40 = arrayList37;
                                        j2 = jOooO0o2;
                                        String str55 = "SegmentTemplate";
                                        if (o0OoO00O.OooO0Oo(xmlPullParser5, "AdaptationSet")) {
                                            ArrayList arrayList41 = arrayList35;
                                            if (arrayList39.isEmpty()) {
                                                arrayList39 = arrayList41;
                                            }
                                            int iOooOO0o = OooOO0o(xmlPullParser5, str52, -1);
                                            int iOooO0oo = OooO0oo(xmlPullParser);
                                            String str56 = "AdaptationSet";
                                            String attributeValue9 = xmlPullParser5.getAttributeValue(null, "mimeType");
                                            String str57 = str51;
                                            String attributeValue10 = xmlPullParser5.getAttributeValue(null, "codecs");
                                            j3 = j10;
                                            int iOooOO0o2 = OooOO0o(xmlPullParser5, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1);
                                            arrayList = arrayList33;
                                            ArrayList arrayList42 = arrayList34;
                                            int iOooOO0o3 = OooOO0o(xmlPullParser5, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, -1);
                                            float fOooOO0O = OooOO0O(xmlPullParser5, -1.0f);
                                            String str58 = str54;
                                            String str59 = "SegmentBase";
                                            String str60 = "SegmentList";
                                            int iOooOO0o4 = OooOO0o(xmlPullParser5, "audioSamplingRate", -1);
                                            String attributeValue11 = xmlPullParser5.getAttributeValue(null, str48);
                                            String str61 = "audioSamplingRate";
                                            String attributeValue12 = xmlPullParser5.getAttributeValue(null, "label");
                                            ArrayList arrayList43 = new ArrayList();
                                            ArrayList arrayList44 = new ArrayList();
                                            ArrayList arrayList45 = new ArrayList();
                                            String str62 = attributeValue12;
                                            ArrayList arrayList46 = new ArrayList();
                                            int i37 = iOooOO0o4;
                                            ArrayList arrayList47 = new ArrayList();
                                            float f7 = fOooOO0O;
                                            ArrayList arrayList48 = new ArrayList();
                                            String str63 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
                                            ArrayList arrayList49 = new ArrayList();
                                            ArrayList arrayList50 = new ArrayList();
                                            String str64 = ViewHierarchyConstants.DIMENSION_WIDTH_KEY;
                                            int i38 = iOooOO0o2;
                                            int i39 = iOooOO0o3;
                                            String str65 = "mimeType";
                                            String str66 = "codecs";
                                            long jOooO0o3 = j16;
                                            o0O0O00 o0o0o00OooOo01 = o0o0o00OooOOo;
                                            long j17 = j2;
                                            int iOooO0oo2 = iOooO0oo;
                                            String str67 = attributeValue11;
                                            int iOooO0Oo = -1;
                                            String str68 = null;
                                            boolean z5 = false;
                                            XmlPullParser xmlPullParser6 = xmlPullParser;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (o0OoO00O.OooO0Oo(xmlPullParser6, str47)) {
                                                    if (z5) {
                                                        jOooO0o0 = j17;
                                                    } else {
                                                        jOooO0o0 = OooO0o0(xmlPullParser6, j17);
                                                        z5 = true;
                                                    }
                                                    arrayList50.addAll(OooO0o(xmlPullParser6, arrayList39, z));
                                                    j17 = jOooO0o0;
                                                    arrayList6 = arrayList39;
                                                } else {
                                                    arrayList6 = arrayList39;
                                                    if (o0OoO00O.OooO0Oo(xmlPullParser6, "ContentProtection")) {
                                                        Pair pairOooO0oO = OooO0oO(xmlPullParser);
                                                        j5 = j17;
                                                        Object obj2 = pairOooO0oO.first;
                                                        if (obj2 != null) {
                                                            str68 = (String) obj2;
                                                        }
                                                        Object obj3 = pairOooO0oO.second;
                                                        if (obj3 != null) {
                                                            arrayList43.add((DrmInitData.SchemeData) obj3);
                                                        }
                                                    } else {
                                                        j5 = j17;
                                                        if (o0OoO00O.OooO0Oo(xmlPullParser6, "ContentComponent")) {
                                                            String attributeValue13 = xmlPullParser6.getAttributeValue(null, str48);
                                                            if (str67 == null) {
                                                                str67 = attributeValue13;
                                                            } else if (attributeValue13 != null) {
                                                                o00O000o.OooO0Oo(str67.equals(attributeValue13));
                                                            }
                                                            int iOooO0oo3 = OooO0oo(xmlPullParser);
                                                            if (iOooO0oo2 == -1) {
                                                                iOooO0oo2 = iOooO0oo3;
                                                            } else if (iOooO0oo3 != -1) {
                                                                o00O000o.OooO0Oo(iOooO0oo2 == iOooO0oo3);
                                                            }
                                                        } else {
                                                            if (o0OoO00O.OooO0Oo(xmlPullParser6, "Role")) {
                                                                arrayList46.add(OooO(xmlPullParser6, "Role"));
                                                            } else {
                                                                String str69 = "AudioChannelConfiguration";
                                                                if (o0OoO00O.OooO0Oo(xmlPullParser6, "AudioChannelConfiguration")) {
                                                                    iOooO0Oo = OooO0Oo(xmlPullParser);
                                                                } else if (o0OoO00O.OooO0Oo(xmlPullParser6, "Accessibility")) {
                                                                    arrayList45.add(OooO(xmlPullParser6, "Accessibility"));
                                                                } else if (o0OoO00O.OooO0Oo(xmlPullParser6, "EssentialProperty")) {
                                                                    arrayList47.add(OooO(xmlPullParser6, "EssentialProperty"));
                                                                } else {
                                                                    str3 = str48;
                                                                    String str70 = "SupplementalProperty";
                                                                    if (o0OoO00O.OooO0Oo(xmlPullParser6, "SupplementalProperty")) {
                                                                        arrayList48.add(OooO(xmlPullParser6, "SupplementalProperty"));
                                                                        str16 = str67;
                                                                        str = str47;
                                                                        arrayList8 = arrayList48;
                                                                        xmlPullParser6 = xmlPullParser6;
                                                                        str10 = str52;
                                                                        arrayList9 = arrayList45;
                                                                        arrayList7 = arrayList43;
                                                                        str53 = str53;
                                                                        arrayList10 = arrayList40;
                                                                        str19 = str55;
                                                                        arrayList2 = arrayList41;
                                                                        str11 = str56;
                                                                        str7 = str57;
                                                                        arrayList34 = arrayList42;
                                                                        str12 = str58;
                                                                        str20 = str60;
                                                                        str21 = str59;
                                                                        str13 = str61;
                                                                        arrayList15 = arrayList44;
                                                                        i4 = i37;
                                                                        f = f7;
                                                                        arrayList11 = arrayList49;
                                                                        i5 = i39;
                                                                        str17 = str64;
                                                                        i6 = i38;
                                                                        str14 = str65;
                                                                        str15 = str66;
                                                                        i2 = 0;
                                                                        i3 = 1;
                                                                        arrayList12 = arrayList46;
                                                                        arrayList13 = arrayList50;
                                                                        i7 = iOooO0oo2;
                                                                        arrayList14 = arrayList47;
                                                                        arrayList32 = arrayList36;
                                                                        j6 = jOooO0o3;
                                                                        z = z;
                                                                        jOooO0o3 = j6;
                                                                        xmlPullParser6 = xmlPullParser6;
                                                                        str67 = str16;
                                                                        iOooO0oo2 = i7;
                                                                        str38 = str62;
                                                                        j17 = j5;
                                                                        str39 = str11;
                                                                    } else {
                                                                        arrayList7 = arrayList43;
                                                                        Object obj4 = "Representation";
                                                                        if (o0OoO00O.OooO0Oo(xmlPullParser6, "Representation")) {
                                                                            String str71 = str67;
                                                                            String str72 = "InbandEventStream";
                                                                            if (arrayList50.isEmpty()) {
                                                                                arrayList16 = arrayList6;
                                                                                str22 = null;
                                                                            } else {
                                                                                str22 = null;
                                                                                arrayList16 = arrayList50;
                                                                            }
                                                                            String attributeValue14 = xmlPullParser6.getAttributeValue(str22, str52);
                                                                            String str73 = str52;
                                                                            String str74 = "EssentialProperty";
                                                                            int iOooOO0o5 = OooOO0o(xmlPullParser6, "bandwidth", -1);
                                                                            String str75 = str65;
                                                                            String attributeValue15 = xmlPullParser6.getAttributeValue(str22, str75);
                                                                            String str76 = attributeValue15 == null ? attributeValue9 : attributeValue15;
                                                                            String str77 = str66;
                                                                            String str78 = str75;
                                                                            String str79 = str77;
                                                                            String attributeValue16 = xmlPullParser6.getAttributeValue(str22, str79);
                                                                            if (attributeValue16 == null) {
                                                                                attributeValue16 = attributeValue10;
                                                                            }
                                                                            int i40 = i38;
                                                                            String str80 = str64;
                                                                            int i41 = iOooOO0o5;
                                                                            ArrayList arrayList51 = arrayList50;
                                                                            int i42 = i39;
                                                                            int iOooOO0o6 = OooOO0o(xmlPullParser6, str80, i40);
                                                                            String str81 = str63;
                                                                            int i43 = iOooO0oo2;
                                                                            String str82 = str81;
                                                                            int iOooOO0o7 = OooOO0o(xmlPullParser6, str82, i42);
                                                                            String str83 = str80;
                                                                            float f8 = f7;
                                                                            float fOooOO0O2 = OooOO0O(xmlPullParser6, f8);
                                                                            int i44 = i37;
                                                                            String str84 = "ContentProtection";
                                                                            String str85 = str61;
                                                                            f = f8;
                                                                            int iOooOO0o8 = OooOO0o(xmlPullParser6, str85, i44);
                                                                            i4 = i44;
                                                                            ArrayList arrayList52 = new ArrayList();
                                                                            ArrayList arrayList53 = new ArrayList();
                                                                            ArrayList arrayList54 = new ArrayList(arrayList47);
                                                                            ArrayList arrayList55 = new ArrayList(arrayList48);
                                                                            ArrayList arrayList56 = new ArrayList();
                                                                            String str86 = str85;
                                                                            ArrayList arrayList57 = arrayList46;
                                                                            arrayList14 = arrayList47;
                                                                            ArrayList arrayList58 = arrayList52;
                                                                            int iOooO0Oo2 = iOooO0Oo;
                                                                            long j18 = jOooO0o3;
                                                                            o0O0O00 o0o0o00OooOo02 = o0o0o00OooOo01;
                                                                            long jOooO0o4 = j5;
                                                                            String str87 = null;
                                                                            boolean z6 = false;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (o0OoO00O.OooO0Oo(xmlPullParser6, str47)) {
                                                                                    if (!z6) {
                                                                                        jOooO0o4 = OooO0o0(xmlPullParser6, jOooO0o4);
                                                                                        z6 = true;
                                                                                    }
                                                                                    arrayList56.addAll(OooO0o(xmlPullParser6, arrayList16, z));
                                                                                } else {
                                                                                    i40 = i40;
                                                                                    if (o0OoO00O.OooO0Oo(xmlPullParser6, str69)) {
                                                                                        iOooO0Oo2 = OooO0Oo(xmlPullParser);
                                                                                    } else {
                                                                                        String str88 = str59;
                                                                                        if (o0OoO00O.OooO0Oo(xmlPullParser6, str88)) {
                                                                                            str59 = str88;
                                                                                            o0o0o00OooOo02 = OooOOo(xmlPullParser6, (o0O0O00.OooO) o0o0o00OooOo02);
                                                                                        } else {
                                                                                            String str89 = str60;
                                                                                            if (o0OoO00O.OooO0Oo(xmlPullParser6, str89)) {
                                                                                                long jOooO0o5 = OooO0o0(xmlPullParser6, j18);
                                                                                                str20 = str89;
                                                                                                ArrayList arrayList59 = arrayList40;
                                                                                                str24 = str56;
                                                                                                str17 = str83;
                                                                                                i6 = i40;
                                                                                                arrayList20 = arrayList16;
                                                                                                String str90 = str71;
                                                                                                str = str47;
                                                                                                arrayList8 = arrayList48;
                                                                                                arrayList10 = arrayList59;
                                                                                                str12 = str58;
                                                                                                str10 = str73;
                                                                                                str13 = str86;
                                                                                                arrayList21 = arrayList56;
                                                                                                int i45 = i41;
                                                                                                str25 = str90;
                                                                                                xmlPullParser2 = xmlPullParser6;
                                                                                                i5 = i42;
                                                                                                arrayList34 = arrayList42;
                                                                                                i8 = i43;
                                                                                                arrayList18 = arrayList49;
                                                                                                arrayList13 = arrayList51;
                                                                                                str63 = str82;
                                                                                                str23 = str69;
                                                                                                i9 = i45;
                                                                                                arrayList2 = arrayList41;
                                                                                                str7 = str57;
                                                                                                str14 = str78;
                                                                                                str26 = str74;
                                                                                                str15 = str79;
                                                                                                arrayList32 = arrayList36;
                                                                                                arrayList17 = arrayList44;
                                                                                                z = z;
                                                                                                arrayList19 = arrayList45;
                                                                                                o0o0o00OooOo02 = OooOOoo(xmlPullParser, (o0O0O00.OooO0O0) o0o0o00OooOo02, j15, jOooOO6, jOooO0o4, jOooO0o5, jOooOO3);
                                                                                                str27 = str55;
                                                                                                str28 = str88;
                                                                                                j18 = jOooO0o5;
                                                                                                z2 = true;
                                                                                            } else {
                                                                                                str20 = str89;
                                                                                                i5 = i42;
                                                                                                str23 = str69;
                                                                                                arrayList10 = arrayList40;
                                                                                                arrayList2 = arrayList41;
                                                                                                str24 = str56;
                                                                                                str7 = str57;
                                                                                                arrayList34 = arrayList42;
                                                                                                str12 = str58;
                                                                                                arrayList17 = arrayList44;
                                                                                                i8 = i43;
                                                                                                arrayList18 = arrayList49;
                                                                                                i9 = i41;
                                                                                                str14 = str78;
                                                                                                str25 = str71;
                                                                                                str10 = str73;
                                                                                                arrayList13 = arrayList51;
                                                                                                str17 = str83;
                                                                                                str13 = str86;
                                                                                                i6 = i40;
                                                                                                str = str47;
                                                                                                arrayList8 = arrayList48;
                                                                                                str63 = str82;
                                                                                                str15 = str79;
                                                                                                arrayList19 = arrayList45;
                                                                                                arrayList20 = arrayList16;
                                                                                                arrayList21 = arrayList56;
                                                                                                arrayList32 = arrayList36;
                                                                                                String str91 = str55;
                                                                                                str26 = str74;
                                                                                                xmlPullParser2 = xmlPullParser6;
                                                                                                z = z;
                                                                                                if (o0OoO00O.OooO0Oo(xmlPullParser2, str91)) {
                                                                                                    long jOooO0o6 = OooO0o0(xmlPullParser2, j18);
                                                                                                    str27 = str91;
                                                                                                    str28 = str88;
                                                                                                    z2 = true;
                                                                                                    o0o0o00OooOo02 = OooOo00(xmlPullParser, (o0O0O00.OooO0OO) o0o0o00OooOo02, arrayList8, j15, jOooOO6, jOooO0o4, jOooO0o6, jOooOO3);
                                                                                                    j18 = jOooO0o6;
                                                                                                } else {
                                                                                                    str27 = str91;
                                                                                                    jOooO0o4 = jOooO0o4;
                                                                                                    str53 = str53;
                                                                                                    str28 = str88;
                                                                                                    str29 = str84;
                                                                                                    i4 = i4;
                                                                                                    arrayList14 = arrayList14;
                                                                                                    z2 = true;
                                                                                                    if (o0OoO00O.OooO0Oo(xmlPullParser2, str29)) {
                                                                                                        Pair pairOooO0oO2 = OooO0oO(xmlPullParser);
                                                                                                        Object obj5 = pairOooO0oO2.first;
                                                                                                        if (obj5 != null) {
                                                                                                            str87 = (String) obj5;
                                                                                                        }
                                                                                                        Object obj6 = pairOooO0oO2.second;
                                                                                                        if (obj6 != null) {
                                                                                                            arrayList22 = arrayList58;
                                                                                                            arrayList22.add((DrmInitData.SchemeData) obj6);
                                                                                                        } else {
                                                                                                            arrayList22 = arrayList58;
                                                                                                        }
                                                                                                        str30 = str72;
                                                                                                        arrayList23 = arrayList53;
                                                                                                        arrayList24 = arrayList54;
                                                                                                        str31 = str70;
                                                                                                        arrayList25 = arrayList55;
                                                                                                    } else {
                                                                                                        str30 = str72;
                                                                                                        arrayList22 = arrayList58;
                                                                                                        if (o0OoO00O.OooO0Oo(xmlPullParser2, str30)) {
                                                                                                            arrayList23 = arrayList53;
                                                                                                            arrayList23.add(OooO(xmlPullParser2, str30));
                                                                                                            arrayList24 = arrayList54;
                                                                                                            str31 = str70;
                                                                                                            arrayList25 = arrayList55;
                                                                                                        } else {
                                                                                                            arrayList23 = arrayList53;
                                                                                                            if (o0OoO00O.OooO0Oo(xmlPullParser2, str26)) {
                                                                                                                arrayList24 = arrayList54;
                                                                                                                arrayList24.add(OooO(xmlPullParser2, str26));
                                                                                                                str31 = str70;
                                                                                                                arrayList25 = arrayList55;
                                                                                                            } else {
                                                                                                                str31 = str70;
                                                                                                                arrayList24 = arrayList54;
                                                                                                                if (o0OoO00O.OooO0Oo(xmlPullParser2, str31)) {
                                                                                                                    arrayList25 = arrayList55;
                                                                                                                    arrayList25.add(OooO(xmlPullParser2, str31));
                                                                                                                } else {
                                                                                                                    arrayList25 = arrayList55;
                                                                                                                    OooO0OO(xmlPullParser);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            str29 = str84;
                                                                                            arrayList22 = arrayList58;
                                                                                            str30 = str72;
                                                                                            arrayList23 = arrayList53;
                                                                                            arrayList24 = arrayList54;
                                                                                            str31 = str70;
                                                                                            arrayList25 = arrayList55;
                                                                                        }
                                                                                        str32 = str87;
                                                                                        i10 = iOooO0Oo2;
                                                                                        if (o0OoO00O.OooO0O0(xmlPullParser2, obj4)) {
                                                                                            if (o00OO0OO.OooOO0(str76)) {
                                                                                                strOooO0Oo = o00OO0OO.OooO0O0(attributeValue16);
                                                                                            } else {
                                                                                                if (o00OO0OO.OooOO0o(str76)) {
                                                                                                    strOooO0Oo = o00OO0OO.OooO(attributeValue16);
                                                                                                } else if (o00OO0OO.OooOO0O(str76) && !"image".equals(o00OO0OO.OooO0oO(str76))) {
                                                                                                    str33 = str76;
                                                                                                    if ("application/mp4".equals(str33)) {
                                                                                                        strOooO0Oo = o00OO0OO.OooO0Oo(attributeValue16);
                                                                                                        if ("text/vtt".equals(strOooO0Oo)) {
                                                                                                            strOooO0Oo = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    } else {
                                                                                                        strOooO0Oo = null;
                                                                                                    }
                                                                                                } else {
                                                                                                    strOooO0Oo = str76;
                                                                                                    str33 = strOooO0Oo;
                                                                                                }
                                                                                                if ("audio/eac3".equals(strOooO0Oo)) {
                                                                                                    i24 = 0;
                                                                                                    while (true) {
                                                                                                        if (i24 < arrayList25.size()) {
                                                                                                            o00oO0o o00oo0o8 = (o00oO0o) arrayList25.get(i24);
                                                                                                            String str92 = o00oo0o8.f39952OooO00o;
                                                                                                            boolean zEquals2 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str92);
                                                                                                            String str93 = o00oo0o8.f39953OooO0O0;
                                                                                                            if ((!zEquals2 && "JOC".equals(str93)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str92) && "ec+3".equals(str93))) {
                                                                                                                strOooO0Oo = "audio/eac3-joc";
                                                                                                            }
                                                                                                        } else {
                                                                                                            strOooO0Oo = "audio/eac3";
                                                                                                        }
                                                                                                    }
                                                                                                    str34 = "audio/eac3-joc".equals(strOooO0Oo) ? "ec+3" : attributeValue16;
                                                                                                }
                                                                                                i11 = 0;
                                                                                                i12 = 0;
                                                                                                while (true) {
                                                                                                    str35 = "urn:mpeg:dash:role:2011";
                                                                                                    if (i11 < arrayList57.size()) {
                                                                                                        ArrayList arrayList60 = arrayList57;
                                                                                                        o00oo0o7 = (o00oO0o) arrayList60.get(i11);
                                                                                                        if (!OooO0OO.OooO00o("urn:mpeg:dash:role:2011", o00oo0o7.f39952OooO00o)) {
                                                                                                            str42 = o00oo0o7.f39953OooO0O0;
                                                                                                            if (str42 == null && (str42.equals("forced_subtitle") || str42.equals("forced-subtitle"))) {
                                                                                                                i23 = 2;
                                                                                                            } else {
                                                                                                                i23 = 0;
                                                                                                            }
                                                                                                            i12 |= i23;
                                                                                                        }
                                                                                                        i11++;
                                                                                                        arrayList57 = arrayList60;
                                                                                                    } else {
                                                                                                        arrayList26 = arrayList57;
                                                                                                        i13 = 0;
                                                                                                        iOooOOOo = 0;
                                                                                                        while (i13 < arrayList26.size()) {
                                                                                                            o00oo0o6 = (o00oO0o) arrayList26.get(i13);
                                                                                                            ArrayList arrayList61 = arrayList26;
                                                                                                            if (OooO0OO.OooO00o("urn:mpeg:dash:role:2011", o00oo0o6.f39952OooO00o)) {
                                                                                                                iOooOOOo |= OooOOOo(o00oo0o6.f39953OooO0O0);
                                                                                                            }
                                                                                                            i13++;
                                                                                                            arrayList26 = arrayList61;
                                                                                                        }
                                                                                                        ArrayList arrayList62 = arrayList26;
                                                                                                        i14 = 0;
                                                                                                        i15 = 0;
                                                                                                        while (i14 < arrayList19.size()) {
                                                                                                            ArrayList arrayList63 = arrayList19;
                                                                                                            ArrayList arrayList64 = arrayList23;
                                                                                                            o00oo0o5 = (o00oO0o) arrayList63.get(i14);
                                                                                                            ArrayList arrayList65 = arrayList22;
                                                                                                            zOooO00o = OooO0OO.OooO00o(str35, o00oo0o5.f39952OooO00o);
                                                                                                            String str94 = str35;
                                                                                                            str41 = o00oo0o5.f39953OooO0O0;
                                                                                                            if (zOooO00o) {
                                                                                                                iOooOOOo2 = OooOOOo(str41);
                                                                                                            } else {
                                                                                                                if (!OooO0OO.OooO00o("urn:tva:metadata:cs:AudioPurposeCS:2007", o00oo0o5.f39952OooO00o)) {
                                                                                                                    if (str41 == null) {
                                                                                                                        iOooOOOo2 = 0;
                                                                                                                    } else {
                                                                                                                        switch (str41.hashCode()) {
                                                                                                                            case 49:
                                                                                                                                if (str41.equals("1")) {
                                                                                                                                    b = 0;
                                                                                                                                } else {
                                                                                                                                    b = -1;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 50:
                                                                                                                                if (str41.equals(FeedbackType.Suggestions)) {
                                                                                                                                    b = 1;
                                                                                                                                } else {
                                                                                                                                    b = -1;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 51:
                                                                                                                                if (str41.equals(FeedbackType.Recharge)) {
                                                                                                                                    b = 2;
                                                                                                                                } else {
                                                                                                                                    b = -1;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 52:
                                                                                                                                if (str41.equals("4")) {
                                                                                                                                    b = 3;
                                                                                                                                } else {
                                                                                                                                    b = -1;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                            default:
                                                                                                                                b = -1;
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                if (str41.equals("6")) {
                                                                                                                                    b = 4;
                                                                                                                                } else {
                                                                                                                                    b = -1;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        if (b != 0) {
                                                                                                                            iOooOOOo2 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                                                                                                                        } else if (b != 1) {
                                                                                                                            iOooOOOo2 = 2048;
                                                                                                                        } else if (b != 2) {
                                                                                                                            iOooOOOo2 = 4;
                                                                                                                        } else if (b != 3) {
                                                                                                                            iOooOOOo2 = 8;
                                                                                                                        } else if (b != 4) {
                                                                                                                            iOooOOOo2 = 0;
                                                                                                                        } else {
                                                                                                                            iOooOOOo2 = 1;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                i14++;
                                                                                                                arrayList19 = arrayList63;
                                                                                                                str35 = str94;
                                                                                                                arrayList22 = arrayList65;
                                                                                                                arrayList23 = arrayList64;
                                                                                                            }
                                                                                                            i15 |= iOooOOOo2;
                                                                                                            i14++;
                                                                                                            arrayList19 = arrayList63;
                                                                                                            str35 = str94;
                                                                                                            arrayList22 = arrayList65;
                                                                                                            arrayList23 = arrayList64;
                                                                                                        }
                                                                                                        ArrayList arrayList66 = arrayList22;
                                                                                                        ArrayList arrayList67 = arrayList23;
                                                                                                        arrayList9 = arrayList19;
                                                                                                        int iOooOOo0 = i15 | iOooOOOo | OooOOo0(arrayList24) | OooOOo0(arrayList25);
                                                                                                        i16 = 0;
                                                                                                        while (true) {
                                                                                                            if (i16 < arrayList24.size()) {
                                                                                                                o00oo0o4 = (o00oO0o) arrayList24.get(i16);
                                                                                                                if ((OooO0OO.OooO00o("http://dashif.org/thumbnail_tile", o00oo0o4.f39952OooO00o) || OooO0OO.OooO00o("http://dashif.org/guidelines/thumbnail_tile", o00oo0o4.f39952OooO00o)) && (str40 = o00oo0o4.f39953OooO0O0) != null) {
                                                                                                                    int i46 = o0O00.f40595OooO00o;
                                                                                                                    strArrSplit = str40.split("x", -1);
                                                                                                                    if (strArrSplit.length == 2) {
                                                                                                                        i2 = 0;
                                                                                                                        try {
                                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                                                                                                                        } catch (NumberFormatException unused) {
                                                                                                                            continue;
                                                                                                                            i16++;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i16++;
                                                                                                                }
                                                                                                                i16++;
                                                                                                            } else {
                                                                                                                i2 = 0;
                                                                                                                pairCreate = null;
                                                                                                            }
                                                                                                        }
                                                                                                        oooO00o = new OooOo.OooO00o();
                                                                                                        oooO00o.f11235OooO00o = attributeValue14;
                                                                                                        oooO00o.f11243OooOO0 = str33;
                                                                                                        oooO00o.f11244OooOO0O = strOooO0Oo;
                                                                                                        oooO00o.f11242OooO0oo = str34;
                                                                                                        oooO00o.f11241OooO0oO = i9;
                                                                                                        oooO00o.f11238OooO0Oo = i12;
                                                                                                        oooO00o.f11240OooO0o0 = iOooOOo0;
                                                                                                        String str95 = str25;
                                                                                                        oooO00o.f11237OooO0OO = str95;
                                                                                                        if (pairCreate != null) {
                                                                                                            iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                        } else {
                                                                                                            iIntValue = -1;
                                                                                                        }
                                                                                                        oooO00o.f11263OooOooO = iIntValue;
                                                                                                        if (pairCreate != null) {
                                                                                                            iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                        } else {
                                                                                                            iIntValue2 = -1;
                                                                                                        }
                                                                                                        oooO00o.f11264OooOooo = iIntValue2;
                                                                                                        if (o00OO0OO.OooOO0o(strOooO0Oo)) {
                                                                                                            oooO00o.f11249OooOOOo = iOooOO0o6;
                                                                                                            oooO00o.f11251OooOOo0 = iOooOO0o7;
                                                                                                            oooO00o.f11250OooOOo = fOooOO0O2;
                                                                                                        } else {
                                                                                                            i17 = iOooOO0o6;
                                                                                                            if (o00OO0OO.OooOO0(strOooO0Oo)) {
                                                                                                                oooO00o.f11253OooOo = i10;
                                                                                                                oooO00o.f11259OooOoO0 = iOooOO0o8;
                                                                                                            } else if (o00OO0OO.OooOO0O(strOooO0Oo)) {
                                                                                                                if ("application/cea-608".equals(strOooO0Oo)) {
                                                                                                                    i21 = i2;
                                                                                                                    while (true) {
                                                                                                                        if (i21 < arrayList9.size()) {
                                                                                                                            o00oo0o3 = (o00oO0o) arrayList9.get(i21);
                                                                                                                            if (!"urn:scte:dash:cc:cea-608:2015".equals(o00oo0o3.f39952OooO00o) && (str37 = o00oo0o3.f39953OooO0O0) != null) {
                                                                                                                                Matcher matcher = f39989OooO0o.matcher(str37);
                                                                                                                                if (matcher.matches()) {
                                                                                                                                    i20 = Integer.parseInt(matcher.group(1));
                                                                                                                                    i18 = 1;
                                                                                                                                } else {
                                                                                                                                    Log.OooO0o("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str37));
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i21++;
                                                                                                                        } else {
                                                                                                                            i18 = 1;
                                                                                                                            i20 = -1;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else if ("application/cea-708".equals(strOooO0Oo)) {
                                                                                                                    i19 = i2;
                                                                                                                    while (true) {
                                                                                                                        if (i19 < arrayList9.size()) {
                                                                                                                            o00oo0o2 = (o00oO0o) arrayList9.get(i19);
                                                                                                                            if (!"urn:scte:dash:cc:cea-708:2015".equals(o00oo0o2.f39952OooO00o) && (str36 = o00oo0o2.f39953OooO0O0) != null) {
                                                                                                                                Matcher matcher2 = f39991OooO0oO.matcher(str36);
                                                                                                                                if (matcher2.matches()) {
                                                                                                                                    i18 = 1;
                                                                                                                                    i20 = Integer.parseInt(matcher2.group(1));
                                                                                                                                } else {
                                                                                                                                    Log.OooO0o("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str36));
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i19++;
                                                                                                                        } else {
                                                                                                                            i18 = 1;
                                                                                                                            i20 = -1;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i18 = 1;
                                                                                                                    i20 = -1;
                                                                                                                }
                                                                                                                oooO00o.f11261OooOoo = i20;
                                                                                                            } else {
                                                                                                                i18 = 1;
                                                                                                                if ("image".equals(o00OO0OO.OooO0oO(strOooO0Oo))) {
                                                                                                                    oooO00o.f11249OooOOOo = i17;
                                                                                                                    oooO00o.f11251OooOOo0 = iOooOO0o7;
                                                                                                                }
                                                                                                            }
                                                                                                            OooOo oooOo2 = new OooOo(oooO00o);
                                                                                                            if (o0o0o00OooOo02 != null) {
                                                                                                                oooO = o0o0o00OooOo02;
                                                                                                            } else {
                                                                                                                oooO = new o0O0O00.OooO();
                                                                                                            }
                                                                                                            if (arrayList21.isEmpty()) {
                                                                                                                arrayList27 = arrayList20;
                                                                                                            } else {
                                                                                                                arrayList27 = arrayList21;
                                                                                                            }
                                                                                                            OooO00o oooO00o4 = new OooO00o(oooOo2, arrayList27, oooO, str32, arrayList66, arrayList67, arrayList24, arrayList25);
                                                                                                            iOooO0oo2 = o00OO0OO.OooO0oo(oooOo2.f11211OooOOOO);
                                                                                                            i22 = i8;
                                                                                                            if (i22 != -1) {
                                                                                                                if (iOooO0oo2 != -1) {
                                                                                                                    if (i22 == iOooO0oo2) {
                                                                                                                        z3 = i18;
                                                                                                                    } else {
                                                                                                                        z3 = i2;
                                                                                                                    }
                                                                                                                    o00O000o.OooO0Oo(z3);
                                                                                                                }
                                                                                                                iOooO0oo2 = i22;
                                                                                                            }
                                                                                                            ArrayList arrayList68 = arrayList18;
                                                                                                            arrayList68.add(oooO00o4);
                                                                                                            xmlPullParser6 = xmlPullParser;
                                                                                                            arrayList11 = arrayList68;
                                                                                                            str67 = str95;
                                                                                                            i3 = i18;
                                                                                                            str38 = str62;
                                                                                                            j17 = j5;
                                                                                                            arrayList12 = arrayList62;
                                                                                                            str39 = str24;
                                                                                                            arrayList15 = arrayList17;
                                                                                                            str21 = str28;
                                                                                                            str19 = str27;
                                                                                                        }
                                                                                                        i18 = 1;
                                                                                                        OooOo oooOo3 = new OooOo(oooO00o);
                                                                                                        if (o0o0o00OooOo02 != null) {
                                                                                                            oooO = o0o0o00OooOo02;
                                                                                                        } else {
                                                                                                            oooO = new o0O0O00.OooO();
                                                                                                        }
                                                                                                        if (arrayList21.isEmpty()) {
                                                                                                            arrayList27 = arrayList21;
                                                                                                        } else {
                                                                                                            arrayList27 = arrayList20;
                                                                                                        }
                                                                                                        OooO00o oooO00o5 = new OooO00o(oooOo3, arrayList27, oooO, str32, arrayList66, arrayList67, arrayList24, arrayList25);
                                                                                                        iOooO0oo2 = o00OO0OO.OooO0oo(oooOo3.f11211OooOOOO);
                                                                                                        i22 = i8;
                                                                                                        if (i22 != -1) {
                                                                                                            if (iOooO0oo2 != -1) {
                                                                                                                if (i22 == iOooO0oo2) {
                                                                                                                    z3 = i18;
                                                                                                                } else {
                                                                                                                    z3 = i2;
                                                                                                                }
                                                                                                                o00O000o.OooO0Oo(z3);
                                                                                                            }
                                                                                                            iOooO0oo2 = i22;
                                                                                                        }
                                                                                                        ArrayList arrayList69 = arrayList18;
                                                                                                        arrayList69.add(oooO00o5);
                                                                                                        xmlPullParser6 = xmlPullParser;
                                                                                                        arrayList11 = arrayList69;
                                                                                                        str67 = str95;
                                                                                                        i3 = i18;
                                                                                                        str38 = str62;
                                                                                                        j17 = j5;
                                                                                                        arrayList12 = arrayList62;
                                                                                                        str39 = str24;
                                                                                                        arrayList15 = arrayList17;
                                                                                                        str21 = str28;
                                                                                                        str19 = str27;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            str33 = str76;
                                                                                            if ("audio/eac3".equals(strOooO0Oo)) {
                                                                                                i24 = 0;
                                                                                                while (true) {
                                                                                                    if (i24 < arrayList25.size()) {
                                                                                                        o00oO0o o00oo0o9 = (o00oO0o) arrayList25.get(i24);
                                                                                                        String str96 = o00oo0o9.f39952OooO00o;
                                                                                                        boolean zEquals3 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str96);
                                                                                                        String str97 = o00oo0o9.f39953OooO0O0;
                                                                                                        i24 = !zEquals3 ? i24 + 1 : i24 + 1;
                                                                                                        strOooO0Oo = "audio/eac3-joc";
                                                                                                    } else {
                                                                                                        strOooO0Oo = "audio/eac3";
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3-joc".equals(strOooO0Oo)) {
                                                                                                }
                                                                                            }
                                                                                            i11 = 0;
                                                                                            i12 = 0;
                                                                                            while (true) {
                                                                                                str35 = "urn:mpeg:dash:role:2011";
                                                                                                if (i11 < arrayList57.size()) {
                                                                                                    ArrayList arrayList610 = arrayList57;
                                                                                                    o00oo0o7 = (o00oO0o) arrayList610.get(i11);
                                                                                                    if (!OooO0OO.OooO00o("urn:mpeg:dash:role:2011", o00oo0o7.f39952OooO00o)) {
                                                                                                        str42 = o00oo0o7.f39953OooO0O0;
                                                                                                        if (str42 == null) {
                                                                                                            i23 = 0;
                                                                                                        } else {
                                                                                                            i23 = 2;
                                                                                                        }
                                                                                                        i12 |= i23;
                                                                                                    }
                                                                                                    i11++;
                                                                                                    arrayList57 = arrayList610;
                                                                                                } else {
                                                                                                    arrayList26 = arrayList57;
                                                                                                    i13 = 0;
                                                                                                    iOooOOOo = 0;
                                                                                                    while (i13 < arrayList26.size()) {
                                                                                                        o00oo0o6 = (o00oO0o) arrayList26.get(i13);
                                                                                                        ArrayList arrayList611 = arrayList26;
                                                                                                        if (OooO0OO.OooO00o("urn:mpeg:dash:role:2011", o00oo0o6.f39952OooO00o)) {
                                                                                                            iOooOOOo |= OooOOOo(o00oo0o6.f39953OooO0O0);
                                                                                                        }
                                                                                                        i13++;
                                                                                                        arrayList26 = arrayList611;
                                                                                                    }
                                                                                                    ArrayList arrayList612 = arrayList26;
                                                                                                    i14 = 0;
                                                                                                    i15 = 0;
                                                                                                    while (i14 < arrayList19.size()) {
                                                                                                        ArrayList arrayList613 = arrayList19;
                                                                                                        ArrayList arrayList614 = arrayList23;
                                                                                                        o00oo0o5 = (o00oO0o) arrayList613.get(i14);
                                                                                                        ArrayList arrayList615 = arrayList22;
                                                                                                        zOooO00o = OooO0OO.OooO00o(str35, o00oo0o5.f39952OooO00o);
                                                                                                        String str98 = str35;
                                                                                                        str41 = o00oo0o5.f39953OooO0O0;
                                                                                                        if (zOooO00o) {
                                                                                                            iOooOOOo2 = OooOOOo(str41);
                                                                                                        } else {
                                                                                                            if (!OooO0OO.OooO00o("urn:tva:metadata:cs:AudioPurposeCS:2007", o00oo0o5.f39952OooO00o)) {
                                                                                                                if (str41 == null) {
                                                                                                                    iOooOOOo2 = 0;
                                                                                                                } else {
                                                                                                                    switch (str41.hashCode()) {
                                                                                                                        case 49:
                                                                                                                            if (str41.equals("1")) {
                                                                                                                                b = -1;
                                                                                                                            } else {
                                                                                                                                b = 0;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 50:
                                                                                                                            if (str41.equals(FeedbackType.Suggestions)) {
                                                                                                                                b = -1;
                                                                                                                            } else {
                                                                                                                                b = 1;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 51:
                                                                                                                            if (str41.equals(FeedbackType.Recharge)) {
                                                                                                                                b = -1;
                                                                                                                            } else {
                                                                                                                                b = 2;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 52:
                                                                                                                            if (str41.equals("4")) {
                                                                                                                                b = -1;
                                                                                                                            } else {
                                                                                                                                b = 3;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 53:
                                                                                                                        default:
                                                                                                                            b = -1;
                                                                                                                            break;
                                                                                                                        case 54:
                                                                                                                            if (str41.equals("6")) {
                                                                                                                                b = -1;
                                                                                                                            } else {
                                                                                                                                b = 4;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    if (b != 0) {
                                                                                                                        iOooOOOo2 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                                                                                                                    } else if (b != 1) {
                                                                                                                        iOooOOOo2 = 2048;
                                                                                                                    } else if (b != 2) {
                                                                                                                        iOooOOOo2 = 4;
                                                                                                                    } else if (b != 3) {
                                                                                                                        iOooOOOo2 = 8;
                                                                                                                    } else if (b != 4) {
                                                                                                                        iOooOOOo2 = 0;
                                                                                                                    } else {
                                                                                                                        iOooOOOo2 = 1;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            i14++;
                                                                                                            arrayList19 = arrayList613;
                                                                                                            str35 = str98;
                                                                                                            arrayList22 = arrayList615;
                                                                                                            arrayList23 = arrayList614;
                                                                                                        }
                                                                                                        i15 |= iOooOOOo2;
                                                                                                        i14++;
                                                                                                        arrayList19 = arrayList613;
                                                                                                        str35 = str98;
                                                                                                        arrayList22 = arrayList615;
                                                                                                        arrayList23 = arrayList614;
                                                                                                    }
                                                                                                    ArrayList arrayList616 = arrayList22;
                                                                                                    ArrayList arrayList617 = arrayList23;
                                                                                                    arrayList9 = arrayList19;
                                                                                                    int iOooOOo1 = i15 | iOooOOOo | OooOOo0(arrayList24) | OooOOo0(arrayList25);
                                                                                                    i16 = 0;
                                                                                                    while (true) {
                                                                                                        if (i16 < arrayList24.size()) {
                                                                                                            o00oo0o4 = (o00oO0o) arrayList24.get(i16);
                                                                                                            if (OooO0OO.OooO00o("http://dashif.org/thumbnail_tile", o00oo0o4.f39952OooO00o)) {
                                                                                                                int i47 = o0O00.f40595OooO00o;
                                                                                                                strArrSplit = str40.split("x", -1);
                                                                                                                if (strArrSplit.length == 2) {
                                                                                                                    i2 = 0;
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                                                                                                                }
                                                                                                            } else {
                                                                                                                int i48 = o0O00.f40595OooO00o;
                                                                                                                strArrSplit = str40.split("x", -1);
                                                                                                                if (strArrSplit.length == 2) {
                                                                                                                    i2 = 0;
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                                                                                                                }
                                                                                                            }
                                                                                                            i16++;
                                                                                                        } else {
                                                                                                            i2 = 0;
                                                                                                            pairCreate = null;
                                                                                                        }
                                                                                                    }
                                                                                                    oooO00o = new OooOo.OooO00o();
                                                                                                    oooO00o.f11235OooO00o = attributeValue14;
                                                                                                    oooO00o.f11243OooOO0 = str33;
                                                                                                    oooO00o.f11244OooOO0O = strOooO0Oo;
                                                                                                    oooO00o.f11242OooO0oo = str34;
                                                                                                    oooO00o.f11241OooO0oO = i9;
                                                                                                    oooO00o.f11238OooO0Oo = i12;
                                                                                                    oooO00o.f11240OooO0o0 = iOooOOo1;
                                                                                                    String str99 = str25;
                                                                                                    oooO00o.f11237OooO0OO = str99;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                    } else {
                                                                                                        iIntValue = -1;
                                                                                                    }
                                                                                                    oooO00o.f11263OooOooO = iIntValue;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                    } else {
                                                                                                        iIntValue2 = -1;
                                                                                                    }
                                                                                                    oooO00o.f11264OooOooo = iIntValue2;
                                                                                                    if (o00OO0OO.OooOO0o(strOooO0Oo)) {
                                                                                                        oooO00o.f11249OooOOOo = iOooOO0o6;
                                                                                                        oooO00o.f11251OooOOo0 = iOooOO0o7;
                                                                                                        oooO00o.f11250OooOOo = fOooOO0O2;
                                                                                                    } else {
                                                                                                        i17 = iOooOO0o6;
                                                                                                        if (o00OO0OO.OooOO0(strOooO0Oo)) {
                                                                                                            oooO00o.f11253OooOo = i10;
                                                                                                            oooO00o.f11259OooOoO0 = iOooOO0o8;
                                                                                                        } else if (o00OO0OO.OooOO0O(strOooO0Oo)) {
                                                                                                            if ("application/cea-608".equals(strOooO0Oo)) {
                                                                                                                i21 = i2;
                                                                                                                while (true) {
                                                                                                                    if (i21 < arrayList9.size()) {
                                                                                                                        o00oo0o3 = (o00oO0o) arrayList9.get(i21);
                                                                                                                        if (!"urn:scte:dash:cc:cea-608:2015".equals(o00oo0o3.f39952OooO00o)) {
                                                                                                                        }
                                                                                                                        i21++;
                                                                                                                    } else {
                                                                                                                        i18 = 1;
                                                                                                                        i20 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else if ("application/cea-708".equals(strOooO0Oo)) {
                                                                                                                i19 = i2;
                                                                                                                while (true) {
                                                                                                                    if (i19 < arrayList9.size()) {
                                                                                                                        o00oo0o2 = (o00oO0o) arrayList9.get(i19);
                                                                                                                        if (!"urn:scte:dash:cc:cea-708:2015".equals(o00oo0o2.f39952OooO00o)) {
                                                                                                                        }
                                                                                                                        i19++;
                                                                                                                    } else {
                                                                                                                        i18 = 1;
                                                                                                                        i20 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                i18 = 1;
                                                                                                                i20 = -1;
                                                                                                            }
                                                                                                            oooO00o.f11261OooOoo = i20;
                                                                                                        } else {
                                                                                                            i18 = 1;
                                                                                                            if ("image".equals(o00OO0OO.OooO0oO(strOooO0Oo))) {
                                                                                                                oooO00o.f11249OooOOOo = i17;
                                                                                                                oooO00o.f11251OooOOo0 = iOooOO0o7;
                                                                                                            }
                                                                                                        }
                                                                                                        OooOo oooOo4 = new OooOo(oooO00o);
                                                                                                        if (o0o0o00OooOo02 != null) {
                                                                                                            oooO = o0o0o00OooOo02;
                                                                                                        } else {
                                                                                                            oooO = new o0O0O00.OooO();
                                                                                                        }
                                                                                                        if (arrayList21.isEmpty()) {
                                                                                                            arrayList27 = arrayList21;
                                                                                                        } else {
                                                                                                            arrayList27 = arrayList20;
                                                                                                        }
                                                                                                        OooO00o oooO00o6 = new OooO00o(oooOo4, arrayList27, oooO, str32, arrayList616, arrayList617, arrayList24, arrayList25);
                                                                                                        iOooO0oo2 = o00OO0OO.OooO0oo(oooOo4.f11211OooOOOO);
                                                                                                        i22 = i8;
                                                                                                        if (i22 != -1) {
                                                                                                            if (iOooO0oo2 != -1) {
                                                                                                                if (i22 == iOooO0oo2) {
                                                                                                                    z3 = i18;
                                                                                                                } else {
                                                                                                                    z3 = i2;
                                                                                                                }
                                                                                                                o00O000o.OooO0Oo(z3);
                                                                                                            }
                                                                                                            iOooO0oo2 = i22;
                                                                                                        }
                                                                                                        ArrayList arrayList618 = arrayList18;
                                                                                                        arrayList618.add(oooO00o6);
                                                                                                        xmlPullParser6 = xmlPullParser;
                                                                                                        arrayList11 = arrayList618;
                                                                                                        str67 = str99;
                                                                                                        i3 = i18;
                                                                                                        str38 = str62;
                                                                                                        j17 = j5;
                                                                                                        arrayList12 = arrayList612;
                                                                                                        str39 = str24;
                                                                                                        arrayList15 = arrayList17;
                                                                                                        str21 = str28;
                                                                                                        str19 = str27;
                                                                                                    }
                                                                                                    i18 = 1;
                                                                                                    OooOo oooOo5 = new OooOo(oooO00o);
                                                                                                    if (o0o0o00OooOo02 != null) {
                                                                                                        oooO = o0o0o00OooOo02;
                                                                                                    } else {
                                                                                                        oooO = new o0O0O00.OooO();
                                                                                                    }
                                                                                                    if (arrayList21.isEmpty()) {
                                                                                                        arrayList27 = arrayList21;
                                                                                                    } else {
                                                                                                        arrayList27 = arrayList20;
                                                                                                    }
                                                                                                    OooO00o oooO00o7 = new OooO00o(oooOo5, arrayList27, oooO, str32, arrayList616, arrayList617, arrayList24, arrayList25);
                                                                                                    iOooO0oo2 = o00OO0OO.OooO0oo(oooOo5.f11211OooOOOO);
                                                                                                    i22 = i8;
                                                                                                    if (i22 != -1) {
                                                                                                        if (iOooO0oo2 != -1) {
                                                                                                            if (i22 == iOooO0oo2) {
                                                                                                                z3 = i18;
                                                                                                            } else {
                                                                                                                z3 = i2;
                                                                                                            }
                                                                                                            o00O000o.OooO0Oo(z3);
                                                                                                        }
                                                                                                        iOooO0oo2 = i22;
                                                                                                    }
                                                                                                    ArrayList arrayList619 = arrayList18;
                                                                                                    arrayList619.add(oooO00o7);
                                                                                                    xmlPullParser6 = xmlPullParser;
                                                                                                    arrayList11 = arrayList619;
                                                                                                    str67 = str99;
                                                                                                    i3 = i18;
                                                                                                    str38 = str62;
                                                                                                    j17 = j5;
                                                                                                    arrayList12 = arrayList612;
                                                                                                    str39 = str24;
                                                                                                    arrayList15 = arrayList17;
                                                                                                    str21 = str28;
                                                                                                    str19 = str27;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            str72 = str30;
                                                                                            arrayList58 = arrayList22;
                                                                                            str87 = str32;
                                                                                            arrayList53 = arrayList23;
                                                                                            arrayList54 = arrayList24;
                                                                                            str70 = str31;
                                                                                            arrayList55 = arrayList25;
                                                                                            iOooO0Oo2 = i10;
                                                                                            obj4 = obj4;
                                                                                            arrayList45 = arrayList19;
                                                                                            str74 = str26;
                                                                                            i42 = i5;
                                                                                            i4 = i4;
                                                                                            z = z;
                                                                                            arrayList14 = arrayList14;
                                                                                            str79 = str15;
                                                                                            str69 = str23;
                                                                                            arrayList16 = arrayList20;
                                                                                            arrayList51 = arrayList13;
                                                                                            arrayList56 = arrayList21;
                                                                                            iOooOO0o6 = iOooOO0o6;
                                                                                            str82 = str63;
                                                                                            arrayList36 = arrayList32;
                                                                                            str47 = str;
                                                                                            str86 = str13;
                                                                                            arrayList48 = arrayList8;
                                                                                            jOooO0o4 = jOooO0o4;
                                                                                            str56 = str24;
                                                                                            str60 = str20;
                                                                                            str73 = str10;
                                                                                            str58 = str12;
                                                                                            i43 = i8;
                                                                                            str57 = str7;
                                                                                            arrayList44 = arrayList17;
                                                                                            str53 = str53;
                                                                                            str55 = str27;
                                                                                            xmlPullParser6 = xmlPullParser;
                                                                                            str84 = str29;
                                                                                            arrayList42 = arrayList34;
                                                                                            arrayList41 = arrayList2;
                                                                                            str78 = str14;
                                                                                            i40 = i6;
                                                                                            str83 = str17;
                                                                                            str71 = str25;
                                                                                            arrayList40 = arrayList10;
                                                                                            str59 = str28;
                                                                                            i41 = i9;
                                                                                            arrayList49 = arrayList18;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i5 = i42;
                                                                                str23 = str69;
                                                                                jOooO0o4 = jOooO0o4;
                                                                                str53 = str53;
                                                                                arrayList10 = arrayList40;
                                                                                str27 = str55;
                                                                                arrayList2 = arrayList41;
                                                                                str24 = str56;
                                                                                str7 = str57;
                                                                                arrayList34 = arrayList42;
                                                                                str12 = str58;
                                                                                str20 = str60;
                                                                                str28 = str59;
                                                                                arrayList17 = arrayList44;
                                                                                str29 = str84;
                                                                                i8 = i43;
                                                                                arrayList18 = arrayList49;
                                                                                i9 = i41;
                                                                                str14 = str78;
                                                                                str31 = str70;
                                                                                str25 = str71;
                                                                                str10 = str73;
                                                                                arrayList13 = arrayList51;
                                                                                str17 = str83;
                                                                                i4 = i4;
                                                                                arrayList14 = arrayList14;
                                                                                arrayList23 = arrayList53;
                                                                                str13 = str86;
                                                                                i6 = i40;
                                                                                z2 = true;
                                                                                str = str47;
                                                                                arrayList8 = arrayList48;
                                                                                str63 = str82;
                                                                                str15 = str79;
                                                                                arrayList19 = arrayList45;
                                                                                arrayList20 = arrayList16;
                                                                                arrayList21 = arrayList56;
                                                                                arrayList32 = arrayList36;
                                                                                str30 = str72;
                                                                                str26 = str74;
                                                                                arrayList22 = arrayList58;
                                                                                arrayList24 = arrayList54;
                                                                                arrayList25 = arrayList55;
                                                                                xmlPullParser2 = xmlPullParser6;
                                                                                z = z;
                                                                                str32 = str87;
                                                                                i10 = iOooO0Oo2;
                                                                                if (o0OoO00O.OooO0O0(xmlPullParser2, obj4)) {
                                                                                    if (o00OO0OO.OooOO0(str76)) {
                                                                                        strOooO0Oo = o00OO0OO.OooO0O0(attributeValue16);
                                                                                    } else {
                                                                                        if (o00OO0OO.OooOO0o(str76)) {
                                                                                            strOooO0Oo = o00OO0OO.OooO(attributeValue16);
                                                                                        } else if (o00OO0OO.OooOO0O(str76)) {
                                                                                            strOooO0Oo = str76;
                                                                                            str33 = strOooO0Oo;
                                                                                        } else {
                                                                                            str33 = str76;
                                                                                            if ("application/mp4".equals(str33)) {
                                                                                                strOooO0Oo = o00OO0OO.OooO0Oo(attributeValue16);
                                                                                                if ("text/vtt".equals(strOooO0Oo)) {
                                                                                                    strOooO0Oo = "application/x-mp4-vtt";
                                                                                                }
                                                                                            } else {
                                                                                                strOooO0Oo = null;
                                                                                            }
                                                                                        }
                                                                                        if ("audio/eac3".equals(strOooO0Oo)) {
                                                                                            i24 = 0;
                                                                                            while (true) {
                                                                                                if (i24 < arrayList25.size()) {
                                                                                                    o00oO0o o00oo0o10 = (o00oO0o) arrayList25.get(i24);
                                                                                                    String str910 = o00oo0o10.f39952OooO00o;
                                                                                                    boolean zEquals4 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str910);
                                                                                                    String str911 = o00oo0o10.f39953OooO0O0;
                                                                                                    if (!zEquals4) {
                                                                                                    }
                                                                                                    strOooO0Oo = "audio/eac3-joc";
                                                                                                } else {
                                                                                                    strOooO0Oo = "audio/eac3";
                                                                                                }
                                                                                            }
                                                                                            if ("audio/eac3-joc".equals(strOooO0Oo)) {
                                                                                            }
                                                                                        }
                                                                                        i11 = 0;
                                                                                        i12 = 0;
                                                                                        while (true) {
                                                                                            str35 = "urn:mpeg:dash:role:2011";
                                                                                            if (i11 < arrayList57.size()) {
                                                                                                ArrayList arrayList6110 = arrayList57;
                                                                                                o00oo0o7 = (o00oO0o) arrayList6110.get(i11);
                                                                                                if (!OooO0OO.OooO00o("urn:mpeg:dash:role:2011", o00oo0o7.f39952OooO00o)) {
                                                                                                    str42 = o00oo0o7.f39953OooO0O0;
                                                                                                    if (str42 == null) {
                                                                                                        i23 = 0;
                                                                                                    } else {
                                                                                                        i23 = 2;
                                                                                                    }
                                                                                                    i12 |= i23;
                                                                                                }
                                                                                                i11++;
                                                                                                arrayList57 = arrayList6110;
                                                                                            } else {
                                                                                                arrayList26 = arrayList57;
                                                                                                i13 = 0;
                                                                                                iOooOOOo = 0;
                                                                                                while (i13 < arrayList26.size()) {
                                                                                                    o00oo0o6 = (o00oO0o) arrayList26.get(i13);
                                                                                                    ArrayList arrayList6111 = arrayList26;
                                                                                                    if (OooO0OO.OooO00o("urn:mpeg:dash:role:2011", o00oo0o6.f39952OooO00o)) {
                                                                                                        iOooOOOo |= OooOOOo(o00oo0o6.f39953OooO0O0);
                                                                                                    }
                                                                                                    i13++;
                                                                                                    arrayList26 = arrayList6111;
                                                                                                }
                                                                                                ArrayList arrayList6112 = arrayList26;
                                                                                                i14 = 0;
                                                                                                i15 = 0;
                                                                                                while (i14 < arrayList19.size()) {
                                                                                                    ArrayList arrayList6113 = arrayList19;
                                                                                                    ArrayList arrayList6114 = arrayList23;
                                                                                                    o00oo0o5 = (o00oO0o) arrayList6113.get(i14);
                                                                                                    ArrayList arrayList6115 = arrayList22;
                                                                                                    zOooO00o = OooO0OO.OooO00o(str35, o00oo0o5.f39952OooO00o);
                                                                                                    String str912 = str35;
                                                                                                    str41 = o00oo0o5.f39953OooO0O0;
                                                                                                    if (zOooO00o) {
                                                                                                        iOooOOOo2 = OooOOOo(str41);
                                                                                                    } else {
                                                                                                        if (!OooO0OO.OooO00o("urn:tva:metadata:cs:AudioPurposeCS:2007", o00oo0o5.f39952OooO00o)) {
                                                                                                            if (str41 == null) {
                                                                                                                iOooOOOo2 = 0;
                                                                                                            } else {
                                                                                                                switch (str41.hashCode()) {
                                                                                                                    case 49:
                                                                                                                        if (str41.equals("1")) {
                                                                                                                            b = -1;
                                                                                                                        } else {
                                                                                                                            b = 0;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 50:
                                                                                                                        if (str41.equals(FeedbackType.Suggestions)) {
                                                                                                                            b = -1;
                                                                                                                        } else {
                                                                                                                            b = 1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 51:
                                                                                                                        if (str41.equals(FeedbackType.Recharge)) {
                                                                                                                            b = -1;
                                                                                                                        } else {
                                                                                                                            b = 2;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 52:
                                                                                                                        if (str41.equals("4")) {
                                                                                                                            b = -1;
                                                                                                                        } else {
                                                                                                                            b = 3;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 53:
                                                                                                                    default:
                                                                                                                        b = -1;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        if (str41.equals("6")) {
                                                                                                                            b = -1;
                                                                                                                        } else {
                                                                                                                            b = 4;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                if (b != 0) {
                                                                                                                    iOooOOOo2 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                                                                                                                } else if (b != 1) {
                                                                                                                    iOooOOOo2 = 2048;
                                                                                                                } else if (b != 2) {
                                                                                                                    iOooOOOo2 = 4;
                                                                                                                } else if (b != 3) {
                                                                                                                    iOooOOOo2 = 8;
                                                                                                                } else if (b != 4) {
                                                                                                                    iOooOOOo2 = 0;
                                                                                                                } else {
                                                                                                                    iOooOOOo2 = 1;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        i14++;
                                                                                                        arrayList19 = arrayList6113;
                                                                                                        str35 = str912;
                                                                                                        arrayList22 = arrayList6115;
                                                                                                        arrayList23 = arrayList6114;
                                                                                                    }
                                                                                                    i15 |= iOooOOOo2;
                                                                                                    i14++;
                                                                                                    arrayList19 = arrayList6113;
                                                                                                    str35 = str912;
                                                                                                    arrayList22 = arrayList6115;
                                                                                                    arrayList23 = arrayList6114;
                                                                                                }
                                                                                                ArrayList arrayList6116 = arrayList22;
                                                                                                ArrayList arrayList6117 = arrayList23;
                                                                                                arrayList9 = arrayList19;
                                                                                                int iOooOOo2 = i15 | iOooOOOo | OooOOo0(arrayList24) | OooOOo0(arrayList25);
                                                                                                i16 = 0;
                                                                                                while (true) {
                                                                                                    if (i16 < arrayList24.size()) {
                                                                                                        o00oo0o4 = (o00oO0o) arrayList24.get(i16);
                                                                                                        if (OooO0OO.OooO00o("http://dashif.org/thumbnail_tile", o00oo0o4.f39952OooO00o)) {
                                                                                                            int i49 = o0O00.f40595OooO00o;
                                                                                                            strArrSplit = str40.split("x", -1);
                                                                                                            if (strArrSplit.length == 2) {
                                                                                                                i2 = 0;
                                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                                                                                                            }
                                                                                                        } else {
                                                                                                            int i410 = o0O00.f40595OooO00o;
                                                                                                            strArrSplit = str40.split("x", -1);
                                                                                                            if (strArrSplit.length == 2) {
                                                                                                                i2 = 0;
                                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                                                                                                            }
                                                                                                        }
                                                                                                        i16++;
                                                                                                    } else {
                                                                                                        i2 = 0;
                                                                                                        pairCreate = null;
                                                                                                    }
                                                                                                }
                                                                                                oooO00o = new OooOo.OooO00o();
                                                                                                oooO00o.f11235OooO00o = attributeValue14;
                                                                                                oooO00o.f11243OooOO0 = str33;
                                                                                                oooO00o.f11244OooOO0O = strOooO0Oo;
                                                                                                oooO00o.f11242OooO0oo = str34;
                                                                                                oooO00o.f11241OooO0oO = i9;
                                                                                                oooO00o.f11238OooO0Oo = i12;
                                                                                                oooO00o.f11240OooO0o0 = iOooOOo2;
                                                                                                String str913 = str25;
                                                                                                oooO00o.f11237OooO0OO = str913;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                } else {
                                                                                                    iIntValue = -1;
                                                                                                }
                                                                                                oooO00o.f11263OooOooO = iIntValue;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                } else {
                                                                                                    iIntValue2 = -1;
                                                                                                }
                                                                                                oooO00o.f11264OooOooo = iIntValue2;
                                                                                                if (o00OO0OO.OooOO0o(strOooO0Oo)) {
                                                                                                    oooO00o.f11249OooOOOo = iOooOO0o6;
                                                                                                    oooO00o.f11251OooOOo0 = iOooOO0o7;
                                                                                                    oooO00o.f11250OooOOo = fOooOO0O2;
                                                                                                } else {
                                                                                                    i17 = iOooOO0o6;
                                                                                                    if (o00OO0OO.OooOO0(strOooO0Oo)) {
                                                                                                        oooO00o.f11253OooOo = i10;
                                                                                                        oooO00o.f11259OooOoO0 = iOooOO0o8;
                                                                                                    } else if (o00OO0OO.OooOO0O(strOooO0Oo)) {
                                                                                                        if ("application/cea-608".equals(strOooO0Oo)) {
                                                                                                            i21 = i2;
                                                                                                            while (true) {
                                                                                                                if (i21 < arrayList9.size()) {
                                                                                                                    o00oo0o3 = (o00oO0o) arrayList9.get(i21);
                                                                                                                    if (!"urn:scte:dash:cc:cea-608:2015".equals(o00oo0o3.f39952OooO00o)) {
                                                                                                                    }
                                                                                                                    i21++;
                                                                                                                } else {
                                                                                                                    i18 = 1;
                                                                                                                    i20 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else if ("application/cea-708".equals(strOooO0Oo)) {
                                                                                                            i19 = i2;
                                                                                                            while (true) {
                                                                                                                if (i19 < arrayList9.size()) {
                                                                                                                    o00oo0o2 = (o00oO0o) arrayList9.get(i19);
                                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(o00oo0o2.f39952OooO00o)) {
                                                                                                                    }
                                                                                                                    i19++;
                                                                                                                } else {
                                                                                                                    i18 = 1;
                                                                                                                    i20 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i18 = 1;
                                                                                                            i20 = -1;
                                                                                                        }
                                                                                                        oooO00o.f11261OooOoo = i20;
                                                                                                    } else {
                                                                                                        i18 = 1;
                                                                                                        if ("image".equals(o00OO0OO.OooO0oO(strOooO0Oo))) {
                                                                                                            oooO00o.f11249OooOOOo = i17;
                                                                                                            oooO00o.f11251OooOOo0 = iOooOO0o7;
                                                                                                        }
                                                                                                    }
                                                                                                    OooOo oooOo6 = new OooOo(oooO00o);
                                                                                                    if (o0o0o00OooOo02 != null) {
                                                                                                        oooO = o0o0o00OooOo02;
                                                                                                    } else {
                                                                                                        oooO = new o0O0O00.OooO();
                                                                                                    }
                                                                                                    if (arrayList21.isEmpty()) {
                                                                                                        arrayList27 = arrayList21;
                                                                                                    } else {
                                                                                                        arrayList27 = arrayList20;
                                                                                                    }
                                                                                                    OooO00o oooO00o8 = new OooO00o(oooOo6, arrayList27, oooO, str32, arrayList6116, arrayList6117, arrayList24, arrayList25);
                                                                                                    iOooO0oo2 = o00OO0OO.OooO0oo(oooOo6.f11211OooOOOO);
                                                                                                    i22 = i8;
                                                                                                    if (i22 != -1) {
                                                                                                        if (iOooO0oo2 != -1) {
                                                                                                            if (i22 == iOooO0oo2) {
                                                                                                                z3 = i18;
                                                                                                            } else {
                                                                                                                z3 = i2;
                                                                                                            }
                                                                                                            o00O000o.OooO0Oo(z3);
                                                                                                        }
                                                                                                        iOooO0oo2 = i22;
                                                                                                    }
                                                                                                    ArrayList arrayList6118 = arrayList18;
                                                                                                    arrayList6118.add(oooO00o8);
                                                                                                    xmlPullParser6 = xmlPullParser;
                                                                                                    arrayList11 = arrayList6118;
                                                                                                    str67 = str913;
                                                                                                    i3 = i18;
                                                                                                    str38 = str62;
                                                                                                    j17 = j5;
                                                                                                    arrayList12 = arrayList6112;
                                                                                                    str39 = str24;
                                                                                                    arrayList15 = arrayList17;
                                                                                                    str21 = str28;
                                                                                                    str19 = str27;
                                                                                                }
                                                                                                i18 = 1;
                                                                                                OooOo oooOo7 = new OooOo(oooO00o);
                                                                                                if (o0o0o00OooOo02 != null) {
                                                                                                    oooO = o0o0o00OooOo02;
                                                                                                } else {
                                                                                                    oooO = new o0O0O00.OooO();
                                                                                                }
                                                                                                if (arrayList21.isEmpty()) {
                                                                                                    arrayList27 = arrayList21;
                                                                                                } else {
                                                                                                    arrayList27 = arrayList20;
                                                                                                }
                                                                                                OooO00o oooO00o9 = new OooO00o(oooOo7, arrayList27, oooO, str32, arrayList6116, arrayList6117, arrayList24, arrayList25);
                                                                                                iOooO0oo2 = o00OO0OO.OooO0oo(oooOo7.f11211OooOOOO);
                                                                                                i22 = i8;
                                                                                                if (i22 != -1) {
                                                                                                    if (iOooO0oo2 != -1) {
                                                                                                        if (i22 == iOooO0oo2) {
                                                                                                            z3 = i18;
                                                                                                        } else {
                                                                                                            z3 = i2;
                                                                                                        }
                                                                                                        o00O000o.OooO0Oo(z3);
                                                                                                    }
                                                                                                    iOooO0oo2 = i22;
                                                                                                }
                                                                                                ArrayList arrayList6119 = arrayList18;
                                                                                                arrayList6119.add(oooO00o9);
                                                                                                xmlPullParser6 = xmlPullParser;
                                                                                                arrayList11 = arrayList6119;
                                                                                                str67 = str913;
                                                                                                i3 = i18;
                                                                                                str38 = str62;
                                                                                                j17 = j5;
                                                                                                arrayList12 = arrayList6112;
                                                                                                str39 = str24;
                                                                                                arrayList15 = arrayList17;
                                                                                                str21 = str28;
                                                                                                str19 = str27;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str33 = str76;
                                                                                    if ("audio/eac3".equals(strOooO0Oo)) {
                                                                                        i24 = 0;
                                                                                        while (true) {
                                                                                            if (i24 < arrayList25.size()) {
                                                                                                o00oO0o o00oo0o11 = (o00oO0o) arrayList25.get(i24);
                                                                                                String str914 = o00oo0o11.f39952OooO00o;
                                                                                                boolean zEquals5 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str914);
                                                                                                String str915 = o00oo0o11.f39953OooO0O0;
                                                                                                if (!zEquals5) {
                                                                                                }
                                                                                                strOooO0Oo = "audio/eac3-joc";
                                                                                            } else {
                                                                                                strOooO0Oo = "audio/eac3";
                                                                                            }
                                                                                        }
                                                                                        if ("audio/eac3-joc".equals(strOooO0Oo)) {
                                                                                        }
                                                                                    }
                                                                                    i11 = 0;
                                                                                    i12 = 0;
                                                                                    while (true) {
                                                                                        str35 = "urn:mpeg:dash:role:2011";
                                                                                        if (i11 < arrayList57.size()) {
                                                                                            ArrayList arrayList61110 = arrayList57;
                                                                                            o00oo0o7 = (o00oO0o) arrayList61110.get(i11);
                                                                                            if (!OooO0OO.OooO00o("urn:mpeg:dash:role:2011", o00oo0o7.f39952OooO00o)) {
                                                                                                str42 = o00oo0o7.f39953OooO0O0;
                                                                                                if (str42 == null) {
                                                                                                    i23 = 0;
                                                                                                } else {
                                                                                                    i23 = 2;
                                                                                                }
                                                                                                i12 |= i23;
                                                                                            }
                                                                                            i11++;
                                                                                            arrayList57 = arrayList61110;
                                                                                        } else {
                                                                                            arrayList26 = arrayList57;
                                                                                            i13 = 0;
                                                                                            iOooOOOo = 0;
                                                                                            while (i13 < arrayList26.size()) {
                                                                                                o00oo0o6 = (o00oO0o) arrayList26.get(i13);
                                                                                                ArrayList arrayList61111 = arrayList26;
                                                                                                if (OooO0OO.OooO00o("urn:mpeg:dash:role:2011", o00oo0o6.f39952OooO00o)) {
                                                                                                    iOooOOOo |= OooOOOo(o00oo0o6.f39953OooO0O0);
                                                                                                }
                                                                                                i13++;
                                                                                                arrayList26 = arrayList61111;
                                                                                            }
                                                                                            ArrayList arrayList61112 = arrayList26;
                                                                                            i14 = 0;
                                                                                            i15 = 0;
                                                                                            while (i14 < arrayList19.size()) {
                                                                                                ArrayList arrayList61113 = arrayList19;
                                                                                                ArrayList arrayList61114 = arrayList23;
                                                                                                o00oo0o5 = (o00oO0o) arrayList61113.get(i14);
                                                                                                ArrayList arrayList61115 = arrayList22;
                                                                                                zOooO00o = OooO0OO.OooO00o(str35, o00oo0o5.f39952OooO00o);
                                                                                                String str916 = str35;
                                                                                                str41 = o00oo0o5.f39953OooO0O0;
                                                                                                if (zOooO00o) {
                                                                                                    iOooOOOo2 = OooOOOo(str41);
                                                                                                } else {
                                                                                                    if (!OooO0OO.OooO00o("urn:tva:metadata:cs:AudioPurposeCS:2007", o00oo0o5.f39952OooO00o)) {
                                                                                                        if (str41 == null) {
                                                                                                            iOooOOOo2 = 0;
                                                                                                        } else {
                                                                                                            switch (str41.hashCode()) {
                                                                                                                case 49:
                                                                                                                    if (str41.equals("1")) {
                                                                                                                        b = -1;
                                                                                                                    } else {
                                                                                                                        b = 0;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    if (str41.equals(FeedbackType.Suggestions)) {
                                                                                                                        b = -1;
                                                                                                                    } else {
                                                                                                                        b = 1;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 51:
                                                                                                                    if (str41.equals(FeedbackType.Recharge)) {
                                                                                                                        b = -1;
                                                                                                                    } else {
                                                                                                                        b = 2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 52:
                                                                                                                    if (str41.equals("4")) {
                                                                                                                        b = -1;
                                                                                                                    } else {
                                                                                                                        b = 3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                default:
                                                                                                                    b = -1;
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    if (str41.equals("6")) {
                                                                                                                        b = -1;
                                                                                                                    } else {
                                                                                                                        b = 4;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            if (b != 0) {
                                                                                                                iOooOOOo2 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                                                                                                            } else if (b != 1) {
                                                                                                                iOooOOOo2 = 2048;
                                                                                                            } else if (b != 2) {
                                                                                                                iOooOOOo2 = 4;
                                                                                                            } else if (b != 3) {
                                                                                                                iOooOOOo2 = 8;
                                                                                                            } else if (b != 4) {
                                                                                                                iOooOOOo2 = 0;
                                                                                                            } else {
                                                                                                                iOooOOOo2 = 1;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    i14++;
                                                                                                    arrayList19 = arrayList61113;
                                                                                                    str35 = str916;
                                                                                                    arrayList22 = arrayList61115;
                                                                                                    arrayList23 = arrayList61114;
                                                                                                }
                                                                                                i15 |= iOooOOOo2;
                                                                                                i14++;
                                                                                                arrayList19 = arrayList61113;
                                                                                                str35 = str916;
                                                                                                arrayList22 = arrayList61115;
                                                                                                arrayList23 = arrayList61114;
                                                                                            }
                                                                                            ArrayList arrayList61116 = arrayList22;
                                                                                            ArrayList arrayList61117 = arrayList23;
                                                                                            arrayList9 = arrayList19;
                                                                                            int iOooOOo3 = i15 | iOooOOOo | OooOOo0(arrayList24) | OooOOo0(arrayList25);
                                                                                            i16 = 0;
                                                                                            while (true) {
                                                                                                if (i16 < arrayList24.size()) {
                                                                                                    o00oo0o4 = (o00oO0o) arrayList24.get(i16);
                                                                                                    if (OooO0OO.OooO00o("http://dashif.org/thumbnail_tile", o00oo0o4.f39952OooO00o)) {
                                                                                                        int i411 = o0O00.f40595OooO00o;
                                                                                                        strArrSplit = str40.split("x", -1);
                                                                                                        if (strArrSplit.length == 2) {
                                                                                                            i2 = 0;
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                                                                                                        }
                                                                                                    } else {
                                                                                                        int i412 = o0O00.f40595OooO00o;
                                                                                                        strArrSplit = str40.split("x", -1);
                                                                                                        if (strArrSplit.length == 2) {
                                                                                                            i2 = 0;
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                                                                                                        }
                                                                                                    }
                                                                                                    i16++;
                                                                                                } else {
                                                                                                    i2 = 0;
                                                                                                    pairCreate = null;
                                                                                                }
                                                                                            }
                                                                                            oooO00o = new OooOo.OooO00o();
                                                                                            oooO00o.f11235OooO00o = attributeValue14;
                                                                                            oooO00o.f11243OooOO0 = str33;
                                                                                            oooO00o.f11244OooOO0O = strOooO0Oo;
                                                                                            oooO00o.f11242OooO0oo = str34;
                                                                                            oooO00o.f11241OooO0oO = i9;
                                                                                            oooO00o.f11238OooO0Oo = i12;
                                                                                            oooO00o.f11240OooO0o0 = iOooOOo3;
                                                                                            String str917 = str25;
                                                                                            oooO00o.f11237OooO0OO = str917;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                            } else {
                                                                                                iIntValue = -1;
                                                                                            }
                                                                                            oooO00o.f11263OooOooO = iIntValue;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                            } else {
                                                                                                iIntValue2 = -1;
                                                                                            }
                                                                                            oooO00o.f11264OooOooo = iIntValue2;
                                                                                            if (o00OO0OO.OooOO0o(strOooO0Oo)) {
                                                                                                oooO00o.f11249OooOOOo = iOooOO0o6;
                                                                                                oooO00o.f11251OooOOo0 = iOooOO0o7;
                                                                                                oooO00o.f11250OooOOo = fOooOO0O2;
                                                                                            } else {
                                                                                                i17 = iOooOO0o6;
                                                                                                if (o00OO0OO.OooOO0(strOooO0Oo)) {
                                                                                                    oooO00o.f11253OooOo = i10;
                                                                                                    oooO00o.f11259OooOoO0 = iOooOO0o8;
                                                                                                } else if (o00OO0OO.OooOO0O(strOooO0Oo)) {
                                                                                                    if ("application/cea-608".equals(strOooO0Oo)) {
                                                                                                        i21 = i2;
                                                                                                        while (true) {
                                                                                                            if (i21 < arrayList9.size()) {
                                                                                                                o00oo0o3 = (o00oO0o) arrayList9.get(i21);
                                                                                                                if (!"urn:scte:dash:cc:cea-608:2015".equals(o00oo0o3.f39952OooO00o)) {
                                                                                                                }
                                                                                                                i21++;
                                                                                                            } else {
                                                                                                                i18 = 1;
                                                                                                                i20 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else if ("application/cea-708".equals(strOooO0Oo)) {
                                                                                                        i19 = i2;
                                                                                                        while (true) {
                                                                                                            if (i19 < arrayList9.size()) {
                                                                                                                o00oo0o2 = (o00oO0o) arrayList9.get(i19);
                                                                                                                if (!"urn:scte:dash:cc:cea-708:2015".equals(o00oo0o2.f39952OooO00o)) {
                                                                                                                }
                                                                                                                i19++;
                                                                                                            } else {
                                                                                                                i18 = 1;
                                                                                                                i20 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i18 = 1;
                                                                                                        i20 = -1;
                                                                                                    }
                                                                                                    oooO00o.f11261OooOoo = i20;
                                                                                                } else {
                                                                                                    i18 = 1;
                                                                                                    if ("image".equals(o00OO0OO.OooO0oO(strOooO0Oo))) {
                                                                                                        oooO00o.f11249OooOOOo = i17;
                                                                                                        oooO00o.f11251OooOOo0 = iOooOO0o7;
                                                                                                    }
                                                                                                }
                                                                                                OooOo oooOo8 = new OooOo(oooO00o);
                                                                                                if (o0o0o00OooOo02 != null) {
                                                                                                    oooO = o0o0o00OooOo02;
                                                                                                } else {
                                                                                                    oooO = new o0O0O00.OooO();
                                                                                                }
                                                                                                if (arrayList21.isEmpty()) {
                                                                                                    arrayList27 = arrayList21;
                                                                                                } else {
                                                                                                    arrayList27 = arrayList20;
                                                                                                }
                                                                                                OooO00o oooO00o10 = new OooO00o(oooOo8, arrayList27, oooO, str32, arrayList61116, arrayList61117, arrayList24, arrayList25);
                                                                                                iOooO0oo2 = o00OO0OO.OooO0oo(oooOo8.f11211OooOOOO);
                                                                                                i22 = i8;
                                                                                                if (i22 != -1) {
                                                                                                    if (iOooO0oo2 != -1) {
                                                                                                        if (i22 == iOooO0oo2) {
                                                                                                            z3 = i18;
                                                                                                        } else {
                                                                                                            z3 = i2;
                                                                                                        }
                                                                                                        o00O000o.OooO0Oo(z3);
                                                                                                    }
                                                                                                    iOooO0oo2 = i22;
                                                                                                }
                                                                                                ArrayList arrayList61118 = arrayList18;
                                                                                                arrayList61118.add(oooO00o10);
                                                                                                xmlPullParser6 = xmlPullParser;
                                                                                                arrayList11 = arrayList61118;
                                                                                                str67 = str917;
                                                                                                i3 = i18;
                                                                                                str38 = str62;
                                                                                                j17 = j5;
                                                                                                arrayList12 = arrayList61112;
                                                                                                str39 = str24;
                                                                                                arrayList15 = arrayList17;
                                                                                                str21 = str28;
                                                                                                str19 = str27;
                                                                                            }
                                                                                            i18 = 1;
                                                                                            OooOo oooOo9 = new OooOo(oooO00o);
                                                                                            if (o0o0o00OooOo02 != null) {
                                                                                                oooO = o0o0o00OooOo02;
                                                                                            } else {
                                                                                                oooO = new o0O0O00.OooO();
                                                                                            }
                                                                                            if (arrayList21.isEmpty()) {
                                                                                                arrayList27 = arrayList21;
                                                                                            } else {
                                                                                                arrayList27 = arrayList20;
                                                                                            }
                                                                                            OooO00o oooO00o11 = new OooO00o(oooOo9, arrayList27, oooO, str32, arrayList61116, arrayList61117, arrayList24, arrayList25);
                                                                                            iOooO0oo2 = o00OO0OO.OooO0oo(oooOo9.f11211OooOOOO);
                                                                                            i22 = i8;
                                                                                            if (i22 != -1) {
                                                                                                if (iOooO0oo2 != -1) {
                                                                                                    if (i22 == iOooO0oo2) {
                                                                                                        z3 = i18;
                                                                                                    } else {
                                                                                                        z3 = i2;
                                                                                                    }
                                                                                                    o00O000o.OooO0Oo(z3);
                                                                                                }
                                                                                                iOooO0oo2 = i22;
                                                                                            }
                                                                                            ArrayList arrayList61119 = arrayList18;
                                                                                            arrayList61119.add(oooO00o11);
                                                                                            xmlPullParser6 = xmlPullParser;
                                                                                            arrayList11 = arrayList61119;
                                                                                            str67 = str917;
                                                                                            i3 = i18;
                                                                                            str38 = str62;
                                                                                            j17 = j5;
                                                                                            arrayList12 = arrayList61112;
                                                                                            str39 = str24;
                                                                                            arrayList15 = arrayList17;
                                                                                            str21 = str28;
                                                                                            str19 = str27;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str72 = str30;
                                                                                    arrayList58 = arrayList22;
                                                                                    str87 = str32;
                                                                                    arrayList53 = arrayList23;
                                                                                    arrayList54 = arrayList24;
                                                                                    str70 = str31;
                                                                                    arrayList55 = arrayList25;
                                                                                    iOooO0Oo2 = i10;
                                                                                    obj4 = obj4;
                                                                                    arrayList45 = arrayList19;
                                                                                    str74 = str26;
                                                                                    i42 = i5;
                                                                                    i4 = i4;
                                                                                    z = z;
                                                                                    arrayList14 = arrayList14;
                                                                                    str79 = str15;
                                                                                    str69 = str23;
                                                                                    arrayList16 = arrayList20;
                                                                                    arrayList51 = arrayList13;
                                                                                    arrayList56 = arrayList21;
                                                                                    iOooOO0o6 = iOooOO0o6;
                                                                                    str82 = str63;
                                                                                    arrayList36 = arrayList32;
                                                                                    str47 = str;
                                                                                    str86 = str13;
                                                                                    arrayList48 = arrayList8;
                                                                                    jOooO0o4 = jOooO0o4;
                                                                                    str56 = str24;
                                                                                    str60 = str20;
                                                                                    str73 = str10;
                                                                                    str58 = str12;
                                                                                    i43 = i8;
                                                                                    str57 = str7;
                                                                                    arrayList44 = arrayList17;
                                                                                    str53 = str53;
                                                                                    str55 = str27;
                                                                                    xmlPullParser6 = xmlPullParser;
                                                                                    str84 = str29;
                                                                                    arrayList42 = arrayList34;
                                                                                    arrayList41 = arrayList2;
                                                                                    str78 = str14;
                                                                                    i40 = i6;
                                                                                    str83 = str17;
                                                                                    str71 = str25;
                                                                                    arrayList40 = arrayList10;
                                                                                    str59 = str28;
                                                                                    i41 = i9;
                                                                                    arrayList49 = arrayList18;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str = str47;
                                                                            arrayList8 = arrayList48;
                                                                            str10 = str52;
                                                                            arrayList9 = arrayList45;
                                                                            str53 = str53;
                                                                            arrayList10 = arrayList40;
                                                                            String str100 = str55;
                                                                            arrayList2 = arrayList41;
                                                                            str11 = str56;
                                                                            str7 = str57;
                                                                            arrayList34 = arrayList42;
                                                                            str12 = str58;
                                                                            String str101 = str60;
                                                                            str13 = str61;
                                                                            ArrayList arrayList70 = arrayList44;
                                                                            i4 = i37;
                                                                            f = f7;
                                                                            arrayList11 = arrayList49;
                                                                            i5 = i39;
                                                                            i6 = i38;
                                                                            str14 = str65;
                                                                            str15 = str66;
                                                                            i2 = 0;
                                                                            i3 = 1;
                                                                            str16 = str67;
                                                                            arrayList12 = arrayList46;
                                                                            arrayList13 = arrayList50;
                                                                            i7 = iOooO0oo2;
                                                                            arrayList14 = arrayList47;
                                                                            arrayList32 = arrayList36;
                                                                            z = z;
                                                                            String str102 = str59;
                                                                            str17 = str64;
                                                                            if (o0OoO00O.OooO0Oo(xmlPullParser6, str102)) {
                                                                                o0o0o00OooOOoo = OooOOo(xmlPullParser6, (o0O0O00.OooO) o0o0o00OooOo01);
                                                                                str18 = str101;
                                                                            } else {
                                                                                str18 = str101;
                                                                                if (o0OoO00O.OooO0Oo(xmlPullParser6, str18)) {
                                                                                    jOooO0o3 = OooO0o0(xmlPullParser6, jOooO0o3);
                                                                                    o0o0o00OooOOoo = OooOOoo(xmlPullParser, (o0O0O00.OooO0O0) o0o0o00OooOo01, j15, jOooOO6, j5, jOooO0o3, jOooOO3);
                                                                                } else {
                                                                                    str16 = str16;
                                                                                    xmlPullParser6 = xmlPullParser6;
                                                                                    i7 = i7;
                                                                                    j6 = jOooO0o3;
                                                                                    if (o0OoO00O.OooO0Oo(xmlPullParser6, str100)) {
                                                                                        long jOooO0o7 = OooO0o0(xmlPullParser6, j6);
                                                                                        str19 = str100;
                                                                                        str20 = str18;
                                                                                        str21 = str102;
                                                                                        o0o0o00OooOo01 = OooOo00(xmlPullParser, (o0O0O00.OooO0OO) o0o0o00OooOo01, arrayList8, j15, jOooOO6, j5, jOooO0o7, jOooOO3);
                                                                                        jOooO0o3 = jOooO0o7;
                                                                                    } else {
                                                                                        str19 = str100;
                                                                                        str20 = str18;
                                                                                        str21 = str102;
                                                                                        if (o0OoO00O.OooO0Oo(xmlPullParser6, "InbandEventStream")) {
                                                                                            arrayList15 = arrayList70;
                                                                                            arrayList15.add(OooO(xmlPullParser6, "InbandEventStream"));
                                                                                        } else {
                                                                                            arrayList15 = arrayList70;
                                                                                            if (o0OoO00O.OooO0Oo(xmlPullParser6, TextFieldImplKt.LabelId)) {
                                                                                                String text = "";
                                                                                                do {
                                                                                                    xmlPullParser6.next();
                                                                                                    if (xmlPullParser6.getEventType() == 4) {
                                                                                                        text = xmlPullParser6.getText();
                                                                                                    } else {
                                                                                                        OooO0OO(xmlPullParser6);
                                                                                                    }
                                                                                                } while (!o0OoO00O.OooO0O0(xmlPullParser6, TextFieldImplKt.LabelId));
                                                                                                str62 = text;
                                                                                            } else if (o0OoO00O.OooO0OO(xmlPullParser)) {
                                                                                                OooO0OO(xmlPullParser);
                                                                                            }
                                                                                        }
                                                                                        jOooO0o3 = j6;
                                                                                        xmlPullParser6 = xmlPullParser6;
                                                                                        str67 = str16;
                                                                                        iOooO0oo2 = i7;
                                                                                        str38 = str62;
                                                                                        j17 = j5;
                                                                                        str39 = str11;
                                                                                    }
                                                                                }
                                                                                arrayList15 = arrayList70;
                                                                                xmlPullParser6 = xmlPullParser6;
                                                                                str67 = str16;
                                                                                iOooO0oo2 = i7;
                                                                                str38 = str62;
                                                                                j17 = j5;
                                                                                str39 = str11;
                                                                            }
                                                                            o0o0o00OooOo01 = o0o0o00OooOOoo;
                                                                            str20 = str18;
                                                                            str19 = str100;
                                                                            str21 = str102;
                                                                            arrayList15 = arrayList70;
                                                                            xmlPullParser6 = xmlPullParser6;
                                                                            str67 = str16;
                                                                            iOooO0oo2 = i7;
                                                                            str38 = str62;
                                                                            j17 = j5;
                                                                            str39 = str11;
                                                                        }
                                                                    }
                                                                }
                                                                if (o0OoO00O.OooO0O0(xmlPullParser6, str39)) {
                                                                    arrayList28 = new ArrayList(arrayList11.size());
                                                                    i25 = i2;
                                                                    while (i25 < arrayList11.size()) {
                                                                        arrayList29 = arrayList11;
                                                                        OooO00o oooO00o12 = (OooO00o) arrayList29.get(i25);
                                                                        OooOo oooOo10 = oooO00o12.f39995OooO00o;
                                                                        oooOo10.getClass();
                                                                        oooO00o2 = new OooOo.OooO00o(oooOo10);
                                                                        if (str38 != null) {
                                                                            oooO00o2.f11236OooO0O0 = str38;
                                                                        }
                                                                        str43 = oooO00o12.f39998OooO0Oo;
                                                                        if (str43 == null) {
                                                                            str43 = str68;
                                                                        }
                                                                        arrayList30 = oooO00o12.f40000OooO0o0;
                                                                        ArrayList arrayList71 = arrayList7;
                                                                        arrayList30.addAll(arrayList71);
                                                                        if (arrayList30.isEmpty()) {
                                                                            str44 = str38;
                                                                            arrayList11 = arrayList29;
                                                                        } else {
                                                                            i26 = i2;
                                                                            while (true) {
                                                                                if (i26 < arrayList30.size()) {
                                                                                    schemeData4 = arrayList30.get(i26);
                                                                                    if (C.f10898OooO0OO.equals(schemeData4.f11756OooO0o0) || (str45 = schemeData4.f11755OooO0o) == null) {
                                                                                        i26++;
                                                                                    } else {
                                                                                        arrayList30.remove(i26);
                                                                                    }
                                                                                } else {
                                                                                    str45 = null;
                                                                                }
                                                                            }
                                                                            if (str45 != null) {
                                                                                i27 = i2;
                                                                                while (i27 < arrayList30.size()) {
                                                                                    schemeData = arrayList30.get(i27);
                                                                                    String str103 = str38;
                                                                                    if (!C.f10897OooO0O0.equals(schemeData.f11756OooO0o0) && schemeData.f11755OooO0o == null) {
                                                                                        arrayList30.set(i27, new DrmInitData.SchemeData(C.f10898OooO0OO, str45, schemeData.f11757OooO0oO, schemeData.f11758OooO0oo));
                                                                                    }
                                                                                    i27++;
                                                                                    str38 = str103;
                                                                                    arrayList29 = arrayList29;
                                                                                }
                                                                            }
                                                                            str44 = str38;
                                                                            arrayList11 = arrayList29;
                                                                            for (size = arrayList30.size() - 1; size >= 0; size--) {
                                                                                schemeData2 = arrayList30.get(size);
                                                                                if (schemeData2.f11758OooO0oo != null) {
                                                                                    i28 = i3;
                                                                                } else {
                                                                                    i28 = i2;
                                                                                }
                                                                                if (i28 == 0) {
                                                                                    for (i29 = i2; i29 < arrayList30.size(); i29++) {
                                                                                        schemeData3 = arrayList30.get(i29);
                                                                                        if (schemeData3.f11758OooO0oo != null) {
                                                                                            i30 = i3;
                                                                                        } else {
                                                                                            i30 = i2;
                                                                                        }
                                                                                        if (i30 == 0) {
                                                                                            i31 = i2;
                                                                                        } else {
                                                                                            if (schemeData2.f11758OooO0oo != null) {
                                                                                                i32 = i3;
                                                                                            } else {
                                                                                                i32 = i2;
                                                                                            }
                                                                                            if (i32 == 0 || !schemeData3.OooO00o(schemeData2.f11756OooO0o0)) {
                                                                                                i31 = i2;
                                                                                            } else {
                                                                                                i31 = i3;
                                                                                            }
                                                                                        }
                                                                                        if (i31 != 0) {
                                                                                            arrayList30.remove(size);
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            oooO00o2.f11246OooOOO = new DrmInitData(str43, arrayList30);
                                                                        }
                                                                        arrayList31 = oooO00o12.f39999OooO0o;
                                                                        arrayList31.addAll(arrayList15);
                                                                        j7 = oooO00o12.f40001OooO0oO;
                                                                        oooOo = new OooOo(oooO00o2);
                                                                        immutableList = oooO00o12.f39996OooO0O0;
                                                                        list = oooO00o12.f40002OooO0oo;
                                                                        list2 = oooO00o12.f39994OooO;
                                                                        o0o0o00 = oooO00o12.f39997OooO0OO;
                                                                        if (o0o0o00 instanceof o0O0O00.OooO) {
                                                                            oooO00o3 = new oo0o0Oo.OooO0O0(j7, oooOo, immutableList, (o0O0O00.OooO) o0o0o00, arrayList31, list, list2);
                                                                        } else {
                                                                            if (!(o0o0o00 instanceof o0O0O00.OooO00o)) {
                                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                            }
                                                                            oooO00o3 = new oo0o0Oo.OooO00o(j7, oooOo, immutableList, (o0O0O00.OooO00o) o0o0o00, arrayList31, list, list2);
                                                                        }
                                                                        arrayList28.add(oooO00o3);
                                                                        i25++;
                                                                        arrayList7 = arrayList71;
                                                                        str38 = str44;
                                                                    }
                                                                    arrayList3 = arrayList10;
                                                                    arrayList3.add(new o00O0O(iOooOO0o, iOooO0oo2, arrayList28, arrayList9, arrayList14, arrayList8));
                                                                    xmlPullParser3 = xmlPullParser;
                                                                    arrayList5 = arrayList38;
                                                                    str4 = str10;
                                                                    str5 = str12;
                                                                } else {
                                                                    arrayList44 = arrayList15;
                                                                    str56 = str39;
                                                                    arrayList45 = arrayList9;
                                                                    i39 = i5;
                                                                    i37 = i4;
                                                                    z = z;
                                                                    arrayList47 = arrayList14;
                                                                    str65 = str14;
                                                                    i38 = i6;
                                                                    arrayList46 = arrayList12;
                                                                    str62 = str38;
                                                                    arrayList50 = arrayList13;
                                                                    str64 = str17;
                                                                    f7 = f;
                                                                    arrayList36 = arrayList32;
                                                                    arrayList39 = arrayList6;
                                                                    str48 = str3;
                                                                    str47 = str;
                                                                    str61 = str13;
                                                                    arrayList48 = arrayList8;
                                                                    str60 = str20;
                                                                    arrayList40 = arrayList10;
                                                                    str52 = str10;
                                                                    str58 = str12;
                                                                    arrayList49 = arrayList11;
                                                                    str57 = str7;
                                                                    str53 = str53;
                                                                    str55 = str19;
                                                                    str59 = str21;
                                                                    arrayList42 = arrayList34;
                                                                    str66 = str15;
                                                                    arrayList43 = arrayList7;
                                                                    arrayList41 = arrayList2;
                                                                }
                                                            }
                                                            str3 = str48;
                                                            str16 = str67;
                                                            str = str47;
                                                            arrayList8 = arrayList48;
                                                            xmlPullParser6 = xmlPullParser6;
                                                            str10 = str52;
                                                            arrayList9 = arrayList45;
                                                            arrayList7 = arrayList43;
                                                            str53 = str53;
                                                            arrayList10 = arrayList40;
                                                            str19 = str55;
                                                            arrayList2 = arrayList41;
                                                            str11 = str56;
                                                            str7 = str57;
                                                            arrayList34 = arrayList42;
                                                            str12 = str58;
                                                            str20 = str60;
                                                            str21 = str59;
                                                            str13 = str61;
                                                            arrayList15 = arrayList44;
                                                            i4 = i37;
                                                            f = f7;
                                                            arrayList11 = arrayList49;
                                                            i5 = i39;
                                                            str17 = str64;
                                                            i6 = i38;
                                                            str14 = str65;
                                                            str15 = str66;
                                                            i2 = 0;
                                                            i3 = 1;
                                                            arrayList12 = arrayList46;
                                                            arrayList13 = arrayList50;
                                                            i7 = iOooO0oo2;
                                                            arrayList14 = arrayList47;
                                                            arrayList32 = arrayList36;
                                                            j6 = jOooO0o3;
                                                            z = z;
                                                            jOooO0o3 = j6;
                                                            xmlPullParser6 = xmlPullParser6;
                                                            str67 = str16;
                                                            iOooO0oo2 = i7;
                                                            str38 = str62;
                                                            j17 = j5;
                                                            str39 = str11;
                                                            if (o0OoO00O.OooO0O0(xmlPullParser6, str39)) {
                                                                arrayList28 = new ArrayList(arrayList11.size());
                                                                i25 = i2;
                                                                while (i25 < arrayList11.size()) {
                                                                    arrayList29 = arrayList11;
                                                                    OooO00o oooO00o13 = (OooO00o) arrayList29.get(i25);
                                                                    OooOo oooOo11 = oooO00o13.f39995OooO00o;
                                                                    oooOo11.getClass();
                                                                    oooO00o2 = new OooOo.OooO00o(oooOo11);
                                                                    if (str38 != null) {
                                                                        oooO00o2.f11236OooO0O0 = str38;
                                                                    }
                                                                    str43 = oooO00o13.f39998OooO0Oo;
                                                                    if (str43 == null) {
                                                                        str43 = str68;
                                                                    }
                                                                    arrayList30 = oooO00o13.f40000OooO0o0;
                                                                    ArrayList arrayList72 = arrayList7;
                                                                    arrayList30.addAll(arrayList72);
                                                                    if (arrayList30.isEmpty()) {
                                                                        i26 = i2;
                                                                        while (true) {
                                                                            if (i26 < arrayList30.size()) {
                                                                                schemeData4 = arrayList30.get(i26);
                                                                                if (C.f10898OooO0OO.equals(schemeData4.f11756OooO0o0)) {
                                                                                }
                                                                                i26++;
                                                                            } else {
                                                                                str45 = null;
                                                                            }
                                                                        }
                                                                        if (str45 != null) {
                                                                            i27 = i2;
                                                                            while (i27 < arrayList30.size()) {
                                                                                schemeData = arrayList30.get(i27);
                                                                                String str104 = str38;
                                                                                if (!C.f10897OooO0O0.equals(schemeData.f11756OooO0o0)) {
                                                                                }
                                                                                i27++;
                                                                                str38 = str104;
                                                                                arrayList29 = arrayList29;
                                                                            }
                                                                        }
                                                                        str44 = str38;
                                                                        arrayList11 = arrayList29;
                                                                        while (size >= 0) {
                                                                            schemeData2 = arrayList30.get(size);
                                                                            if (schemeData2.f11758OooO0oo != null) {
                                                                                i28 = i3;
                                                                            } else {
                                                                                i28 = i2;
                                                                            }
                                                                            if (i28 == 0) {
                                                                                while (i29 < arrayList30.size()) {
                                                                                    schemeData3 = arrayList30.get(i29);
                                                                                    if (schemeData3.f11758OooO0oo != null) {
                                                                                        i30 = i3;
                                                                                    } else {
                                                                                        i30 = i2;
                                                                                    }
                                                                                    if (i30 == 0) {
                                                                                        i31 = i2;
                                                                                    } else {
                                                                                        if (schemeData2.f11758OooO0oo != null) {
                                                                                            i32 = i3;
                                                                                        } else {
                                                                                            i32 = i2;
                                                                                        }
                                                                                        if (i32 == 0) {
                                                                                            i31 = i2;
                                                                                        } else {
                                                                                            i31 = i2;
                                                                                        }
                                                                                    }
                                                                                    if (i31 != 0) {
                                                                                        arrayList30.remove(size);
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        oooO00o2.f11246OooOOO = new DrmInitData(str43, arrayList30);
                                                                    } else {
                                                                        str44 = str38;
                                                                        arrayList11 = arrayList29;
                                                                    }
                                                                    arrayList31 = oooO00o13.f39999OooO0o;
                                                                    arrayList31.addAll(arrayList15);
                                                                    j7 = oooO00o13.f40001OooO0oO;
                                                                    oooOo = new OooOo(oooO00o2);
                                                                    immutableList = oooO00o13.f39996OooO0O0;
                                                                    list = oooO00o13.f40002OooO0oo;
                                                                    list2 = oooO00o13.f39994OooO;
                                                                    o0o0o00 = oooO00o13.f39997OooO0OO;
                                                                    if (o0o0o00 instanceof o0O0O00.OooO) {
                                                                        oooO00o3 = new oo0o0Oo.OooO0O0(j7, oooOo, immutableList, (o0O0O00.OooO) o0o0o00, arrayList31, list, list2);
                                                                    } else {
                                                                        if (!(o0o0o00 instanceof o0O0O00.OooO00o)) {
                                                                            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                        }
                                                                        oooO00o3 = new oo0o0Oo.OooO00o(j7, oooOo, immutableList, (o0O0O00.OooO00o) o0o0o00, arrayList31, list, list2);
                                                                    }
                                                                    arrayList28.add(oooO00o3);
                                                                    i25++;
                                                                    arrayList7 = arrayList72;
                                                                    str38 = str44;
                                                                }
                                                                arrayList3 = arrayList10;
                                                                arrayList3.add(new o00O0O(iOooOO0o, iOooO0oo2, arrayList28, arrayList9, arrayList14, arrayList8));
                                                                xmlPullParser3 = xmlPullParser;
                                                                arrayList5 = arrayList38;
                                                                str4 = str10;
                                                                str5 = str12;
                                                            } else {
                                                                arrayList44 = arrayList15;
                                                                str56 = str39;
                                                                arrayList45 = arrayList9;
                                                                i39 = i5;
                                                                i37 = i4;
                                                                z = z;
                                                                arrayList47 = arrayList14;
                                                                str65 = str14;
                                                                i38 = i6;
                                                                arrayList46 = arrayList12;
                                                                str62 = str38;
                                                                arrayList50 = arrayList13;
                                                                str64 = str17;
                                                                f7 = f;
                                                                arrayList36 = arrayList32;
                                                                arrayList39 = arrayList6;
                                                                str48 = str3;
                                                                str47 = str;
                                                                str61 = str13;
                                                                arrayList48 = arrayList8;
                                                                str60 = str20;
                                                                arrayList40 = arrayList10;
                                                                str52 = str10;
                                                                str58 = str12;
                                                                arrayList49 = arrayList11;
                                                                str57 = str7;
                                                                str53 = str53;
                                                                str55 = str19;
                                                                str59 = str21;
                                                                arrayList42 = arrayList34;
                                                                str66 = str15;
                                                                arrayList43 = arrayList7;
                                                                arrayList41 = arrayList2;
                                                            }
                                                        }
                                                    }
                                                    j17 = j5;
                                                }
                                                str = str47;
                                                arrayList8 = arrayList48;
                                                str10 = str52;
                                                arrayList7 = arrayList43;
                                                str3 = str48;
                                                str53 = str53;
                                                arrayList10 = arrayList40;
                                                str19 = str55;
                                                arrayList2 = arrayList41;
                                                str39 = str56;
                                                str7 = str57;
                                                arrayList34 = arrayList42;
                                                str12 = str58;
                                                str20 = str60;
                                                str21 = str59;
                                                str13 = str61;
                                                arrayList15 = arrayList44;
                                                str38 = str62;
                                                i4 = i37;
                                                f = f7;
                                                arrayList11 = arrayList49;
                                                i5 = i39;
                                                str17 = str64;
                                                i6 = i38;
                                                str14 = str65;
                                                str15 = str66;
                                                i2 = 0;
                                                i3 = 1;
                                                arrayList12 = arrayList46;
                                                arrayList13 = arrayList50;
                                                arrayList9 = arrayList45;
                                                arrayList14 = arrayList47;
                                                arrayList32 = arrayList36;
                                                z = z;
                                                if (o0OoO00O.OooO0O0(xmlPullParser6, str39)) {
                                                    arrayList28 = new ArrayList(arrayList11.size());
                                                    i25 = i2;
                                                    while (i25 < arrayList11.size()) {
                                                        arrayList29 = arrayList11;
                                                        OooO00o oooO00o14 = (OooO00o) arrayList29.get(i25);
                                                        OooOo oooOo12 = oooO00o14.f39995OooO00o;
                                                        oooOo12.getClass();
                                                        oooO00o2 = new OooOo.OooO00o(oooOo12);
                                                        if (str38 != null) {
                                                            oooO00o2.f11236OooO0O0 = str38;
                                                        }
                                                        str43 = oooO00o14.f39998OooO0Oo;
                                                        if (str43 == null) {
                                                            str43 = str68;
                                                        }
                                                        arrayList30 = oooO00o14.f40000OooO0o0;
                                                        ArrayList arrayList73 = arrayList7;
                                                        arrayList30.addAll(arrayList73);
                                                        if (arrayList30.isEmpty()) {
                                                            i26 = i2;
                                                            while (true) {
                                                                if (i26 < arrayList30.size()) {
                                                                    schemeData4 = arrayList30.get(i26);
                                                                    if (C.f10898OooO0OO.equals(schemeData4.f11756OooO0o0)) {
                                                                    }
                                                                    i26++;
                                                                } else {
                                                                    str45 = null;
                                                                }
                                                            }
                                                            if (str45 != null) {
                                                                i27 = i2;
                                                                while (i27 < arrayList30.size()) {
                                                                    schemeData = arrayList30.get(i27);
                                                                    String str105 = str38;
                                                                    if (!C.f10897OooO0O0.equals(schemeData.f11756OooO0o0)) {
                                                                    }
                                                                    i27++;
                                                                    str38 = str105;
                                                                    arrayList29 = arrayList29;
                                                                }
                                                            }
                                                            str44 = str38;
                                                            arrayList11 = arrayList29;
                                                            while (size >= 0) {
                                                                schemeData2 = arrayList30.get(size);
                                                                if (schemeData2.f11758OooO0oo != null) {
                                                                    i28 = i3;
                                                                } else {
                                                                    i28 = i2;
                                                                }
                                                                if (i28 == 0) {
                                                                    while (i29 < arrayList30.size()) {
                                                                        schemeData3 = arrayList30.get(i29);
                                                                        if (schemeData3.f11758OooO0oo != null) {
                                                                            i30 = i3;
                                                                        } else {
                                                                            i30 = i2;
                                                                        }
                                                                        if (i30 == 0) {
                                                                            i31 = i2;
                                                                        } else {
                                                                            if (schemeData2.f11758OooO0oo != null) {
                                                                                i32 = i3;
                                                                            } else {
                                                                                i32 = i2;
                                                                            }
                                                                            if (i32 == 0) {
                                                                                i31 = i2;
                                                                            } else {
                                                                                i31 = i2;
                                                                            }
                                                                        }
                                                                        if (i31 != 0) {
                                                                            arrayList30.remove(size);
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            oooO00o2.f11246OooOOO = new DrmInitData(str43, arrayList30);
                                                        } else {
                                                            str44 = str38;
                                                            arrayList11 = arrayList29;
                                                        }
                                                        arrayList31 = oooO00o14.f39999OooO0o;
                                                        arrayList31.addAll(arrayList15);
                                                        j7 = oooO00o14.f40001OooO0oO;
                                                        oooOo = new OooOo(oooO00o2);
                                                        immutableList = oooO00o14.f39996OooO0O0;
                                                        list = oooO00o14.f40002OooO0oo;
                                                        list2 = oooO00o14.f39994OooO;
                                                        o0o0o00 = oooO00o14.f39997OooO0OO;
                                                        if (o0o0o00 instanceof o0O0O00.OooO) {
                                                            oooO00o3 = new oo0o0Oo.OooO0O0(j7, oooOo, immutableList, (o0O0O00.OooO) o0o0o00, arrayList31, list, list2);
                                                        } else {
                                                            if (!(o0o0o00 instanceof o0O0O00.OooO00o)) {
                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                            }
                                                            oooO00o3 = new oo0o0Oo.OooO00o(j7, oooOo, immutableList, (o0O0O00.OooO00o) o0o0o00, arrayList31, list, list2);
                                                        }
                                                        arrayList28.add(oooO00o3);
                                                        i25++;
                                                        arrayList7 = arrayList73;
                                                        str38 = str44;
                                                    }
                                                    arrayList3 = arrayList10;
                                                    arrayList3.add(new o00O0O(iOooOO0o, iOooO0oo2, arrayList28, arrayList9, arrayList14, arrayList8));
                                                    xmlPullParser3 = xmlPullParser;
                                                    arrayList5 = arrayList38;
                                                    str4 = str10;
                                                    str5 = str12;
                                                } else {
                                                    arrayList44 = arrayList15;
                                                    str56 = str39;
                                                    arrayList45 = arrayList9;
                                                    i39 = i5;
                                                    i37 = i4;
                                                    z = z;
                                                    arrayList47 = arrayList14;
                                                    str65 = str14;
                                                    i38 = i6;
                                                    arrayList46 = arrayList12;
                                                    str62 = str38;
                                                    arrayList50 = arrayList13;
                                                    str64 = str17;
                                                    f7 = f;
                                                    arrayList36 = arrayList32;
                                                    arrayList39 = arrayList6;
                                                    str48 = str3;
                                                    str47 = str;
                                                    str61 = str13;
                                                    arrayList48 = arrayList8;
                                                    str60 = str20;
                                                    arrayList40 = arrayList10;
                                                    str52 = str10;
                                                    str58 = str12;
                                                    arrayList49 = arrayList11;
                                                    str57 = str7;
                                                    str53 = str53;
                                                    str55 = str19;
                                                    str59 = str21;
                                                    arrayList42 = arrayList34;
                                                    str66 = str15;
                                                    arrayList43 = arrayList7;
                                                    arrayList41 = arrayList2;
                                                }
                                            }
                                        } else {
                                            str = str47;
                                            j3 = j10;
                                            String str106 = str52;
                                            String str107 = str54;
                                            arrayList = arrayList33;
                                            arrayList34 = arrayList34;
                                            arrayList2 = arrayList35;
                                            str2 = str51;
                                            str3 = str48;
                                            arrayList39 = arrayList39;
                                            arrayList32 = arrayList36;
                                            String str108 = str53;
                                            arrayList3 = arrayList40;
                                            i2 = 0;
                                            i3 = 1;
                                            z = z;
                                            xmlPullParser3 = xmlPullParser;
                                            if (o0OoO00O.OooO0Oo(xmlPullParser3, "EventStream")) {
                                                str7 = str2;
                                                String attributeValue17 = xmlPullParser3.getAttributeValue(null, str7);
                                                if (attributeValue17 == null) {
                                                    attributeValue17 = "";
                                                }
                                                String str109 = str108;
                                                String attributeValue18 = xmlPullParser3.getAttributeValue(null, str109);
                                                String str110 = attributeValue18 == null ? "" : attributeValue18;
                                                long jOooOOO3 = OooOOO0(xmlPullParser3, "timescale", 1L);
                                                long j19 = 0;
                                                long jOooOOO4 = OooOOO0(xmlPullParser3, "presentationTimeOffset", 0L);
                                                ArrayList arrayList74 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    String str111 = "Event";
                                                    if (o0OoO00O.OooO0Oo(xmlPullParser3, "Event")) {
                                                        String str112 = str106;
                                                        long jOooOOO5 = OooOOO0(xmlPullParser3, str112, j19);
                                                        String str113 = str107;
                                                        long jOooOOO6 = OooOOO0(xmlPullParser3, str113, -9223372036854775807L);
                                                        long jOooOOO7 = OooOOO0(xmlPullParser3, "presentationTime", j19);
                                                        long jOooo0oo = o0O00.Oooo0oo(jOooOOO6, 1000L, jOooOOO3);
                                                        long jOooo0oo2 = o0O00.Oooo0oo(jOooOOO7 - jOooOOO4, AnimationKt.MillisToNanos, jOooOOO3);
                                                        String attributeValue19 = xmlPullParser3.getAttributeValue(null, "messageData");
                                                        if (attributeValue19 == null) {
                                                            attributeValue19 = null;
                                                        }
                                                        byteArrayOutputStream.reset();
                                                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                                        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, OooO.f19059OooO0OO.name());
                                                        xmlPullParser.nextToken();
                                                        while (!o0OoO00O.OooO0O0(xmlPullParser3, str111)) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    str111 = str111;
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    str111 = str111;
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    xmlSerializerNewSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i50 = 0;
                                                                    while (i50 < xmlPullParser.getAttributeCount()) {
                                                                        xmlSerializerNewSerializer.attribute(xmlPullParser3.getAttributeNamespace(i50), xmlPullParser3.getAttributeName(i50), xmlPullParser3.getAttributeValue(i50));
                                                                        i50++;
                                                                        str113 = str113;
                                                                        str109 = str109;
                                                                    }
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                case 3:
                                                                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                case 4:
                                                                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                case 5:
                                                                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                case 6:
                                                                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                case 7:
                                                                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                case 8:
                                                                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                case 9:
                                                                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                case 10:
                                                                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                                default:
                                                                    str8 = str113;
                                                                    str9 = str109;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            str111 = str111;
                                                            str113 = str8;
                                                            str109 = str9;
                                                        }
                                                        String str114 = str113;
                                                        str53 = str109;
                                                        xmlSerializerNewSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long lValueOf = Long.valueOf(jOooo0oo2);
                                                        if (attributeValue19 != null) {
                                                            byteArray = o0O00.OooOoo0(attributeValue19);
                                                        }
                                                        str4 = str112;
                                                        str5 = str114;
                                                        j4 = 0;
                                                        arrayList74.add(Pair.create(lValueOf, new EventMessage(attributeValue17, str110, jOooo0oo, jOooOOO5, byteArray)));
                                                    } else {
                                                        j4 = j19;
                                                        str53 = str109;
                                                        str4 = str106;
                                                        str5 = str107;
                                                        OooO0OO(xmlPullParser);
                                                    }
                                                    if (o0OoO00O.OooO0O0(xmlPullParser3, "EventStream")) {
                                                        long[] jArr = new long[arrayList74.size()];
                                                        EventMessage[] eventMessageArr = new EventMessage[arrayList74.size()];
                                                        for (int i51 = 0; i51 < arrayList74.size(); i51++) {
                                                            Pair pair = (Pair) arrayList74.get(i51);
                                                            jArr[i51] = ((Long) pair.first).longValue();
                                                            eventMessageArr[i51] = (EventMessage) pair.second;
                                                        }
                                                        arrayList5 = arrayList38;
                                                        arrayList5.add(new o0ooOOo(attributeValue17, str110, jArr, eventMessageArr));
                                                    } else {
                                                        str106 = str4;
                                                        str107 = str5;
                                                        byteArrayOutputStream = byteArrayOutputStream;
                                                        j19 = j4;
                                                        str7 = str7;
                                                        str109 = str53;
                                                    }
                                                }
                                            } else {
                                                ArrayList arrayList75 = arrayList38;
                                                str4 = str106;
                                                str5 = str107;
                                                if (o0OoO00O.OooO0Oo(xmlPullParser3, "SegmentBase")) {
                                                    o0o0o00OooOOo = OooOOo(xmlPullParser3, null);
                                                    arrayList4 = arrayList75;
                                                    xmlPullParser5 = xmlPullParser3;
                                                    str2 = str2;
                                                    str6 = str108;
                                                    j = -9223372036854775807L;
                                                } else {
                                                    if (o0OoO00O.OooO0Oo(xmlPullParser3, "SegmentList")) {
                                                        long jOooO0o8 = OooO0o0(xmlPullParser3, -9223372036854775807L);
                                                        str6 = str108;
                                                        o0o0o00OooOo00 = OooOOoo(xmlPullParser, null, j15, jOooOO6, j2, jOooO0o8, jOooOO3);
                                                        j = -9223372036854775807L;
                                                        arrayList4 = arrayList75;
                                                        j16 = jOooO0o8;
                                                    } else {
                                                        str6 = str108;
                                                        if (o0OoO00O.OooO0Oo(xmlPullParser3, str55)) {
                                                            long jOooO0o9 = OooO0o0(xmlPullParser3, -9223372036854775807L);
                                                            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
                                                            j = -9223372036854775807L;
                                                            arrayList4 = arrayList75;
                                                            o0o0o00OooOo00 = OooOo00(xmlPullParser, null, com.google.common.collect.o0O00.f19536OooO0oo, j15, jOooOO6, j2, jOooO0o9, jOooOO3);
                                                            j16 = jOooO0o9;
                                                        } else {
                                                            j = -9223372036854775807L;
                                                            arrayList4 = arrayList75;
                                                            str2 = str2;
                                                            if (o0OoO00O.OooO0Oo(xmlPullParser3, "AssetIdentifier")) {
                                                                OooO(xmlPullParser3, "AssetIdentifier");
                                                            } else {
                                                                OooO0OO(xmlPullParser);
                                                            }
                                                        }
                                                        xmlPullParser5 = xmlPullParser3;
                                                    }
                                                    o0o0o00OooOOo = o0o0o00OooOo00;
                                                    xmlPullParser5 = xmlPullParser3;
                                                }
                                            }
                                        }
                                        arrayList4 = arrayList5;
                                        str2 = str7;
                                        str6 = str53;
                                        j = -9223372036854775807L;
                                        xmlPullParser5 = xmlPullParser3;
                                    }
                                    if (o0OoO00O.OooO0O0(xmlPullParser5, obj)) {
                                        Pair pairCreate2 = Pair.create(new o0OOO0o(attributeValue8, jOooOO5, arrayList3, arrayList4), Long.valueOf(jOooOO6));
                                        o0OOO0o o0ooo0o2 = (o0OOO0o) pairCreate2.first;
                                        if (o0ooo0o2.f39977OooO0O0 != j) {
                                            long jLongValue = ((Long) pairCreate2.second).longValue();
                                            j10 = jLongValue == j ? j : o0ooo0o2.f39977OooO0O0 + jLongValue;
                                            arrayList33 = arrayList;
                                            arrayList33.add(o0ooo0o2);
                                            i33 = i36;
                                        } else {
                                            if (!zEquals) {
                                                throw ParserException.OooO0O0("Unable to determine start of period " + arrayList.size(), null);
                                            }
                                            j10 = j3;
                                            arrayList33 = arrayList;
                                            i33 = i3;
                                        }
                                        i36 = i33;
                                        xmlPullParser4 = xmlPullParser3;
                                        jOooO0o1 = j14;
                                    } else {
                                        obj = obj;
                                        arrayList38 = arrayList4;
                                        arrayList37 = arrayList3;
                                        arrayList34 = arrayList34;
                                        str51 = str2;
                                        str52 = str4;
                                        z = z;
                                        str54 = str5;
                                        arrayList35 = arrayList2;
                                        str53 = str6;
                                        arrayList39 = arrayList39;
                                        jOooO0o2 = j2;
                                        j10 = j3;
                                        arrayList33 = arrayList;
                                        arrayList36 = arrayList32;
                                        str48 = str3;
                                        str47 = str;
                                    }
                                }
                            } else {
                                long j20 = j10;
                                arrayList33 = arrayList33;
                                arrayList34 = arrayList34;
                                z = z;
                                arrayList32 = arrayList32;
                                xmlPullParser3 = xmlPullParser3;
                                i2 = 0;
                                j = -9223372036854775807L;
                                i3 = 1;
                                OooO0OO(xmlPullParser);
                                jOooO0o1 = j14;
                                j10 = j20;
                            }
                        }
                        if (o0OoO00O.OooO0O0(xmlPullParser4, "MPD")) {
                            if (jOooOO0 == j) {
                                if (j10 != j) {
                                    jOooOO0 = j10;
                                } else if (!zEquals) {
                                    throw ParserException.OooO0O0("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList33.isEmpty()) {
                                throw ParserException.OooO0O0("No periods found.", null);
                            }
                            return new o00Ooo(jOooo0o, jOooOO0, jOooOO1, zEquals, jOooOO2, jOooOO3, jOooOO4, jOooo0o2, o0oo0oo2, o00000Var, o000ooo2, uri2, arrayList33);
                        }
                        arrayList33 = arrayList33;
                        j10 = j10;
                        xmlPullParser3 = xmlPullParser3;
                        arrayList34 = arrayList34;
                        z = z;
                        i = i3;
                        arrayList32 = arrayList32;
                        str46 = null;
                    }
                }
            }
            i2 = 0;
            j = -9223372036854775807L;
            i3 = 1;
            if (o0OoO00O.OooO0O0(xmlPullParser4, "MPD")) {
                if (jOooOO0 == j) {
                    if (j10 != j) {
                        jOooOO0 = j10;
                    } else if (!zEquals) {
                        throw ParserException.OooO0O0("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList33.isEmpty()) {
                    return new o00Ooo(jOooo0o, jOooOO0, jOooOO1, zEquals, jOooOO2, jOooOO3, jOooOO4, jOooo0o2, o0oo0oo2, o00000Var, o000ooo2, uri2, arrayList33);
                }
                throw ParserException.OooO0O0("No periods found.", null);
            }
            arrayList33 = arrayList33;
            j10 = j10;
            xmlPullParser3 = xmlPullParser3;
            arrayList34 = arrayList34;
            z = z;
            i = i3;
            arrayList32 = arrayList32;
            str46 = null;
        }
    }

    public static long OooOOO0(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static o0OO00O OooOOOO(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            long j2 = strArrSplit.length == 2 ? (Long.parseLong(strArrSplit[1]) - j) + 1 : -1L;
            return new o0OO00O(j, j2, attributeValue);
        }
        j = 0;
        return new o0OO00O(j, j2, attributeValue);
    }

    public static int OooOOOo(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return ConstantsKt.MINIMUM_BLOCK_SIZE;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public static o0O0O00.OooO OooOOo(XmlPullParser xmlPullParser, @Nullable o0O0O00.OooO oooO) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long jOooOOO0 = OooOOO0(xmlPullParser, "timescale", oooO != null ? oooO.f39956OooO0O0 : 1L);
        long jOooOOO1 = OooOOO0(xmlPullParser, "presentationTimeOffset", oooO != null ? oooO.f39957OooO0OO : 0L);
        long j3 = oooO != null ? oooO.f39958OooO0Oo : 0L;
        long j4 = oooO != null ? oooO.f39959OooO0o0 : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j5 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j5) + 1;
            j2 = j5;
        } else {
            j = j4;
            j2 = j3;
        }
        o0OO00O o0oo00oOooOOOO = oooO != null ? oooO.f39955OooO00o : null;
        do {
            xmlPullParser.next();
            if (o0OoO00O.OooO0Oo(xmlPullParser, "Initialization")) {
                o0oo00oOooOOOO = OooOOOO(xmlPullParser, "sourceURL", "range");
            } else {
                OooO0OO(xmlPullParser);
            }
        } while (!o0OoO00O.OooO0O0(xmlPullParser, "SegmentBase"));
        return new o0O0O00.OooO(o0oo00oOooOOOO, jOooOOO0, jOooOOO1, j2, j);
    }

    public static int OooOOo0(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (OooO0OO.OooO00o("http://dashif.org/guidelines/trickmode", ((o00oO0o) arrayList.get(i2)).f39952OooO00o)) {
                i |= 16384;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b5 A[PHI: r3 r4
      0x00b5: PHI (r3v3 o00oOo0o.o0OO00O) = (r3v2 o00oOo0o.o0OO00O), (r3v5 o00oOo0o.o0OO00O) binds: [B:40:0x00a1, B:47:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r4v9 java.util.List) = (r4v8 java.util.List), (r4v11 java.util.List) binds: [B:40:0x00a1, B:47:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    public static o0O0O00.OooO0O0 OooOOoo(XmlPullParser xmlPullParser, @Nullable o0O0O00.OooO0O0 oooO0O0, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        List<o0OO00O> list;
        long jOooOOO0 = OooOOO0(xmlPullParser, "timescale", oooO0O0 != null ? oooO0O0.f39956OooO0O0 : 1L);
        long jOooOOO1 = OooOOO0(xmlPullParser, "presentationTimeOffset", oooO0O0 != null ? oooO0O0.f39957OooO0OO : 0L);
        long jOooOOO2 = OooOOO0(xmlPullParser, "duration", oooO0O0 != null ? oooO0O0.f39963OooO0o0 : -9223372036854775807L);
        long jOooOOO3 = OooOOO0(xmlPullParser, "startNumber", oooO0O0 != null ? oooO0O0.f39961OooO0Oo : 1L);
        long j6 = j4 == -9223372036854775807L ? j3 : j4;
        long j7 = j6 == LongCompanionObject.MAX_VALUE ? -9223372036854775807L : j6;
        ArrayList arrayList = null;
        o0OO00O o0oo00oOooOOOO = null;
        List listOooOo0 = null;
        do {
            xmlPullParser.next();
            if (o0OoO00O.OooO0Oo(xmlPullParser, "Initialization")) {
                o0oo00oOooOOOO = OooOOOO(xmlPullParser, "sourceURL", "range");
            } else if (o0OoO00O.OooO0Oo(xmlPullParser, "SegmentTimeline")) {
                listOooOo0 = OooOo0(xmlPullParser, jOooOOO0, j2);
            } else if (o0OoO00O.OooO0Oo(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(OooOOOO(xmlPullParser, ShareConstants.WEB_DIALOG_PARAM_MEDIA, "mediaRange"));
            } else {
                OooO0OO(xmlPullParser);
            }
        } while (!o0OoO00O.OooO0O0(xmlPullParser, "SegmentList"));
        if (oooO0O0 == null) {
            list = arrayList;
        } else {
            if (o0oo00oOooOOOO == null) {
                o0oo00oOooOOOO = oooO0O0.f39955OooO00o;
            }
            if (listOooOo0 == null) {
                listOooOo0 = oooO0O0.f39962OooO0o;
            }
            if (arrayList != null) {
                list = arrayList;
            } else {
                list = oooO0O0.f39966OooOO0;
            }
        }
        return new o0O0O00.OooO0O0(o0oo00oOooOOOO, jOooOOO0, jOooOOO1, jOooOOO3, jOooOOO2, listOooOo0, j7, list, o0O00.Oooo0O0(j5), o0O00.Oooo0O0(j));
    }

    public static ArrayList OooOo0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jOooO0O0 = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int iOooOO0o = 0;
        do {
            xmlPullParser.next();
            if (o0OoO00O.OooO0Oo(xmlPullParser, "S")) {
                long jOooOOO0 = OooOOO0(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jOooO0O0 = OooO0O0(arrayList, jOooO0O0, j3, iOooOO0o, jOooOOO0);
                }
                if (jOooOOO0 == -9223372036854775807L) {
                    jOooOOO0 = jOooO0O0;
                }
                long jOooOOO1 = OooOOO0(xmlPullParser, "d", -9223372036854775807L);
                iOooOO0o = OooOO0o(xmlPullParser, "r", 0);
                z = true;
                j3 = jOooOOO1;
                jOooO0O0 = jOooOOO0;
            } else {
                OooO0OO(xmlPullParser);
            }
        } while (!o0OoO00O.OooO0O0(xmlPullParser, "SegmentTimeline"));
        if (z) {
            OooO0O0(arrayList, jOooO0O0, j3, iOooOO0o, o0O00.Oooo0oo(j2, j, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d3 A[PHI: r2
      0x00d3: PHI (r2v12 o00oOo0o.o0OO00O) = (r2v11 o00oOo0o.o0OO00O), (r2v13 o00oOo0o.o0OO00O) binds: [B:51:0x00c3, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    public static o0O0O00.OooO0OO OooOo00(XmlPullParser xmlPullParser, @Nullable o0O0O00.OooO0OO oooO0OO, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        o0OO00O o0oo00o2;
        List<o0O0O00.OooO0o> list2;
        long jOooOOO0 = OooOOO0(xmlPullParser, "timescale", oooO0OO != null ? oooO0OO.f39956OooO0O0 : 1L);
        long jOooOOO1 = OooOOO0(xmlPullParser, "presentationTimeOffset", oooO0OO != null ? oooO0OO.f39957OooO0OO : 0L);
        long jOooOOO2 = OooOOO0(xmlPullParser, "duration", oooO0OO != null ? oooO0OO.f39963OooO0o0 : -9223372036854775807L);
        long jOooOOO3 = OooOOO0(xmlPullParser, "startNumber", oooO0OO != null ? oooO0OO.f39961OooO0Oo : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            o00oO0o o00oo0o2 = (o00oO0o) list.get(i);
            if (OooO0OO.OooO00o("http://dashif.org/guidelines/last-segment-number", o00oo0o2.f39952OooO00o)) {
                j6 = Long.parseLong(o00oo0o2.f39953OooO0O0);
                break;
            }
            i++;
        }
        long j7 = j6;
        long j8 = j4 == -9223372036854775807L ? j3 : j4;
        long j9 = j8 == LongCompanionObject.MAX_VALUE ? -9223372036854775807L : j8;
        o0OO00O o0oo00oOooOOOO = null;
        o000000O o000000oOooOo0O = OooOo0O(xmlPullParser, ShareConstants.WEB_DIALOG_PARAM_MEDIA, oooO0OO != null ? oooO0OO.f39968OooOO0O : null);
        o000000O o000000oOooOo0O2 = OooOo0O(xmlPullParser, "initialization", oooO0OO != null ? oooO0OO.f39967OooOO0 : null);
        ArrayList arrayListOooOo0 = null;
        do {
            xmlPullParser.next();
            if (o0OoO00O.OooO0Oo(xmlPullParser, "Initialization")) {
                o0oo00oOooOOOO = OooOOOO(xmlPullParser, "sourceURL", "range");
            } else if (o0OoO00O.OooO0Oo(xmlPullParser, "SegmentTimeline")) {
                arrayListOooOo0 = OooOo0(xmlPullParser, jOooOOO0, j2);
            } else {
                OooO0OO(xmlPullParser);
            }
        } while (!o0OoO00O.OooO0O0(xmlPullParser, "SegmentTemplate"));
        if (oooO0OO == null) {
            o0oo00o2 = o0oo00oOooOOOO;
            list2 = arrayListOooOo0;
        } else {
            if (o0oo00oOooOOOO == null) {
                o0oo00oOooOOOO = oooO0OO.f39955OooO00o;
            }
            if (arrayListOooOo0 != null) {
                o0oo00o2 = o0oo00oOooOOOO;
                list2 = arrayListOooOo0;
            } else {
                list2 = oooO0OO.f39962OooO0o;
                o0oo00o2 = o0oo00oOooOOOO;
            }
        }
        return new o0O0O00.OooO0OO(o0oo00o2, jOooOOO0, jOooOOO1, jOooOOO3, j7, jOooOOO2, list2, j9, o000000oOooOo0O2, o000000oOooOo0O, o0O00.Oooo0O0(j5), o0O00.Oooo0O0(j));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c6. Please report as an issue. */
    @Nullable
    public static o000000O OooOo0O(XmlPullParser xmlPullParser, String str, @Nullable o000000O o000000o2) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return o000000o2;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i] = strArr[i] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i] = strArr[i] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i] = o0O00o0.OooO0O0(new StringBuilder(), strArr[i], "$");
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i2);
                String strSubstring2 = attributeValue.substring(i2, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i] = 2;
                            break;
                        case "Time":
                            iArr[i] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new o000000O(strArr, iArr, strArr2, i);
    }

    @Override // com.google.android.exoplayer2.upstream.OooOO0.OooO00o
    public final Object OooO00o(Uri uri, o00oOoo o00oooo2) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f39993OooO0Oo.newPullParser();
            xmlPullParserNewPullParser.setInput(o00oooo2, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return OooOOO(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.OooO0O0("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw ParserException.OooO0O0(null, e);
        }
    }
}
