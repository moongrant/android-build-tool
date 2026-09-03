package o00OO;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o0000O00<PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final oo0o0Oo f36920OooO00o = new oo0o0Oo();

    @Override // o00OO.o0000O00
    public final PointF OooO00o(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token tokenOooo0O0 = jsonReader.Oooo0O0();
        if (tokenOooo0O0 == JsonReader.Token.BEGIN_ARRAY) {
            return o00Ooo.OooO0O0(jsonReader, f);
        }
        if (tokenOooo0O0 == JsonReader.Token.BEGIN_OBJECT) {
            return o00Ooo.OooO0O0(jsonReader, f);
        }
        if (tokenOooo0O0 != JsonReader.Token.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenOooo0O0);
        }
        PointF pointF = new PointF(((float) jsonReader.OooOooo()) * f, ((float) jsonReader.OooOooo()) * f);
        while (jsonReader.OooOo0()) {
            jsonReader.OoooO00();
        }
        return pointF;
    }
}
