package p217o00oO00o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0<Object> f33632OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f33633OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0<T> f33634OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f33635OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile byte[] f33636OooO0Oo;

    public class OooO00o implements OooO0O0<Object> {
        @Override // o00oO00o.o000000O.OooO0O0
        public final void OooO00o(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    public interface OooO0O0<T> {
        void OooO00o(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public o000000O(@NonNull String str, @Nullable T t, @NonNull OooO0O0<T> oooO0O0) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f33635OooO0OO = str;
        this.f33633OooO00o = t;
        this.f33634OooO0O0 = oooO0O0;
    }

    @NonNull
    public static <T> o000000O<T> OooO00o(@NonNull String str, @NonNull T t) {
        return new o000000O<>(str, t, f33632OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o000000O) {
            return this.f33635OooO0OO.equals(((o000000O) obj).f33635OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33635OooO0OO.hashCode();
    }

    public final String toString() {
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(OooO00o.OooO00o.OooO0o0("Option{key='"), this.f33635OooO0OO, '\'', '}');
    }
}
