package p285o0O0O0o;

import OooO00o.OooO00o;
import android.support.v4.media.session.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35410OooO00o;

    public Oooo0(long j) {
        this.f35410OooO00o = j;
    }

    @Override // p285o0O0O0o.o00Oo0
    public final long OooO0O0() {
        return this.f35410OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o00Oo0) && this.f35410OooO00o == ((o00Oo0) obj).OooO0O0();
    }

    public final int hashCode() {
        long j = this.f35410OooO00o;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return OooOOO0.OooO00o(OooO00o.OooO0o0("LogResponse{nextRequestWaitMillis="), this.f35410OooO00o, "}");
    }
}
