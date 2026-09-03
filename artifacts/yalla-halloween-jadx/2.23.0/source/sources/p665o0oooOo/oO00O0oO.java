package p665o0oooOo;

import com.google.gson.OooOOO0;
import com.google.gson.o0ooOOo;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.oo00oO;
import p659o0oooO00.o00000O;
import p659o0oooO00.o00000OO;
import retrofit2.OooOOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0oO<T> implements OooOOOO<T, oo00oO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00OOO0 f60326OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f60327OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f60328OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo<T> f60329OooO0O0;

    static {
        Pattern pattern = o00OOO0.f57234OooO0o0;
        f60326OooO0OO = o00OOO0.OooO00o.OooO00o("application/json; charset=UTF-8");
        f60327OooO0Oo = Charset.forName("UTF-8");
    }

    public oO00O0oO(OooOOO0 oooOOO0, o0ooOOo<T> o0ooooo) {
        this.f60328OooO00o = oooOOO0;
        this.f60329OooO0O0 = o0ooooo;
    }

    @Override // retrofit2.OooOOOO
    public final oo00oO convert(Object obj) throws IOException {
        o00000O o00000o = new o00000O();
        JsonWriter jsonWriterOooO0oO = this.f60328OooO00o.OooO0oO(new OutputStreamWriter(new o00000OO(o00000o), f60327OooO0Oo));
        this.f60329OooO0O0.write(jsonWriterOooO0oO, obj);
        jsonWriterOooO0oO.close();
        return oo00oO.create(f60326OooO0OO, o00000o.Oooo0o0());
    }
}
