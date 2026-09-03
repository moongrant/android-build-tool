package p115o00O00oO;

import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.OooO00o;
import java.io.IOException;
import java.util.ArrayList;
import o00O0.OooOOOO;
import o00O000o.OooOOO;
import o00O00OO.OooO;
import o00O00OO.OooO0O0;
import o00O00OO.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36500OooO00o = JsonReader.OooO00o.OooO00o("k", "x", "y");

    public static OooO OooO00o(OooO00o oooO00o, OooOO0 oooOO1) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (oooO00o.Oooo0() == JsonReader.Token.BEGIN_ARRAY) {
            oooO00o.OooO00o();
            while (oooO00o.OooOo00()) {
                arrayList.add(new OooOOO(oooOO1, o000O000.OooO0O0(oooO00o, oooOO1, OooOOOO.OooO0OO(), o000O0.f36468OooO00o, oooO00o.Oooo0() == JsonReader.Token.BEGIN_OBJECT, false)));
            }
            oooO00o.OooO0oO();
            o000O0o.OooO0O0(arrayList);
        } else {
            arrayList.add(new o00O0O00.OooO00o(o000.OooO0O0(oooO00o, OooOOOO.OooO0OO())));
        }
        return new OooO(arrayList);
    }

    public static Oooo000 OooO0O0(OooO00o oooO00o, OooOO0 oooOO1) throws IOException {
        oooO00o.OooO0OO();
        OooO oooOOooO00o = null;
        OooO0O0 OooO0O1 = null;
        boolean z = false;
        OooO0O0 OooO0O2 = null;
        while (oooO00o.Oooo0() != JsonReader.Token.END_OBJECT) {
            int iOooo0OO = oooO00o.Oooo0OO(f36500OooO00o);
            if (iOooo0OO == 0) {
                oooOOooO00o = OooO00o(oooO00o, oooOO1);
            } else if (iOooo0OO != 1) {
                if (iOooo0OO != 2) {
                    oooO00o.Oooo0o0();
                    oooO00o.Oooo0o();
                } else if (oooO00o.Oooo0() == JsonReader.Token.STRING) {
                    oooO00o.Oooo0o();
                    z = true;
                } else {
                    OooO0O1 = o000000.OooO0O0(oooO00o, oooOO1, true);
                }
            } else if (oooO00o.Oooo0() == JsonReader.Token.STRING) {
                oooO00o.Oooo0o();
                z = true;
            } else {
                OooO0O2 = o000000.OooO0O0(oooO00o, oooOO1, true);
            }
        }
        oooO00o.OooOOo0();
        if (z) {
            oooOO1.OooO00o("Lottie doesn't support expressions.");
        }
        return oooOOooO00o != null ? oooOOooO00o : new o00O00OO.OooOOO(OooO0O2, OooO0O1);
    }
}
