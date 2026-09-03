package o00OO00O;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00<Data> implements o0OoOo0<Uri, Data> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<String> f37143OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<OooOOO0, Data> f37144OooO00o;

    public static class OooO00o implements o00O0O<Uri, InputStream> {
        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, InputStream> OooO0OO(oo000o oo000oVar) {
            return new o0O0O00(oo000oVar.OooO0OO(OooOOO0.class, InputStream.class));
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public o0O0O00(o0OoOo0<OooOOO0, Data> o0oooo0) {
        this.f37144OooO00o = o0oooo0;
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        return f37143OooO0O0.contains(uri.getScheme());
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        return this.f37144OooO00o.OooO0O0(new OooOOO0(uri.toString()), i, i2, o00000Var);
    }
}
