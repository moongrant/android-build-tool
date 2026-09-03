package p127o00O0oO;

import android.graphics.PointF;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p120o00O0OoO.o000oOoO;
import p123o00O0o0.OooOOOO;
import p123o00O0o0.Oooo0;
import p123o00O0o0.o00Oo0;
import p129o00O0oOo.o000O0Oo;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f31125OooO00o = JsonReader.OooO00o.OooO00o("k", "x", "y");

    public static OooOOOO OooO00o(JsonReader jsonReader, OooOO0O oooOO0O) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.OooOoo() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.OooO00o();
            while (jsonReader.OooOOO()) {
                arrayList.add(new o000oOoO(oooOO0O, o0000O.OooO0O0(jsonReader, oooOO0O, o000O0Oo.OooO0OO(), o000Oo0.f31119OooO00o, jsonReader.OooOoo() == JsonReader.Token.BEGIN_OBJECT, false)));
            }
            jsonReader.OooO0Oo();
            o0000OO0.OooO0O0(arrayList);
        } else {
            arrayList.add(new o000OOo(o000OO.OooO0O0(jsonReader, o000O0Oo.OooO0OO())));
        }
        return new OooOOOO(arrayList);
    }

    public static o00Oo0<PointF, PointF> OooO0O0(JsonReader jsonReader, OooOO0O oooOO0O) throws IOException {
        jsonReader.OooO0O0();
        OooOOOO oooOOOOOooO00o = null;
        p123o00O0o0.OooOO0O oooOO0OOooO0OO = null;
        p123o00O0o0.OooOO0O oooOO0OOooO0OO2 = null;
        boolean z = false;
        while (jsonReader.OooOoo() != JsonReader.Token.END_OBJECT) {
            int iOooo0 = jsonReader.Oooo0(f31125OooO00o);
            if (iOooo0 == 0) {
                oooOOOOOooO00o = OooO00o(jsonReader, oooOO0O);
            } else if (iOooo0 != 1) {
                if (iOooo0 != 2) {
                    jsonReader.Oooo0OO();
                    jsonReader.Oooo0o();
                } else if (jsonReader.OooOoo() == JsonReader.Token.STRING) {
                    jsonReader.Oooo0o();
                    z = true;
                } else {
                    oooOO0OOooO0OO2 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
                }
            } else if (jsonReader.OooOoo() == JsonReader.Token.STRING) {
                jsonReader.Oooo0o();
                z = true;
            } else {
                oooOO0OOooO0OO = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, true);
            }
        }
        jsonReader.OooO0o();
        if (z) {
            oooOO0O.OooO00o("Lottie doesn't support expressions.");
        }
        return oooOOOOOooO00o != null ? oooOOOOOooO00o : new Oooo0(oooOO0OOooO0OO, oooOO0OOooO0OO2);
    }
}
