package o00OO;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36902OooO00o = JsonReader.OooO00o.OooO00o("k");

    public static ArrayList OooO00o(JsonReader jsonReader, com.airbnb.lottie.OooOO0 oooOO1, float f, o0000O00 o0000o00, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.Oooo0O0() == JsonReader.Token.STRING) {
            oooOO1.OooO00o("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.OooO0OO();
        while (jsonReader.OooOo0()) {
            if (jsonReader.Oooo0o0(f36902OooO00o) != 0) {
                jsonReader.OoooO00();
            } else if (jsonReader.Oooo0O0() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.OooO00o();
                if (jsonReader.Oooo0O0() == JsonReader.Token.NUMBER) {
                    arrayList.add(oo000o.OooO0O0(jsonReader, oooOO1, f, o0000o00, false, z));
                } else {
                    while (jsonReader.OooOo0()) {
                        arrayList.add(oo000o.OooO0O0(jsonReader, oooOO1, f, o0000o00, true, z));
                    }
                }
                jsonReader.OooO0oO();
            } else {
                arrayList.add(oo000o.OooO0O0(jsonReader, oooOO1, f, o0000o00, false, z));
            }
        }
        jsonReader.OooOOo();
        OooO0O0(arrayList);
        return arrayList;
    }

    public static void OooO0O0(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            o00OOO0O.OooO00o oooO00o = (o00OOO0O.OooO00o) arrayList.get(i2);
            i2++;
            o00OOO0O.OooO00o oooO00o2 = (o00OOO0O.OooO00o) arrayList.get(i2);
            oooO00o.f37447OooO0oo = Float.valueOf(oooO00o2.f37446OooO0oO);
            if (oooO00o.f37442OooO0OO == 0 && (t = oooO00o2.f37441OooO0O0) != 0) {
                oooO00o.f37442OooO0OO = t;
                if (oooO00o instanceof o00OO0O0.OooOOO) {
                    ((o00OO0O0.OooOOO) oooO00o).OooO0Oo();
                }
            }
        }
        o00OOO0O.OooO00o oooO00o3 = (o00OOO0O.OooO00o) arrayList.get(i);
        if ((oooO00o3.f37441OooO0O0 == 0 || oooO00o3.f37442OooO0OO == 0) && arrayList.size() > 1) {
            arrayList.remove(oooO00o3);
        }
    }
}
