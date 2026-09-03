package p115o00O00oO;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o00O0.OooOOO;
import oOO00O.OooO00o;
import p113o00O00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 implements o00O000o<o0ooOOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000OOo0 f36487OooO00o = new o000OOo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36488OooO0O0 = JsonReader.OooO00o.OooO00o("c", "v", "i", "o");

    @Override // p115o00O00oO.o00O000o
    public final o0ooOOo OooO00o(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.Oooo0() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.OooO00o();
        }
        jsonReader.OooO0OO();
        ArrayList arrayListOooO0OO = null;
        ArrayList arrayListOooO0OO2 = null;
        ArrayList arrayListOooO0OO3 = null;
        boolean zOooOo0 = false;
        while (jsonReader.OooOo00()) {
            int iOooo0OO = jsonReader.Oooo0OO(f36488OooO0O0);
            if (iOooo0OO == 0) {
                zOooOo0 = jsonReader.OooOo0();
            } else if (iOooo0OO == 1) {
                arrayListOooO0OO = o000.OooO0OO(jsonReader, f);
            } else if (iOooo0OO == 2) {
                arrayListOooO0OO2 = o000.OooO0OO(jsonReader, f);
            } else if (iOooo0OO != 3) {
                jsonReader.Oooo0o0();
                jsonReader.Oooo0o();
            } else {
                arrayListOooO0OO3 = o000.OooO0OO(jsonReader, f);
            }
        }
        jsonReader.OooOOo0();
        if (jsonReader.Oooo0() == JsonReader.Token.END_ARRAY) {
            jsonReader.OooO0oO();
        }
        if (arrayListOooO0OO == null || arrayListOooO0OO2 == null || arrayListOooO0OO3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListOooO0OO.isEmpty()) {
            return new o0ooOOo(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListOooO0OO.size();
        PointF pointF = (PointF) arrayListOooO0OO.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListOooO0OO.get(i);
            int i2 = i - 1;
            arrayList.add(new OooO00o(OooOOO.OooO00o((PointF) arrayListOooO0OO.get(i2), (PointF) arrayListOooO0OO3.get(i2)), OooOOO.OooO00o(pointF2, (PointF) arrayListOooO0OO2.get(i)), pointF2));
        }
        if (zOooOo0) {
            PointF pointF3 = (PointF) arrayListOooO0OO.get(0);
            int i3 = size - 1;
            arrayList.add(new OooO00o(OooOOO.OooO00o((PointF) arrayListOooO0OO.get(i3), (PointF) arrayListOooO0OO3.get(i3)), OooOOO.OooO00o(pointF3, (PointF) arrayListOooO0OO2.get(0)), pointF3));
        }
        return new o0ooOOo(pointF, zOooOo0, arrayList);
    }
}
