package p127o00O0oO;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p125o00O0o0O.o00000O;
import p129o00O0oOo.o000O0;
import p225o00oOOo.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 implements o0O0ooO<o00000O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O0O0 f31109OooO00o = new o000O0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f31110OooO0O0 = JsonReader.OooO00o.OooO00o(ak.aF, ak.aE, ak.aC, "o");

    @Override // p127o00O0oO.o0O0ooO
    public final o00000O OooO00o(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.OooOoo() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.OooO00o();
        }
        jsonReader.OooO0O0();
        List<PointF> listOooO0OO = null;
        List<PointF> listOooO0OO2 = null;
        List<PointF> listOooO0OO3 = null;
        boolean zOooOOo = false;
        while (jsonReader.OooOOO()) {
            int iOooo0 = jsonReader.Oooo0(f31110OooO0O0);
            if (iOooo0 == 0) {
                zOooOOo = jsonReader.OooOOo();
            } else if (iOooo0 == 1) {
                listOooO0OO = o000OO.OooO0OO(jsonReader, f);
            } else if (iOooo0 == 2) {
                listOooO0OO2 = o000OO.OooO0OO(jsonReader, f);
            } else if (iOooo0 != 3) {
                jsonReader.Oooo0OO();
                jsonReader.Oooo0o();
            } else {
                listOooO0OO3 = o000OO.OooO0OO(jsonReader, f);
            }
        }
        jsonReader.OooO0o();
        if (jsonReader.OooOoo() == JsonReader.Token.END_ARRAY) {
            jsonReader.OooO0Oo();
        }
        if (listOooO0OO == null || listOooO0OO2 == null || listOooO0OO3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listOooO0OO.isEmpty()) {
            return new o00000O(new PointF(), false, Collections.emptyList());
        }
        int size = listOooO0OO.size();
        PointF pointF = listOooO0OO.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listOooO0OO.get(i);
            int i2 = i - 1;
            arrayList.add(new o00O0OO0(o000O0.OooO00o(listOooO0OO.get(i2), listOooO0OO3.get(i2)), o000O0.OooO00o(pointF2, listOooO0OO2.get(i)), pointF2));
        }
        if (zOooOOo) {
            PointF pointF3 = listOooO0OO.get(0);
            int i3 = size - 1;
            arrayList.add(new o00O0OO0(o000O0.OooO00o(listOooO0OO.get(i3), listOooO0OO3.get(i3)), o000O0.OooO00o(pointF3, listOooO0OO2.get(0)), pointF3));
        }
        return new o00000O(pointF, zOooOOo, arrayList);
    }
}
