package p127o00O0oO;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O implements o0O0ooO<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000O0O f31095OooO00o = new o0000O0O();

    @Override // p127o00O0oO.o0O0ooO
    public final Integer OooO00o(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(o000OO.OooO0Oo(jsonReader) * f));
    }
}
