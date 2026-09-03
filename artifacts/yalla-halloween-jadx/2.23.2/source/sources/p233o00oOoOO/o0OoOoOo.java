package p233o00oOoOO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39905OooO00o;

    public o0OoOoOo(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f39905OooO00o = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOoOo)) {
            return false;
        }
        return this.f39905OooO00o.equals(((o0OoOoOo) obj).f39905OooO00o);
    }

    public final int hashCode() {
        return this.f39905OooO00o.hashCode() ^ 1000003;
    }

    @NonNull
    public final String toString() {
        return o0oOO.OooO0O0(new StringBuilder("Encoding{name=\""), this.f39905OooO00o, "\"}");
    }
}
