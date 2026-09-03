package com.google.android.datatransport.runtime.backends;

import android.support.v4.media.session.OooOOO0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends BackendResponse {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BackendResponse.Status f13081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f13082OooO0O0;

    public OooO00o(BackendResponse.Status status, long j) {
        Objects.requireNonNull(status, "Null status");
        this.f13081OooO00o = status;
        this.f13082OooO0O0 = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long OooO0O0() {
        return this.f13082OooO0O0;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status OooO0OO() {
        return this.f13081OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f13081OooO00o.equals(backendResponse.OooO0OO()) && this.f13082OooO0O0 == backendResponse.OooO0O0();
    }

    public final int hashCode() {
        int iHashCode = (this.f13081OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f13082OooO0O0;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("BackendResponse{status=");
        sbOooO0o0.append(this.f13081OooO00o);
        sbOooO0o0.append(", nextRequestWaitMillis=");
        return OooOOO0.OooO00o(sbOooO0o0, this.f13082OooO0O0, "}");
    }
}
