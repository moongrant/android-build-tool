package o0OO00O;

import Oooo000.o000O0;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f37205OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f37206OooO0O0;

    public OooO00o(long j, long j2) {
        this.f37205OooO00o = j;
        this.f37206OooO0O0 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return OooO.OooO00o(this.f37205OooO00o, oooO00o.f37205OooO00o) && this.f37206OooO0O0 == oooO00o.f37206OooO0O0;
    }

    public final int hashCode() {
        int iOooO0o0 = OooO.OooO0o0(this.f37205OooO00o) * 31;
        long j = this.f37206OooO0O0;
        return iOooO0o0 + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PointAtTime(point=");
        sbOooO0o0.append((Object) OooO.OooO(this.f37205OooO00o));
        sbOooO0o0.append(", time=");
        return o000O0.OooO0O0(sbOooO0o0, this.f37206OooO0O0, ')');
    }
}
