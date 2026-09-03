package o00OO;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements o0000O00<o00OOO0O.OooO0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000000O f36888OooO00o = new o000000O();

    @Override // o00OO.o0000O00
    public final o00OOO0O.OooO0o OooO00o(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.Oooo0O0() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.OooO00o();
        }
        float fOooOooo = (float) jsonReader.OooOooo();
        float fOooOooo2 = (float) jsonReader.OooOooo();
        while (jsonReader.OooOo0()) {
            jsonReader.OoooO00();
        }
        if (z) {
            jsonReader.OooO0oO();
        }
        return new o00OOO0O.OooO0o((fOooOooo / 100.0f) * f, (fOooOooo2 / 100.0f) * f);
    }
}
