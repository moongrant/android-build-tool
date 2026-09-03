package o00OO;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements o0000O00<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0O f36864OooO00o = new OooOO0O();

    @Override // o00OO.o0000O00
    public final Integer OooO00o(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.Oooo0O0() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.OooO00o();
        }
        double dOooOooo = jsonReader.OooOooo();
        double dOooOooo2 = jsonReader.OooOooo();
        double dOooOooo3 = jsonReader.OooOooo();
        double dOooOooo4 = jsonReader.Oooo0O0() == JsonReader.Token.NUMBER ? jsonReader.OooOooo() : 1.0d;
        if (z) {
            jsonReader.OooO0oO();
        }
        if (dOooOooo <= 1.0d && dOooOooo2 <= 1.0d && dOooOooo3 <= 1.0d) {
            dOooOooo *= 255.0d;
            dOooOooo2 *= 255.0d;
            dOooOooo3 *= 255.0d;
            if (dOooOooo4 <= 1.0d) {
                dOooOooo4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dOooOooo4, (int) dOooOooo, (int) dOooOooo2, (int) dOooOooo3));
    }
}
