package p115o00O00oO;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements o00O000o<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00000O0 f36450OooO00o = new o00000O0();

    @Override // p115o00O00oO.o00O000o
    public final Integer OooO00o(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.Oooo0() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.OooO00o();
        }
        double dOooOo = jsonReader.OooOo();
        double dOooOo2 = jsonReader.OooOo();
        double dOooOo3 = jsonReader.OooOo();
        double dOooOo4 = jsonReader.Oooo0() == JsonReader.Token.NUMBER ? jsonReader.OooOo() : 1.0d;
        if (z) {
            jsonReader.OooO0oO();
        }
        if (dOooOo <= 1.0d && dOooOo2 <= 1.0d && dOooOo3 <= 1.0d) {
            dOooOo *= 255.0d;
            dOooOo2 *= 255.0d;
            dOooOo3 *= 255.0d;
            if (dOooOo4 <= 1.0d) {
                dOooOo4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dOooOo4, (int) dOooOo, (int) dOooOo2, (int) dOooOo3));
    }
}
