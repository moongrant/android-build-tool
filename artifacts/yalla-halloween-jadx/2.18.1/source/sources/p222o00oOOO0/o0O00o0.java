package p222o00oOOO0;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import p217o00oO00o.o00000;
import p221o00oOO.o0000;
import p221o00oOO.o00000O;
import p221o00oOO.o00000O0;
import p221o00oOO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 implements o00000O0<URL, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<o0Oo0oo, InputStream> f33773OooO00o;

    public static class OooO00o implements o00000O<URL, InputStream> {
        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<URL, InputStream> OooO00o(o0000 o0000Var) {
            return new o0O00o0(o0000Var.OooO0OO(o0Oo0oo.class, InputStream.class));
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o0O00o0(o00000O0<o0Oo0oo, InputStream> o00000o1) {
        this.f33773OooO00o = o00000o1;
    }

    @Override // p221o00oOO.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull URL url) {
        return true;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<InputStream> OooO0O0(@NonNull URL url, int i, int i2, @NonNull o00000 o00000Var) {
        return this.f33773OooO00o.OooO0O0(new o0Oo0oo(url), i, i2, o00000Var);
    }
}
