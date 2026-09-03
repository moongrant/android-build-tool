package p127o00O0oO;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 implements o0O0ooO<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000000 f31072OooO00o = new o000000();

    @Override // p127o00O0oO.o0O0ooO
    public final Integer OooO00o(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.OooOoo() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.OooO00o();
        }
        double dOooOOoo = jsonReader.OooOOoo();
        double dOooOOoo2 = jsonReader.OooOOoo();
        double dOooOOoo3 = jsonReader.OooOOoo();
        double dOooOOoo4 = jsonReader.OooOoo() == JsonReader.Token.NUMBER ? jsonReader.OooOOoo() : 1.0d;
        if (z) {
            jsonReader.OooO0Oo();
        }
        if (dOooOOoo <= 1.0d && dOooOOoo2 <= 1.0d && dOooOOoo3 <= 1.0d) {
            dOooOOoo *= 255.0d;
            dOooOOoo2 *= 255.0d;
            dOooOOoo3 *= 255.0d;
            if (dOooOOoo4 <= 1.0d) {
                dOooOOoo4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dOooOOoo4, (int) dOooOOoo, (int) dOooOOoo2, (int) dOooOOoo3));
    }
}
