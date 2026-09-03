package p126o00O0oOo;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f36726OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f36727OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0<T> f36728OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f36729OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile byte[] f36730OooO0Oo;

    public class OooO00o implements OooO0O0<Object> {
        @Override // o00O0oOo.o000000O.OooO0O0
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
        this.f36729OooO0OO = str;
        this.f36727OooO00o = t;
        this.f36728OooO0O0 = oooO0O0;
    }

    @NonNull
    public static o000000O OooO00o(@NonNull Object obj, @NonNull String str) {
        return new o000000O(str, obj, f36726OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o000000O) {
            return this.f36729OooO0OO.equals(((o000000O) obj).f36729OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36729OooO0OO.hashCode();
    }

    public final String toString() {
        return o0O00o0.OooO0O0(new StringBuilder("Option{key='"), this.f36729OooO0OO, "'}");
    }
}
