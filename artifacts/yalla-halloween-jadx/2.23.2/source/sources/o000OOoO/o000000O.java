package o000OOoO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000000O f34701OooO0OO = new o000000O(0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f34702OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f34703OooO0O0;

    public o000000O(long j, long j2) {
        this.f34702OooO00o = j;
        this.f34703OooO0O0 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000000O.class != obj.getClass()) {
            return false;
        }
        o000000O o000000o2 = (o000000O) obj;
        return this.f34702OooO00o == o000000o2.f34702OooO00o && this.f34703OooO0O0 == o000000o2.f34703OooO0O0;
    }

    public final int hashCode() {
        return (((int) this.f34702OooO00o) * 31) + ((int) this.f34703OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f34702OooO00o);
        sb.append(", position=");
        return android.support.v4.media.session.OooO0OO.OooO0O0(sb, this.f34703OooO0O0, "]");
    }
}
