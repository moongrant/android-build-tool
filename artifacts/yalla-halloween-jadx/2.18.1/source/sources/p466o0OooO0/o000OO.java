package p466o0OooO0;

import androidx.annotation.Nullable;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f40540OooO00o = null;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000OO.class != obj.getClass()) {
            return false;
        }
        return o000OOo0.OooO00o(this.f40540OooO00o, ((o000OO) obj).f40540OooO00o);
    }

    public final int hashCode() {
        String str = this.f40540OooO00o;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
