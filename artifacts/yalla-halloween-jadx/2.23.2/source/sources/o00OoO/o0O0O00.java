package o00OoO;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00<Data> implements o0OoOo0<Uri, Data> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<String> f37905OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<OooOOO0, Data> f37906OooO00o;

    public static class OooO00o implements o00O0O<Uri, InputStream> {
        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Uri, InputStream> OooO0Oo(oo000o oo000oVar) {
            return new o0O0O00(oo000oVar.OooO0OO(OooOOO0.class, InputStream.class));
        }
    }

    public o0O0O00(o0OoOo0<OooOOO0, Data> o0oooo1) {
        this.f37906OooO00o = o0oooo1;
    }

    @Override // o00OoO.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        return f37905OooO0O0.contains(uri.getScheme());
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) {
        return this.f37906OooO00o.OooO0O0(new OooOOO0(uri.toString()), i, i2, oo0o0oo);
    }
}
