package p130o00OO00o;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import o00OO00O.OooOOO0;
import o00OO00O.o00O0O;
import o00OO00O.o0OoOo0;
import o00OO00O.oo000o;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements o0OoOo0<URL, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<OooOOO0, InputStream> f37192OooO00o;

    public static class OooO00o implements o00O0O<URL, InputStream> {
        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<URL, InputStream> OooO0OO(oo000o oo000oVar) {
            return new o00000O0(oo000oVar.OooO0OO(OooOOO0.class, InputStream.class));
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public o00000O0(o0OoOo0<OooOOO0, InputStream> o0oooo0) {
        this.f37192OooO00o = o0oooo0;
    }

    @Override // o00OO00O.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull URL url) {
        return true;
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull URL url, int i, int i2, @NonNull o00000 o00000Var) {
        return this.f37192OooO00o.OooO0O0(new OooOOO0(url), i, i2, o00000Var);
    }
}
