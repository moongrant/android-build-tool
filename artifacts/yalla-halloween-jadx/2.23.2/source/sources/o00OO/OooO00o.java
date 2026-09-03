package o00OO;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36858OooO00o = JsonReader.OooO00o.OooO00o("k", "x", "y");

    public static p134o00OO0o.o0OOO0o OooO00o(com.airbnb.lottie.parser.moshi.OooO00o oooO00o, com.airbnb.lottie.OooOO0 oooOO1) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (oooO00o.Oooo0O0() == JsonReader.Token.BEGIN_ARRAY) {
            oooO00o.OooO00o();
            while (oooO00o.OooOo0()) {
                arrayList.add(new o00OO0O0.OooOOO(oooOO1, oo000o.OooO0O0(oooO00o, oooOO1, o00OOO0.OooOOOO.OooO0OO(), o0OO00O.f36904OooO00o, oooO00o.Oooo0O0() == JsonReader.Token.BEGIN_OBJECT, false)));
            }
            oooO00o.OooO0oO();
            o00oO0o.OooO0O0(arrayList);
        } else {
            arrayList.add(new o00OOO0O.OooO00o(o00Ooo.OooO0O0(oooO00o, o00OOO0.OooOOOO.OooO0OO())));
        }
        return new p134o00OO0o.o0OOO0o(arrayList);
    }

    public static p134o00OO0o.o00000 OooO0O0(com.airbnb.lottie.parser.moshi.OooO00o oooO00o, com.airbnb.lottie.OooOO0 oooOO1) throws IOException {
        oooO00o.OooO0OO();
        p134o00OO0o.o0OOO0o o0ooo0oOooO00o = null;
        p134o00OO0o.oo000o oo000oVarOooO0O0 = null;
        boolean z = false;
        p134o00OO0o.oo000o oo000oVarOooO0O1 = null;
        while (oooO00o.Oooo0O0() != JsonReader.Token.END_OBJECT) {
            int iOooo0o0 = oooO00o.Oooo0o0(f36858OooO00o);
            if (iOooo0o0 == 0) {
                o0ooo0oOooO00o = OooO00o(oooO00o, oooOO1);
            } else if (iOooo0o0 != 1) {
                if (iOooo0o0 != 2) {
                    oooO00o.Oooo0oO();
                    oooO00o.OoooO00();
                } else if (oooO00o.Oooo0O0() == JsonReader.Token.STRING) {
                    oooO00o.OoooO00();
                    z = true;
                } else {
                    oo000oVarOooO0O0 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
                }
            } else if (oooO00o.Oooo0O0() == JsonReader.Token.STRING) {
                oooO00o.OoooO00();
                z = true;
            } else {
                oo000oVarOooO0O1 = OooO0o.OooO0O0(oooO00o, oooOO1, true);
            }
        }
        oooO00o.OooOOo();
        if (z) {
            oooOO1.OooO00o("Lottie doesn't support expressions.");
        }
        return o0ooo0oOooO00o != null ? o0ooo0oOooO00o : new p134o00OO0o.o0O0O00(oo000oVarOooO0O1, oo000oVarOooO0O0);
    }
}
