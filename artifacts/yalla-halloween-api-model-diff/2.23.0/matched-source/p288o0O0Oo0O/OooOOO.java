package p288o0O0Oo0O;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.OooOOOO;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.OooO;
import com.google.firebase.crashlytics.internal.model.OooO0O0;
import com.google.firebase.crashlytics.internal.model.OooO0OO;
import com.google.firebase.crashlytics.internal.model.OooOOO0;
import com.google.firebase.crashlytics.internal.model.OooOo;
import com.google.firebase.crashlytics.internal.model.OooOo00;
import com.google.firebase.crashlytics.internal.model.Oooo0;
import com.google.firebase.crashlytics.internal.model.Oooo000;
import com.google.firebase.crashlytics.internal.model.o00O0O;
import com.google.firebase.crashlytics.internal.model.o00Ooo;
import com.google.firebase.crashlytics.internal.model.o00oO0o;
import com.google.firebase.crashlytics.internal.model.o0OOO0o;
import com.google.firebase.crashlytics.internal.model.o0OoOo0;
import com.google.firebase.crashlytics.internal.model.o0ooOOo;
import com.google.firebase.crashlytics.internal.model.oo000o;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p221o00oOOOo.o00O00O;
import p245o00oo0o.o00O0O0O;
import p246o00oo0o0.o000O0;
import p287o0O0Oo0.OooOO0;
import p295o0O0OooO.o00O0;
import p295o0O0OooO.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final oo00o f42269OooO00o;

    public interface OooO00o<T> {
        T OooO0O0(@NonNull JsonReader jsonReader) throws IOException;
    }

    static {
        o00O0 o00o1 = new o00O0();
        com.google.firebase.crashlytics.internal.model.OooO00o.f19861OooO00o.OooO00o(o00o1);
        o00o1.f42317OooO0Oo = true;
        f42269OooO00o = new oo00o(o00o1);
    }

    public static o00Ooo OooO00o(JsonReader jsonReader) throws IOException {
        o00Ooo.OooO00o oooO00o = new o00Ooo.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    oooO00o.f20123OooO0Oo = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    oooO00o.f20121OooO0O0 = strNextString;
                    break;
                    break;
                case "pc":
                    oooO00o.f20120OooO00o = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    oooO00o.f20122OooO0OO = jsonReader.nextString();
                    break;
                case "importance":
                    oooO00o.f20124OooO0o0 = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }

    public static OooO OooO0O0(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" value");
        }
        if (strConcat.isEmpty()) {
            return new OooO(strNextString, strNextString2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @NonNull
    public static OooO0OO OooO0OO(@NonNull JsonReader jsonReader) throws IOException {
        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    oooO00o.f20013OooO = OooO0Oo(jsonReader, new o00O0O0O());
                    break;
                case "pid":
                    oooO00o.f20014OooO00o = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    oooO00o.f20019OooO0o0 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    oooO00o.f20018OooO0o = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    oooO00o.f20020OooO0oO = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    oooO00o.f20015OooO0O0 = strNextString;
                    break;
                    break;
                case "reasonCode":
                    oooO00o.f20016OooO0OO = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    oooO00o.f20021OooO0oo = jsonReader.nextString();
                    break;
                case "importance":
                    oooO00o.f20017OooO0Oo = Integer.valueOf(jsonReader.nextInt());
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
    public static <T> OooOO0<T> OooO0Oo(@NonNull JsonReader jsonReader, @NonNull OooO00o<T> oooO00o) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(oooO00o.OooO0O0(jsonReader));
        }
        jsonReader.endArray();
        return new OooOO0<>(arrayList);
    }

    @NonNull
    public static o0OoOo0 OooO0o(@NonNull JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String strNextString = null;
        String strNextString2 = null;
        OooOO0 oooOO1 = null;
        o0OoOo0 o0oooo0OooO0o = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(OooO00o(jsonReader));
                    }
                    jsonReader.endArray();
                    oooOO1 = new OooOO0(arrayList);
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    break;
                    break;
                case "causedBy":
                    o0oooo0OooO0o = OooO0o(jsonReader);
                    break;
                case "overflowCount":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strOooO00o = strNextString == null ? " type" : "";
        if (oooOO1 == null) {
            strOooO00o = strOooO00o.concat(" frames");
        }
        if (numValueOf == null) {
            strOooO00o = OooOOOO.OooO00o(strOooO00o, " overflowCount");
        }
        if (strOooO00o.isEmpty()) {
            return new o0OoOo0(strNextString, strNextString2, oooOO1, o0oooo0OooO0o, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x021c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0366  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:83:0x011e  */
    @NonNull
    public static OooOo OooO0o0(@NonNull JsonReader jsonReader) throws IOException {
        byte b;
        String str;
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
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
            String str2 = "";
            switch (b) {
                case 0:
                    oo000o.OooO00o oooO00o2 = new oo000o.OooO00o();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                oooO00o2.f20146OooO00o = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                oooO00o2.f20147OooO0O0 = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "orientation":
                                oooO00o2.f20149OooO0Oo = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                oooO00o2.f20150OooO0o = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                oooO00o2.f20151OooO0o0 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                oooO00o2.f20148OooO0OO = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    oooO00o.f20066OooO0Oo = oooO00o2.OooO00o();
                    break;
                case 1:
                    jsonReader.beginObject();
                    Integer numValueOf = null;
                    Oooo0 oooo0 = null;
                    OooOO0 oooOO1 = null;
                    OooOO0 oooOO2 = null;
                    Boolean boolValueOf = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "background":
                                str = str2;
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                str2 = str;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                OooOO0 oooOO0OooO0Oo = null;
                                o0OoOo0 o0oooo0OooO0o = null;
                                OooO0OO OooO0OO2 = null;
                                o00O0O o00o0o2 = null;
                                OooOO0 oooOO0OooO0Oo2 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "appExitInfo":
                                            OooO0OO2 = OooO0OO(jsonReader);
                                            break;
                                        case "threads":
                                            oooOO0OooO0Oo = OooO0Oo(jsonReader, new OooOO0());
                                            str2 = str2;
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            String strNextString = null;
                                            String strNextString2 = null;
                                            Long lValueOf = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName5 = jsonReader.nextName();
                                                strNextName5.getClass();
                                                switch (strNextName5) {
                                                    case "address":
                                                        lValueOf = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            String strOooO00o = strNextString == null ? " name" : str2;
                                            if (strNextString2 == null) {
                                                strOooO00o = strOooO00o.concat(" code");
                                            }
                                            if (lValueOf == null) {
                                                strOooO00o = OooOOOO.OooO00o(strOooO00o, " address");
                                            }
                                            if (!strOooO00o.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
                                            }
                                            o00o0o2 = new o00O0O(strNextString, strNextString2, lValueOf.longValue());
                                            str2 = str2;
                                            break;
                                            break;
                                        case "binaries":
                                            oooOO0OooO0Oo2 = OooO0Oo(jsonReader, new o00O00O());
                                            break;
                                        case "exception":
                                            o0oooo0OooO0o = OooO0o(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                str = str2;
                                jsonReader.endObject();
                                String strConcat = o00o0o2 == null ? " signal" : str;
                                if (oooOO0OooO0Oo2 == null) {
                                    strConcat = strConcat.concat(" binaries");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                oooo0 = new Oooo0(oooOO0OooO0Oo, o0oooo0OooO0o, OooO0OO2, o00o0o2, oooOO0OooO0Oo2);
                                str2 = str;
                                break;
                                break;
                            case "internalKeys":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(OooO0O0(jsonReader));
                                }
                                jsonReader.endArray();
                                oooOO2 = new OooOO0(arrayList);
                                break;
                            case "customAttributes":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(OooO0O0(jsonReader));
                                }
                                jsonReader.endArray();
                                oooOO1 = new OooOO0(arrayList2);
                                break;
                            case "uiOrientation":
                                numValueOf = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    String str3 = str2;
                    jsonReader.endObject();
                    String strConcat2 = oooo0 == null ? " execution" : str3;
                    if (numValueOf == null) {
                        strConcat2 = strConcat2.concat(" uiOrientation");
                    }
                    if (!strConcat2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat2));
                    }
                    oooO00o.f20065OooO0OO = new Oooo000(oooo0, oooOO1, oooOO2, boolValueOf, numValueOf.intValue());
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        strNextName6.getClass();
                        if (strNextName6.equals("content")) {
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str2 = strNextString3 == null ? " content" : "";
                    if (!str2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                    oooO00o.f20067OooO0o0 = new o00oO0o(strNextString3);
                    break;
                    break;
                case 3:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null type");
                    }
                    oooO00o.f20064OooO0O0 = strNextString4;
                    break;
                    break;
                case 4:
                    oooO00o.f20063OooO00o = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:233:0x0357  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0144  */
    @NonNull
    public static OooO0O0 OooO0oO(@NonNull JsonReader jsonReader) throws IOException {
        byte b;
        Charset charset = CrashlyticsReport.f19858OooO00o;
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    b = 0;
                    break;
                case "sdkVersion":
                    b = 1;
                    break;
                case "appExitInfo":
                    b = 2;
                    break;
                case "buildVersion":
                    b = 3;
                    break;
                case "gmpAppId":
                    b = 4;
                    break;
                case "installationUuid":
                    b = 5;
                    break;
                case "platform":
                    b = 6;
                    break;
                case "displayVersion":
                    b = 7;
                    break;
                case "session":
                    b = 8;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    jsonReader.beginObject();
                    OooOO0 oooOO0OooO0Oo = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            oooOO0OooO0Oo = OooO0Oo(jsonReader, new o000O0());
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = oooOO0OooO0Oo == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    oooO00o.f20003OooO0oo = new com.google.firebase.crashlytics.internal.model.OooOO0(oooOO0OooO0Oo, strNextString);
                    continue;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    oooO00o.f19996OooO00o = strNextString2;
                    break;
                    break;
                case 2:
                    oooO00o.f19995OooO = OooO0OO(jsonReader);
                    break;
                case 3:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    oooO00o.f20001OooO0o0 = strNextString3;
                    break;
                    break;
                case 4:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    oooO00o.f19997OooO0O0 = strNextString4;
                    break;
                    break;
                case 5:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    oooO00o.f19999OooO0Oo = strNextString5;
                    break;
                    break;
                case 6:
                    oooO00o.f19998OooO0OO = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    oooO00o.f20000OooO0o = strNextString6;
                    break;
                    break;
                case 8:
                    OooOOO0.OooO00o oooO00o2 = new OooOOO0.OooO00o();
                    oooO00o2.f20053OooO0o0 = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                oooO00o2.f20050OooO0OO = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "identifier":
                                oooO00o2.f20049OooO0O0 = new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f19858OooO00o);
                                break;
                            case "endedAt":
                                oooO00o2.f20051OooO0Oo = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                OooOo00.OooO00o oooO00o3 = new OooOo00.OooO00o();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            oooO00o3.f20082OooO0o = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            oooO00o3.f20085OooO0oo = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            oooO00o3.f20081OooO0Oo = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            oooO00o3.f20078OooO00o = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            oooO00o3.f20083OooO0o0 = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            oooO00o3.f20080OooO0OO = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            oooO00o3.f20079OooO0O0 = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            oooO00o3.f20084OooO0oO = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            oooO00o3.f20077OooO = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                oooO00o2.f20047OooO = oooO00o3.OooO00o();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(OooO0o0(jsonReader));
                                }
                                jsonReader.endArray();
                                oooO00o2.f20056OooOO0 = new OooOO0<>(arrayList);
                                break;
                            case "os":
                                o0ooOOo.OooO00o oooO00o4 = new o0ooOOo.OooO00o();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            oooO00o4.f20138OooO0OO = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            oooO00o4.f20139OooO0Oo = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            oooO00o4.f20137OooO0O0 = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            oooO00o4.f20136OooO00o = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                oooO00o2.f20055OooO0oo = oooO00o4.OooO00o();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString13 = jsonReader.nextString();
                                            if (strNextString13 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat = strNextString12 == null ? " identifier" : "";
                                if (strNextString13 == null) {
                                    strConcat = strConcat.concat(" version");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                oooO00o2.f20052OooO0o = new com.google.firebase.crashlytics.internal.model.OooOOO(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                break;
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    strNextName7.getClass();
                                    if (strNextName7.equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str2 = strNextString18 == null ? " identifier" : "";
                                if (!str2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                                oooO00o2.f20054OooO0oO = new o0OOO0o(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                oooO00o2.f20048OooO00o = strNextString19;
                                break;
                                break;
                            case "crashed":
                                oooO00o2.f20053OooO0o0 = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                oooO00o2.f20057OooOO0O = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    oooO00o.f20002OooO0oO = oooO00o2.OooO00o();
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }

    @NonNull
    public static OooO0O0 OooO0oo(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                OooO0O0 oooO0O0OooO0oO = OooO0oO(jsonReader);
                jsonReader.close();
                return oooO0O0OooO0oO;
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
}
