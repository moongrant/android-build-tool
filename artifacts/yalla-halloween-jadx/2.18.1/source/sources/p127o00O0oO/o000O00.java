package p127o00O0oO;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 implements o0O0ooO<PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O00 f31103OooO00o = new o000O00();

    @Override // p127o00O0oO.o0O0ooO
    public final PointF OooO00o(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token tokenOooOoo = jsonReader.OooOoo();
        if (tokenOooOoo == JsonReader.Token.BEGIN_ARRAY) {
            return o000OO.OooO0O0(jsonReader, f);
        }
        if (tokenOooOoo == JsonReader.Token.BEGIN_OBJECT) {
            return o000OO.OooO0O0(jsonReader, f);
        }
        if (tokenOooOoo == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.OooOOoo()) * f, ((float) jsonReader.OooOOoo()) * f);
            while (jsonReader.OooOOO()) {
                jsonReader.Oooo0o();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenOooOoo);
    }
}
