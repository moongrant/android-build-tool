package p127o00O0oO;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p131o00O0oo0.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O implements o0O0ooO<o00000> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO0O f31116OooO00o = new o000OO0O();

    @Override // p127o00O0oO.o0O0ooO
    public final o00000 OooO00o(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.OooOoo() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.OooO00o();
        }
        float fOooOOoo = (float) jsonReader.OooOOoo();
        float fOooOOoo2 = (float) jsonReader.OooOOoo();
        while (jsonReader.OooOOO()) {
            jsonReader.Oooo0o();
        }
        if (z) {
            jsonReader.OooO0Oo();
        }
        return new o00000((fOooOOoo / 100.0f) * f, (fOooOOoo2 / 100.0f) * f);
    }
}
