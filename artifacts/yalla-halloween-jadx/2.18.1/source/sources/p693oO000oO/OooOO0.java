package p693oO000oO;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.o0O00o0;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0<T> implements retrofit2.OooOO0<T, o0o0Oo> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00OO0O0 f52707OooO0OO = o00OO0O0.f51401OooO0oO.OooO00o("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f52708OooO0Oo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo0 f52709OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0<T> f52710OooO0O0;

    public OooOO0(o000OOo0 o000ooo1, o00O0<T> o00o1) {
        this.f52709OooO00o = o000ooo1;
        this.f52710OooO0O0 = o00o1;
    }

    @Override // retrofit2.OooOO0
    public final o0o0Oo OooO00o(Object obj) throws IOException {
        o0oOO o0ooo2 = new o0oOO();
        JsonWriter jsonWriterOooO0oO = this.f52709OooO00o.OooO0oO(new OutputStreamWriter(new o0O00o0(o0ooo2), f52708OooO0Oo));
        this.f52710OooO0O0.write(jsonWriterOooO0oO, obj);
        jsonWriterOooO0oO.close();
        return o0o0Oo.create(f52707OooO0OO, o0ooo2.OooOoo());
    }
}
