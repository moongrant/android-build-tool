package com.google.android.datatransport.runtime.backends;

import android.support.v4.media.session.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends BackendResponse {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BackendResponse.Status f13920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f13921OooO0O0;

    public OooO00o(BackendResponse.Status status, long j) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.f13920OooO00o = status;
        this.f13921OooO0O0 = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long OooO00o() {
        return this.f13921OooO0O0;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status OooO0O0() {
        return this.f13920OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f13920OooO00o.equals(backendResponse.OooO0O0()) && this.f13921OooO0O0 == backendResponse.OooO00o();
    }

    public final int hashCode() {
        int iHashCode = (this.f13920OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f13921OooO0O0;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f13920OooO00o);
        sb.append(", nextRequestWaitMillis=");
        return OooO0OO.OooO0O0(sb, this.f13921OooO0O0, "}");
    }
}
