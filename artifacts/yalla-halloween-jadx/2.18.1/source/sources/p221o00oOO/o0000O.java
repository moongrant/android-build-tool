package p221o00oOO;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p217o00oO00o.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O<Data> implements o00000O0<Uri, Data> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<String> f33703OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<o0Oo0oo, Data> f33704OooO00o;

    public static class OooO00o implements o00000O<Uri, InputStream> {
        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, InputStream> OooO00o(o0000 o0000Var) {
            return new o0000O(o0000Var.OooO0OO(o0Oo0oo.class, InputStream.class));
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o0000O(o00000O0<o0Oo0oo, Data> o00000o1) {
        this.f33704OooO00o = o00000o1;
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Uri uri) {
        return f33703OooO0O0.contains(uri.getScheme());
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        return this.f33704OooO00o.OooO0O0(new o0Oo0oo(uri.toString()), i, i2, o00000Var);
    }
}
