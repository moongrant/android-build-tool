package o00OO;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements o0000O00<p136o00OO0oO.OooOOOO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00000 f36885OooO00o = new o00000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36886OooO0O0 = JsonReader.OooO00o.OooO00o("c", "v", "i", "o");

    @Override // o00OO.o0000O00
    public final p136o00OO0oO.OooOOOO OooO00o(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.Oooo0O0() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.OooO00o();
        }
        jsonReader.OooO0OO();
        ArrayList arrayListOooO0OO = null;
        ArrayList arrayListOooO0OO2 = null;
        ArrayList arrayListOooO0OO3 = null;
        boolean zOooOo = false;
        while (jsonReader.OooOo0()) {
            int iOooo0o0 = jsonReader.Oooo0o0(f36886OooO0O0);
            if (iOooo0o0 == 0) {
                zOooOo = jsonReader.OooOo();
            } else if (iOooo0o0 == 1) {
                arrayListOooO0OO = o00Ooo.OooO0OO(jsonReader, f);
            } else if (iOooo0o0 == 2) {
                arrayListOooO0OO2 = o00Ooo.OooO0OO(jsonReader, f);
            } else if (iOooo0o0 != 3) {
                jsonReader.Oooo0oO();
                jsonReader.OoooO00();
            } else {
                arrayListOooO0OO3 = o00Ooo.OooO0OO(jsonReader, f);
            }
        }
        jsonReader.OooOOo();
        if (jsonReader.Oooo0O0() == JsonReader.Token.END_ARRAY) {
            jsonReader.OooO0oO();
        }
        if (arrayListOooO0OO == null || arrayListOooO0OO2 == null || arrayListOooO0OO3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListOooO0OO.isEmpty()) {
            return new p136o00OO0oO.OooOOOO(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListOooO0OO.size();
        PointF pointF = (PointF) arrayListOooO0OO.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListOooO0OO.get(i);
            int i2 = i - 1;
            arrayList.add(new p135o00OO0o0.o00Oo0(o00OOO0.OooOOO.OooO00o((PointF) arrayListOooO0OO.get(i2), (PointF) arrayListOooO0OO3.get(i2)), o00OOO0.OooOOO.OooO00o(pointF2, (PointF) arrayListOooO0OO2.get(i)), pointF2));
        }
        if (zOooOo) {
            PointF pointF3 = (PointF) arrayListOooO0OO.get(0);
            int i3 = size - 1;
            arrayList.add(new p135o00OO0o0.o00Oo0(o00OOO0.OooOOO.OooO00o((PointF) arrayListOooO0OO.get(i3), (PointF) arrayListOooO0OO3.get(i3)), o00OOO0.OooOOO.OooO00o(pointF3, (PointF) arrayListOooO0OO2.get(0)), pointF3));
        }
        return new p136o00OO0oO.OooOOOO(pointF, zOooOo, arrayList);
    }
}
