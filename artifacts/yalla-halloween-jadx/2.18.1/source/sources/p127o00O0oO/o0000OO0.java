package p127o00O0oO;

import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p120o00O0OoO.o000oOoO;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static JsonReader.OooO00o f31096OooO00o = JsonReader.OooO00o.OooO00o("k");

    public static <T> List<o000OOo<T>> OooO00o(JsonReader jsonReader, OooOO0O oooOO0O, float f, o0O0ooO<T> o0o0ooo, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.OooOoo() == JsonReader.Token.STRING) {
            oooOO0O.OooO00o("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.OooO0O0();
        while (jsonReader.OooOOO()) {
            if (jsonReader.Oooo0(f31096OooO00o) != 0) {
                jsonReader.Oooo0o();
            } else if (jsonReader.OooOoo() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.OooO00o();
                if (jsonReader.OooOoo() == JsonReader.Token.NUMBER) {
                    arrayList.add(o0000O.OooO0O0(jsonReader, oooOO0O, f, o0o0ooo, false, z));
                } else {
                    while (jsonReader.OooOOO()) {
                        arrayList.add(o0000O.OooO0O0(jsonReader, oooOO0O, f, o0o0ooo, true, z));
                    }
                }
                jsonReader.OooO0Oo();
            } else {
                arrayList.add(o0000O.OooO0O0(jsonReader, oooOO0O, f, o0o0ooo, false, z));
            }
        }
        jsonReader.OooO0o();
        OooO0O0(arrayList);
        return arrayList;
    }

    public static <T> void OooO0O0(List<? extends o000OOo<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            o000OOo<T> o000ooo2 = list.get(i2);
            i2++;
            o000OOo<T> o000ooo3 = list.get(i2);
            o000ooo2.f31163OooO0oo = Float.valueOf(o000ooo3.f31162OooO0oO);
            if (o000ooo2.f31158OooO0OO == null && (t = o000ooo3.f31157OooO0O0) != null) {
                o000ooo2.f31158OooO0OO = t;
                if (o000ooo2 instanceof o000oOoO) {
                    ((o000oOoO) o000ooo2).OooO0Oo();
                }
            }
        }
        o000OOo<T> o000ooo4 = list.get(i);
        if ((o000ooo4.f31157OooO0O0 == null || o000ooo4.f31158OooO0OO == null) && list.size() > 1) {
            list.remove(o000ooo4);
        }
    }
}
