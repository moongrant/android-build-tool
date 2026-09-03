package p140o00OOOo0;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.Oooo0;
import java.io.IOException;
import java.util.Objects;
import o0O0O00.o000000;
import p028Oooo0o0.o00O000;
import p028Oooo0o0.o0oO0Ooo;
import p048OoooooO.o00OO0OO;
import p100o000oOoO.oOO00O;
import p365o0OOOooO.o000O0;
import p373o0OOo0Oo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo implements o000O0.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final /* synthetic */ o000OOo f31822Oooo = new o000OOo();

    public static o000000 OooO0O0(oOO00O ooo00o, int i, o00O000.OooO0O0 oooO0O0, o00OO0OO.OooO0O0 oooO0O1, oOO00O ooo00o2, int i2) {
        ooo00o.OooO0o0(i);
        o000000 o000000VarOooO00o = o0oO0Ooo.OooO00o(oooO0O0, oooO0O1, ooo00o2);
        ooo00o.OooO0o0(i2);
        return o000000VarOooO00o;
    }

    @Override // o0OOOooO.o000O0.OooO00o
    public Object OooO00o(JsonReader jsonReader) throws IOException {
        o00Oo0 o00oo1 = o000O0.f38596OooO00o;
        Oooo0.OooO00o oooO00o = new Oooo0.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "name":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null name");
                    oooO00o.f19045OooO0OO = strNextString;
                    break;
                case "size":
                    oooO00o.f19044OooO0O0 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "uuid":
                    oooO00o.f19046OooO0Oo = new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f18812OooO00o);
                    break;
                case "baseAddress":
                    oooO00o.f19043OooO00o = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }
}
