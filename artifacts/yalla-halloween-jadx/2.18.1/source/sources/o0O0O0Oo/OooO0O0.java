package o0O0O0Oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f35382OooO00o;

    public OooO0O0(@NonNull String str) {
        this.f35382OooO00o = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0O0) {
            return this.f35382OooO00o.equals(((OooO0O0) obj).f35382OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35382OooO00o.hashCode() ^ 1000003;
    }

    @NonNull
    public final String toString() {
        return p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("Encoding{name=\""), this.f35382OooO00o, "\"}");
    }
}
