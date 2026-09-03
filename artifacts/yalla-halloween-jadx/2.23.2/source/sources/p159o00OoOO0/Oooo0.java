package p159o00OoOO0;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import o00OoO.OooOOO0;
import o00OoO.o00O0O;
import o00OoO.o0OoOo0;
import o00OoO.oo000o;
import p154o00Oo0oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o0OoOo0<URL, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<OooOOO0, InputStream> f38025OooO00o;

    public static class OooO00o implements o00O0O<URL, InputStream> {
        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<URL, InputStream> OooO0Oo(oo000o oo000oVar) {
            return new Oooo0(oo000oVar.OooO0OO(OooOOO0.class, InputStream.class));
        }
    }

    public Oooo0(o0OoOo0<OooOOO0, InputStream> o0oooo1) {
        this.f38025OooO00o = o0oooo1;
    }

    @Override // o00OoO.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull URL url) {
        return true;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull URL url, int i, int i2, @NonNull oo0o0Oo oo0o0oo) {
        return this.f38025OooO00o.OooO0O0(new OooOOO0(url), i, i2, oo0o0oo);
    }
}
