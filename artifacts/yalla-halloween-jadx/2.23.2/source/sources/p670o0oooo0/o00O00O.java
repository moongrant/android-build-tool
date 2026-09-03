package p670o0oooo0;

import com.google.gson.JsonIOException;
import com.google.gson.OooOOO0;
import com.google.gson.o0OOO0o;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00oO0;
import p662o0oooO0O.o0O0o0;
import retrofit2.OooOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O00O<T> implements OooOOO<o0O00oO0, T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f59912OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o<T> f59913OooO0O0;

    public o00O00O(OooOOO0 oooOOO0, o0OOO0o<T> o0ooo0o2) {
        this.f59912OooO00o = oooOOO0;
        this.f59913OooO0O0 = o0ooo0o2;
    }

    @Override // retrofit2.OooOOO
    public final Object convert(o0O00oO0 o0o00oo1) throws IOException {
        o0O00oO0 o0o00oo2 = o0o00oo1;
        o0O00oO0.OooO00o oooO00o = o0o00oo2.f57873OooO0Oo;
        if (oooO00o == null) {
            o0O0o0 o0o0o0OooOOo = o0o00oo2.OooOOo();
            o0O000Oo o0o000ooOooO0oO = o0o00oo2.OooO0oO();
            Charset charsetOooO00o = o0o000ooOooO0oO == null ? null : o0o000ooOooO0oO.OooO00o(Charsets.UTF_8);
            if (charsetOooO00o == null) {
                charsetOooO00o = Charsets.UTF_8;
            }
            oooO00o = new o0O00oO0.OooO00o(o0o0o0OooOOo, charsetOooO00o);
            o0o00oo2.f57873OooO0Oo = oooO00o;
        }
        OooOOO0 oooOOO0 = this.f59912OooO00o;
        oooOOO0.getClass();
        JsonReader jsonReader = new JsonReader(oooO00o);
        jsonReader.setLenient(oooOOO0.f20126OooOO0O);
        try {
            T t = this.f59913OooO0O0.read(jsonReader);
            if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            o0o00oo2.close();
            return t;
        } catch (Throwable th) {
            o0o00oo2.close();
            throw th;
        }
    }
}
