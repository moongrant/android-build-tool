package p115o00O00oO;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo implements o00O000o<PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O0Oo f36479OooO00o = new o000O0Oo();

    @Override // p115o00O00oO.o00O000o
    public final PointF OooO00o(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token tokenOooo0 = jsonReader.Oooo0();
        if (tokenOooo0 == JsonReader.Token.BEGIN_ARRAY) {
            return o000.OooO0O0(jsonReader, f);
        }
        if (tokenOooo0 == JsonReader.Token.BEGIN_OBJECT) {
            return o000.OooO0O0(jsonReader, f);
        }
        if (tokenOooo0 != JsonReader.Token.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenOooo0);
        }
        PointF pointF = new PointF(((float) jsonReader.OooOo()) * f, ((float) jsonReader.OooOo()) * f);
        while (jsonReader.OooOo00()) {
            jsonReader.Oooo0o();
        }
        return pointF;
    }
}
