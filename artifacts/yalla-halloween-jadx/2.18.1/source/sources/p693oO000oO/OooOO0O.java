package p693oO000oO;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.text.Charsets;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOOo;
import p674o0oooo0.o0oOOo;
import retrofit2.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O<T> implements OooOO0<o00OOOOo, T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo0 f52711OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0<T> f52712OooO0O0;

    public OooOO0O(o000OOo0 o000ooo1, o00O0<T> o00o1) {
        this.f52711OooO00o = o000ooo1;
        this.f52712OooO0O0 = o00o1;
    }

    @Override // retrofit2.OooOO0
    public final Object OooO00o(o00OOOOo o00ooooo2) throws IOException {
        Charset charsetOooO00o;
        o00OOOOo o00ooooo3 = o00ooooo2;
        o000OOo0 o000ooo1 = this.f52711OooO00o;
        o00OOOOo.OooO00o oooO00o = o00ooooo3.f51465Oooo0o;
        if (oooO00o == null) {
            o0oOOo o0ooooOooO0oo = o00ooooo3.OooO0oo();
            o00OO0O0 o00oo0o0OooO0o = o00ooooo3.OooO0o();
            if (o00oo0o0OooO0o == null || (charsetOooO00o = o00oo0o0OooO0o.OooO00o(Charsets.UTF_8)) == null) {
                charsetOooO00o = Charsets.UTF_8;
            }
            oooO00o = new o00OOOOo.OooO00o(o0ooooOooO0oo, charsetOooO00o);
            o00ooooo3.f51465Oooo0o = oooO00o;
        }
        Objects.requireNonNull(o000ooo1);
        JsonReader jsonReader = new JsonReader(oooO00o);
        jsonReader.setLenient(o000ooo1.f38881OooOO0O);
        try {
            T t = this.f52712OooO0O0.read(jsonReader);
            if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            o00ooooo3.close();
            return t;
        } catch (Throwable th) {
            o00ooooo3.close();
            throw th;
        }
    }
}
