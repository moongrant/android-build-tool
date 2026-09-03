package o00OO;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements o0000O00<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00Oo0 f36899OooO00o = new o00Oo0();

    @Override // o00OO.o0000O00
    public final Integer OooO00o(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(o00Ooo.OooO0Oo(jsonReader) * f));
    }
}
