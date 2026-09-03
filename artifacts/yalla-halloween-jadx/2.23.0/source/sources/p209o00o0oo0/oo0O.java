package p209o00o0oo0;

import android.support.v4.media.session.OooO0o;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final oo0O f39574OooO0OO = new oo0O(0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39575OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39576OooO0O0;

    public oo0O(long j, long j2) {
        this.f39575OooO00o = j;
        this.f39576OooO0O0 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oo0O.class != obj.getClass()) {
            return false;
        }
        oo0O oo0o = (oo0O) obj;
        return this.f39575OooO00o == oo0o.f39575OooO00o && this.f39576OooO0O0 == oo0o.f39576OooO0O0;
    }

    public final int hashCode() {
        return (((int) this.f39575OooO00o) * 31) + ((int) this.f39576OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f39575OooO00o);
        sb.append(", position=");
        return OooO0o.OooO0O0(sb, this.f39576OooO0O0, "]");
    }
}
