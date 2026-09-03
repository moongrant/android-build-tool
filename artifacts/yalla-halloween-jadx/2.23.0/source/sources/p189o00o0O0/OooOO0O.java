package p189o00o0O0;

import android.support.v4.media.session.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f38854OooO00o;

    public OooOO0O(long j) {
        this.f38854OooO00o = j;
    }

    @Override // p189o00o0O0.OooOo00
    public final long OooO0O0() {
        return this.f38854OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof OooOo00) && this.f38854OooO00o == ((OooOo00) obj).OooO0O0();
    }

    public final int hashCode() {
        long j = this.f38854OooO00o;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return OooO0o.OooO0O0(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f38854OooO00o, "}");
    }
}
