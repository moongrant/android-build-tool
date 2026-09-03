package p236o00oOoo0;

import android.support.v4.media.session.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0O0 extends o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39947OooO00o;

    public o000O0O0(long j) {
        this.f39947OooO00o = j;
    }

    @Override // p236o00oOoo0.o00
    public final long OooO0O0() {
        return this.f39947OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o00) && this.f39947OooO00o == ((o00) obj).OooO0O0();
    }

    public final int hashCode() {
        long j = this.f39947OooO00o;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return OooO0OO.OooO0O0(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f39947OooO00o, "}");
    }
}
