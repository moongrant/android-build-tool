package p665o0oooOo;

import com.google.gson.JsonIOException;
import com.google.gson.OooOOO0;
import com.google.gson.o0ooOOo;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o0O0o;
import p659o0oooO00.o0000;
import retrofit2.OooOOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00OO0O<T> implements OooOOOO<o0O0o, T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f60330OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo<T> f60331OooO0O0;

    public oO00OO0O(OooOOO0 oooOOO0, o0ooOOo<T> o0ooooo) {
        this.f60330OooO00o = oooOOO0;
        this.f60331OooO0O0 = o0ooooo;
    }

    @Override // retrofit2.OooOOOO
    public final Object convert(o0O0o o0o0o) throws IOException {
        o0O0o o0o0o2 = o0o0o;
        o0O0o.OooO00o oooO00o = o0o0o2.f57333OooO0Oo;
        if (oooO00o == null) {
            o0000 o0000VarOooOOo0 = o0o0o2.OooOOo0();
            o00OOO0 o00ooo0OooO0oO = o0o0o2.OooO0oO();
            Charset charsetOooO00o = o00ooo0OooO0oO == null ? null : o00ooo0OooO0oO.OooO00o(Charsets.UTF_8);
            if (charsetOooO00o == null) {
                charsetOooO00o = Charsets.UTF_8;
            }
            oooO00o = new o0O0o.OooO00o(o0000VarOooOOo0, charsetOooO00o);
            o0o0o2.f57333OooO0Oo = oooO00o;
        }
        OooOOO0 oooOOO0 = this.f60330OooO00o;
        oooOOO0.getClass();
        JsonReader jsonReader = new JsonReader(oooO00o);
        jsonReader.setLenient(oooOOO0.f20599OooOO0O);
        try {
            T t = this.f60331OooO0O0.read(jsonReader);
            if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            o0o0o2.close();
            return t;
        } catch (Throwable th) {
            o0o0o2.close();
            throw th;
        }
    }
}
