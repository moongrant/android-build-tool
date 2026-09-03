package p670o0oooo0;

import com.google.gson.OooOOO0;
import com.google.gson.o0OOO0o;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.o0O0o000;
import p662o0oooO0O.oo0OOoo;
import retrofit2.OooOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O00<T> implements OooOOO<T, o0oO0Ooo> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O000Oo f59907OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f59908OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f59909OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o<T> f59910OooO0O0;

    static {
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        f59907OooO0OO = o0O000Oo.OooO00o.OooO00o("application/json; charset=UTF-8");
        f59908OooO0Oo = Charset.forName("UTF-8");
    }

    public o00O00(OooOOO0 oooOOO0, o0OOO0o<T> o0ooo0o2) {
        this.f59909OooO00o = oooOOO0;
        this.f59910OooO0O0 = o0ooo0o2;
    }

    @Override // retrofit2.OooOOO
    public final o0oO0Ooo convert(Object obj) throws IOException {
        oo0OOoo oo0oooo = new oo0OOoo();
        JsonWriter jsonWriterOooO0oO = this.f59909OooO00o.OooO0oO(new OutputStreamWriter(new o0O0o000(oo0oooo), f59908OooO0Oo));
        this.f59910OooO0O0.write(jsonWriterOooO0oO, obj);
        jsonWriterOooO0oO.close();
        return o0oO0Ooo.create(f59907OooO0OO, oo0oooo.Oooo0o0());
    }
}
