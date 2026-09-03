package io.opentelemetry.sdk.trace.data;

import io.opentelemetry.api.trace.StatusCode;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ImmutableStatusData extends ImmutableStatusData {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final StatusCode f33013OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f33014OooO0o0;

    public AutoValue_ImmutableStatusData(StatusCode statusCode, String str) {
        if (statusCode == null) {
            throw new NullPointerException("Null statusCode");
        }
        this.f33013OooO0Oo = statusCode;
        this.f33014OooO0o0 = str;
    }

    @Override // io.opentelemetry.sdk.trace.data.StatusData
    public final StatusCode OooO00o() {
        return this.f33013OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableStatusData)) {
            return false;
        }
        ImmutableStatusData immutableStatusData = (ImmutableStatusData) obj;
        return this.f33013OooO0Oo.equals(((AutoValue_ImmutableStatusData) immutableStatusData).f33013OooO0Oo) && this.f33014OooO0o0.equals(((AutoValue_ImmutableStatusData) immutableStatusData).f33014OooO0o0);
    }

    @Override // io.opentelemetry.sdk.trace.data.StatusData
    public final String getDescription() {
        return this.f33014OooO0o0;
    }

    public final int hashCode() {
        return ((this.f33013OooO0Oo.hashCode() ^ 1000003) * 1000003) ^ this.f33014OooO0o0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableStatusData{statusCode=");
        sb.append(this.f33013OooO0Oo);
        sb.append(", description=");
        return o0oOO.OooO0O0(sb, this.f33014OooO0o0, "}");
    }
}
