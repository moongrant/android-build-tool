package p296o0O0OoO0;

import android.support.v4.media.session.OooOOO0;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O0O00 f35926OooO0OO = new o0O0O00(0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35927OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f35928OooO0O0;

    public o0O0O00(long j, long j2) {
        this.f35927OooO00o = j;
        this.f35928OooO0O0 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0O0O00.class != obj.getClass()) {
            return false;
        }
        o0O0O00 o0o0o00 = (o0O0O00) obj;
        return this.f35927OooO00o == o0o0o00.f35927OooO00o && this.f35928OooO0O0 == o0o0o00.f35928OooO0O0;
    }

    public final int hashCode() {
        return (((int) this.f35927OooO00o) * 31) + ((int) this.f35928OooO0O0);
    }

    public final String toString() {
        long j = this.f35927OooO00o;
        long j2 = this.f35928OooO0O0;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        return OooOOO0.OooO00o(sb, j2, "]");
    }
}
