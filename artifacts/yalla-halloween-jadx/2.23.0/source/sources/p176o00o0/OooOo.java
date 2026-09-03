package p176o00o0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38564OooO00o;

    public OooOo(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f38564OooO00o = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        return this.f38564OooO00o.equals(((OooOo) obj).f38564OooO00o);
    }

    public final int hashCode() {
        return this.f38564OooO00o.hashCode() ^ 1000003;
    }

    @NonNull
    public final String toString() {
        return o0O00o0.OooO0O0(new StringBuilder("Encoding{name=\""), this.f38564OooO00o, "\"}");
    }
}
