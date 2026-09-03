package p154o00Oo0oo;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f37828OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f37829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0<T> f37830OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f37831OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile byte[] f37832OooO0Oo;

    public class OooO00o implements OooO0O0<Object> {
        @Override // o00Oo0oo.o0OO00O.OooO0O0
        public final void OooO00o(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    public interface OooO0O0<T> {
        void OooO00o(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public o0OO00O(@NonNull String str, @Nullable T t, @NonNull OooO0O0<T> oooO0O0) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f37831OooO0OO = str;
        this.f37829OooO00o = t;
        this.f37830OooO0O0 = oooO0O0;
    }

    @NonNull
    public static o0OO00O OooO00o(@NonNull Object obj, @NonNull String str) {
        return new o0OO00O(str, obj, f37828OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0OO00O) {
            return this.f37831OooO0OO.equals(((o0OO00O) obj).f37831OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37831OooO0OO.hashCode();
    }

    public final String toString() {
        return o0oOO.OooO0O0(new StringBuilder("Option{key='"), this.f37831OooO0OO, "'}");
    }
}
