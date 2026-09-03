package p115o00O00oO;

import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import o00O000o.OooOOO;
import o00O0O00.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36480OooO00o = JsonReader.OooO00o.OooO00o("k");

    public static ArrayList OooO00o(JsonReader jsonReader, OooOO0 oooOO1, float f, o00O000o o00o000o2, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.Oooo0() == JsonReader.Token.STRING) {
            oooOO1.OooO00o("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.OooO0OO();
        while (jsonReader.OooOo00()) {
            if (jsonReader.Oooo0OO(f36480OooO00o) != 0) {
                jsonReader.Oooo0o();
            } else if (jsonReader.Oooo0() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.OooO00o();
                if (jsonReader.Oooo0() == JsonReader.Token.NUMBER) {
                    arrayList.add(o000O000.OooO0O0(jsonReader, oooOO1, f, o00o000o2, false, z));
                } else {
                    while (jsonReader.OooOo00()) {
                        arrayList.add(o000O000.OooO0O0(jsonReader, oooOO1, f, o00o000o2, true, z));
                    }
                }
                jsonReader.OooO0oO();
            } else {
                arrayList.add(o000O000.OooO0O0(jsonReader, oooOO1, f, o00o000o2, false, z));
            }
        }
        jsonReader.OooOOo0();
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
            OooO00o oooO00o = (OooO00o) arrayList.get(i2);
            i2++;
            OooO00o oooO00o2 = (OooO00o) arrayList.get(i2);
            oooO00o.f36509OooO0oo = Float.valueOf(oooO00o2.f36508OooO0oO);
            if (oooO00o.f36504OooO0OO == 0 && (t = oooO00o2.f36503OooO0O0) != 0) {
                oooO00o.f36504OooO0OO = t;
                if (oooO00o instanceof OooOOO) {
                    ((OooOOO) oooO00o).OooO0Oo();
                }
            }
        }
        OooO00o oooO00o3 = (OooO00o) arrayList.get(i);
        if ((oooO00o3.f36503OooO0O0 == 0 || oooO00o3.f36504OooO0OO == 0) && arrayList.size() > 1) {
            arrayList.remove(oooO00o3);
        }
    }
}
