package p238o00oOooo;

import androidx.annotation.NonNull;
import java.util.Arrays;
import p233o00oOoOO.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOoOo f40042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f40043OooO0O0;

    public o0oOo0O0(@NonNull o0OoOoOo o0oooooo, @NonNull byte[] bArr) {
        if (o0oooooo == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f40042OooO00o = o0oooooo;
        this.f40043OooO0O0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0oOo0O0)) {
            return false;
        }
        o0oOo0O0 o0ooo0o1 = (o0oOo0O0) obj;
        if (this.f40042OooO00o.equals(o0ooo0o1.f40042OooO00o)) {
            return Arrays.equals(this.f40043OooO0O0, o0ooo0o1.f40043OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f40042OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40043OooO0O0);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f40042OooO00o + ", bytes=[...]}";
    }
}
