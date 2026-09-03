package p288o0O0Oo;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.OooOOOO;
import androidx.media3.session.OooO0o;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.OooO;
import com.google.firebase.crashlytics.internal.model.OooO0OO;
import com.google.firebase.crashlytics.internal.model.OooOO0;
import com.google.firebase.crashlytics.internal.model.OooOOO;
import com.google.firebase.crashlytics.internal.model.OooOOO0;
import com.google.firebase.crashlytics.internal.model.OooOo;
import com.google.firebase.crashlytics.internal.model.OooOo00;
import com.google.firebase.crashlytics.internal.model.Oooo0;
import com.google.firebase.crashlytics.internal.model.Oooo000;
import com.google.firebase.crashlytics.internal.model.o00Ooo;
import com.google.firebase.crashlytics.internal.model.o0OOO0o;
import com.google.firebase.crashlytics.internal.model.o0OoOo0;
import com.google.firebase.crashlytics.internal.model.o0ooOOo;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p291o0O0Oo0o.o00O0O;
import p299o0O0o00.o00oO0o;
import p299o0O0o00.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final oo000o f41451OooO00o;

    public interface OooO00o<T> {
        T OooO0O0(@NonNull JsonReader jsonReader) throws IOException;
    }

    static {
        o00oO0o o00oo0o2 = new o00oO0o();
        com.google.firebase.crashlytics.internal.model.OooO00o.f19389OooO00o.OooO00o(o00oo0o2);
        o00oo0o2.f41723OooO0Oo = true;
        f41451OooO00o = new oo000o(o00oo0o2);
    }

    public static o00Ooo OooO00o(JsonReader jsonReader) throws IOException {
        o00Ooo.OooO00o oooO00o = new o00Ooo.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    oooO00o.f19651OooO0Oo = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    oooO00o.f19649OooO0O0 = strNextString;
                    break;
                    break;
                case "pc":
                    oooO00o.f19648OooO00o = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    oooO00o.f19650OooO0OO = jsonReader.nextString();
                    break;
                case "importance":
                    oooO00o.f19652OooO0o0 = Integer.valueOf(jsonReader.nextInt());
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
            int i = 2;
            switch (strNextName) {
                case "buildIdMappingForArch":
                    oooO00o.f19541OooO = OooO0Oo(jsonReader, new androidx.media3.session.OooO00o(i));
                    break;
                case "pid":
                    oooO00o.f19542OooO00o = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    oooO00o.f19547OooO0o0 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    oooO00o.f19546OooO0o = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    oooO00o.f19548OooO0oO = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    oooO00o.f19543OooO0O0 = strNextString;
                    break;
                    break;
                case "reasonCode":
                    oooO00o.f19544OooO0OO = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    oooO00o.f19549OooO0oo = jsonReader.nextString();
                    break;
                case "importance":
                    oooO00o.f19545OooO0Oo = Integer.valueOf(jsonReader.nextInt());
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
    public static <T> o00O0O<T> OooO0Oo(@NonNull JsonReader jsonReader, @NonNull OooO00o<T> oooO00o) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(oooO00o.OooO0O0(jsonReader));
        }
        jsonReader.endArray();
        return new o00O0O<>(arrayList);
    }

    @NonNull
    public static o0OoOo0 OooO0o(@NonNull JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String strNextString = null;
        String strNextString2 = null;
        o00O0O o00o0o2 = null;
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
                    o00o0o2 = new o00O0O(arrayList);
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
        if (o00o0o2 == null) {
            strOooO00o = strOooO00o.concat(" frames");
        }
        if (numValueOf == null) {
            strOooO00o = OooOOOO.OooO00o(strOooO00o, " overflowCount");
        }
        if (strOooO00o.isEmpty()) {
            return new o0OoOo0(strNextString, strNextString2, o00o0o2, o0oooo0OooO0o, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x0221  */
    /* JADX WARN: Code duplicated, block: B:231:0x036b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NonNull
    public static OooOo OooO0o0(@NonNull JsonReader jsonReader) throws IOException {
        byte b;
        int i;
        String str;
        int i2;
        int i3;
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i4 = 2;
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
                    com.google.firebase.crashlytics.internal.model.oo000o.OooO00o oooO00o2 = new com.google.firebase.crashlytics.internal.model.oo000o.OooO00o();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                oooO00o2.f19674OooO00o = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                oooO00o2.f19675OooO0O0 = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "orientation":
                                oooO00o2.f19677OooO0Oo = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                oooO00o2.f19678OooO0o = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                oooO00o2.f19679OooO0o0 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                oooO00o2.f19676OooO0OO = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    oooO00o.f19594OooO0Oo = oooO00o2.OooO00o();
                    break;
                case 1:
                    jsonReader.beginObject();
                    Integer numValueOf = null;
                    Oooo0 oooo0 = null;
                    o00O0O o00o0o2 = null;
                    o00O0O o00o0o3 = null;
                    Boolean boolValueOf = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3.hashCode()) {
                            case -1332194002:
                                if (!strNextName3.equals("background")) {
                                    i = -1;
                                } else {
                                    i = 0;
                                }
                                break;
                            case -1090974952:
                                if (!strNextName3.equals("execution")) {
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                break;
                            case -80231855:
                                if (!strNextName3.equals("internalKeys")) {
                                    i = -1;
                                } else {
                                    i = i4;
                                }
                                break;
                            case 555169704:
                                if (!strNextName3.equals("customAttributes")) {
                                    i = -1;
                                } else {
                                    i = 3;
                                }
                                break;
                            case 928737948:
                                if (!strNextName3.equals("uiOrientation")) {
                                    i = -1;
                                } else {
                                    i = 4;
                                }
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        switch (i) {
                            case 0:
                                str = str2;
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                i4 = 2;
                                str2 = str;
                                break;
                            case 1:
                                jsonReader.beginObject();
                                o00O0O o00o0oOooO0Oo = null;
                                o0OoOo0 o0oooo0OooO0o = null;
                                OooO0OO OooO0OO2 = null;
                                com.google.firebase.crashlytics.internal.model.o00O0O o00o0o4 = null;
                                o00O0O o00o0oOooO0Oo2 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4.hashCode()) {
                                        case -1375141843:
                                            if (!strNextName4.equals("appExitInfo")) {
                                                i2 = -1;
                                            } else {
                                                i2 = 0;
                                            }
                                            break;
                                        case -1337936983:
                                            if (!strNextName4.equals("threads")) {
                                                i2 = -1;
                                            } else {
                                                i2 = 1;
                                            }
                                            break;
                                        case -902467928:
                                            if (!strNextName4.equals("signal")) {
                                                i2 = -1;
                                            } else {
                                                i2 = i4;
                                            }
                                            break;
                                        case 937615455:
                                            if (!strNextName4.equals("binaries")) {
                                                i2 = -1;
                                            } else {
                                                i2 = 3;
                                            }
                                            break;
                                        case 1481625679:
                                            if (!strNextName4.equals("exception")) {
                                                i2 = -1;
                                            } else {
                                                i2 = 4;
                                            }
                                            break;
                                        default:
                                            i2 = -1;
                                            break;
                                    }
                                    switch (i2) {
                                        case 0:
                                            OooO0OO2 = OooO0OO(jsonReader);
                                            i4 = 2;
                                            str2 = str2;
                                            break;
                                        case 1:
                                            o00o0oOooO0Oo = OooO0Oo(jsonReader, new androidx.compose.foundation.layout.o00oO0o());
                                            i4 = 2;
                                            str2 = str2;
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            String strNextString = null;
                                            String strNextString2 = null;
                                            Long lValueOf = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName5 = jsonReader.nextName();
                                                strNextName5.getClass();
                                                int i5 = i4;
                                                switch (strNextName5.hashCode()) {
                                                    case -1147692044:
                                                        if (!strNextName5.equals(IntegrityManager.INTEGRITY_TYPE_ADDRESS)) {
                                                            i3 = -1;
                                                        } else {
                                                            i3 = 0;
                                                        }
                                                        break;
                                                    case 3059181:
                                                        if (!strNextName5.equals("code")) {
                                                            i3 = -1;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                        break;
                                                    case 3373707:
                                                        if (!strNextName5.equals("name")) {
                                                            i3 = -1;
                                                        } else {
                                                            i3 = i5;
                                                        }
                                                        break;
                                                    default:
                                                        i3 = -1;
                                                        break;
                                                }
                                                switch (i3) {
                                                    case 0:
                                                        lValueOf = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case 1:
                                                        strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                        break;
                                                    case 2:
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
                                                i4 = i5;
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
                                            o00o0o4 = new com.google.firebase.crashlytics.internal.model.o00O0O(strNextString, strNextString2, lValueOf.longValue());
                                            i4 = 2;
                                            str2 = str2;
                                            break;
                                            break;
                                        case 3:
                                            o00o0oOooO0Oo2 = OooO0Oo(jsonReader, new OooO0o(i4));
                                            break;
                                        case 4:
                                            o0oooo0OooO0o = OooO0o(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                str = str2;
                                jsonReader.endObject();
                                String strConcat = o00o0o4 == null ? " signal" : str;
                                if (o00o0oOooO0Oo2 == null) {
                                    strConcat = strConcat.concat(" binaries");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                oooo0 = new Oooo0(o00o0oOooO0Oo, o0oooo0OooO0o, OooO0OO2, o00o0o4, o00o0oOooO0Oo2);
                                i4 = 2;
                                str2 = str;
                                break;
                                break;
                            case 2:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(OooO0O0(jsonReader));
                                }
                                jsonReader.endArray();
                                o00o0o3 = new o00O0O(arrayList);
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(OooO0O0(jsonReader));
                                }
                                jsonReader.endArray();
                                o00o0o2 = new o00O0O(arrayList2);
                                break;
                            case 4:
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
                    oooO00o.f19593OooO0OO = new Oooo000(oooo0, o00o0o2, o00o0o3, boolValueOf, numValueOf.intValue());
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
                    oooO00o.f19595OooO0o0 = new com.google.firebase.crashlytics.internal.model.o00oO0o(strNextString3);
                    break;
                    break;
                case 3:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null type");
                    }
                    oooO00o.f19592OooO0O0 = strNextString4;
                    break;
                    break;
                case 4:
                    oooO00o.f19591OooO00o = Long.valueOf(jsonReader.nextLong());
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
    public static com.google.firebase.crashlytics.internal.model.OooO0O0 OooO0oO(@NonNull JsonReader jsonReader) throws IOException {
        byte b;
        Charset charset = CrashlyticsReport.f19386OooO00o;
        com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o();
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
                    o00O0O o00o0oOooO0Oo = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            o00o0oOooO0Oo = OooO0Oo(jsonReader, new p103o000oo00.oo000o());
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = o00o0oOooO0Oo == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    oooO00o.f19531OooO0oo = new OooOO0(o00o0oOooO0Oo, strNextString);
                    continue;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    oooO00o.f19524OooO00o = strNextString2;
                    break;
                    break;
                case 2:
                    oooO00o.f19523OooO = OooO0OO(jsonReader);
                    break;
                case 3:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    oooO00o.f19529OooO0o0 = strNextString3;
                    break;
                    break;
                case 4:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    oooO00o.f19525OooO0O0 = strNextString4;
                    break;
                    break;
                case 5:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    oooO00o.f19527OooO0Oo = strNextString5;
                    break;
                    break;
                case 6:
                    oooO00o.f19526OooO0OO = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    oooO00o.f19528OooO0o = strNextString6;
                    break;
                    break;
                case 8:
                    OooOOO0.OooO00o oooO00o2 = new OooOOO0.OooO00o();
                    oooO00o2.f19581OooO0o0 = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                oooO00o2.f19578OooO0OO = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "identifier":
                                oooO00o2.f19577OooO0O0 = new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f19386OooO00o);
                                break;
                            case "endedAt":
                                oooO00o2.f19579OooO0Oo = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                OooOo00.OooO00o oooO00o3 = new OooOo00.OooO00o();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            oooO00o3.f19610OooO0o = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            oooO00o3.f19613OooO0oo = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            oooO00o3.f19609OooO0Oo = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            oooO00o3.f19606OooO00o = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            oooO00o3.f19611OooO0o0 = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            oooO00o3.f19608OooO0OO = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            oooO00o3.f19607OooO0O0 = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            oooO00o3.f19612OooO0oO = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            oooO00o3.f19605OooO = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                oooO00o2.f19575OooO = oooO00o3.OooO00o();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(OooO0o0(jsonReader));
                                }
                                jsonReader.endArray();
                                oooO00o2.f19584OooOO0 = new o00O0O<>(arrayList);
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
                                            oooO00o4.f19666OooO0OO = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            oooO00o4.f19667OooO0Oo = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            oooO00o4.f19665OooO0O0 = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            oooO00o4.f19664OooO00o = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                oooO00o2.f19583OooO0oo = oooO00o4.OooO00o();
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
                                oooO00o2.f19580OooO0o = new OooOOO(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
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
                                oooO00o2.f19582OooO0oO = new o0OOO0o(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                oooO00o2.f19576OooO00o = strNextString19;
                                break;
                                break;
                            case "crashed":
                                oooO00o2.f19581OooO0o0 = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                oooO00o2.f19585OooOO0O = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    oooO00o.f19530OooO0oO = oooO00o2.OooO00o();
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
    public static com.google.firebase.crashlytics.internal.model.OooO0O0 OooO0oo(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                com.google.firebase.crashlytics.internal.model.OooO0O0 oooO0O0OooO0oO = OooO0oO(jsonReader);
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
