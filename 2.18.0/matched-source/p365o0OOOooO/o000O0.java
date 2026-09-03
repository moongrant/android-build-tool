package p365o0OOOooO;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.facebook.appevents.Oooo0;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.OooO;
import com.google.firebase.crashlytics.internal.model.OooO0O0;
import com.google.firebase.crashlytics.internal.model.OooO0OO;
import com.google.firebase.crashlytics.internal.model.OooO0o;
import com.google.firebase.crashlytics.internal.model.OooOO0O;
import com.google.firebase.crashlytics.internal.model.OooOOO0;
import com.google.firebase.crashlytics.internal.model.OooOOOO;
import com.google.firebase.crashlytics.internal.model.OooOo;
import com.google.firebase.crashlytics.internal.model.Oooo000;
import com.google.firebase.crashlytics.internal.model.o000oOoO;
import com.google.firebase.crashlytics.internal.model.o00O0O;
import com.google.firebase.crashlytics.internal.model.o0OoOo0;
import com.google.firebase.crashlytics.internal.model.o0ooOOo;
import com.google.firebase.crashlytics.internal.model.oo000o;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;
import p016OooOoO0.OooOo00;
import p140o00OOOo0.o000OOo;
import p303o0O0o00.o00O000o;
import p363o0OOOoo.o00oO0o;
import p373o0OOo0Oo.o00Oo0;
import p373o0OOo0Oo.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00Oo0 f38596OooO00o;

    public interface OooO00o<T> {
        T OooO00o(@NonNull JsonReader jsonReader) throws IOException;
    }

    static {
        o00Ooo o00ooo2 = new o00Ooo();
        com.google.firebase.crashlytics.internal.model.OooO00o.f18815OooO00o.OooO00o(o00ooo2);
        o00ooo2.f38691OooO0Oo = true;
        f38596OooO00o = new o00Oo0(o00ooo2);
    }

    public static CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0 OooO00o(JsonReader jsonReader) throws IOException {
        com.google.firebase.crashlytics.internal.model.o00Oo0.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.o00Oo0.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "offset":
                    oooO00o.f19076OooO0Oo = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null symbol");
                    oooO00o.f19074OooO0O0 = strNextString;
                    break;
                case "pc":
                    oooO00o.f19073OooO00o = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    oooO00o.f19075OooO0OO = jsonReader.nextString();
                    break;
                case "importance":
                    oooO00o.f19077OooO0o0 = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }

    public static CrashlyticsReport.OooO0OO OooO0O0(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                Objects.requireNonNull(strNextString, "Null key");
            } else if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                strNextString2 = jsonReader.nextString();
                Objects.requireNonNull(strNextString2, "Null value");
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strOooO00o = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strOooO00o = OooOo00.OooO00o(strOooO00o, " value");
        }
        if (strOooO00o.isEmpty()) {
            return new OooO0o(strNextString, strNextString2);
        }
        throw new IllegalStateException(OooOo00.OooO00o("Missing required properties:", strOooO00o));
    }

    @NonNull
    public static <T> o00oO0o<T> OooO0OO(@NonNull JsonReader jsonReader, @NonNull OooO00o<T> oooO00o) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(oooO00o.OooO00o(jsonReader));
        }
        jsonReader.endArray();
        return new o00oO0o<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:153:0x022e  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:257:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:80:0x011a  */
    @NonNull
    public static CrashlyticsReport.OooO.OooO0o OooO0Oo(@NonNull JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        com.google.firebase.crashlytics.internal.model.OooOo00.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.OooOo00.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "app":
                    b = 1;
                    break;
                case "log":
                    b = 2;
                    break;
                case "type":
                    b = 3;
                    break;
                case "timestamp":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                if (b == 1) {
                    OooOo.OooO0O0 oooO0O0 = new OooOo.OooO0O0();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName2);
                        switch (strNextName2) {
                            case "background":
                                b2 = 0;
                                break;
                            case "execution":
                                b2 = 1;
                                break;
                            case "internalKeys":
                                b2 = 2;
                                break;
                            case "customAttributes":
                                b2 = 3;
                                break;
                            case "uiOrientation":
                                b2 = 4;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            oooO0O0.f19027OooO0Oo = Boolean.valueOf(jsonReader.nextBoolean());
                        } else if (b2 == 1) {
                            jsonReader.beginObject();
                            o00oO0o o00oo0oOooO0OO = null;
                            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O0OooO0o0 = null;
                            CrashlyticsReport.OooO00o OooO00o2 = null;
                            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OOOooO00o = null;
                            o00oO0o o00oo0oOooO0OO2 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName3 = jsonReader.nextName();
                                Objects.requireNonNull(strNextName3);
                                switch (strNextName3) {
                                    case "appExitInfo":
                                        b3 = 0;
                                        break;
                                    case "threads":
                                        b3 = 1;
                                        break;
                                    case "signal":
                                        b3 = 2;
                                        break;
                                    case "binaries":
                                        b3 = 3;
                                        break;
                                    case "exception":
                                        b3 = 4;
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                if (b3 == 0) {
                                    OooO0OO.OooO00o oooO00o2 = new OooO0OO.OooO00o();
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        String strNextName4 = jsonReader.nextName();
                                        Objects.requireNonNull(strNextName4);
                                        switch (strNextName4) {
                                            case "pid":
                                                oooO00o2.f18958OooO00o = Integer.valueOf(jsonReader.nextInt());
                                                break;
                                            case "pss":
                                                oooO00o2.f18963OooO0o0 = Long.valueOf(jsonReader.nextLong());
                                                break;
                                            case "rss":
                                                oooO00o2.f18962OooO0o = Long.valueOf(jsonReader.nextLong());
                                                break;
                                            case "timestamp":
                                                oooO00o2.f18964OooO0oO = Long.valueOf(jsonReader.nextLong());
                                                break;
                                            case "processName":
                                                String strNextString = jsonReader.nextString();
                                                Objects.requireNonNull(strNextString, "Null processName");
                                                oooO00o2.f18959OooO0O0 = strNextString;
                                                break;
                                            case "reasonCode":
                                                oooO00o2.f18960OooO0OO = Integer.valueOf(jsonReader.nextInt());
                                                break;
                                            case "traceFile":
                                                oooO00o2.f18965OooO0oo = jsonReader.nextString();
                                                break;
                                            case "importance":
                                                oooO00o2.f18961OooO0Oo = Integer.valueOf(jsonReader.nextInt());
                                                break;
                                            default:
                                                jsonReader.skipValue();
                                                break;
                                        }
                                    }
                                    jsonReader.endObject();
                                    OooO00o2 = oooO00o2.OooO00o();
                                } else if (b3 == 1) {
                                    o00oo0oOooO0OO = OooO0OO(jsonReader, new OooO00o() { // from class: o0OOOooO.o000O00O
                                        @Override // o0OOOooO.o000O0.OooO00o
                                        public final Object OooO00o(JsonReader jsonReader2) throws IOException {
                                            o00Oo0 o00oo1 = o000O0.f38596OooO00o;
                                            o00O0O.OooO0O0 oooO0O1 = new o00O0O.OooO0O0();
                                            jsonReader2.beginObject();
                                            while (jsonReader2.hasNext()) {
                                                String strNextName5 = jsonReader2.nextName();
                                                Objects.requireNonNull(strNextName5);
                                                switch (strNextName5) {
                                                    case "frames":
                                                        oooO0O1.f19067OooO0OO = o000O0.OooO0OO(jsonReader2, new o000O0.OooO00o() { // from class: o0OOOooO.o000O00
                                                            @Override // o0OOOooO.o000O0.OooO00o
                                                            public final Object OooO00o(JsonReader jsonReader3) {
                                                                return o000O0.OooO00o(jsonReader3);
                                                            }
                                                        });
                                                        break;
                                                    case "name":
                                                        String strNextString2 = jsonReader2.nextString();
                                                        Objects.requireNonNull(strNextString2, "Null name");
                                                        oooO0O1.f19065OooO00o = strNextString2;
                                                        break;
                                                    case "importance":
                                                        oooO0O1.f19066OooO0O0 = Integer.valueOf(jsonReader2.nextInt());
                                                        break;
                                                    default:
                                                        jsonReader2.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader2.endObject();
                                            return oooO0O1.OooO00o();
                                        }
                                    });
                                } else if (b3 == 2) {
                                    o0OoOo0.OooO00o oooO00o3 = new o0OoOo0.OooO00o();
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        String strNextName5 = jsonReader.nextName();
                                        Objects.requireNonNull(strNextName5);
                                        int iHashCode = strNextName5.hashCode();
                                        if (iHashCode != -1147692044) {
                                            if (iHashCode != 3059181) {
                                                if (iHashCode == 3373707 && strNextName5.equals("name")) {
                                                    b4 = 2;
                                                } else {
                                                    b4 = -1;
                                                }
                                            } else if (strNextName5.equals("code")) {
                                                b4 = 1;
                                            } else {
                                                b4 = -1;
                                            }
                                        } else if (strNextName5.equals(IntegrityManager.INTEGRITY_TYPE_ADDRESS)) {
                                            b4 = 0;
                                        } else {
                                            b4 = -1;
                                        }
                                        if (b4 == 0) {
                                            oooO00o3.f19103OooO0OO = Long.valueOf(jsonReader.nextLong());
                                        } else if (b4 == 1) {
                                            String strNextString2 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString2, "Null code");
                                            oooO00o3.f19102OooO0O0 = strNextString2;
                                        } else if (b4 != 2) {
                                            jsonReader.skipValue();
                                        } else {
                                            String strNextString3 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString3, "Null name");
                                            oooO00o3.f19101OooO00o = strNextString3;
                                        }
                                    }
                                    jsonReader.endObject();
                                    oooO0OOOooO00o = oooO00o3.OooO00o();
                                } else if (b3 == 3) {
                                    o00oo0oOooO0OO2 = OooO0OO(jsonReader, o000OOo.f31822Oooo);
                                } else if (b3 != 4) {
                                    jsonReader.skipValue();
                                } else {
                                    abstractC0140OooO0O0OooO0o0 = OooO0o0(jsonReader);
                                }
                            }
                            jsonReader.endObject();
                            String strOooO00o = oooO0OOOooO00o == null ? " signal" : "";
                            if (o00oo0oOooO0OO2 == null) {
                                strOooO00o = OooOo00.OooO00o(strOooO00o, " binaries");
                            }
                            if (!strOooO00o.isEmpty()) {
                                throw new IllegalStateException(OooOo00.OooO00o("Missing required properties:", strOooO00o));
                            }
                            oooO0O0.f19024OooO00o = new Oooo000(o00oo0oOooO0OO, abstractC0140OooO0O0OooO0o0, OooO00o2, oooO0OOOooO00o, o00oo0oOooO0OO2, null);
                        } else if (b2 == 2) {
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(OooO0O0(jsonReader));
                            }
                            jsonReader.endArray();
                            oooO0O0.f19026OooO0OO = new o00oO0o<>(arrayList);
                        } else if (b2 == 3) {
                            ArrayList arrayList2 = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList2.add(OooO0O0(jsonReader));
                            }
                            jsonReader.endArray();
                            oooO0O0.f19025OooO0O0 = new o00oO0o<>(arrayList2);
                        } else if (b2 != 4) {
                            jsonReader.skipValue();
                        } else {
                            oooO0O0.OooO0O0(jsonReader.nextInt());
                        }
                    }
                    jsonReader.endObject();
                    oooO00o.f19036OooO0OO = oooO0O0.OooO00o();
                } else if (b == 2) {
                    jsonReader.beginObject();
                    String strNextString4 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName6);
                        if (strNextName6.equals("content")) {
                            strNextString4 = jsonReader.nextString();
                            Objects.requireNonNull(strNextString4, "Null content");
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = strNextString4 == null ? " content" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException(OooOo00.OooO00o("Missing required properties:", str));
                    }
                    oooO00o.f19038OooO0o0 = new oo000o(strNextString4);
                } else if (b == 3) {
                    oooO00o.OooO0OO(jsonReader.nextString());
                } else if (b != 4) {
                    jsonReader.skipValue();
                } else {
                    oooO00o.OooO0O0(jsonReader.nextLong());
                }
            } else {
                com.google.firebase.crashlytics.internal.model.o00Ooo.OooO00o oooO00o4 = new com.google.firebase.crashlytics.internal.model.o00Ooo.OooO00o();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName7 = jsonReader.nextName();
                    Objects.requireNonNull(strNextName7);
                    switch (strNextName7) {
                        case "batteryLevel":
                            b5 = 0;
                            break;
                        case "batteryVelocity":
                            b5 = 1;
                            break;
                        case "orientation":
                            b5 = 2;
                            break;
                        case "diskUsed":
                            b5 = 3;
                            break;
                        case "ramUsed":
                            b5 = 4;
                            break;
                        case "proximityOn":
                            b5 = 5;
                            break;
                        default:
                            b5 = -1;
                            break;
                    }
                    if (b5 == 0) {
                        oooO00o4.f19084OooO00o = Double.valueOf(jsonReader.nextDouble());
                    } else if (b5 == 1) {
                        oooO00o4.f19085OooO0O0 = Integer.valueOf(jsonReader.nextInt());
                    } else if (b5 == 2) {
                        oooO00o4.f19087OooO0Oo = Integer.valueOf(jsonReader.nextInt());
                    } else if (b5 == 3) {
                        oooO00o4.f19088OooO0o = Long.valueOf(jsonReader.nextLong());
                    } else if (b5 == 4) {
                        oooO00o4.f19089OooO0o0 = Long.valueOf(jsonReader.nextLong());
                    } else if (b5 != 5) {
                        jsonReader.skipValue();
                    } else {
                        oooO00o4.f19086OooO0OO = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                }
                jsonReader.endObject();
                oooO00o.f19037OooO0Oo = oooO00o4.OooO00o();
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:147:0x020d  */
    /* JADX WARN: Code duplicated, block: B:200:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:261:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    @NonNull
    public static CrashlyticsReport OooO0o(@NonNull JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        byte b3;
        String strOooO00o;
        byte b4;
        Charset charset = CrashlyticsReport.f18812OooO00o;
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "ndkPayload":
                    b = 0;
                    break;
                case "sdkVersion":
                    b = 1;
                    break;
                case "buildVersion":
                    b = 2;
                    break;
                case "gmpAppId":
                    b = 3;
                    break;
                case "installationUuid":
                    b = 4;
                    break;
                case "platform":
                    b = 5;
                    break;
                case "displayVersion":
                    b = 6;
                    break;
                case "session":
                    b = 7;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    jsonReader.beginObject();
                    o00oO0o o00oo0oOooO0OO = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName2);
                        if (strNextName2.equals("files")) {
                            o00oo0oOooO0OO = OooO0OO(jsonReader, o00O000o.f36104Oooo);
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = o00oo0oOooO0OO == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException(OooOo00.OooO00o("Missing required properties:", str));
                    }
                    oooO00o.f18949OooO0oo = new OooO(o00oo0oOooO0OO, strNextString, null);
                    break;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString2, "Null sdkVersion");
                    oooO00o.f18942OooO00o = strNextString2;
                    break;
                case 2:
                    String strNextString3 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString3, "Null buildVersion");
                    oooO00o.f18947OooO0o0 = strNextString3;
                    break;
                case 3:
                    String strNextString4 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString4, "Null gmpAppId");
                    oooO00o.f18943OooO0O0 = strNextString4;
                    break;
                case 4:
                    String strNextString5 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString5, "Null installationUuid");
                    oooO00o.f18945OooO0Oo = strNextString5;
                    break;
                case 5:
                    oooO00o.f18944OooO0OO = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 6:
                    String strNextString6 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString6, "Null displayVersion");
                    oooO00o.f18946OooO0o = strNextString6;
                    break;
                case 7:
                    OooOO0O.OooO0O0 oooO0O0 = new OooOO0O.OooO0O0();
                    oooO0O0.OooO0O0(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName3);
                        switch (strNextName3) {
                            case "startedAt":
                                b2 = 0;
                                break;
                            case "identifier":
                                b2 = 1;
                                break;
                            case "endedAt":
                                b2 = 2;
                                break;
                            case "device":
                                b2 = 3;
                                break;
                            case "events":
                                b2 = 4;
                                break;
                            case "os":
                                b2 = 5;
                                break;
                            case "app":
                                b2 = 6;
                                break;
                            case "user":
                                b2 = 7;
                                break;
                            case "generator":
                                b2 = 8;
                                break;
                            case "crashed":
                                b2 = 9;
                                break;
                            case "generatorType":
                                b2 = 10;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                                oooO0O0.f18986OooO0OO = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                oooO0O0.f18985OooO0O0 = new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f18812OooO00o);
                                break;
                            case 2:
                                oooO0O0.f18987OooO0Oo = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 3:
                                OooOOOO.OooO00o oooO00o2 = new OooOOOO.OooO00o();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName4);
                                    switch (strNextName4) {
                                        case "simulator":
                                            oooO00o2.f19015OooO0o = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString7, "Null manufacturer");
                                            oooO00o2.f19018OooO0oo = strNextString7;
                                            break;
                                        case "ram":
                                            oooO00o2.f19014OooO0Oo = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            oooO00o2.f19011OooO00o = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            oooO00o2.f19016OooO0o0 = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            oooO00o2.f19013OooO0OO = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString8, "Null model");
                                            oooO00o2.f19012OooO0O0 = strNextString8;
                                            break;
                                        case "state":
                                            oooO00o2.f19017OooO0oO = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString9, "Null modelClass");
                                            oooO00o2.f19010OooO = strNextString9;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                oooO0O0.f18983OooO = oooO00o2.OooO00o();
                                break;
                            case 4:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(OooO0Oo(jsonReader));
                                }
                                jsonReader.endArray();
                                oooO0O0.f18992OooOO0 = new o00oO0o<>(arrayList);
                                break;
                            case 5:
                                com.google.firebase.crashlytics.internal.model.o00oO0o.OooO00o oooO00o3 = new com.google.firebase.crashlytics.internal.model.o00oO0o.OooO00o();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName5);
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            b3 = 0;
                                            break;
                                        case "jailbroken":
                                            b3 = 1;
                                            break;
                                        case "version":
                                            b3 = 2;
                                            break;
                                        case "platform":
                                            b3 = 3;
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    if (b3 == 0) {
                                        String strNextString10 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString10, "Null buildVersion");
                                        oooO00o3.f19096OooO0OO = strNextString10;
                                    } else if (b3 == 1) {
                                        oooO00o3.f19097OooO0Oo = Boolean.valueOf(jsonReader.nextBoolean());
                                    } else if (b3 == 2) {
                                        String strNextString11 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString11, "Null version");
                                        oooO00o3.f19095OooO0O0 = strNextString11;
                                    } else if (b3 != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        oooO00o3.f19094OooO00o = Integer.valueOf(jsonReader.nextInt());
                                    }
                                }
                                jsonReader.endObject();
                                oooO0O0.f18991OooO0oo = oooO00o3.OooO00o();
                                break;
                            case 6:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName6);
                                    switch (strNextName6) {
                                        case "identifier":
                                            b4 = 0;
                                            break;
                                        case "developmentPlatform":
                                            b4 = 1;
                                            break;
                                        case "developmentPlatformVersion":
                                            b4 = 2;
                                            break;
                                        case "version":
                                            b4 = 3;
                                            break;
                                        case "installationUuid":
                                            b4 = 4;
                                            break;
                                        case "displayVersion":
                                            b4 = 5;
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    if (b4 == 0) {
                                        String strNextString16 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString16, "Null identifier");
                                        str2 = strNextString16;
                                    } else if (b4 == 1) {
                                        strNextString14 = jsonReader.nextString();
                                    } else if (b4 == 2) {
                                        strNextString15 = jsonReader.nextString();
                                    } else if (b4 == 3) {
                                        String strNextString17 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString17, "Null version");
                                        str3 = strNextString17;
                                    } else if (b4 == 4) {
                                        strNextString13 = jsonReader.nextString();
                                    } else if (b4 != 5) {
                                        jsonReader.skipValue();
                                    } else {
                                        strNextString12 = jsonReader.nextString();
                                    }
                                }
                                jsonReader.endObject();
                                strOooO00o = str2 != null ? "" : " identifier";
                                if (str3 == null) {
                                    strOooO00o = OooOo00.OooO00o(strOooO00o, " version");
                                }
                                if (!strOooO00o.isEmpty()) {
                                    throw new IllegalStateException(OooOo00.OooO00o("Missing required properties:", strOooO00o));
                                }
                                oooO0O0.f18988OooO0o = new OooOOO0(str2, str3, strNextString12, strNextString13, strNextString14, strNextString15);
                                break;
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName7);
                                    if (strNextName7.equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString18, "Null identifier");
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                strOooO00o = strNextString18 != null ? "" : " identifier";
                                if (!strOooO00o.isEmpty()) {
                                    throw new IllegalStateException(OooOo00.OooO00o("Missing required properties:", strOooO00o));
                                }
                                oooO0O0.f18990OooO0oO = new o0ooOOo(strNextString18);
                                break;
                                break;
                            case 8:
                                String strNextString19 = jsonReader.nextString();
                                Objects.requireNonNull(strNextString19, "Null generator");
                                oooO0O0.f18984OooO00o = strNextString19;
                                break;
                            case 9:
                                oooO0O0.OooO0O0(jsonReader.nextBoolean());
                                break;
                            case 10:
                                oooO0O0.f18993OooOO0O = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    oooO00o.f18948OooO0oO = oooO0O0.OooO00o();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }

    @NonNull
    public static CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 OooO0o0(@NonNull JsonReader jsonReader) throws IOException {
        o000oOoO.OooO0O0 oooO0O0 = new o000oOoO.OooO0O0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "frames":
                    oooO0O0.f19059OooO0OO = OooO0OO(jsonReader, Oooo0.f12747OoooO00);
                    break;
                case "reason":
                    oooO0O0.f19058OooO0O0 = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null type");
                    oooO0O0.f19057OooO00o = strNextString;
                    break;
                case "causedBy":
                    oooO0O0.f19060OooO0Oo = OooO0o0(jsonReader);
                    break;
                case "overflowCount":
                    oooO0O0.f19061OooO0o0 = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oooO0O0.OooO00o();
    }

    @NonNull
    public final CrashlyticsReport OooO0oO(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport crashlyticsReportOooO0o = OooO0o(jsonReader);
                jsonReader.close();
                return crashlyticsReportOooO0o;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @NonNull
    public final String OooO0oo(@NonNull CrashlyticsReport crashlyticsReport) {
        o00Oo0 o00oo1 = f38596OooO00o;
        Objects.requireNonNull(o00oo1);
        StringWriter stringWriter = new StringWriter();
        try {
            o00oo1.OooO00o(crashlyticsReport, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
