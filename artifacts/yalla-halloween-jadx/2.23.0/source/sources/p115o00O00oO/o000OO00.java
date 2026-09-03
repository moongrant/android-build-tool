package p115o00O00oO;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import o00O0O00.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 implements o00O000o<OooO0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO00 f36483OooO00o = new o000OO00();

    @Override // p115o00O00oO.o00O000o
    public final OooO0o OooO00o(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.Oooo0() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.OooO00o();
        }
        float fOooOo = (float) jsonReader.OooOo();
        float fOooOo2 = (float) jsonReader.OooOo();
        while (jsonReader.OooOo00()) {
            jsonReader.Oooo0o();
        }
        if (z) {
            jsonReader.OooO0oO();
        }
        return new OooO0o((fOooOo / 100.0f) * f, (fOooOo2 / 100.0f) * f);
    }
}
